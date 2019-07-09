import java.util.Scanner;

public class CelsToFahr {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED   = "\u001B[31m";
    public static final String ANSI_BLUE  = "\u001B[34m";
    public static final String ANSI_CYAN  = "\u001B[36m";

    public static void main(String[] args) {
        double fahr, cels;

        // Program UI
        String headerText = "CONVERTISSEUR DEGRÉS CELSIUS/FAHRENHEIT";
        String header     = ANSI_BLUE + headerText + "\n" + ANSI_RESET;
        String separator  = new String(new char[headerText.length()]).replace("\0", ANSI_CYAN + "-" + ANSI_RESET);
        String menu       = String.join("\n"
                          ,ANSI_BLUE + "Choisissez le mode de conversion :" + ANSI_RESET
                          , ANSI_CYAN + "(1)" + ANSI_RESET + " - Celsius vers Fahrenheit"
                          , ANSI_CYAN + "(2)" + ANSI_RESET + " - Fahrenheit vers Celsius");
        System.out.println(header + separator);

        // >>>>>>>>>>>>> TRY/CATCH <<<<<<<<<<<<<<<
        // Main method loops until stop playing scenario (user input = "N")
        while (true) {
            System.out.println(menu);
            System.out.print("> ");

            // Get User Input
            String temperaturePrompt = ANSI_BLUE + "\nTempérature à convertir :\n" + ANSI_RESET;
            Scanner scan             = new Scanner(System.in);
            int menuInput            = scan.nextInt();

            switch (menuInput)
            {
                case 1: System.out.print(temperaturePrompt);
                    System.out.print("> ");
                    cels = scan.nextDouble();
                    fahr = (9 * cels / 5) + 32;
                    String plural = cels > 1 ? "ent" : "";
                    System.out.println(String.format("%s °C correspond%s à %s °F.", cels, plural, fahr));
                    break;
                case 2: System.out.print(temperaturePrompt);
                    System.out.print("> ");
                    fahr = scan.nextDouble();
                    cels = arrondi((fahr-32)*5/9, 1);
                    String plural2 = cels > 1 ? "ent" : "";
                    System.out.println(String.format("%s °F correspond%s à %s °C.", fahr, plural2, cels));
                    break;
                default: System.out.println("Choisir 1 ou 2!");
            }

            //  Ask user for a new conversion
            boolean correctInput = false;
            do {
                System.out.print(ANSI_BLUE
                                + "\nSouhaitez vous convertir une autre température? (O/N)\n" + ANSI_RESET);
                System.out.print("> ");
                Scanner scan2    = new Scanner(System.in);
                String userInput = scan2.nextLine();
                System.out.print("\n");

                if (userInput.equals("N")) {
                    System.out.println("Au revoir! 👋️");
                    return;
                } else if (userInput.equals("O")) {
                    correctInput = true;
                } else {
                    System.out.println(ANSI_RED + "Erreur de saisie, réessayez" + ANSI_RESET);
                }

            } while (!correctInput);
        }
    }

    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
