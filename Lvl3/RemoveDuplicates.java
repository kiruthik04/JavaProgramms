import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String word = in.nextLine();
        // char[] letters = word.toCharArray();

        // LinkedHashMap<Character, Integer> lettersMap = new LinkedHashMap<>();

        // for(char c: letters){
        //     lettersMap.put(c, lettersMap.getOrDefault(c, 0) + 1);
        // }
        // for(char c: lettersMap.keySet()){
        //     System.out.print(c);
        // }

        LinkedHashSet<Character> letterSet = new LinkedHashSet<>();

        for(char c: word.toCharArray()){
            letterSet.add(c);
        }
        for(char c: letterSet){
            System.out.print(c);
        }

        in.close();
    }
}