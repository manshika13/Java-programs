/*import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {
    private int numVertices;
    private List<List<Integer>> adjList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }

    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

  public void dfs(int startVertex) {
        int[] colors = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            colors[i] = -1;
        }

        dfsUtil(startVertex, colors);
    }

    private void dfsUtil(int vertex, int[] colors) {
        colors[vertex] = 0;

        System.out.println("Visiting vertex: " + vertex);

        for (int neighbor : adjList.get(vertex)) {
            if (colors[neighbor] == -1) {
                dfsUtil(neighbor, colors);
            }
        }
    }

    public void bfs(int startVertex) {
        int[] colors = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            colors[i] = -1;
        }

        colors[startVertex] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.println("Visiting vertex: " + vertex);

            int nextColor = colors[vertex] + 1;

            for (int neighbor : adjList.get(vertex)) {
                if (colors[neighbor] == -1) {
                    colors[neighbor] = nextColor;
                    queue.offer(neighbor);
                }
            }
        }
    }

}
*/

