import java.util.*;
class Bellmanford{
    public static void main(String[] args){
        Scanxuner in = new Scanner(System.in);
        int V = in.nextInt();
        int E = in.nextInt();
        int[][] edges = new int[E][3];

        for(int i = 0;i<E;i++){
            int srcVertex = in.nextInt();
            int destVertex = in.nextInt();
            int weight = in.nextInt();
            edges[i][0] = srcVertex;
            edges[i][1] = destVertex;
            edges[i][2] = weight;
        }
        int source = in.nextInt();
        // System.out.println(Arrays.deepToString(edges));
    }
    static void bellmanAlgo(int V, int[][] edges, int source){
        int distance[] = new int[V];

        Arrays.fill(distance, (int)le8);

        distance[source] = 0;

        for(int i = 0;i<V;i++){
            for(int[] path : edges){
                int startVertex = path[];
                int endVertex = path[];
                int path                
            }
        }
    }
}