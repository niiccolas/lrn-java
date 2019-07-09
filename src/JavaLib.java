import java.util.Scanner;

public class JavaLib {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Saisissez un entier : ");
//        int i = sc.nextInt();
//        System.out.println("Saisissez une chaîne : ");
//        //On vide la ligne avant d'en lire une autre
//        sc.nextLine();
//        String str = sc.nextLine();
//        System.out.println("FIN ! ");
//
//
//        int j = 10;
//
//        if (j < 0)
//            System.out.println("le nombre est négatif");
//        else
//            System.out.println("le nombre est positif");
//
//        int note = 0;
//        switch (note)
//        {
//            case 0:
//                System.out.println("Ouch !");
//                break;
//            case 10:
//                System.out.println("Vous avez juste la moyenne.");
//                break;
//            case 20:
//                System.out.println("Parfait !");
//                break;
//            default:
//                System.out.println("Il faut davantage travailler.");
//        }


        String prenom;
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O')
        {
            System.out.println("Donnez un prénom : ");
            prenom = sc.nextLine();
            System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
            //Sans ça, nous n'entrerions pas dans la deuxième boucle
            reponse = ' ';

            //Tant que la réponse n'est pas O ou N, on repose la question
            while(reponse != 'O' && reponse != 'N')
            {
                //On demande si la personne veut faire un autre essai
                System.out.println("Voulez-vous réessayer ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            }
        }
        System.out.println("Au revoir…");






       /*
        int degreesC;
       degreesC = 24;


        int entier = 32;
        float pi = 3.1416f;
        char carac = 'z';
        String mot = new String("Coucou");

        int i = 123;
        float j = (float)i;

        System.out.println(j);

        */
    }
}
