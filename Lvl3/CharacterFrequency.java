import java.util.*;

class CharacterFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String word = in.nextLine();
        char[] letters = word.toCharArray();

        TreeMap<Character, Integer> lettersMap = new TreeMap<>();

        for(char letter: letters){
            lettersMap.put(letter, lettersMap.getOrDefault(letter, 0)+1);
        }
        for(char letter: lettersMap.keySet()){
            if(Character.isUpperCase(letter)){
                System.out.println(letter + ": " + lettersMap.get(letter));
            }
        }
        for(char letter: lettersMap.keySet()){
            if(Character.isLowerCase(letter)){
                System.out.println(letter + ": " + lettersMap.get(letter));
            }
        }
        in.close();
    }
}