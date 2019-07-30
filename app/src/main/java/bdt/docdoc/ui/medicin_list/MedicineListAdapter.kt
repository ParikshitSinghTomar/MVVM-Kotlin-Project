package bdt.docdoc.ui.medicin_list

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.RelativeLayout
import android.widget.TextView
import bdt.docdoc.R
import bdt.docdoc.repo.local.roomdb.entity.Medicine
import org.w3c.dom.Text

/**
 * Created by parikshit on 29/7/19.
 */
class MedicineListAdapter : RecyclerView.Adapter<MedicineListAdapter.ViewHolder> {

    var originalList: ArrayList<Medicine>
    var filterList = ArrayList<Medicine>()
    var context: Context
    var itemClickListener: ItemClickListener

    constructor(baseContext: Context, list: ArrayList<Medicine>, itemClickListener: ItemClickListener) {
        this.originalList = list
        this.filterList.clear()
        this.filterList.addAll(list)
        this.context = baseContext
        this.itemClickListener = itemClickListener
    }


    fun getNameFilter(): NameFilter {
        return NameFilter()
    }

    inner class NameFilter : Filter {

        constructor() {}

        override fun performFiltering(constraint: CharSequence?): FilterResults {
            var tempList = ArrayList<Medicine>()
            tempList.clear()
            if (!constraint.isNullOrEmpty()) {
                for (medicine in originalList) {
                    if (medicine.name.toLowerCase().contains(constraint.toString().toLowerCase())) {
                        tempList.add(medicine)
                    }
                }

            } else {
                tempList.addAll(originalList)
            }
            var result = FilterResults()
            result.values = tempList
            result.count = tempList.size
            return result

        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            filterList.clear()
            filterList.addAll(results!!.values as ArrayList<Medicine>)
            notifyDataSetChanged()
        }

    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var textMName = itemView!!.findViewById<TextView>(R.id.textViewMedicineName)
        var textMUrl = itemView!!.findViewById<TextView>(R.id.textViewUrl)

        var rltMedicine = itemView!!.findViewById<RelativeLayout>(R.id.rltListItemMedicine)

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        var view = LayoutInflater.from(context).inflate(R.layout.item_list_medicine, null, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return filterList.size

    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        if (holder != null) {
            holder.textMName.text = filterList[position].name
            holder.textMUrl.text = filterList[position].detail_url

            holder.rltMedicine.tag = filterList[position]
            holder.rltMedicine.setOnClickListener({

                var medicine = it.tag as Medicine
                itemClickListener.itemClick(medicine)

            })
        }
    }

    interface ItemClickListener {
        fun itemClick(medicine: Medicine)
    }
}