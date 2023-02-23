package fr.rodez3il.a2022.mrmatt.Test;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;

public class TestElementListeTableau {
    public static void main(String[] args) {
        ListeTableau liste = new ListeTableau<>();

        liste.ajouter(1);
        liste.ajouter(2);

        if(liste.element(1).equals(2)) {
            System.out.println("Pas d'erreurs");
        }
        else {
            System.out.println("Erreurs");
        }
    }
}
