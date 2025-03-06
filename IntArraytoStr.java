import java.util.*;

class IntArraytoStr{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] num = in.nextLine().split(" ");

        StringBuilder numStr = new StringBuilder(num.length * 2);

        for(String i : num){
            numStr.append(i);
        }

        long number = Long.parseLong(numStr.toString()) + 1;

        System.out.println(number);
    }
}