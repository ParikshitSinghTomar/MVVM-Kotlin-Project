package bdt.docdoc.ui.dashboard.p_visit_info

import android.content.Context
import android.os.Build
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import bdt.docdoc.R
import bdt.docdoc.repo.local.roomdb.entity.Medicine
import bdt.docdoc.repo.remote.model.common.CommonObjectSymptomsDescription
import bdt.docdoc.repo.remote.model.common.MedicineDescription
import bdt.docdoc.repo.remote.model.common.Precaution
import bdt.docdoc.repo.remote.model.common.Symptoms

/**
 * Created by parikshit on 25/7/19.
 */
class AdapterSymptoms : RecyclerView.Adapter<AdapterSymptoms.ViewHolder> {


    var listSymptoms = arrayListOf<CommonObjectSymptomsDescription>()

    var baseContext: Context
    var listener: IVisitInfoAdaterBindListener

    constructor(list: ArrayList<CommonObjectSymptomsDescription>, context: Context, listener: IVisitInfoAdaterBindListener) {
        this.listSymptoms = list
        this.baseContext = context
        this.listener = listener
    }

    fun refreshData(list: ArrayList<CommonObjectSymptomsDescription>) {
        this.listSymptoms.clear()
        this.listSymptoms.addAll(list)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(baseContext).inflate(R.layout.list_item_symptoms, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSymptoms.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textViewSymptoms.text = listSymptoms[position].name
        if (listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_SYMPTOMS) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_MEDICINE) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_SYMPTOMS) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_MEDICINE) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.PRECAUTION) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_PRECAUTION) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_PRECAUTION)) {
            holder.editRemarks.visibility = View.GONE
            holder.spinnerDays.visibility = View.GONE
            holder.spinnerTime.visibility = View.GONE
            holder.btnClose.visibility = View.GONE
        } else {
            holder.editRemarks.visibility = View.VISIBLE
            holder.spinnerDays.visibility = View.VISIBLE
            holder.spinnerTime.visibility = View.VISIBLE
            holder.btnClose.visibility = View.VISIBLE
        }

        if (listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.MEDICINE) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.PRECAUTION)) {
            holder.btnClose.visibility = View.VISIBLE
        }

        if (listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_SYMPTOMS) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_MEDICINE) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.HEAD_PRECAUTION)) {
            holder!!.rltListItemShipment.setBackgroundColor(ContextCompat.getColor(baseContext, R.color.colorAccent))
            holder!!.textViewSymptoms.setTextColor(ContextCompat.getColor(baseContext, R.color.white))
        } else if (listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_SYMPTOMS) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_MEDICINE) ||
                listSymptoms[position].objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_PRECAUTION)) {
            holder!!.rltListItemShipment.setBackgroundColor(ContextCompat.getColor(baseContext, R.color.blue_light))
            holder!!.textViewSymptoms.setTextColor(ContextCompat.getColor(baseContext, R.color.white))
        } else {
            holder!!.rltListItemShipment.setBackgroundColor(ContextCompat.getColor(baseContext, R.color.white))
            holder!!.textViewSymptoms.setTextColor(ContextCompat.getColor(baseContext, R.color.black))
        }
        holder.btnClose.tag = listSymptoms[position]
        holder.btnClose.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                var tg = (v!!.tag) as CommonObjectSymptomsDescription
                if (tg.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.SYMPTOMS)
                ) {
                    Log.i("", "Remove Symptom Button")
                    listener.removeSymptom(tg as Symptoms)
                } else if (tg.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.MEDICINE)
                ) {
                    Log.i("", "Remove Medicine Button")
                    listener.removeMedicine(tg as MedicineDescription)
                } else if (tg.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.PRECAUTION)
                ) {
                    Log.i("", "Remove Precaution Button")
                    listener.removePrecautions(tg as Precaution)
                }
            }
        })

        holder.textViewSymptoms.tag = listSymptoms[position]
        holder.textViewSymptoms.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var tg = (v!!.tag) as CommonObjectSymptomsDescription
                if (tg.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_MEDICINE)
                ) {
                    Log.i("", "Add Medicine Button")
                    Toast.makeText(baseContext, "Add Medicine", Toast.LENGTH_SHORT).show()
                    showAddMedicineDialog(tg)
                } else if (tg.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_SYMPTOMS)
                ) {
                    Log.i("", "Add Symptoms Button")
                    Toast.makeText(baseContext, "Add Symptoms", Toast.LENGTH_SHORT).show()
                    addSymptom()
                } else if (tg.objectType.equals(CommonObjectSymptomsDescription.OBJECT_TYPE.ADD_PRECAUTION)
                ) {
                    Log.i("", "Add Symptoms Button")
                    Toast.makeText(baseContext, "Add Precaution", Toast.LENGTH_SHORT).show()
                    addPrecaution()
                }
            }
        })
    }

    private fun addSymptom() {
        listener.addSymptom()
    }

    fun addPrecaution() {
        listener.addPrecaution()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewSymptoms = itemView.findViewById<TextView>(R.id.textViewSymptoms)
        val rltListItemShipment = itemView.findViewById<RelativeLayout>(R.id.rltListItemShipment)
        val spinnerTime = itemView.findViewById<Spinner>(R.id.spinnerTimes)
        val spinnerDays = itemView.findViewById<Spinner>(R.id.spinnerDays)
        val editRemarks = itemView.findViewById<EditText>(R.id.editTextRemark)
        val btnClose = itemView.findViewById<ImageView>(R.id.imageViewDelete)
    }

    private fun showAddMedicineDialog(obj: CommonObjectSymptomsDescription) {
        listener.startMedicineListActivity(obj)
    }
}