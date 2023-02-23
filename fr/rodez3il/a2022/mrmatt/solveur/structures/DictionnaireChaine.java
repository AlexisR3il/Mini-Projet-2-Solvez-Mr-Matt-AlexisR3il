package fr.rodez3il.a2022.mrmatt.solveur.structures;

public class DictionnaireChaine<C, V> implements Dictionnaire<C, V> {

    // classe interne représentant une entrée dans le dictionnaire
    private class Entree<C,V> {
        private C cle;         // la clé de l'entrée
        private V valeur;      // la valeur associée à la clé

        // constructeur de l'entrée
        public Entree(C cle, V valeur) {
            this.cle = cle;
            this.valeur = valeur;
        }

        // accesseur pour la clé de l'entrée
        public C getCle() {
            return cle;
        }

        // accesseur pour la valeur de l'entrée
        public V getValeur() {
            return valeur;
        }
    }

    private ListeChainee<Entree<C,V>> liste = new ListeChainee<>(); // liste chaînée des entrées du dictionnaire
    private int taille; // taille du dictionnaire

    // constructeur du dictionnaire
    public DictionnaireChaine(ListeChainee<Entree<C, V>> liste) {
        this.liste = liste;
        this.taille=0;
    }

    // méthode pour insérer une entrée dans le dictionnaire
    @Override
    public void inserer(C cle, V valeur) {
        Entree entreeExistante = null;

        // vérifie si la clé existe déjà dans le dictionnaire
        if(this.contient(cle)){
            throw new IllegalArgumentException("Clé déjà existante ");
        }

        // met à jour la valeur associée à la clé si l'entrée existe déjà, sinon ajoute une nouvelle entrée
        if(entreeExistante != null) {
            entreeExistante.valeur = valeur;
        }
        else {
            liste.ajouter(new Entree(cle, valeur));
        }
    }

    // méthode pour vérifier si une clé existe dans le dictionnaire
    @Override
    public boolean contient(C cle) {
        boolean contient = false;
        if (liste.estVide()) { // si la liste est vide, la clé ne peut pas être dans le dictionnaire
            contient = false;
        }
        else {
            for (int i = 0; i < taille; i++) {
                if (liste.element(i).getCle().equals(cle)) { // si la clé est trouvée, elle est dans le dictionnaire
                    contient = true;
                }
            }
        }
        return contient;
    }

    // méthode pour récupérer la valeur associée à une clé dans le dictionnaire
    @Override
    public V valeur(C cle) {
        V val = null;
        for(int i = 0; i < taille; i++) {
            if(liste.element(i).getCle().equals(cle)) { // si la clé est trouvée, on récupère la valeur associée
                val = liste.element(i).getValeur();
            }
        }
        return val;
    }
}
