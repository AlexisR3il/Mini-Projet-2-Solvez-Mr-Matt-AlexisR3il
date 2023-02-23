package fr.rodez3il.a2022.mrmatt.Test;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;

public class TestAjouterListeTableau {
    public static void main(String[] args) {
        ListeTableau liste = new ListeTableau<>();

        liste.ajouter(1);

        if(liste.taille() == 1) {
            System.out.println("Pas d'erreurs");
        }
        else {
            System.out.println("Erreurs");
        }
    }

}
