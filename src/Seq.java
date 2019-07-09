public class Seq {
    public static boolean includesSeq(String str, String[] seq) {
        for (int i = 0; i < seq.length; i++)
            if (seq[i].equals(str)) return true;

        return false;
    }
}