package ProjetBibli;

import java.text.SimpleDateFormat;

public class Bibliotheque {
    private Livre[] etagereLivres;

    Bibliotheque() {
       this.etagereLivres = new Livre[3];
    }

    public void ajouterLivres() {
        ProjetBibli.Livre my_book1 = new ProjetBibli.Livre(0, "Voyage au bout de la nuit", "Louis Ferdinand Céline", "Denoël et Steele", 1, true, new SimpleDateFormat("01/01/1932"));
        ProjetBibli.Livre my_book2 = new ProjetBibli.Livre(1, "For Whom the Bell Tolls", "Ernest Hemingway", "Charles Scribner's Sons", 1, true, new SimpleDateFormat("21/10/1940"));
        ProjetBibli.Livre my_book3 = new ProjetBibli.Livre(2, "Oranges", "John McPhee", "Straus and Giroux", 1, true, new SimpleDateFormat("01/01/1975"));
        this.etagereLivres[0] = my_book1;
        this.etagereLivres[1] = my_book2;
        this.etagereLivres[2] = my_book3;
    }

    public void afficherContenu() {
        for (Livre livre : etagereLivres) {
            livre.afficherInfos();
        }
    }

    public void afficherLivre(int livreId) {
        for (Livre livre : etagereLivres) {
            if (livre.id == livreId)
                livre.afficherInfos();
        }
    }

    public boolean contientLivreId(int test_id) {
        for (Livre livre : etagereLivres) {
            if (livre.id == test_id)
                return true;
        }
        return false;
    }
}