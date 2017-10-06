package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

/**
 * Created by d16013755 on 06/10/17.
 */
public class Employe {
    private int identifiant;
    private int secuID;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double base;
    private double nbHeures;


    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", secuID=" + secuID +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                '}';
    }

    public double CalculerSalaireBrut(){
        return base * nbHeures;
    }

    public double CalculerSalaireNet(){
        return (CalculerSalaireBrut()*0.8);
    }

    public void setDateEmbauche(){
        this.dateEmbauche = dateEmbauche;
    }
}

