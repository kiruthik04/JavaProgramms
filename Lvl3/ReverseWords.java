import java.util.*;

class ReverseWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String sentence = in.nextLine();
        // String[] words = sentence.split(" ");

        // for(int i = words.length - 1; i >= 0;i--){
        //     System.out.print(words[i] + " ");
        // }
        List<String> words = Arrays.asList(sentence.split(" "));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));
        in.close();
    }
}