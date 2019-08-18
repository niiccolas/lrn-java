package SystemeSolaire;

public class Planete {
    String nom;
    String couleur;
    int position;

    Planete(String nom, String couleur, int position) {
        this.nom = nom;
        this.couleur = couleur;
        this.position = position;
    }

    public static void main(String[] args) {
        Planete maPlanete = new Planete("Uranus", "vert", 3);
        System.out.println(maPlanete.couleur);
    }
}


