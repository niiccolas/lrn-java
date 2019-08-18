package Animaux;

public class Mammal extends Animal {
    int nbrPattes;

    public Mammal(String nom, String race, String couleur, int nbrPattes) {
        super(nom, race, couleur);
        this.nbrPattes = nbrPattes;
    }

    public static void main(String[] args) {
        Mammal human1 = new Mammal("Marc", "Humain", "Blanc", 2);
        System.out.println(human1.toString());
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "nbrPattes=" + nbrPattes +
                ", nom='" + nom + '\'' +
                ", race='" + race + '\'' +
                ", couleur='" + couleur + '\'' +
                "} " + super.toString();
    }
}
