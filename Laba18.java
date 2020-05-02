
import java.util.HashSet;
        import java.util.Set;
        import java.io.*;

public class Laba18 {
    public static void main(String []args) {
        Set<Character> plural = new HashSet<Character>();

        try {
            get(plural);
        }catch (IOException e) {}

        dis(plural);
    }
    static void get(Set<Character> str) throws IOException {
        FileReader fr = new FileReader("src\\text.txt");
        Set<Character> subPlural = new HashSet<Character>();
        int c;
        while ((c = fr.read()) != -1)
            if (c >= 'G' && c <= 'N') {
                for (Character k : subPlural)
                    if ((char) c == k)
                        str.add((char) c);

                subPlural.add((char) c);
            }
    }
    static void dis(Set<Character> str) {
        System.out.println(str);
    }
}
