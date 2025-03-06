import java.util.*;

class DynamicArray {
    private ArrayList<Integer> list;

    public DynamicArray(){
        list = new ArrayList<>();
    }

    public void add(int value){
        list.add(value);
    }

    public void remove(int index){
        if(index >= 0 && index < list.size()){
            list.remove(index);
            System.out.printf("Element in index %d is removed Successfully\n", index);
        }else{
            System.out.println("out of index");
        }
    }

    public boolean search(int value){
        return list.contains(value);
    }

    public void print(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        DynamicArray list = new DynamicArray();

        list.add(10);
        list.add(20);
        list.add(30);

        list.print();

        System.out.println(list.search(20));

        list.remove(1);
        
        list.print();
    }
}