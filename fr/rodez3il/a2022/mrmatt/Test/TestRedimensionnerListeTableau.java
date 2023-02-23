package fr.rodez3il.a2022.mrmatt.Test;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;

public class TestRedimensionnerListeTableau {
    public static void main(String[] args) {
        ListeTableau liste = new ListeTableau<>();

        for(int i = 0; i < 20; i++) {
            liste.ajouter(i);
        }

        if(liste.taille() == 20) {
            System.out.println("Pas d'erreurs");
        }
        else {
            System.out.println("Erreurs");
        }
    }

}