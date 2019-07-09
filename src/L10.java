// Créez votre première classe
public class L10 {
    public static void main(String[] args) {
        L10Ville v = new L10Ville();
        L10Ville v1 = new L10Ville("Marseille", 123456, "France");
        L10Ville v2 = new L10Ville("Rio", 321654, "Brésil");

        System.out.println("\n v = "+v.getNom()+" L10Ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
        System.out.println(" v1 = "+v1.getNom()+" L10Ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" L10Ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");


        L10Ville temp = new L10Ville();
        temp = v1;
        v1 = v2;
        v2 = temp;

        v1.setNomVille("HongKong");
        System.out.println(" v1 = "+v1.getNom()+" L10Ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
    }
}
