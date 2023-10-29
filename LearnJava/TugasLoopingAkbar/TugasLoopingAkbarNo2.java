import java.util.Scanner;

public class TugasLoopingAkbarNo2 {
    
    /*  Nama : Muhamad Akbar Rizky Saputra
        Nim : 20230040236
        Kelas : TI
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(("Put ur numbers: "));
        int inputNumbers = input.nextInt();
    
        int nextPalindrome = findNextPalindrome(inputNumbers);
        System.out.println("Angka palindrome terdekat dari " + inputNumbers + " adalah " + nextPalindrome);

        input.close();

    }
    public static int findNextPalindrome(int inputNumbers) {
        while (true) {
            inputNumbers++;
            if (isPalindrome(inputNumbers)) {
                return inputNumbers;
            }
        }
    }

    public static boolean isPalindrome(int numberToCheck) {
        int reversed = 0;
        int original = numberToCheck;

        while (numberToCheck != 0) {
            int digit = numberToCheck % 10;
            reversed = reversed * 10 + digit;
            numberToCheck /= 10;
        }

        return original == reversed; 
    }  
}
    






