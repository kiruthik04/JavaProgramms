import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        // String[] words = sentence.split(" ");
        char[] letters = sentence.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char letter: letters){
            hashMap.put(letter, hashMap.getOrDefault(letter,0) + 1); 
        } 
        // for(String key: hashMap.keySet()){
        //     System.out.println(key + " " + hashMap.get(key));
        // }

        for(char letter: letters){
            if(hashMap.get(letter) == 1){
                System.out.println(letter);
                break;
            }
        }
    }
}
