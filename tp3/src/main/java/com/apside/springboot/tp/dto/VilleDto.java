package com.apside.springboot.tp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class VilleDto {

    private long id;

    private DepartementDto departement;

    private String nom;

    private String codePostal;

    public VilleDto(long id, DepartementDto departement, String nom, String codePostal) {
        this.id = id;
        this.departement = departement;
        this.nom = nom;
        this.codePostal = codePostal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DepartementDto getDepartement() {
        return departement;
    }

    public void setDepartement(DepartementDto departement) {
        this.departement = departement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}
