public class L08 {
    public static void main(String[] args) {
//        String[] arr = {"toto", "tata", "titi", "tete"};
//        System.out.println(toString(arr));
    }

    static void walkArray(String[] arrBis) {
        for (String str : arrBis) {
            System.out.println(str);
        }
    }

    static String toString(String[] tab) {
        System.out.println("Méthode toString()!\n--------");
        String result = "";

        for (String str :
                tab) {
            result += str + "\n";
        }

        return result;
    }
}
