package com.example.EsunBankProject.dto;

public class SeatingUpdateRequest {
    private String empId;
    private String floorno;
    private String seatno;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFloorNo() {
        return floorno;
    }

    public void setFloorNo(String floorno) {
        this.floorno = floorno;
    }

    public String getSeatNo() {
        return seatno;
    }

    public void setSeatNo(String seatno) {
        this.seatno = seatno;
    }
}
