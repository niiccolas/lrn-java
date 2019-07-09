public class L10Ville {
    private String nomVille;
    private String nomPays;
    private int nbreHabitants;

    @Override
    public String toString() {
        return "L10Ville{" +
                "nomVille='" + nomVille + '\'' +
                ", nomPays='" + nomPays + '\'' +
                ", nbreHabitants=" + nbreHabitants +
                '}';
    }

    //    le constructeur n'a aucun type de retour
//    et porte le même nom que notre classe
    public L10Ville(){
        System.out.println("Création d'une ville!");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitants = 0;
    }

//    constructeur surchargé
    public L10Ville(String pNom, int pNbre, String pPays){
        System.out.println("Création ville AVEC PARAMÈTRES");
        nomVille = pNom;
        nomPays = pPays;
        nbreHabitants = pNbre;
    }

    public String getNom() {
        return nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public int getNombreHabitants() {
        return nbreHabitants;
    }

    public void setNomVille(String pNom) {
        nomVille = pNom;
    }

    public void setNomPays(String pPays) {
        nomPays = pPays;
    }

    public void setNombreHabitants(int pNbre) {
        nbreHabitants = pNbre;
    }
}
