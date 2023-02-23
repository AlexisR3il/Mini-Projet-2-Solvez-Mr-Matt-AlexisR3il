package fr.rodez3il.a2022.mrmatt.solveur.structures;

public class ListeChainee<T> implements Liste<T> {

    // Classe Maillon interne à la classe ListeChainee
    class Maillon {
        private T donnee;
        private Maillon suivant;

        // Constructeur de Maillon qui prend en paramètre une donnée de type T
        public Maillon(T donnee) {
            this.donnee = donnee;
            this.suivant = null;
        }

        // Setter de la donnée
        public void setDonnee(T donnee) {
            this.donnee = donnee;
        }

        // Getter de la donnée
        public T getDonnee() {
            return donnee;
        }

        // Setter du maillon suivant
        public void setMaillonSuivant(Maillon suivant){
            this.suivant = suivant;
        }

        // Getter du maillon suivant
        public Maillon getMaillonSuivant() {
            return suivant;
        }
    }

    // Attribut qui représente le premier maillon de la liste chaînée
    private Maillon teteListe;
    // Attribut qui représente la taille de la liste chaînée
    private int taille;

    // Constructeur de la liste chaînée qui initialise la tête à null et la taille à 0
    public ListeChainee() {
        this.teteListe = null;
        this.taille = 0;
    }

    // Méthode qui retourne le maillon situé à l'index i
    private Maillon getMaillon(int i){
        Maillon maillon = teteListe;

        for (int j = 0; j < i; j++) {
            maillon = maillon.getMaillonSuivant();
        }
        return maillon;
    }

    // Méthode d'ajout d'un élément à la fin de la liste
    @Override
    public void ajouter(T element){
        Maillon newMaillon = new Maillon(element);
        if (teteListe == null) {
            teteListe = newMaillon;
        }
        else {
            Maillon lastMaillon = getMaillon(taille - 1);
            lastMaillon.setMaillonSuivant(newMaillon);
        }

        taille++;
    }

    // Méthode qui retourne vrai si la liste est vide, faux sinon
    @Override
    public boolean estVide() {
        boolean vide;
        if(taille == 0) {
            vide = true;
        } else {
            vide = false;
        }
        return vide;
    }

    // Méthode qui retourne la taille de la liste
    @Override
    public int taille(){
        return this.taille;
    }

    // Méthode qui enlève l'élément situé à l'index i de la liste
    @Override
    public T enlever(int i) {
        T suppr;
        if (i == 0) {
            suppr = teteListe.getDonnee();
            teteListe = teteListe.getMaillonSuivant();
        }
        else {
            Maillon maillonPrecedent = getMaillon(i - 1);
            Maillon maillonSupprimer = maillonPrecedent.getMaillonSuivant();
            suppr = maillonSupprimer.getDonnee();
            maillonPrecedent.setMaillonSuivant(maillonSupprimer.getMaillonSuivant());
        }

        taille--;

        return suppr;
    }

    //Méthode retourne l'élément à l'indice i de la liste.
    @Override
    public T element(int i) {
        Maillon maillon = getMaillon(i);

        return maillon.getDonnee();
    }

    //Méthode vérifie si la liste contient l'élément spécifié en paramètre.
    @Override
    public boolean contient(T element) {
        boolean contient = false;
        Maillon maillon = teteListe;
        while (maillon != null) {
            if (maillon.getDonnee().equals(element)) {
                contient = true;
            }
            maillon = maillon.getMaillonSuivant();
        }
        return contient;
    }
}
