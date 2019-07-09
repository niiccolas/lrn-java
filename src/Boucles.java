public class Boucles {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED   = "\u001B[31m";

    public static void main(String[] args) {
        String[] myName = {"Nicolas", "Issa", "Chaverou"};

        decorate("For loop");
        int i;
        for (i = 0; i < myName.length; i++) {
            System.out.println(myName[i]);
        }

        decorate("For Each");
        for (String n : myName) {
            System.out.println(n);
        }

        decorate("While loop");
        int wu = 0;
        while (wu < myName.length) {
            System.out.println(myName[wu]);
            wu++;
        }

        decorate("Do while loop");
        int tang = 0;
        do {
            System.out.println(myName[tang]);
            tang++;
        } while (tang < myName.length);
    }

    public static void decorate(String el) {
        System.out.println(ANSI_RED + "--- " + el + " --------" + ANSI_RESET);
    }
}
