import java.util.*;

class WordFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordMap = new HashMap<>();

        for(String word: words){
            wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
        }
        for(String word: wordMap.keySet()){
            System.out.println(word + " = " + wordMap.get(word));
        }
        in.close();
    }
}