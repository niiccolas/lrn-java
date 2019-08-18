package ProjetBibli;

import java.util.Scanner;

public class Utilitaires {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE  = "\u001B[34m";
    public static final String ANSI_RED   = "\u001B[31m";

    public static int demanderIdLivre() {
        Scanner kb = new Scanner(System.in);
        int     userInput;

        while (true) {
            try {
                menuPrompt("Saisir ID du livre à afficher : ");
                userInput = Integer.parseInt(kb.nextLine());
                if (userInput >= 0)
                    // System.out.println("You chose ID n° " + userInput);
                    // exit the while loop as soon as we have a correct input
                    return userInput;
            } catch (NumberFormatException nfe) {
                menuPromptWarning("Nombres entiers seulement! Réessayez");
            }
        }
    }

    public static void menuBibliotheque(Bibliotheque bibli) {
        while (true)
            try {
                int livreId = demanderIdLivre();

                if (bibli.contientLivreId(livreId)) {
                    bibli.afficherLivre(livreId);
                    break;
                } else {
                    menuPromptWarning("Cet ID de livre n'existe pas ✋");
                }
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            }
    }

    public static void menu(Bibliotheque bibli) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            try {
                menuPrompt("Cherchez-vous un livre ? (o/n) : ");
                String userInput = kb.nextLine();

                if (userInput.toLowerCase().equals("o") || userInput.toLowerCase().equals("oui")) {
                    menuBibliotheque(bibli);
                } else if (userInput.toLowerCase().equals("n") || userInput.toLowerCase().equals("non")) {
                    menuPrompt("À bientôt 👋");
                    break;
                } else {
                    menuPromptWarning("Répondre 'o' pour oui, 'n' pour non");
                }

            } catch (NumberFormatException nfe) {
                //System.out.println("Cet ID de livre n'existe pas");
            }
        }
    }

    public static void menuPrompt(String message) {
        System.out.print(ANSI_BLUE + "> " + message + ANSI_RESET);
    }

    public static void menuPromptWarning(String message) {
        System.out.print(ANSI_RED + "> " + message + "\n" + ANSI_RESET);
    }
}