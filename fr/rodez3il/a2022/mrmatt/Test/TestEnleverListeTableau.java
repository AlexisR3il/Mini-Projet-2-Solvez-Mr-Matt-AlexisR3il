package fr.rodez3il.a2022.mrmatt.Test;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;

public class TestEnleverListeTableau {
    public static void main(String[] args) {
        ListeTableau liste = new ListeTableau<>();

        liste.ajouter(1);
        liste.ajouter(2);
        liste.ajouter(3);

        if(liste.taille() == 3) {
            liste.enlever(1);

            if (liste.taille() == 2) {
                if(!liste.contient(2)) {
                    System.out.println("Pas d'erreurs");
                }
                else {
                    System.out.println("Erreurs");
                }
            }
            else {
                System.out.println("Erreurs");
            }
        }
        else {
            System.out.println("Erreurs");
        }
    }
}
