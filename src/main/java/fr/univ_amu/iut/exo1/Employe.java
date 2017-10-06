package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.util.Date;

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

    public double CalculSalaireBrut(){
        return base * nbHeures;
    }

    public double CalculSalaireNet(){
        return (CalculSalaireBrut()*0,8);
    }
}

