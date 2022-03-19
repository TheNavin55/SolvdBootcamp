package com.solvd.patientrelated;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private List diagnosis = new ArrayList<> ();
    private List treatments = new ArrayList<> ();

    public MedicalRecord() {}

    public List getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List getTreatments() {
        return treatments;
    }

    public void setTreatments(List treatments) {
        this.treatments = treatments;
    }
}
