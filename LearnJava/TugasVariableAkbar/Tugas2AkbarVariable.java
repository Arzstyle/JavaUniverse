/*M Akbar Rizky Saputra
Nim 20230040236
1. TUGAS VARIABLE
*/

import java.util.Scanner;

public class Tugas2AkbarVariable {
    public static void main(String[] args) {
        int nilai = 95;
        String hasil = "";

        if(nilai >=85 && nilai <=100){
            hasil = "A";
        }
        else if(nilai >=75 && nilai <=84){
            hasil = "B";
        }
        else if(nilai >=65 && nilai <=74){
            hasil = "C";
        }
        else if(nilai >=55 && nilai <=64){
            hasil = "D";
        }
        else if(nilai >=0 && nilai <=54){
            hasil = "E";
        }
        else{
            hasil = "input anda salah";
        }
        System.out.println(hasil);
        

// 2. TUGAS TIPE DATA

        Scanner Data = new Scanner(System.in);

        System.out.println("Masukan angka 1: ");
        double bilangan = Data.nextDouble();

        System.out.println("Masukan angka 2: ");
        double bilangan2 = Data.nextDouble();

        System.out.println("Masukan operator (+ , - , * , / , % ");
        char operator = Data.next().charAt(0);

        Data.close();

        double result ;
        
        switch (operator) {
            case '+':
                result = bilangan + bilangan2; 
                break;
            case '-':
                result = bilangan - bilangan2;
                break;
            case '*':
                result = bilangan * bilangan2;
                break;
            case '/':
                result = bilangan / bilangan2;
                break;
            case '%':
                result = bilangan % bilangan2;
                break;
            default:
                System.out.println("Masukan operator yang benar");
                return; 
        }    
        System.out.println("Result dari operasi " + operator + " adalah " + result);
    }
                            
}

    






