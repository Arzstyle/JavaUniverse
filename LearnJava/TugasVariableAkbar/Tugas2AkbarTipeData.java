import java.util.Scanner;

public class Tugas2AkbarTipeData {
    public static void main(String[] args) {
        Scanner Data = new Scanner(System.in);

        System.out.println("Masukan angka 1: ");
        double bilangan = Data.nextDouble();

        System.out.println("Masukan angka 2: ");
        double bilangan2 = Data.nextDouble();

        System.out.println("Masukan operator (+ , - , * , / , % ");
        char operator = Data.next().charAt(0);

        Data.close();

        double hasil;
        
        switch (operator) {
            case '+':
                hasil = bilangan + bilangan2; 
                break;
            case '-':
                hasil = bilangan - bilangan2;
                break;
            case '*':
                hasil = bilangan * bilangan2;
                break;
            case '/':
                hasil = bilangan / bilangan2;
                break;
            case '%':
                hasil = bilangan % bilangan2;
                break;
            default:
                System.out.println("Masukan operator yang benar");
                return; 
        }    
        System.out.println("Hasil dari operasi " + operator + " adalah " + hasil);
    }
                            
}

