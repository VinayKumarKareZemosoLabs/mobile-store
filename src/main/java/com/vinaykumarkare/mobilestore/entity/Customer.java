package com.vinaykumarkare.mobilestore.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Customer {

    @Column(name = "id")
    int id;
    @Column(name = "username")
    @Id
    String username;
    @Column(name = "password")
    String password;
    @Column(name = "email")
    String email;
    @Column(name = "address")
    String address;
    @Column(name = "phone_number")
    String  number;
    @Column(name = "enabled")
    private short enabled;


    public Customer() {
    }


    public Customer(String username, String password, String email, String address, String number) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.number = number;
    }

    public Customer(int id, String username, String password, String email, String address, String number) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "orders",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private List<Mobiles> mobiles;

    public void addItem(Mobiles mobile)
    {
        if(mobiles ==null)
        {
            mobiles =new ArrayList<Mobiles>();
        }
        mobiles.add(mobile);
    }

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinTable(
            name = "authorities",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "authority")
    )
    private List<Roles> roles;


    public List<Mobiles> getMobiles() {
        return mobiles;
    }


}
