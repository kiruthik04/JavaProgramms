import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        char[] letters = word.toCharArray();

        char[] reverseWord = new char[word.length()];

        boolean isPalindrome = true;

        int end = word.length() - 1;
        for(int i = 0;i<word.length();i++){
            reverseWord[i] = letters[end];
            end--;
        }
        int start = 0;
        for(char c: reverseWord){
            if(Character.toLowerCase(c) != Character.toLowerCase(letters[start])){
                isPalindrome = false;
            }
            start++;
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        in.close();
    }
}