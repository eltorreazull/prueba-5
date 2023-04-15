package com.Bodega.entity;

import javax.persistence.*;
@Entity
@Table (name= "departamento")
public class Departamento {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column (name = "M2")
    private int m2;
    @Column(name="Precio")
    private int precio;
    public Departamento(){

    }

    public Departamento(Integer id, int m2, int precio) {
        this.id = id;
//        this.id = id1;
        this.m2 = m2;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", id=" + id +
                ", m2=" + m2 +
                ", precio=" + precio +
                '}';
    }
}
