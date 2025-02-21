
package dashboard;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class hoverPanelListener extends MouseAdapter {
    
    private final Color hoverPanelColor;
    private final Color originalPanelColor;
    private final JLabel label;
    private final Color hoverLabelColor;
    private final Color originalLabelColor;

    public hoverPanelListener(Color hoverPanelColor, Color originalPanelColor, JLabel label, Color hoverLabelColor) {
        this.hoverPanelColor = hoverPanelColor;
        this.originalPanelColor = originalPanelColor;
        this.label = label;
        this.hoverLabelColor = hoverLabelColor;
        this.originalLabelColor = (label != null) ? label.getForeground() : null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JPanel panel = (JPanel) e.getSource();
        panel.setBackground(hoverPanelColor);

        if (label != null) {
            label.setForeground(hoverLabelColor);
            label.repaint();
        }

        panel.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JPanel panel = (JPanel) e.getSource();
        panel.setBackground(originalPanelColor);

        if (label != null) {
            label.setForeground(originalLabelColor);
            label.repaint();
        }
        panel.repaint();
    }



   
}

