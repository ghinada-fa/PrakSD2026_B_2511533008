package pekan9_2511533008;

import java.util.*;
public class GraphTraversal_2511533008 {
    private Map<String, List<String>> graph_3008 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_3008(String node1_3008, String node2_3008) {
        graph_3008.putIfAbsent(node1_3008, new ArrayList<>());
        graph_3008.putIfAbsent(node2_3008, new ArrayList<>());
        graph_3008.get(node1_3008).add(node2_3008);
        graph_3008.get(node2_3008).add(node1_3008);
    }

    // Menampilkan graf awal
    public void printGraph_3008() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_3008 : graph_3008.keySet()) {
            System.out.print(node_3008 + " -> ");
            List<String> neighbors_3008 = graph_3008.get(node_3008);
            System.out.println(String.join(", ", neighbors_3008));
        }
        System.out.println();
    } 

    // DFS rekursif
    public void dfs_3008(String start_3008) {
        Set<String> visited_3008 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_3008(start_3008, visited_3008);
        System.out.println();
    }

    private void dfsHelper_3008(String current_3008, Set<String> visited_3008) {
        if (visited_3008.contains(current_3008)) return;
        visited_3008.add(current_3008);
        System.out.print(current_3008 + " ");
        for (String neighbor_3008 : graph_3008.getOrDefault(current_3008, new ArrayList<>())) {
            dfsHelper_3008(neighbor_3008, visited_3008);
        }
    }
 // BFS iteratif
    public void bfs_3008(String start_3008) {
        Set<String> visited_3008 = new HashSet<>();
        Queue<String> queue_3008 = new LinkedList<>();
        queue_3008.add(start_3008);
        visited_3008.add(start_3008);
        System.out.println("Penelusuran BFS:");
        while (!queue_3008.isEmpty()) {
            String current_3008 = queue_3008.poll();
            System.out.print(current_3008 + " ");
            for (String neighbor_3008 : graph_3008.getOrDefault(current_3008, new ArrayList<>())) {
                if (!visited_3008.contains(neighbor_3008)) {
                    queue_3008.add(neighbor_3008);
                    visited_3008.add(neighbor_3008);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        GraphTraversal_2511533008 graph_3008 = new GraphTraversal_2511533008();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_3008.addEdge_3008("A", "B");
        graph_3008.addEdge_3008("A", "C");
        graph_3008.addEdge_3008("B", "D");
        graph_3008.addEdge_3008("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah: ");
        graph_3008.printGraph_3008();

        // Lakukan penelusuran
        graph_3008.dfs_3008("A");
        graph_3008.bfs_3008("A");
    }

}

