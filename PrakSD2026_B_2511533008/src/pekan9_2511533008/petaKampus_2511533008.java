package pekan9_2511533008;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class petaKampus_2511533008 extends JFrame {
    private Map<String, List<String>> graph_3008 = new HashMap<>();
    private JComboBox<String> startBox_3008, goalBox_3008;
    private JTextArea graphArea_3008, resultArea_3008;
    private JLabel pathLabel_3008, visitedLabel_3008, countLabel_3008;

    public petaKampus_2511533008() {
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        graph_3008.put("Gedung A", Arrays.asList("Gedung B", "Gedung C"));
        graph_3008.put("Gedung B", Arrays.asList("Gedung A", "Gedung D", "Gedung E"));
        graph_3008.put("Gedung C", Arrays.asList("Gedung A", "Gedung F"));
        graph_3008.put("Gedung D", Arrays.asList("Gedung B", "Gedung G"));
        graph_3008.put("Gedung E", Arrays.asList("Gedung B", "Gedung H"));
        graph_3008.put("Gedung F", Arrays.asList("Gedung C", "Gedung I"));
        graph_3008.put("Gedung G", Arrays.asList("Gedung D", "Gedung J"));
        graph_3008.put("Gedung H", Arrays.asList("Gedung E"));
        graph_3008.put("Gedung I", Arrays.asList("Gedung F"));
        graph_3008.put("Gedung J", Arrays.asList("Gedung G"));

        // --- Panel kontrol ---
        JPanel controlPanel_3008 = new JPanel();
        startBox_3008 = new JComboBox<>(graph_3008.keySet().toArray(new String[0]));
        goalBox_3008 = new JComboBox<>(graph_3008.keySet().toArray(new String[0]));

        JButton bfsBtn_3008 = new JButton("BFS");
        bfsBtn_3008.setBackground(Color.GREEN);
        JButton dfsBtn_3008 = new JButton("DFS");
        dfsBtn_3008.setBackground(Color.ORANGE);
        JButton resetBtn_3008 = new JButton("RESET");
        resetBtn_3008.setBackground(Color.RED);

        controlPanel_3008.add(new JLabel("Lokasi Awal:"));
        controlPanel_3008.add(startBox_3008);
        controlPanel_3008.add(new JLabel("Lokasi Tujuan:"));
        controlPanel_3008.add(goalBox_3008);
        controlPanel_3008.add(bfsBtn_3008);
        controlPanel_3008.add(dfsBtn_3008);
        controlPanel_3008.add(resetBtn_3008);

        add(controlPanel_3008, BorderLayout.NORTH);

        // --- Area visualisasi graph ---
        graphArea_3008 = new JTextArea();
        graphArea_3008.setEditable(false);
        graphArea_3008.setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH"));
        tampilkanGraph_3008();

        // --- Area hasil pencarian ---
        JPanel resultPanel_3008 = new JPanel(new GridLayout(3,1));
        pathLabel_3008 = new JLabel("Jalur: -");
        visitedLabel_3008 = new JLabel("Node Dikunjungi: -");
        countLabel_3008 = new JLabel("Jumlah Node Dikunjungi: 0");
        resultPanel_3008.setBorder(BorderFactory.createTitledBorder("Hasil Pencarian"));
        resultPanel_3008.add(pathLabel_3008);
        resultPanel_3008.add(visitedLabel_3008);
        resultPanel_3008.add(countLabel_3008);

        JSplitPane splitPane_3008 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(graphArea_3008), resultPanel_3008);
        splitPane_3008.setDividerLocation(250);
        add(splitPane_3008, BorderLayout.CENTER);

        // --- Action ---
        bfsBtn_3008.addActionListener(e -> jalankanBFS_3008());
        dfsBtn_3008.addActionListener(e -> jalankanDFS_3008());
        resetBtn_3008.addActionListener(e -> resetOutput_3008());
    }

    private void tampilkanGraph_3008() {
        StringBuilder sb_3008 = new StringBuilder();
        for (String node_3008 : graph_3008.keySet()) {
            sb_3008.append(node_3008).append(" -> ").append(graph_3008.get(node_3008)).append("\n");
        }
        graphArea_3008.setText(sb_3008.toString());
    }

    private void jalankanBFS_3008() {
        String start_3008 = (String) startBox_3008.getSelectedItem();
        String goal_3008 = (String) goalBox_3008.getSelectedItem();

        Queue<String> queue_3008 = new LinkedList<>();
        Set<String> visited_3008 = new LinkedHashSet<>();
        Map<String, String> parent_3008 = new HashMap<>();

        queue_3008.add(start_3008);
        visited_3008.add(start_3008);

        while (!queue_3008.isEmpty()) {
            String current_3008 = queue_3008.poll();
            if (current_3008.equals(goal_3008)) break;

            for (String neighbor_3008 : graph_3008.getOrDefault(current_3008, new ArrayList<>())) {
                if (!visited_3008.contains(neighbor_3008)) {
                    visited_3008.add(neighbor_3008);
                    parent_3008.put(neighbor_3008, current_3008);
                    queue_3008.add(neighbor_3008);
                }
            }
        }
        tampilkanHasil_3008(parent_3008, visited_3008, start_3008, goal_3008);
    }

    private void jalankanDFS_3008() {
        String start_3008 = (String) startBox_3008.getSelectedItem();
        String goal_3008 = (String) goalBox_3008.getSelectedItem();

        Stack<String> stack_3008 = new Stack<>();
        Set<String> visited_3008 = new LinkedHashSet<>();
        Map<String, String> parent_3008 = new HashMap<>();

        stack_3008.push(start_3008);

        while (!stack_3008.isEmpty()) {
            String current_3008 = stack_3008.pop();
            if (!visited_3008.contains(current_3008)) {
                visited_3008.add(current_3008);
                if (current_3008.equals(goal_3008)) break;

                for (String neighbor_3008 : graph_3008.getOrDefault(current_3008, new ArrayList<>())) {
                    if (!visited_3008.contains(neighbor_3008)) {
                        parent_3008.put(neighbor_3008, current_3008);
                        stack_3008.push(neighbor_3008);
                    }
                }
            }
        }
        tampilkanHasil_3008(parent_3008, visited_3008, start_3008, goal_3008);
    }

    private void tampilkanHasil_3008(Map<String,String> parent_3008, Set<String> visited_3008,
                                String start_3008, String goal_3008) {
        List<String> path_3008 = new ArrayList<>();
        String current_3008 = goal_3008;
        while (current_3008 != null) {
            path_3008.add(current_3008);
            current_3008 = parent_3008.get(current_3008);
        }
        Collections.reverse(path_3008);

        pathLabel_3008.setText("Jalur: " + path_3008);
        visitedLabel_3008.setText("Node Dikunjungi: " + visited_3008);
        countLabel_3008.setText("Jumlah Node Dikunjungi: " + visited_3008.size());
    }

    private void resetOutput_3008() {
        pathLabel_3008.setText("Jalur: -");
        visitedLabel_3008.setText("Node Dikunjungi: -");
        countLabel_3008.setText("Jumlah Node Dikunjungi: 0");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new petaKampus_2511533008().setVisible(true));
    }
}
