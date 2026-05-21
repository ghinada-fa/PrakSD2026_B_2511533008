package pekan7_2511533008;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

class Mahasiswa_3008 {
    private String nama_3008;
    private String nim_3008;
    private String prodi_3008;

    public Mahasiswa_3008(String nama_3008, String nim_3008, String prodi_3008) {
        this.nama_3008 = nama_3008;
        this.nim_3008 = nim_3008;
        this.prodi_3008 = prodi_3008;
    }

    public String getNama_3008() { return nama_3008; }
    public String getNim_3008() { return nim_3008; }
    public String getProdi_3008() { return prodi_3008; }

    @Override
    public String toString() {
        return nama_3008 + " - " + nim_3008 + " - " + prodi_3008;
    }
}

public class MahasiswaGUI_2511533008 extends JFrame {
    private JTextField tfNama_3008, tfNim_3008, tfProdi_3008;
    private JButton btnTambah_3008, btnHapus_3008, btnSort_3008;
    private JComboBox<String> cbAlgoritma_3008;
    private JTable tableAwal_3008, tableAkhir_3008;
    private DefaultTableModel modelAwal_3008, modelAkhir_3008;
    private JTextArea areaProses_3008;

    private ArrayList<Mahasiswa_3008> listMahasiswa_3008 = new ArrayList<>();

    public MahasiswaGUI_2511533008() {
        setTitle("Sorting Mahasiswa");
        setSize(900, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel Input
        JPanel panelInput_3008 = new JPanel(new GridLayout(4, 2));
        tfNama_3008 = new JTextField();
        tfNim_3008 = new JTextField();
        tfProdi_3008 = new JTextField();
        btnTambah_3008 = new JButton("Tambah");
        btnHapus_3008 = new JButton("Hapus");
        panelInput_3008.add(new JLabel("Nama:"));
        panelInput_3008.add(tfNama_3008);
        panelInput_3008.add(new JLabel("NIM:"));
        panelInput_3008.add(tfNim_3008);
        panelInput_3008.add(new JLabel("Prodi:"));
        panelInput_3008.add(tfProdi_3008);
        panelInput_3008.add(btnTambah_3008);
        panelInput_3008.add(btnHapus_3008);

        // Tabel sebelum dan sesudah
        modelAwal_3008 = new DefaultTableModel(new String[]{"Nama", "NIM", "Prodi"}, 0);
        tableAwal_3008 = new JTable(modelAwal_3008);

        modelAkhir_3008 = new DefaultTableModel(new String[]{"Nama", "NIM", "Prodi"}, 0);
        tableAkhir_3008 = new JTable(modelAkhir_3008);

        JPanel panelTables_3008 = new JPanel(new GridLayout(1, 2));
        panelTables_3008.add(new JScrollPane(tableAwal_3008));
        panelTables_3008.add(new JScrollPane(tableAkhir_3008));

        // Panel Sorting
        JPanel panelSort_3008 = new JPanel();
        cbAlgoritma_3008 = new JComboBox<>(new String[]{"Insertion Sort", "Selection Sort", "Bubble Sort"});
        btnSort_3008 = new JButton("Mulai Sorting");
        panelSort_3008.add(cbAlgoritma_3008);
        panelSort_3008.add(btnSort_3008);

        // Area Proses
        areaProses_3008 = new JTextArea(10, 50);
        areaProses_3008.setEditable(false);

        add(panelInput_3008, BorderLayout.NORTH);
        add(panelTables_3008, BorderLayout.CENTER);
        add(panelSort_3008, BorderLayout.SOUTH);
        add(new JScrollPane(areaProses_3008), BorderLayout.EAST);

        // Action Listener
        btnTambah_3008.addActionListener(e -> {
            String nama_3008 = tfNama_3008.getText();
            String nim_3008 = tfNim_3008.getText();
            String prodi_3008 = tfProdi_3008.getText();
            if (!nama_3008.isEmpty() && !nim_3008.isEmpty() && !prodi_3008.isEmpty()) {
                Mahasiswa_3008 m_3008 = new Mahasiswa_3008(nama_3008, nim_3008, prodi_3008);
                listMahasiswa_3008.add(m_3008);
                modelAwal_3008.addRow(new Object[]{nama_3008, nim_3008, prodi_3008});

                tfNama_3008.setText("");
                tfNim_3008.setText("");
                tfProdi_3008.setText("");
                tfNama_3008.requestFocus();
            }
        });

        btnHapus_3008.addActionListener(e -> {
            int row_3008 = tableAwal_3008.getSelectedRow();
            if (row_3008 >= 0) {
                listMahasiswa_3008.remove(row_3008);
                modelAwal_3008.removeRow(row_3008);
            }
        });

        btnSort_3008.addActionListener(e -> {
            String algo_3008 = (String) cbAlgoritma_3008.getSelectedItem();
            areaProses_3008.setText("");
            ArrayList<Mahasiswa_3008> tempList_3008 = new ArrayList<>(listMahasiswa_3008);

            switch (algo_3008) {
                case "Insertion Sort": insertionSort_3008(tempList_3008); break;
                case "Selection Sort": selectionSort_3008(tempList_3008); break;
                case "Bubble Sort": bubbleSort_3008(tempList_3008); break;
            }
            refreshTableAkhir_3008(tempList_3008);
        });
    }

    private void insertionSort_3008(ArrayList<Mahasiswa_3008> tempList) {
        for (int i_3008 = 1; i_3008 < tempList.size(); i_3008++) {
            Mahasiswa_3008 key_3008 = tempList.get(i_3008);
            int j_3008 = i_3008 - 1;
            while (j_3008 >= 0 && tempList.get(j_3008).getNama_3008()
                    .compareToIgnoreCase(key_3008.getNama_3008()) > 0) {
                tempList.set(j_3008 + 1, tempList.get(j_3008));
                j_3008--;
            }
            tempList.set(j_3008 + 1, key_3008);

            areaProses_3008.append("Langkah " + i_3008 + ": ");
            for (Mahasiswa_3008 m_3008 : tempList) {
                areaProses_3008.append(m_3008.toString() + "; ");
            }
            areaProses_3008.append("\n");
        }
    }

    private void selectionSort_3008(ArrayList<Mahasiswa_3008> tempList) {
        for (int i_3008 = 0; i_3008 < tempList.size() - 1; i_3008++) {
            int minIdx_3008 = i_3008;
            for (int j_3008 = i_3008 + 1; j_3008 < tempList.size(); j_3008++) {
                if (tempList.get(j_3008).getNama_3008()
                        .compareToIgnoreCase(tempList.get(minIdx_3008).getNama_3008()) < 0) {
                    minIdx_3008 = j_3008;
                }
            }
            Mahasiswa_3008 temp_3008 = tempList.get(minIdx_3008);
            tempList.set(minIdx_3008, tempList.get(i_3008));
            tempList.set(i_3008, temp_3008);

            areaProses_3008.append("Pass " + (i_3008 + 1) + ": ");
            for (Mahasiswa_3008 m_3008 : tempList) {
                areaProses_3008.append(m_3008.toString() + "; ");
            }
            areaProses_3008.append("\n");
        }
    }

    private void bubbleSort_3008(ArrayList<Mahasiswa_3008> tempList) {
        for (int i_3008 = 0; i_3008 < tempList.size() - 1; i_3008++) {
            for (int j_3008 = 0; j_3008 < tempList.size() - i_3008 - 1; j_3008++) {
                if (tempList.get(j_3008).getNama_3008()
                        .compareToIgnoreCase(tempList.get(j_3008 + 1).getNama_3008()) > 0) {
                    Mahasiswa_3008 temp_3008 = tempList.get(j_3008);
                    tempList.set(j_3008, tempList.get(j_3008 + 1));
                    tempList.set(j_3008 + 1, temp_3008);
                }
            }
            areaProses_3008.append("Pass " + (i_3008 + 1) + ": ");
            for (Mahasiswa_3008 m_3008 : tempList) {
                areaProses_3008.append(m_3008.toString() + "; ");
            }
            areaProses_3008.append("\n");
        }
    }

    private void refreshTableAkhir_3008(ArrayList<Mahasiswa_3008> tempList) {
        modelAkhir_3008.setRowCount(0); // kosongkan tabel hasil
        for (Mahasiswa_3008 m_3008 : tempList) {
            modelAkhir_3008.addRow(new Object[]{
                m_3008.getNama_3008(),
                m_3008.getNim_3008(),
                m_3008.getProdi_3008()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MahasiswaGUI_2511533008().setVisible(true));
    }
}
