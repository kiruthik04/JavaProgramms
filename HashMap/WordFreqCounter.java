import java.util.*;

class WordFreqCounter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");

        LinkedHashMap<String, Integer> stringMap = new LinkedHashMap<>();

        for(String word : words){
            stringMap.put(word, stringMap.getOrDefault(word, 0)+1);
        }

        for(String word : stringMap.keySet()){
            System.out.println(word + " " + stringMap.get(word));
        }
    }
}