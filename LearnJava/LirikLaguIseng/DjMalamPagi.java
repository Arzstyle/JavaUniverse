public class DjMalamPagi {
    public static void main(String[] args) throws InterruptedException {
        String lyrics = "Hilang\n"+
                "Kadang ku tak tenang ku hanya diam\n" +
                "Aku sayang tapi kau yang tak faham\n" +
                "Apa aku pendam\n" +
                "Rasa sakit dalam\n" +
                "Dah lama aku simpan\n" +
                "So sekarang kau nak hay\n" +
                "Datang balik with no shy\n" +
                "Sorry baby malam ni aku busy gettin so fly\n" +
                "Vibe aku memang gila\n" +
                "Party macam 4th July\n" +
                "Hati aku tak rasa\n" +
                "We gon crash or we gon die";

        String[] lines = lyrics.split("\n");

        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                System.out.print(word + " ");
                Thread.sleep(300); 
            }
            System.out.println();
            Thread.sleep(800); 
        }





        
    }
}
