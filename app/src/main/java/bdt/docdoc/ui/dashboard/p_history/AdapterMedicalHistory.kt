package bdt.docdoc.ui.dashboard.p_history

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import bdt.docdoc.R
import bdt.docdoc.repo.remote.model.response.MedicalHistory

/**
 * Created by parikshit on 5/8/19.
 */
class AdapterMedicalHistory : RecyclerView.Adapter<AdapterMedicalHistory.ViewHolder> {

    var medicalHistory = ArrayList<MedicalHistory>()
    var baseContext: Context

    constructor(baseContext: Context, medicalHistory: List<MedicalHistory>) {
        this.medicalHistory.clear()
        this.medicalHistory.addAll(medicalHistory)
        this.baseContext = baseContext
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(baseContext).inflate(R.layout.item_list_medical_history, null)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return medicalHistory.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        if (holder != null) {
            holder.patientName.text = "Name: " + medicalHistory[position].name
            holder.age.text = "Age: " + medicalHistory[position].age.toString()
            holder.bp.text = "B.P.: " + medicalHistory[position].bp.toString()
            holder.temprature.text = "Temp.: " + medicalHistory[position].temp.toString()
            holder.doctorName.text = "Dr.Name: " + medicalHistory[position].doctorName
            holder.visitDate.text = "Date: " + medicalHistory[position].date
            holder.weight.text = "Weight: " + medicalHistory[position].weight.toString()


            holder.itemVisibility.tag = medicalHistory[position]
            holder.itemVisibility.setOnClickListener({

                var medicalHistory = it.tag as MedicalHistory
                showDetails(medicalHistory)

            })

            if (medicalHistory[position].visibility) {
                holder.imageViewHideInfo.visibility = View.VISIBLE
                holder.itemVisibility.text = baseContext.getString(R.string.show)
            } else {
                holder.imageViewHideInfo.visibility = View.GONE
                holder.itemVisibility.text = baseContext.getString(R.string.hide)
            }
        }
    }

    private fun showDetails(medicalHistory: MedicalHistory) {


    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var patientName = itemView.findViewById(R.id.textViewPatientName) as TextView
        var age = itemView.findViewById(R.id.textViewAge) as TextView
        var bp = itemView.findViewById(R.id.textViewBP) as TextView
        var temprature = itemView.findViewById(R.id.textViewTemp) as TextView
        var doctorName = itemView.findViewById(R.id.textViewDoctorName) as TextView
        var visitDate = itemView.findViewById(R.id.textViewDate) as TextView
        var weight = itemView.findViewById(R.id.textViewWeight) as TextView
        var itemVisibility = itemView.findViewById(R.id.textViewVisibility) as TextView
        var imageViewHideInfo = itemView.findViewById(R.id.imageViewHideInfo) as TextView
    }

    fun refershData(medicalHistoryList: List<MedicalHistory>) {
        this.medicalHistory.clear()
        this.medicalHistory.addAll(medicalHistoryList)
    }
}