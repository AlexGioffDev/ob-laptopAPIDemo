package com.example.obspringEjercicio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String model;
    private String ram;
    private String HDCapacity;

    public Laptop() {}

    public Laptop(Long id, String marca, String model, String ram, String HDCapacity) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.ram = ram;
        this.HDCapacity = HDCapacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHDCapacity() {
        return HDCapacity;
    }

    public void setHDCapacity(String HDCapacity) {
        this.HDCapacity = HDCapacity;
    }


}
