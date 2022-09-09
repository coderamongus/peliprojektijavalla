
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File Sanakirja = new File("C:/Hirsipuu/Hirsipuu/src/Sanakirja.txt");

        Scanner tekstiScanner = new Scanner(Sanakirja);
        Scanner input = new Scanner(System.in);

        ArrayList<String> sanat = new ArrayList<>();
        while (tekstiScanner.hasNextLine()) {
            sanat.add(tekstiScanner.nextLine());

        }

        String arvattava = sanat.get((int) (Math.random() * sanat.size()));
        char[] tekstiArray = arvattava.toCharArray();

        char[] vastaukset = new char[tekstiArray.length];
        for (int i = 0; i < tekstiArray.length; i++) {
            vastaukset[i] = '?';
        }

        boolean valmis = false;

        while (valmis == false) {
            System.out.println("-------------------");

            String kirjain = input.next();

            while (kirjain.length() != 1 || Character.isDigit(kirjain.charAt(0))) {
                System.out.println("Väärä syöte, Kokeile uudestaan");
                 kirjain = input.next();
            }
             boolean loyty = false;
            for(int i = 0; i < tekstiArray.length; i++) {
                if(kirjain.charAt(0) == tekstiArray[i]) {
                    vastaus[i] = tekstiArray[i];
                    loyty = true;
                }
            }

            if(!loyty) {
                elamat--;

                System.out.println("Väärä kirjain");
            }
            
             boolean tehty = true;

            for(int i = 0; i < vastaus.length; i++) {
                if(vastaus[i] == '?') {
                    System.out.print(" _");
                    tehty = false;
                } else {
                    System.out.print(" " + vastaus[i]);
                }
            }
            System.out.println("\n" + "Elämiä jäljellä: " + elamat);
            
             if (tehty) {
                System.out.println("Onneksi olkoon, löysit sanan!");
                valmis = true;
            }

            if (elamat <= 0) {
                System.out.println("Voi ei, sinä kuolit!");
                valmis = true;
            }
        }
    }

    public static void Hirsipuu(int l) {
        if (l == 6) {
            System.out.println("|----------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 5) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 4) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 3) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 2) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 1) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
    }
}
