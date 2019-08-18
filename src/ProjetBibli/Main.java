package ProjetBibli;

public class Main {
  public static void main(String[] args) {
    Bibliotheque maBibli = new Bibliotheque();
    maBibli.ajouterLivres();
    Utilitaires.menu(maBibli);
  }
}
