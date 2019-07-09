import java.util.Arrays;

public class L07 {
//    COMMENT DÉCLARER UN TABLEAU
//    <type du tableau> <nom du tableau> [] = { <contenu du tableau>};
    public static void main(String[] args) {
        int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
        double tableauDouble[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        char tableauCaractere[] = {'a','b','c','d','e','f','g'};
        String tableauChaine[] = {"chaine1", "chaine2", "chaine3" , "chaine4"};

        int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };

        System.out.println(Arrays.deepToString(premiersNombres));

        String[] str = new String[10];
//L'instruction suivante va déclencher une exception
//Car vous essayez d'écrire à la case 11 de votre tableau
//Alors que celui-ci n'en contient que 10 (ça commence à 0 !)
        str[10] = "Une exception";
    }
}
