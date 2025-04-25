package Q4.VirtPetSim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Base64;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JButton feedButton;
    private JButton playButton;
    private JButton sleepButton;
    private JLabel statusLabel;
    private JLabel imageLabel;
    private JComboBox<String> petSelectorComboBox;
    private Timer timer;
    // TODO: add adoption buttons

    // Pet list
    private PetManager petManager = new PetManager();

    public MainForm() {
        super("Virtual Pet Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(800, 600));
        this.setResizable(false);
        this.pack();

        // Initialize starting pets
        petManager.addPet(new Dog("Buddy"));
        petManager.addPet(new Cat("Whiskers"));
        this.updatePetList();
        petSelectorComboBox.setSelectedItem(null);  // Clear selection after populating

        // Feed button action
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // feeding the selected pet
                Pet dinner = petManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                dinner.feed();
                updateStatusLabel(dinner);
            }
        });

        // Play button action
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // playing with the selected pet
                Pet dinner = petManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                dinner.play();
                updateStatusLabel(dinner);
            }
        });

        // Sleep button action
        sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // putting the selected pet to sleep
                Pet T_Bone_Steak = petManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                T_Bone_Steak.play();
                updateStatusLabel(T_Bone_Steak);
            }
        });

        // Pet selector action
        petSelectorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Make sure the action event isn't triggered by the removeAllItems() call
                if (petSelectorComboBox.getSelectedIndex() == -1) return;

                // pet selection change
                Pet temp = petManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                updateStatusLabel(temp);
                setPetImage(temp.getImage());
            }
        });

        Timer tim = new Timer(15_000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAll();
            }
        });
        tim.start();

        // TODO: Implement adoption button actions
    }

    public void updateAll() {
        ArrayList<Pet> temppets = petManager.getPets();
        for (int i = 0; i < temppets.size(); i++) {
            if (temppets.get(i).getHealth() <= 0) {
                JOptionPane.showMessageDialog(mainPanel, temppets.get(i).getName() + " has died.", "Womp Womp", JOptionPane.ERROR_MESSAGE);
                temppets.remove(i);
                if (petSelectorComboBox.getSelectedIndex() == i) {
                    petSelectorComboBox.setSelectedIndex(i - 1);
                }
                i--;
            } else {
                if (temppets.get(i).getEnergy() <= 0) temppets.get(i).setHealth(temppets.get(i).getHealth() - 1);
                else {
                    temppets.get(i).setEnergy(temppets.get(i).getEnergy() - 1);
                }

                if (temppets.get(i).getHunger() <= 0) temppets.get(i).setHealth(temppets.get(i).getHealth() - 5);
                else {
                    temppets.get(i).setHunger(temppets.get(i).getHunger() - 5);
                }

                if (temppets.get(i).getHappiness() <= 0) temppets.get(i).setEnergy(temppets.get(i).getEnergy() - 5);
                else {
                    temppets.get(i).setHappiness(temppets.get(i).getHappiness() - 1);
                }
            }
            updateStatusLabel(temppets.get(petSelectorComboBox.getSelectedIndex()));
            petManager.setPets(temppets);
        }
    }


    public void updateStatusLabel(Pet guh) {
        statusLabel.setText("Selected pet: " + guh.getName() +
                "\nHunger 🍗: (" + guh.getHunger() + "/100)" +
                "\nEnergy ⚡: (" + guh.getEnergy() + "/100)" +
                "\nHappiness 😊: (" + guh.getHappiness() + "/100" +
                "\nHealth ❤️: (" + guh.getHealth() + "/100)");
    }

    public void updatePetList() {
        petSelectorComboBox.removeAllItems();  // Clear existing items
        // TODO: Update petSelectorComboBox with pet names from petManager
        // After adding the pet, set the selected index to the last item (petManager.getPets().size() - 1)
    }

    /* ========== DO NOT MODIFY BELOW ========== */
    public void waitButtons(int seconds) {
        // Disable buttons
        feedButton.setEnabled(false);
        playButton.setEnabled(false);
        sleepButton.setEnabled(false);

        // Set a timer to re-enable the buttons after N seconds (1000 ms = 1 second)
        Timer timer = new Timer(seconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedButton.setEnabled(true);
                playButton.setEnabled(true);
                sleepButton.setEnabled(true);
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();
    }

    public void setPetImage(String base64Image) {
        try {
            byte[] imageBytes = Base64.getDecoder().decode(base64Image);
            ImageIcon icon = new ImageIcon(imageBytes);
            Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);

            imageLabel.setIcon(icon);
            imageLabel.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            imageLabel.setIcon(null);
            imageLabel.setText('❌' + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}
