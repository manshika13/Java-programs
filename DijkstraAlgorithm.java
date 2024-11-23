import java.util.*;

class Graph {
    private int vertices;
    private List<List<Edge>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencyList.get(source).add(edge);
    }

    public void dijkstraShortestPath(int source) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Vertex> queue = new PriorityQueue<>(vertices, Comparator.comparingInt(v -> v.distance));
        queue.add(new Vertex(source, 0));

        while (!queue.isEmpty()) {
            int u = queue.poll().vertex;

            for (Edge edge : adjacencyList.get(u)) {
                int v = edge.destination;
                int weight = edge.weight;
                int newDistance = dist[u] + weight;

                if (newDistance < dist[v]) {
                    queue.remove(new Vertex(v, dist[v]));
                    dist[v] = newDistance;
                    queue.add(new Vertex(v, newDistance));
                }
            }
        }

        System.out.println("Shortest Distances from Source:");
        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + ": " + dist[i]);
        }
    }

    private static class Edge {
        private int source;
        private int destination;
        private int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static class Vertex {
        private int vertex;
        private int distance;

        public Vertex(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (source, destination, weight):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.addEdge(source, destination, weight);
        }

        System.out.print("Enter the source vertex: ");
        int sourceVertex = scanner.nextInt();

        graph.dijkstraShortestPath(sourceVertex);
    }
}