
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
            System.out.println("_______________________");

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
                    System.out.println(" _");
                    tehty = false;
                } else {
                    System.out.println(" " + vastaus[i]);
                }
            }
            System.out.println("\n" + "Elämiä jäljellä: " + elamat);
        }
    }
}
