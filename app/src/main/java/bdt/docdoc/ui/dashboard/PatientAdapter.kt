package bdt.docdoc.ui.dashboard

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import bdt.docdoc.R
import bdt.docdoc.repo.local.roomdb.entity.Patient

/**
 * Created by parikshit on 15/7/19.
 */
class PatientAdapter : RecyclerView.Adapter<PatientAdapter.ViewHolder> {

    //no need of lateint if using construtor to initialize objects
    /*lateinit */var patientList: List<Patient>
    var context: Context

    constructor(context: Context, patientList: List<Patient>) {
        this.patientList = patientList
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_patient_list, parent, false))
    }

    override fun getItemCount(): Int {

        return patientList.size

    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textViewName.text = patientList.get(position).name
        holder!!.textViewAddress.text = patientList.get(position).address
        holder!!.textViewEmail.text = patientList.get(position).email
        holder!!.textViewMobileNo.text = patientList.get(position).mobileNo

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var textViewName: TextView = view.findViewById(R.id.textViewPatientName)
        var textViewAddress: TextView = view.findViewById(R.id.textViewPatientAddress)
        var textViewEmail: TextView = view.findViewById(R.id.textViewPatientEmail)
        var textViewMobileNo: TextView = view.findViewById(R.id.textViewPatientMobileNo)

    }
}