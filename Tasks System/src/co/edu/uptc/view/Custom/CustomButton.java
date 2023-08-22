package co.edu.uptc.view.Custom;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomButton extends JButton {

    private Color defaultBackgroundColor;

    public CustomButton(String text) {
        super(text);
        initCustomStyle();
        setupMouseListeners();
    }

    private void initCustomStyle() {
        defaultBackgroundColor = Color.GRAY;
        setBackground(defaultBackgroundColor);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 18));
    }

    private void setupMouseListeners() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultBackgroundColor); // Restaurar color original
            }
        });
    }
}
