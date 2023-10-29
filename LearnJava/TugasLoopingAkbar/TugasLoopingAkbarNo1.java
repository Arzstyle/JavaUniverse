import java.util.Scanner;

public class TugasLoopingAkbarNo1 {

    /*  Nama : Muhamad Akbar Rizky Saputra
        Nim : 20230040236
        Kelas : TI
     */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata atau frasa: ");
        String input = scanner.nextLine();
        
        
        int length = input.length();
        String Palindrome = "";

        for (int i = (length - 1); i >= 0 / 2; i--) {
            
                Palindrome += input.charAt(i);
                 
        }

        if (input.toLowerCase().equals(Palindrome.toLowerCase())) {
            System.out.println(input + " adalah palindrome");
        } else {
            System.out.println(input + " bukan palindrome");
        }

        scanner.close();
        
    }
}
