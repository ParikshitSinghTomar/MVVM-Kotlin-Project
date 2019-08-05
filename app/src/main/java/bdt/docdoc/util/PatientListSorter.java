package bdt.docdoc.util;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import bdt.docdoc.repo.local.roomdb.entity.Patient;

/**
 * Created by parikshittomar on 23-10-2018.
 */

public class PatientListSorter {

    private final static String TAG = PatientListSorter.class.getName();
    private static int MAX_INT_LIMIT = 3;
    static String rtsData = "";

    public enum TECHNIQUE {
        PATIENT_ID
    }

    private static TECHNIQUE technique;

    public static ArrayList<Patient> sort(List<Patient> listDRS, TECHNIQUE tech) {
        ArrayList<Patient> list = new ArrayList<>();
        technique = tech;
        Log.e("", "Before Sorting");
        printDRS(listDRS);
        list = sortObject(listDRS);
        Log.e(TAG, "After Sorting");
        printDRS(list);
        return list;
    }

    private static void printDRS(List<Patient> list) {
        for (Patient commonDRSListItem : list) {
            String resultset = getCompareValue(commonDRSListItem);
            resultset = String.valueOf(getCompareValue(commonDRSListItem));
            Log.e("SORTING: ", resultset);
        }
    }

    static void merge(Patient arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        Patient L[] = new Patient[n1];
        Patient R[] = new Patient[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            switch (technique) {
                case PATIENT_ID: {
                    String drsNoL = getCompareValue(L[i]);
                    String drsNoR = getCompareValue(R[j]);
                    if (drsNoL.compareToIgnoreCase(drsNoR) > 0) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }
                }
                break;
            }

            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    private static ArrayList<Patient> sortObject(List<Patient> patientList) {
        Patient[] patients = patientList.toArray(new Patient[patientList.size()]);
        sort(patients, 0, patients.length - 1);
        ArrayList<Patient> list = new ArrayList<>();
        Log.e(TAG, "DRSSorter " + technique.toString());
        for (Patient patient : patients) {
            list.add(patient);
        }

        return list;
    }

    // Main function that sorts arr[l..r] using
    // merge()
    private static void sort(Patient arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    private static String getCompareValue(Patient patient) {
        String resultStr = "";
        try {
            if (patient.getVisit_done()) {
                resultStr = "B" + patient.getPatient_id();
            } else {
                resultStr = "C" + patient.getPatient_id();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "E";
        }
        return resultStr;
    }


}
