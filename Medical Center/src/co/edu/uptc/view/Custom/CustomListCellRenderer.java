package co.edu.uptc.view.Custom;

import javax.swing.DefaultListCellRenderer;
import javax.swing.border.Border;

import java.awt.*;
import javax.swing.*;

public class CustomListCellRenderer extends DefaultListCellRenderer {
    private static final Border SELECTED_BORDER = BorderFactory.createLineBorder(new Color(238, 238, 238), 2);
    private static final Border DEFAULT_BORDER = BorderFactory.createLineBorder(new Color(238, 238, 238), 1);

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        component.setFont(new Font("Arial", Font.PLAIN, 20));

        if (isSelected || list.getSelectedIndex() == index) {
            ((JComponent) component).setBorder(SELECTED_BORDER);
            component.setBackground(new Color(246, 248, 250));
            component.setForeground(list.getSelectionForeground());
        } else {
            ((JComponent) component).setBorder(DEFAULT_BORDER);
            component.setBackground(Color.WHITE);
            component.setForeground(list.getForeground());
        }
        component.setPreferredSize(new Dimension(getWidth(), 50));
        return component;
    }
}
