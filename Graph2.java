import java.util.*;
class Graph2{
    static void addEdge(List<List<Integer>> outer, int i, int j){
        outer.get(i).add(j);
        outer.get(j).add(i);
        // System.out.println(outer);
    }
    static void traverse(List<List<Integer>> outer){
        for(int i = 0;i<outer.size(); i++){
            System.out.print(i);
            for(int j = 0;j<outer.get(i).size(); j++){
                System.out.print("->" + outer.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        List<List<Integer>> outer = new ArrayList<>();

        int v = 4;
        for(int i = 0;i<v;i++){
            List<Integer> inner = new ArrayList<>();
            outer.add(inner);
        }
        // System.out.println(outer);

        addEdge(outer, 0, 1);
        addEdge(outer, 0, 2);
        addEdge(outer, 1, 2);
        addEdge(outer, 2, 3);

        traverse(outer);
    }
}