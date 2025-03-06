import java.util.*;
public class Denomination{
    static void minimunotes(int amount){
        int notes[] = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int change[] = new int[9];
        for(int i = 0;i<9;i++){
            if(amount>=notes[i]){
                change[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        } 
        for(int i = 0;i<change.length;i++){
            if(change[i] != 0){
                System.out.println(notes[i] + "-" + change[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        minimunotes(amount); 
    }
}