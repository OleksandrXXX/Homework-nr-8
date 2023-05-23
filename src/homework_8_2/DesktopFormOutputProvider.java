package homework_8_2;

import javax.swing.*;
import java.awt.*;

public class DesktopFormOutputProvider implements IOutputProvider {
    private final JFrame mainFrame;
    private final JPanel panel;
    private final GridBagConstraints gbc;

    public DesktopFormOutputProvider(String teamName) {
        mainFrame = new JFrame("Команда " + teamName);
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        mainFrame.add(panel);
        mainFrame.setLocationRelativeTo(null);
        gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
    }

    public void print(String message) {
        JLabel label = new JLabel(message, JLabel.LEFT);
        panel.add(label, gbc);
        mainFrame.setVisible(true);
    }
}

