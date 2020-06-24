package com.example.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Garantie implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    
    String nom;

    int montant;


    String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Garantie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }



}
