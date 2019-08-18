package Animaux;

public class Animal {
    String nom;
    String race;
    String couleur;

    public static void main(String[] args) { }

    public boolean equals(Animal a) {
        if(this.name.equals(a.name) && this.race.equals(a.race) && this.couleur.equals(a.couleur)) {
            return true;
        }
        return false;
    }

    public Animal(String nom, String race, String couleur) {
        this.nom     = nom;
        this.race    = race;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
