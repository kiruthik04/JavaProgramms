import java.util.*;

class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        LinkedHashMap<Character, Integer> lettersMap = new LinkedHashMap<>();

        for(char c: str.toCharArray()){
            lettersMap.put(c, lettersMap.getOrDefault(c, 0) + 1);
        }
        for(char c: lettersMap.keySet()){
            if(lettersMap.get(c) == 1){
                System.out.print(c);
                break;
            }
        }
        in.close();    
    }
}