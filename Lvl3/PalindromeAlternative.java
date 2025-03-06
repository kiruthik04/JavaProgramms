import java.util.*;

class PalindromeAlternative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String word = in.nextLine();
        int left = 0, right = word.length() - 1;
        boolean isPalindrome = true;

        while(left < right){
            if(Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
        in.close();
    }
}