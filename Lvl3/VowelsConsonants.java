import java.util.*;

class VowelsConsonants {
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str = in.nextLine();
        int vowel = 0;
        int consonants = 0;

        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i))){
                vowel++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels: "+ vowel + "\nConsonants: "+ consonants);
        in.close();
    }
}