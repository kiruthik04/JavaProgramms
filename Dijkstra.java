import java.util.*;
class Edge{
    int x, y;
    Edge(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Dijkstra{
    static void dijkstraAlgo(List<List<Edge>> outer, int source, int V){
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        // for(int i = 0; i < distance.length; i++){
        //    distance[i] = Integer.MAX_VALUE;
        // } 
        distance[source] = 0;

        Queue<int[]> q = new ArrayDeque<>();
        int arr[] = {source, 0};
        q.add(arr);
        while(!q.isEmpty()){
            int next_vertex = q.peek()[0];
            int prev_weight = q.peek()[1];
            q.poll();

            for(Edge e : outer.get(next_vertex)){
                int curr_vertex = e.x;
                int curr_weight = e.y;
                if(distance[curr_vertex]>curr_weight+prev_weight){
                    distance[curr_vertex] = curr_weight + prev_weight;
                    int temp[] = {curr_vertex, distance[curr_vertex]};
                    q.add(temp);
                }
            }
        }
        for(int i = 0; i < distance.length;i++){
            System.out.print(distance[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int E = in.nextInt();
        List<List<Edge>> outer = new ArrayList<>();
        for(int i = 0; i < V;i++){
            List<Edge> inner = new ArrayList<>();
            outer.add(inner);
        }
        for(int i = 0; i < E; i++){
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();
            
            Edge obj1 = new Edge(v,w);
            Edge obj2 = new Edge(u,w);
            // System.out.println(obj1 + " " + obj2);   

            outer.get(u).add(obj1);
            outer.get(v).add(obj2);
        }
        int source = in.nextInt();

        dijkstraAlgo(outer, source, V);
    }
}