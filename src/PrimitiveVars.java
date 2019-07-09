public class PrimitiveVars {
    public static void main(String[] args) {
        // le type BYTE
        // 1 octet
        // entiers entre -128 et +127]
        byte temperature;
        temperature = 64;

        // le type SHORT
        // 2 octets
        // entiers entre -32768 et +32767.
        short salary;
        salary = 31_000;

        // le type INT
        // 4 octets
        // entiers de -2^109 à 2^109
        int temperatureSoleil;
        temperatureSoleil = 15_600_000;

        // le type LONG
        // 8 octets
        // entiers de −9×10^18  à 9×1018
        long anneeLumiere;
        anneeLumiere = 9460700000000000L;

        // le type FLOAT
        // 4 octets
        // nombres à virgule flottante
        float pi;
        pi = 3.141592653f;
        float nombre;
        nombre = 2.0f;

        // le type DOUBLE
        // 8 octets
        // comme float, sans suffixe, plus de chiffres
        double division;
        division = 0.3333333333333333333333333d;

        // le type CHAR
        // UN seul caractère stocké entre apostrophes
        char caractere;
        caractere = 'A';

        // le type BOOLEAN
        boolean question;
        question = true;


        System.out.println(temperature);
        System.out.println(salary);
        System.out.println(temperatureSoleil);
        System.out.println(anneeLumiere);
        System.out.println(pi);
        System.out.println(nombre);
        System.out.println(division);
        System.out.println(caractere);


    }
}
