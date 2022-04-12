package com.solvd.patientrelated;

import com.solvd.enums.Disease;

import java.time.LocalDate;

public class Diagnostic {
    private LocalDate date;
    private Disease disease;
    private String prognosis;

    public Diagnostic(LocalDate date, Disease disease, String prognosis) {
        this.date = date;
        this.disease = disease;
        this.prognosis = prognosis;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public String getPrognosis() {
        return prognosis;
    }

    public void setPrognosis(String prognosis) {
        this.prognosis = prognosis;
    }
}
