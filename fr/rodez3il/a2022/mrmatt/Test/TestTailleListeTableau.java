package fr.rodez3il.a2022.mrmatt.Test;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;

public class TestTailleListeTableau {
    public static void main(String[] args) {
        ListeTableau liste = new ListeTableau<>();

        if(liste.taille() == 0) {
            System.out.println("Pas d'erreurs");
        }
        else {
            System.out.println("Erreurs");
        }

        liste.ajouter(1);
        liste.ajouter(2);

        if(liste.taille() == 2) {
            System.out.println("Pas d'erreurs");
        }
        else {
            System.out.println("Erreurs");
        }
    }
}
