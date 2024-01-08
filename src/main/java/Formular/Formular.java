package Formular;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Formular extends JFrame {
    private JTextField textField1, textField2;
    private JCheckBox checkBox;
    private JRadioButton radioButton1, radioButton2;
    private JComboBox<String> comboBox;

    public Formular() {
        super("Adidasi");

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        checkBox = new JCheckBox("");
        radioButton1 = new JRadioButton("Păpuci");
        radioButton2 = new JRadioButton("Papuci");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        String[] options = {"Nike", "Adidas", "New Balance"};
        comboBox = new JComboBox<>(options);

        // Creare panou și adăugare componente
        JPanel panel = new JPanel(new GridLayout(7, 2, 5, 5));
        panel.add(new JLabel("Nume:"));
        panel.add(textField1);
        panel.add(new JLabel("Prenume:"));
        panel.add(textField2);
        panel.add(new JLabel(""));
        panel.add(checkBox);
        panel.add(new JLabel("Păpuci sau papuci:"));
        panel.add(radioButton1);
        panel.add(new JLabel(""));
        panel.add(radioButton2);
        panel.add(new JLabel("Listă brand:"));
        panel.add(comboBox);

        // Butonul de salvare
        JButton saveButton = new JButton("Salvare");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvareInFisierJSON();
            }
        });

        // Butonul de anulare
        JButton cancelButton = new JButton("Anulare");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adăugare butoane
        panel.add(saveButton);
        panel.add(cancelButton);

        // Adăugare panou la frame
        add(panel);

        // Configurare frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void salvareInFisierJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("CampText1", textField1.getText());
        jsonObject.put("CampText2", textField2.getText());
        jsonObject.put("CasetaBifat", String.valueOf(checkBox.isSelected()));
        jsonObject.put("OpțiuneSelectată", radioButton1.isSelected() ? "Opțiune 1" : "Opțiune 2");
        jsonObject.put("SelectareLista", (String) comboBox.getSelectedItem());

        try (FileWriter fileWriter = new FileWriter("date.json", true)) {
            fileWriter.write(jsonObject.toJSONString() + "\n");
            fileWriter.flush();
            JOptionPane.showMessageDialog(this, "Datele au fost salvate în fisierul JSON!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formular();
            }
        });
    }
}