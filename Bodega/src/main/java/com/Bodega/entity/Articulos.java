package com.Bodega.entity;
import javax.persistence.*;
@Entity
@Table (name= "articulos")
public class Articulos {
    @Id
    @Column(name = "Id")
    private Integer id;
    @Column (name = "Nombre")
    private int nombre;



}
