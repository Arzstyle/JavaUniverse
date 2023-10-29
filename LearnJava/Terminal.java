import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        
        String terminal[][] = {
            
            {"Sukabumi", "Cianjur", "Bandung"}, 
            {"Garut", "Tasik", "Ciamis"},
            {"Banjar", "Cilacap", "Banyumas"},
            {"Purwokerto", "Banjarnegara", "Semarang"}
        };
         
         int tarif = 25000;
         String tujuan = "";
         String keterangan = "";
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("Masukan uang");
         int uang = input.nextInt();
         
         for (int b = 0; b < terminal.length; b++){
             for (int k = 0; k < terminal[b].length; k++){
                 if (b == 0 && k == 0){
                     keterangan = "Bus berjalan";
                 }else{
                     if (uang - tarif >= 0){
                         tujuan = terminal[b][k];
                         uang = uang - tarif;
                         keterangan = keterangan + "-" + tujuan;
                     }
                 }
             }
         }
        System.out.println("Rute yang dilalui :" + keterangan);
        System.out.println("Anda sampai ditujuan :" + tujuan);       
        System.out.println("Sisa uang anda :" + uang);
        
        
    }
}

        
        








































    

