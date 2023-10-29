public class TestTugas4 {
    
    public static boolean isPalindrome(String text) {
        
        text = text.replaceAll(" ", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }

    public static void main(String[] args) {
        String text1 = "Katak";
        if (isPalindrome(text1)) {
            System.out.println(text1 + " adalah palindrome");
        } else {
            System.out.println(text1 + " bukan palindrome");
        }

        String kata2 = "Makan";
        if (isPalindrome(kata2)) {
            System.out.println(kata2 + " adalah palindrome");
        } else {
            System.out.println(kata2 + " bukan palindrome");
        }

        String kata3 = "Kasur";
        if (isPalindrome(kata3)) {
            System.out.println(kata3 + " adalah palindrome");
        } else {
            System.out.println(kata3 + " bukan palindrome");
        }

        String kata4 = "Kasur ini rusak";
        if (isPalindrome(kata4)) {
            System.out.println(kata4 + " adalah palindrome");
        } else {
            System.out.println(kata4 + " bukan palindrome");
        }
    }
}
        

    

