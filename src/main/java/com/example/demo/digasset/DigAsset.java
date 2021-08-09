package com.example.demo.digasset;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity // also 1h10m20s
@Table
public class DigAsset {
    @Id
    @SequenceGenerator(name="student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id = 777L;
    private LocalDate acquire_date;
    private String description = "No description yet";
    private String name = "No asset name yet";
    private String asset_token = "No asset token yet";
    private String ownerOf = "No owner";
    private String symbol = "No symbol";
    private Integer totalSupply = 1;
    private Integer balanceOf = 1;

    //@Transient // 58m52s
    //private Integer age = -999;

    public DigAsset(Long id, LocalDate acquire_date, String description, String name, String asset_token) {
    // public DigAsset(Long id, LocalDate acquire_date, String description, String name, String asset_token, Integer age) {
        this.id = id;
        this.acquire_date = acquire_date;
        this.description = description;
        this.name = name;
        this.asset_token = asset_token;
        // this.age = age;
    }

    public DigAsset(Long id, LocalDate acquire_date, String description, String name, String asset_token, String ownerOf) {
        // public DigAsset(Long id, LocalDate acquire_date, String description, String name, String asset_token, Integer age) {
        this.id = id;
        this.acquire_date = acquire_date;
        this.description = description;
        this.name = name;
        this.asset_token = asset_token;
        this.ownerOf = ownerOf;
    }

    // a new constructor that does not need age because it is now @transient
    public DigAsset(Long id, String name, LocalDate acquire_date, String description ) {
        this.id = id;
        this.name = name;
        this.acquire_date = acquire_date;
        this.description = description;
    }



    public DigAsset() { } // default constructor needed


    public DigAsset(String name) {
    // public DigAsset(String name, Integer age) {
        this.name = name;
       // this.age = age;
    }



    public DigAsset(long id, String name, LocalDate acquire_date, String description) {
        this.id = id;
        this.name = name;
        // this.age = age;
        this.acquire_date = acquire_date;
        this.description = description;
    }

    public String getAsset_token() {
        return asset_token;
    }

    public void setAsset_token(String asset_token) {
        this.asset_token = asset_token;
    }

    public DigAsset(String name, LocalDate acquire_date, String description) {
        // public DigAsset(String name, Integer age, LocalDate acquire_date, String description) {
        this.name = name;
        // this.age = age;
        this.acquire_date = acquire_date;
        this.description = description;
    }




    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAcquire_date(LocalDate acquire_date) {
        this.acquire_date = acquire_date;
    }

    public void setEmail(String description) {
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //public Integer getAge() {
        // return age;
        // return (dob.getYear() - LocalDate.now().getYear());
        //return Period.between(this.acquire_date, LocalDate.now()).getYears();

    //}

    public LocalDate getAcquire_date() {
        return acquire_date;
    }

    public String getDescription() {

        return description;
    }


    public void print() {
        System.out.println("====== Digital Asset  Information =====");
        System.out.println("Name = " + this.name);
    }
}
