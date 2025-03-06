import java.util.*;

class IntersectionTwoList{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        List<String> list1 = new ArrayList<>();
        int n1 = Integer.parseInt(in.next());
        for(int i = 0; i < n1;i++){
            list1.add(in.nextLine());
        }

        List<String> list2 = new ArrayList<>();
        int n2 = Integer.parseInt(in.next());
        for(int i = 0; i < n2;i++){
            list2.add(in.nextLine());
        }

        HashMap<String, Integer> freq1 = new HashMap<>();
        HashMap<String, Integer> freq2 = new HashMap<>();

        for(String word: list1){
            freq1.put(word, freq1.getOrDefault(word, 0)+1);
        }
        for(String word: list2){
            freq2.put(word, freq2.getOrDefault(word, 0)+1);
        }

        HashMap<String, Integer> result = new HashMap<>();

        for(String word: freq1.keySet()){
            if(freq2.containsKey(word)){
                result.put(word, Math.min(freq1.get(word), freq2.get(word)));
            }
        }

        for(Map.Entry<String, Integer> entry: result.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}