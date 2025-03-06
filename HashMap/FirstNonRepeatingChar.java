import java.util.*;

class FirstNonRepeatingChar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char[] letters = word.toCharArray();
        
        HashMap<Character, Integer> characterMap = new HashMap<>();

        for(char letter: letters){
            characterMap.put(letter, characterMap.getOrDefault(letter, 0)+1);
        } 

        for(char letter: letters){
            if(characterMap.get(letter) == 1){
                System.out.println(letter);
                break;
            }
        }
    }
}