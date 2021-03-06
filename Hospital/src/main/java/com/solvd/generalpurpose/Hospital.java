package com.solvd.generalpurpose;

import com.solvd.staff.Doctor;
import com.solvd.staff.Nurse;
import com.solvd.staff.Receptionist;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private List<Doctor> doctorList = new ArrayList<>();
    private List<Nurse> nurseList = new ArrayList<>();
    private List<Receptionist> recsList = new ArrayList<Receptionist>();



    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(List<Nurse> nurseList) {
        this.nurseList = nurseList;
    }

    public List<Receptionist> getRecsList() {
        return recsList;
    }

    public void setRecsList(List<Receptionist> recsList) {
        this.recsList = recsList;
    }


    public void addDoctor(Doctor doctor) {
        this.getDoctorList().add(doctor);
    }

    public void removeDoctor(Doctor doctor) {
        this.getDoctorList().remove(doctor);
    }

    public void addNurse(Nurse nurse) {
        this.getNurseList().add(nurse);
    }

    public void removeNurse(Nurse nurse) {
        this.getNurseList().remove(nurse);
    }

    public void addRec(Receptionist receptionist){
        this.getRecsList().add(receptionist);
    }

    public void removeRec(Receptionist receptionist){
        this.getRecsList().remove(receptionist);
    }
}
