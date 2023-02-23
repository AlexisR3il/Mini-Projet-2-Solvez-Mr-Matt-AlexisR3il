package fr.rodez3il.a2022.mrmatt.Test;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;

public class TestContientListeTableau {
    public static void main(String[] args) {
        ListeTableau liste = new ListeTableau<>();

        liste.ajouter(1);
        liste.ajouter(2);
        liste.ajouter(3);

        if(liste.contient(3)) {
            System.out.println("Pas d'erreurs");
        }
        else {
            System.out.println("Erreurs");
        }

        if(liste.contient(4)) {
            System.out.println("Erreur");
        }
        else {
            System.out.println("Pas d'erreurs");
        }
    }

}
