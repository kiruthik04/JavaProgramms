import java.util.Stack;
import java.util.Scanner;
import java.util.*;

class SecondLargest {
    public static int findSecondLargest(Stack st){
        Iterator<Integer> it = st.iterator();
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        while(it.hasNext()){
            int temp = it.next();
            if(temp > largest){
                secondLargest = largest;
                largest = temp;
            }else if(temp > secondLargest && temp != largest){
                secondLargest = temp;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int stSize = sc.nextInt();
        for(int i = 0;i<stSize;i++){
            int inp = sc.nextInt();
            st.push(inp);
        }
        
        System.out.println(findSecondLargest(st));
        // System.out.println(st);
    }
}