import java.util.Scanner;

public class FloydWarshall {
    private static final int INF = Integer.MAX_VALUE / 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int n = scanner.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter the weighted adjacency matrix(-1 for infinity):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int weight = scanner.nextInt();
                graph[i][j] = (weight == -1) ? INF : weight;
            }
        }

        scanner.close();

        int[][] shortestPaths = floydWarshall(graph, n);

        System.out.println("Shortest distances between all pairs of vertices:");
        printMatrix(shortestPaths);
    }

    private static int[][] floydWarshall(int[][] graph, int n) {
        int[][] dist = new int[n][n];

        // Initialize dist matrix with the same values as the graph
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Apply Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        return dist;
    }

    private static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == INF) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}


