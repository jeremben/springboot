package com.apside.springboot.tp.dto;

public class DepartementDto {

    private long id;

    private String nom;

    private String codeDepartement;

    public DepartementDto(long id, String nom, String codeDepartement) {
        this.id = id;
        this.nom = nom;
        this.codeDepartement = codeDepartement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }
}
