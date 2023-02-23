package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.util.Arrays;

public class ListeTableau<E> implements Liste<E> {

    // tableau d'objet
    private E[] tab;
    // taille du tableau;
    private int taille;

    private int tailleTab = 10;

    public ListeTableau() {
        // Initialisation du tableau avec une taille par défaut de 10 éléments
        tab = (E[]) (new Object[tailleTab]);
        taille = 0;
    }

    // Méthode d'ajout d'un élément à la fin de la liste
    @Override
    public void ajouter(E element) {
        if(taille == tab.length) {
            // Si la taille du tableau est égale à sa longueur maximale, on le redimensionne
            redimensionner();
        }
        // Ajout de l'élément au tableau
        tab[taille] = element;

        taille++;
    }

    //méthode permettant de redimensionner le tableau
    private void redimensionner() {
        // Copie du tableau dans un nouveau tableau deux fois plus grand
        E[] newTab;
        newTab = Arrays.copyOf(tab, tab.length * 2);

        tab = newTab;
    }

    // Méthode qui retourne vrai si la liste est vide, faux sinon
    @Override
    public boolean estVide() {
        boolean vide;
        // Si la taille du tableau est égale à zéro, le tableau est vide
        if(taille == 0) {
            vide = true;
        } else {
            vide = false;
        }
        return vide;
    }

    // Méthode qui retourne la taille de la liste
    @Override
    public int taille() {
        // Retourne la taille du tableau
        return taille;
    }

    // Méthode qui enlève l'élément situé à l'index i de la liste
    @Override
    public E enlever(int i) {
        // Suppression d'un élément du tableau et décalage des éléments vers la gauche
        E supprimer = tab[i];
        System.arraycopy(tab, i+1, tab, i, taille-i-1);

        taille--;

        return supprimer;
    }

    //Méthode retourne l'élément à l'indice i de la liste.
    @Override
    public E element(int i) {
        // Retourne l'élément du tableau à l'index donné
        return tab[i];
    }

    //Méthode vérifie si la liste contient l'élément spécifié en paramètre.
    @Override
    public boolean contient(E e) {
        boolean contient = false;

        // Parcours du tableau pour vérifier si l'élément y est présent
        for(int i = 0; i < taille; i++)
            if(tab[i] != null && tab[i].equals(e)) {
                contient = true;
            }

        return contient;
    }
}
