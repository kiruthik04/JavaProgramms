import java.util.*;

public class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    // Constructor
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Add edge
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // For undirected graph
    }

    // Remove edge
    public void removeEdge(int src, int dest) {
        adjMatrix[src][dest] = 0;
        adjMatrix[dest][src] = 0; // For undirected graph
    }

    // Display adjacency matrix
    public void display() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Depth-First Search (DFS)
    public void dfs(int start) {
        boolean[] visited = new boolean[numVertices];
        System.out.print("DFS starting from vertex " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }
    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    // Breadth-First Search (BFS)
    public void bfs(int start) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        System.out.print("BFS starting from vertex " + start + ": ");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int i = 0; i < numVertices; i++) {
                if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        Graph graph = new Graph(vertices);

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print("Enter edge (src dest): ");
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }

        graph.display();

        // System.out.print("Enter edge to remove (src dest): ");
        // int src = sc.nextInt();
        // int dest = sc.nextInt();
        // graph.removeEdge(src, dest);

        // graph.display();

        System.out.print("Enter starting vertex for DFS: ");
        int dfsStart = sc.nextInt();
        graph.dfs(dfsStart);

        System.out.print("Enter starting vertex for BFS: ");
        int bfsStart = sc.nextInt();
        graph.bfs(bfsStart);

        sc.close();
    }
}
