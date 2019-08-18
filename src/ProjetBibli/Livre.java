package ProjetBibli;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livre {
    public int id;
    private String titre, auteur, editeur;
    private int num_edition;
    private boolean disponibilite;
    private SimpleDateFormat sdf;

    Livre(int id, String titre, String auteur,
          String editeur, int num_edition, boolean disponibilite,
          SimpleDateFormat sdf) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.num_edition = num_edition;
        this.disponibilite = disponibilite;
        this.sdf = sdf;
    }

    public void afficherInfos() {
        System.out.println("--------------------------------------");
        System.out.println(String.format("Livre n°:\t%s", id));
        System.out.println(String.format("Titre: \t\t%s", titre));
        System.out.println(String.format("Auteur: \t%s", auteur));
        System.out.println(String.format("Éditeur: \t%s", editeur));
        System.out.println(String.format("Édition n°: %s", num_edition));
        System.out.println(String.format("Dispo: \t\t%s", disponibilite));
        System.out.println(String.format("Date éd.: \t%s", sdf.format(new Date())));
        System.out.println("--------------------------------------");
    }
}
