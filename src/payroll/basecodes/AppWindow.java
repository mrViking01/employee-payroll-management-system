package payroll.basecodes;

import javax.swing.*;

public class AppWindow {

    public static void Switch(JFrame newPanel, JFrame oldPanel) {
        newPanel.setVisible(true);
        oldPanel.dispose();
    }

    public static void ShowPanel(JDialog dialog) {
        dialog.setVisible(true);
    }

    public static void ShowNotification(String statement) {
        JOptionPane.showMessageDialog(null, statement);
    }

    public static void ShowNotification(Exception statement) {
        JOptionPane.showMessageDialog(null, statement);
        System.out.println(statement);
    }
}
