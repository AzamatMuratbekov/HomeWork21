import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("file.txt");
        file.write("""
                Aa
                Bb
                Cc
                Dd
                Ee
                Ff
                Gg
                Hh
                Ii
                Jj
                Kk
                Ll
                Mm
                Nn
                Oo
                Pp
                Qq
                Rr
                Ss
                Tt
                Uu
                Vv
                Ww
                Xx
                Yy
                Zz
                0
                1
                2
                3
                4
                5
                6
                7
                8
                9
                """);
        file.close();
        FileReader reader = new FileReader("file.txt");
        Scanner sc = new Scanner(reader);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}