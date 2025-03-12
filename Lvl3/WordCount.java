import java.util.*;

class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        for(String word: words){
            hm.put(word, hm.getOrDefault(word, 0)+1);
        }
        for(String word: hm.keySet()){
            System.out.println(word + ": "+ hm.get(word));

        }
        in.close();
    }
}