package co.edu.uptc.view.Custom;

import javax.swing.*;

import java.awt.*;

public class CustomJList extends JList<String> {

    public CustomJList() {
        ListCellRenderer<? super String> cellRenderer = new CustomListCellRenderer();
        setCellRenderer(cellRenderer);
        setSize(new Dimension(300, 300));
    }
}
