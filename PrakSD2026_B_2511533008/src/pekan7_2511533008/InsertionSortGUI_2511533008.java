package pekan7_2511533008;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class InsertionSortGUI_2511533008 extends JFrame {

    private static final long serialVersionUID = 1L;

    private int[] array_3008;
    private JLabel[] labelArray_3008;
    private JButton stepButton_3008, resetButton_3008, setButton_3008;
    private JTextField inputField_3008;
    private JPanel panelArray_3008;
    private JTextArea stepArea_3008;

    private int i_3008 = 1, j_3008;
    private boolean sorting_3008 = false;
    private int stepCount_3008 = 1;

    public InsertionSortGUI_2511533008() {
        setTitle("Insertion Sort: Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_3008 = new JPanel(new FlowLayout());
        inputField_3008 = new JTextField(30);
        setButton_3008 = new JButton("Set Array");
        inputPanel_3008.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_3008.add(inputField_3008);
        inputPanel_3008.add(setButton_3008);

        // Panel array visual
        panelArray_3008 = new JPanel();
        panelArray_3008.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_3008 = new JPanel();
        stepButton_3008 = new JButton("Langkah Selanjutnya");
        resetButton_3008 = new JButton("Reset");
        stepButton_3008.setEnabled(false);
        controlPanel_3008.add(stepButton_3008);
        controlPanel_3008.add(resetButton_3008);

        // Area teks untuk log langkah-langkah
        stepArea_3008 = new JTextArea(8, 60);
        stepArea_3008.setEditable(false);
        stepArea_3008.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3008 = new JScrollPane(stepArea_3008);

        // Tambahkan panel ke frame
        add(inputPanel_3008, BorderLayout.NORTH);
        add(panelArray_3008, BorderLayout.CENTER);
        add(controlPanel_3008, BorderLayout.SOUTH);
        add(scrollPane_3008, BorderLayout.EAST);

        // Event Set Array
        setButton_3008.addActionListener(e -> setArrayFromInput_3008());

        // Event Langkah Selanjutnya
        stepButton_3008.addActionListener(e -> performStep_3008());

        // Event Reset
        resetButton_3008.addActionListener(e -> reset_3008());
    }

    private void setArrayFromInput_3008() {
        String text_3008 = inputField_3008.getText().trim();

        if (text_3008.isEmpty()) return;

        String[] parts_3008 = text_3008.split(",");
        array_3008 = new int[parts_3008.length];

        try {
            for (int k_3008 = 0; k_3008 < parts_3008.length; k_3008++) {
                array_3008[k_3008] = Integer.parseInt(parts_3008[k_3008].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan dengan koma",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        i_3008 = 0;
        stepCount_3008 = 1;
        sorting_3008 = true;

        stepButton_3008.setEnabled(true);
        stepArea_3008.setText("");

        panelArray_3008.removeAll();

        labelArray_3008 = new JLabel[array_3008.length];

        for (int k_3008 = 0; k_3008 < array_3008.length; k_3008++) {
            labelArray_3008[k_3008] = new JLabel(String.valueOf(array_3008[k_3008]));
            labelArray_3008[k_3008].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3008[k_3008].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3008[k_3008].setPreferredSize(new Dimension(50, 50));
            labelArray_3008[k_3008].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3008.add(labelArray_3008[k_3008]);
        }
        panelArray_3008.revalidate();
        panelArray_3008.repaint();
    }
    private void performStep_3008() {
        if (i_3008 < array_3008.length && sorting_3008) {
            int key_3008 = array_3008[i_3008];
            j_3008 = i_3008 - 1;
            StringBuilder stepLog_3008 = new StringBuilder();
            stepLog_3008.append("Langkah ").append(stepCount_3008).append(": Memasukkan ").append(key_3008).append("\n");
            while (j_3008 >= 0 && array_3008[j_3008] > key_3008) {
                array_3008[j_3008 + 1] = array_3008[j_3008]; j_3008--;
            }
            array_3008[j_3008 + 1] = key_3008;
            updateLabels_3008();
            stepLog_3008.append("Hasil: ").append(arrayToString_3008(array_3008)).append("\n\n");
            stepArea_3008.append(stepLog_3008.toString());
            i_3008++;
            stepCount_3008++;
        }
        if (i_3008 == array_3008.length) {
            sorting_3008 = false;
            stepButton_3008.setEnabled(false);
            JOptionPane.showMessageDialog(this,"Sorting selesai!");
        }
    }
    private void updateLabels_3008() {
        for (int k_3008 = 0;k_3008 < array_3008.length;k_3008++) {
            labelArray_3008[k_3008].setText(String.valueOf(array_3008[k_3008]));
        }
    }
    private void reset_3008() {
        inputField_3008.setText("");
        panelArray_3008.removeAll();
        panelArray_3008.revalidate();
        panelArray_3008.repaint();
        stepArea_3008.setText("");
        stepButton_3008.setEnabled(false);
        sorting_3008 = false;
        i_3008 = 1;
        stepCount_3008 = 1;
    }
    private String arrayToString_3008(int[] arr_3008) {
        StringBuilder sb_3008 = new StringBuilder();
        for (int k_3008 = 0;k_3008 < arr_3008.length; k_3008++) {
            sb_3008.append(arr_3008[k_3008]);
            if (k_3008 < arr_3008.length - 1) {
                sb_3008.append(", ");
            }
        }
        return sb_3008.toString();
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            InsertionSortGUI_2511533008 gui_3008 =
                    new InsertionSortGUI_2511533008();
            gui_3008.setVisible(true);
        });
    }
}