import java.util.*;

class CharFrequency{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String word = in.nextLine();
        char[] letters = word.toCharArray();
        
        LinkedHashMap<Character, Integer> letterMap = new LinkedHashMap<>();

        for(char letter: letters){
            letterMap.put(letter, letterMap.getOrDefault(letter, 0)+1);
        }
        // for(char key: letterMap.keySet()){
        //     System.out.println(key + " -> " + letterMap.get(key));
        // }
        for(Map.Entry<Character, Integer> entry : letterMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}