import java.util.*;
class Name{
    static void printName(String s, int i){
        if(i > 0){
            System.out.println(s);
            printName(s, i - 1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = in.nextInt();
        printName(s, i);
    }
}