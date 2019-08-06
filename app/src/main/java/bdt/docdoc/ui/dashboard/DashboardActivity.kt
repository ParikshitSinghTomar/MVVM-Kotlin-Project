package bdt.docdoc.ui.dashboard

import android.annotation.SuppressLint
import android.app.Dialog
import android.app.DialogFragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.LinearLayoutManager
import android.view.*
import android.widget.*
import bdt.docdoc.BR
import bdt.docdoc.R
import bdt.docdoc.common.BaseActivity
import bdt.docdoc.common.Constants
import bdt.docdoc.databinding.ActivityDashboardBinding
import bdt.docdoc.repo.local.roomdb.entity.Patient
import bdt.docdoc.repo.remote.model.response.PatientProfileDetails
import bdt.docdoc.repo.remote.model.response.PatientTodayVisitDetailResponse
import bdt.docdoc.ui.dashboard.p_history.PatientHistoryFragment
import bdt.docdoc.ui.dashboard.p_medicine.PatientMedicineFragment
import bdt.docdoc.ui.dashboard.p_profile.PatientProfileFragment
import bdt.docdoc.ui.dashboard.p_visit_info.PatientVisitInfoFragment
import bdt.docdoc.util.PatientListSorter
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.app_bar_dashboard.*
import kotlinx.android.synthetic.main.content_dashboard.*
import javax.inject.Inject
import kotlin.random.Random

/**
 * Created by parikshit on 13/7/19.
 */
class DashboardActivity : BaseActivity<ActivityDashboardBinding, DashboardViewModel>(), IDashboardNavigator, NavigationView.OnNavigationItemSelectedListener, HasSupportFragmentInjector, View.OnClickListener, PatientAdapter.PatientItemClickListener {


    companion object {

        fun getStartIntent(context: Context): Intent {
            return Intent(context, DashboardActivity::class.java)
        }

    }

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>


    @Inject
    lateinit var mDashboardViewModel: DashboardViewModel

    @Inject
    lateinit var visitInfoFragment: PatientVisitInfoFragment
    @Inject
    lateinit var profileFragment: PatientProfileFragment
    @Inject
    lateinit var historyFragment: PatientHistoryFragment
    @Inject
    lateinit var medicineFragment: PatientMedicineFragment

    lateinit var mBinding: ActivityDashboardBinding
    lateinit var context: Context
    var patientEntityList = arrayListOf<Patient>()
    var mAdapter: PatientAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = baseContext
        mBinding = getViewDataBinding()!!
        mBinding.viewModel = mDashboardViewModel
        mDashboardViewModel.setNavigator(this)
        mAdapter = PatientAdapter(context, this)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Are you want to sure to print this prescription.", Snackbar.LENGTH_LONG)
                    .setAction("Yes", {
                        showPrescriptionScreen()
                    }).show()
        }

        fabAddPatient.setOnClickListener { view ->

            showAddPatientDialog()

        }
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        initSearchView()

        mDashboardViewModel.loadPatientList()

        initTabs()

        setUpViewPager()

    }


    private fun captureImage() {

    }

    private fun isNetworkConnected(): Boolean {
        return false
    }


    private fun showPrescriptionScreen() {

        dashboardViewPager.currentItem = 2

    }

    private fun initTabs() {
        textViewTabHistory.setOnClickListener(this)
        textViewTabProfile.setOnClickListener(this)
        textViewTabVisit.setOnClickListener(this)
        textViewTabMedicine.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.textViewTabVisit -> {
                dashboardViewPager.currentItem = 0
            }
            R.id.textViewTabProfile -> {
                dashboardViewPager.currentItem = 1
            }
            R.id.textViewTabMedicine -> {
                dashboardViewPager.currentItem = 2
            }
            R.id.textViewTabHistory -> {
                dashboardViewPager.currentItem = 3
            }
        }
    }

    fun setUpViewPager() {
        val adapter = DashboardFragmentPagerAdapter(getSupportFragmentManager())
        //1
        adapter.addFragment(visitInfoFragment, Constants.FRAGMENT_PATIENT_INFO)
        //2
//        var profileFragment: PatientProfileFragment = PatientProfileFragment.newInstance()
        adapter.addFragment(profileFragment, Constants.FRAGMENT_PATIENT_PROFILE)
        //3
//        var medicineFragment: PatientMedicineFragment = PatientMedicineFragment.newInstance()
        adapter.addFragment(medicineFragment, Constants.FRAGMENT_PATIENT_MEDICINE)
        //4
//        var historyFragment: PatientHistoryFragment = PatientHistoryFragment.newInstance()
        adapter.addFragment(historyFragment, Constants.FRAGMENT_PATIENT_HISTORY)

        dashboardViewPager!!.adapter = adapter
        dashboardViewPager!!.offscreenPageLimit = 4
        dashboardViewPager!!.currentItem = 0
        dashboardViewPager!!.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                return true
            }
        })
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }


    override fun getViewModel(): DashboardViewModel {
        return mDashboardViewModel
    }

    override fun getBindingVariable(): Int {
        return BR._all
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_dashboard
    }


    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.dashboard, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun executePendingBindings() {

    }

    override fun showError(error: String) {

    }

    override fun showToast(error: String) {

    }

    override fun showSuccess(success: String) {

    }

    override fun showPatientList(pList: ArrayList<Patient>) {

        refreshPatientList(pList);
        recyclerViewPatients.layoutManager = LinearLayoutManager(context)
        recyclerViewPatients.adapter = mAdapter

    }

    private fun refreshPatientList(pList: ArrayList<Patient>) {
        if (patientEntityList.size != null) {
            patientEntityList.clear()
        }
        var pListSorted = PatientListSorter.sort(pList, PatientListSorter.TECHNIQUE.PATIENT_ID)
        patientEntityList.addAll(pListSorted)
        mAdapter!!.setPatientList(patientEntityList)
        mAdapter!!.notifyDataSetChanged()
        //refresh patient details in all fragments
        mDashboardViewModel.loadPatientDetails(patientEntityList[patientEntityList.size - 1])
    }

    override fun showDetails(response: PatientProfileDetails) {
        visitInfoFragment.loadSelectedPatientDetails(response)
        profileFragment.loadSelectedPatientDetails(response)
        historyFragment.loadSelectedPatientDetails(response)
    }

    private fun initSearchView() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {

                mAdapter!!.filter.filter(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                mAdapter!!.filter.filter(newText)
                return false
            }

        })
    }

    override fun onItemClicked(patient: Patient) {

        showToast("$patient.name selected")
        loadPatientDetails(patient)

    }

    private fun loadPatientDetails(patient: Patient) {
        mDashboardViewModel.loadPatientDetails(patient)
    }

    private fun showAddPatientDialog() {

//        val manager=fragmentManager
//        AddPatientDialogFragment().newInstance().show(manager,"AddPatientDialog")
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_add_patient)
        val imageProfile = dialog.findViewById(R.id.imageViewProfile) as ImageView
        val imageCapture = dialog.findViewById(R.id.imageViewCaptureImage) as ImageView
        val imageClose = dialog.findViewById(R.id.imageClose) as ImageView
        imageClose.setOnClickListener({
            dialog.dismiss()
        })

        val editName = dialog.findViewById(R.id.editTextPatientName) as EditText
        val editPhoneNo = dialog.findViewById(R.id.editTextCity) as EditText
        val editCity = dialog.findViewById(R.id.editTextPhoneNo) as EditText
        val editAge = dialog.findViewById(R.id.editTextAge) as EditText
        val editTemp = dialog.findViewById(R.id.editTextTemp) as EditText
        val editWeight = dialog.findViewById(R.id.editTextWeight) as EditText

        val yesAdd = dialog.findViewById(R.id.buttonAdd) as Button
        imageProfile.setOnClickListener({
            captureImage()
        })
        imageCapture.setOnClickListener({
            captureImage()
        })
        yesAdd.setOnClickListener {
            var textName = editName.text.toString()
            var textPhoneNo = editPhoneNo.text.toString()
            var textCity = editCity.text.toString()
            var textAge = editAge.text.toString()
            var textTemp = editTemp.text.toString()
            var textWeight = editWeight.text.toString()

            if (textName.isNullOrEmpty()) {
                editName.hint = "Please enter valid text."
                editName.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            } else if (textPhoneNo.isNullOrEmpty()) {
                editPhoneNo.hint = "Please enter valid text."
                editPhoneNo.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            } else if (textCity.isNullOrEmpty()) {
                editCity.hint = "Please enter valid text."
                editCity.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            } else if (textAge.isNullOrEmpty()) {
                editAge.hint = "Please enter valid text."
                editAge.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            } else if (textPhoneNo.isNullOrEmpty()) {
                editPhoneNo.hint = "Please enter valid text."
                editPhoneNo.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            } else if (textTemp.isNullOrEmpty()) {
                editTemp.hint = "Please enter valid text."
                editTemp.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            } else if (textWeight.isNullOrEmpty()) {
                editWeight.hint = "Please enter valid text."
                editWeight.setHintTextColor(ContextCompat.getColor(baseContext, R.color.red))
                return@setOnClickListener
            }
            if (isNetworkConnected()) {

            } else {
                var randomeInt = (java.util.Random().nextInt(Integer.SIZE - 1))
                var visitID = (mDashboardViewModel.getDocID().toString() + randomeInt.toString()).toInt()
                var patient = Patient(visitID, -1, textName,
                        textCity, "", "demo@demo.demo", textAge.toInt(), textPhoneNo, 0, false)
                mDashboardViewModel.addPatient(patient)
                patientEntityList.add(patient)
                addPatientDB(patient)
                addPatientAdapter(patient)
                mAdapter!!.notifyDataSetChanged()
            }

            dialog.dismiss()
        }
        dialog.show()
    }

    private fun addPatientDB(patient: Patient) {
        mDashboardViewModel.addPatient(patient)
    }

    private fun addPatientAdapter(patient: Patient) {
        mAdapter!!.addPatient(patient)
    }

}