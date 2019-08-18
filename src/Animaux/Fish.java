package Animaux;

public class Fish extends Animal {

    int nbrNageoires;

    public Fish(String nom, String race, String couleur, int nbrNageoires) {
        super(nom, race, couleur);
        this.nbrNageoires = nbrNageoires;
    }

    public static void main(String[] args) {
        Fish nemo = new Fish("Nemo", "Poisson-clown", "Blanc et orange", 2);
        System.out.println(nemo.toString());
    }

    @Override
    public String toString() {
        return "Fish{" +
                "nbrNageoires=" + nbrNageoires +
                ", nom='" + nom + '\'' +
                ", race='" + race + '\'' +
                ", couleur='" + couleur + '\'' +
                "} " + super.toString();
    }
}
