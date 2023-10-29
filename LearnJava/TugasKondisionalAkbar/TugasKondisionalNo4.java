import javax.swing.JOptionPane;

public class TugasKondisionalNo4 {

    /*  Nama : Muhamad Akbar Rizky Saputra
        NIM : 20230040236
        Kelas : TI 23 A
     */

    public static void main(String[] args) {
        
        int waktuLari = Integer.parseInt(JOptionPane.
                    showInputDialog("Waktu olahraga lari"));
        int waktuPlank = Integer.parseInt(JOptionPane.
                    showInputDialog("Waktu olahraga plank"));
        int waktuPushup = Integer.parseInt(JOptionPane.
                    showInputDialog("Waktu olahraga pushup"));   
                    
        int lari_per_menit = 60/5;
        double plank_per_menit = 200.0/30.0;
        int pushup_per_menit = 5;

        double total = 0;

        if (waktuLari > 0){
            total = total + (waktuLari * lari_per_menit);
        }
        if (waktuPlank > 0){
            total = total + (waktuPlank * plank_per_menit);
        }
        if (waktuPushup > 0){
            total = total + (waktuPushup * pushup_per_menit);
        }
        System.out.println(total);

        

    }
}

   
        

