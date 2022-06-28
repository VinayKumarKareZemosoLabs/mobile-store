package com.vinaykumarkare.mobilestore.entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="roles")
public class Roles {
    @Id
    @Column(name="authority")
    private String authority;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.DETACH})
    @JoinTable(
            name = "authorities",
            joinColumns = @JoinColumn(name = "authority"),
            inverseJoinColumns = @JoinColumn(name = "username")
    )
    private List<Customer> customers;

    public Roles() {
    }

    public Roles (String authority)
    {
        this.authority=authority;
    }

}