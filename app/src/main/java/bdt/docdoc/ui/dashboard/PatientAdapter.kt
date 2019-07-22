package bdt.docdoc.ui.dashboard

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import bdt.docdoc.R
import bdt.docdoc.repo.local.roomdb.entity.Patient

/**
 * Created by parikshit on 15/7/19.
 */
class PatientAdapter : RecyclerView.Adapter<PatientAdapter.ViewHolder>, Filterable {


    //no need of lateint if we are using construtor to initialize objects
    /*lateinit */
    var patientList = arrayListOf<Patient>()
    var filterPatientList = arrayListOf<Patient>()
    var context: Context
    var FILTER: PatientFilter? = null

    constructor(context: Context) {
        this.context = context
    }

    fun setPatientList(patientList: List<Patient>) {
        this.patientList.addAll(patientList)
        this.filterPatientList = arrayListOf()
        this.filterPatientList.addAll(this.patientList)
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

            filterPatientList=results!!.values as ArrayList<Patient>
            notifyDataSetChanged()
        }

    }


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textViewName.text = patientList.get(position).name
        holder!!.textViewAddress.text = patientList.get(position).address
        holder!!.textViewEmail.text = patientList.get(position).age.toString()
        holder!!.textViewMobileNo.text = patientList.get(position).mobileNo

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var textViewName: TextView = view.findViewById(R.id.textViewPatientName)
        var textViewAddress: TextView = view.findViewById(R.id.textViewPatientAddress)
        var textViewEmail: TextView = view.findViewById(R.id.textViewPatientEmail)
        var textViewMobileNo: TextView = view.findViewById(R.id.textViewPatientMobileNo)

    }
}