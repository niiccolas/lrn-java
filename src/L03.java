import java.util.Scanner;

public class L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier: ");
        int i = sc.nextInt();

        System.out.println("Saisissez une chaine: ");
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(i + " " + str);
        System.out.println("FIN!");
    }
}

/*
    La lecture des entrées clavier se fait via l'objet Scanner.

    Ce dernier se trouve dans le package java.util que vous devrez importer.

    Pour pouvoir récupérer ce vous allez taper dans la console, vous devrez initialiser l'objet Scanner avec l'entrée standard, System.in.

    Il y a une méthode de récupération de données pour chaque type (sauf les char) : nextLine() pour les String, nextInt() pour les int ...
* */