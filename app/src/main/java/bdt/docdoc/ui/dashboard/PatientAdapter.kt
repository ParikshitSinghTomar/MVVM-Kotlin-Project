package bdt.docdoc.ui.dashboard

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import bdt.docdoc.R
import bdt.docdoc.repo.local.roomdb.entity.Patient
import com.bumptech.glide.Glide

/**
 * Created by parikshit on 15/7/19.
 */
class PatientAdapter : RecyclerView.Adapter<PatientAdapter.ViewHolder>, Filterable {


    //no need of lateint if we are using construtor to initialize objects
    /*lateinit */
    var selectPatientPosition = -1
    var patientList = arrayListOf<Patient>()
    var filterPatientList = arrayListOf<Patient>()
    var context: Context
    var FILTER: PatientFilter? = null
    var listener: PatientItemClickListener

    constructor(context: Context, listener: PatientItemClickListener) {
        this.context = context
        this.listener = listener
    }

    fun setPatientList(patientList: List<Patient>) {
        this.patientList.addAll(patientList)
        this.filterPatientList = arrayListOf()
        this.filterPatientList.addAll(this.patientList)
        this.selectPatientPosition = this.filterPatientList.size - 1
    }

    fun addPatient(patient: Patient) {
        patientList.add(patient)
        filterPatientList.add(patient)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_patient_list, parent, false))
    }

    override fun getItemCount(): Int {
        return filterPatientList.size
    }

    override fun getFilter(): Filter {
        if (FILTER == null) {
            FILTER = PatientFilter()
        }
        return FILTER as PatientFilter
    }


    inner class PatientFilter : Filter() {


        override fun performFiltering(constraint: CharSequence?): FilterResults {
            var filterResult = Filter.FilterResults()

            var pTempList = arrayListOf<Patient>()
            if (constraint != null && constraint.isNotEmpty()) {
                for (patient in patientList) {
                    if (patient.toString().toLowerCase().contains(constraint.toString().toLowerCase())) {
                        pTempList.add(patient)
                    }
                }
                filterResult.values = pTempList
                filterResult.count = pTempList.size
            } else {
                filterResult.values = patientList
                filterResult.count = patientList.size
            }

            return filterResult
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            if (filterPatientList != null) {
                filterPatientList.clear()
            }

            filterPatientList = results!!.values as ArrayList<Patient>
            notifyDataSetChanged()
        }

    }


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textViewName.text = patientList[position].name
        holder!!.textViewAddress.text = patientList[position].address
        holder!!.textViewEmail.text = patientList[position].age.toString()
        holder!!.textViewMobileNo.text = patientList[position].mobileNo
        loadImage(holder, position)
        if (patientList[position].visit_done) {
            holder.imageViewVisitStatus.setBackgroundColor(ContextCompat.getColor(context, R.color.green))
        } else {
            holder.imageViewVisitStatus.setBackgroundColor(ContextCompat.getColor(context, R.color.red))
        }
        if (position == selectPatientPosition) {
            holder.imageViewVisitStatus.setBackgroundColor(ContextCompat.getColor(context, R.color.yellow))
        }
        holder.cnsrntLayout.tag = position
        holder.cnsrntLayout.setOnClickListener({

            selectPatientPosition = it.tag as Int
            patientList[selectPatientPosition].visit_done = true
            var selectedPatient = patientList[selectPatientPosition]
            notifyDataSetChanged()
            listener.onItemClicked(selectedPatient)
        })
    }

    private fun loadImage(holder: ViewHolder?, position: Int) {
        Glide
                .with(context)
                .load(patientList[position].profileUrl)
                .centerCrop()
                .into(holder!!.imageViewProfile)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var textViewName: TextView = view.findViewById(R.id.textViewAddressValue)
        var textViewAddress: TextView = view.findViewById(R.id.textViewPatientAddress)
        var textViewEmail: TextView = view.findViewById(R.id.textViewPatientEmail)
        var textViewMobileNo: TextView = view.findViewById(R.id.textViewPatientMobileNo)
        var imageViewVisitStatus: ImageView = view.findViewById(R.id.imageViewVisitStatus)
        var cnsrntLayout: ConstraintLayout = view.findViewById(R.id.cnsrntLayout)
        var imageViewProfile: ImageView = view.findViewById(R.id.imageViewProfile)

    }

    interface PatientItemClickListener {
        fun onItemClicked(patient: Patient);
    }


}