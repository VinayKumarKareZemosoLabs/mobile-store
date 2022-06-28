package com.vinaykumarkare.mobilestore.entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "items")
public class Mobiles {
    @Id
    @Column(name = "item_id")
    private int id;
    @Column(name = "item_name")
    private String mobilename;
    @Column(name = "cost")
    private int cost;

    @Column(name = "company")
    private String companyname;

    public String getMobilename() {
        return mobilename;
    }

    public void setMobilename(String mobilename) {
        this.mobilename = mobilename;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "orders",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "username")
    )
    private List<Customer> customers;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public int getCost() {
        return cost;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }


    public Mobiles() {
    }


    public Mobiles(String name, int cost) {
        this.mobilename = name;
        this.cost = cost;
    }

    public Mobiles(int id, String mobilename, int cost, String companyname) {
        this.id = id;
        this.mobilename = mobilename;
        this.cost = cost;
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Mobiles{" +
                "id=" + id +
                ", mobilename='" + mobilename + '\'' +
                ", cost=" + cost +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
