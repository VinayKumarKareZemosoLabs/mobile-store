package com.vinaykumarkare.mobilestore.dto;

public class MobilesDTO {

    private int id;

    private String mobilename;

    private int cost;

    private String companyname;

    public MobilesDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobilename() {
        return mobilename;
    }

    public void setMobilename(String mobilename) {
        this.mobilename = mobilename;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }


    public MobilesDTO(int id, String mobilename, int cost, String companyname) {
        this.id = id;
        this.mobilename = mobilename;
        this.cost = cost;
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "MobilesDTO{" +
                "id=" + id +
                ", mobilename='" + mobilename + '\'' +
                ", cost=" + cost +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
