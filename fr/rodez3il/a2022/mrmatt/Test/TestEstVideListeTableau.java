package fr.rodez3il.a2022.mrmatt.Test;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;

public class TestEstVideListeTableau {
    public static void main(String[] args) {
        ListeTableau liste = new ListeTableau<>();

        if(liste.estVide()) {
            System.out.println("Pas d'erreurs");
        } else {
            System.out.println("Erreurs");
        }

        liste.ajouter(1);

        if(!liste.estVide()) {
            System.out.println("Pas d'erreurs");
        } else {
            System.out.println("Erreurs");
        }
    }
}
