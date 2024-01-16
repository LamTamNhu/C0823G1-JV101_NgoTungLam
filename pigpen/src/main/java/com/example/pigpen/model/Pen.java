package com.example.pigpen.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Pen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Long capacity;
    @OneToMany(mappedBy = "pen")
    private Set<Pig> pigSet;

    public Pen() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Set<Pig> getPigSet() {
        return pigSet;
    }

    public void setPigSet(Set<Pig> pigSet) {
        this.pigSet = pigSet;
    }
}
