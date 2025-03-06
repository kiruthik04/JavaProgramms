import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        
        char[] letters_word1 = word1.toCharArray();
        char[] letters_word2 = word2.toCharArray();
        
        if(word1.length() != word2.length()){
            System.out.println("false");
            return;
        }
        HashMap<Character, Integer> lettersMap = new HashMap<>();
        
        for(char letter: letters_word1){
            lettersMap.put(letter, lettersMap.getOrDefault(letter, 0)+1);
        }
        for(char letter: letters_word2){
            if(!lettersMap.containsKey(letter) || lettersMap.get(letter) == 0){
                System.out.println("false");
                return;
            }
            lettersMap.put(letter, lettersMap.get(letter) - 1);
        }
        System.out.println("true");
        in.close();
    }
}