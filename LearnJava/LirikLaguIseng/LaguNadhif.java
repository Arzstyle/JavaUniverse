public class LaguNadhif {

    public static void main(String[] args) {

        String nadhif;
        System.out.println("Playing lagu :" + " nadhif");

        String lirik = "Karna bersamamu semua terasa indah, Gundah gulana hatiku pun hancur sirna, janji ku takkan kulepas wahai kau bidadariku dari surga";
        
        String[] kalimatKata = lirik.split(", ");
        
        for (String kalimat : kalimatKata) {
            String[] kataKata = kalimat.split(" ");
            for (String kata : kataKata) {
                System.out.print(kata + " "); 
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); 
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
