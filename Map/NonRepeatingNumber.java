import java.util.*;

class NonRepeatingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char[] letters = word.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for(char c: letters){
            letterCount.put(c, letterCount.getOrDefault(c, 0)+1);
        }
        for(char c: letterCount.keySet()){
            if(letterCount.get(c) == 1){
                System.out.println(c);
                break;
            }
        }
        in.close();
    }
}