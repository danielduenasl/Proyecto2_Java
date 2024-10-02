/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import static javax.swing.SwingConstants.CENTER;

public class CustomTable extends JTable {

    public CustomTable() {
        super(new DefaultTableModel());
        initUI();
    }

    public CustomTable(DefaultTableModel model) {
        super(model);
        initUI();
    }

    private void initUI() {
        setBorder(BorderFactory.createEmptyBorder());
        setShowGrid(false);
        setIntercellSpacing(new Dimension(0, 0));

        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setSelectionBackground(new Color(232, 50, 22));
        setRowHeight(25);

        JTableHeader header = getTableHeader();
        header.setDefaultRenderer(new CustomHeaderRenderer());
        header.setReorderingAllowed(false);
    }

    @Override
    protected void paintBorder(Graphics g) {
    }

    @Override
    public void setShowGrid(boolean showGrid) {
        super.setShowGrid(false);
    }

    private static class CustomHeaderRenderer extends DefaultTableCellRenderer {

        public CustomHeaderRenderer() {
            setOpaque(true);
            setBackground(new Color(222, 8, 163)); 
            setForeground(Color.WHITE); 
            setFont(new Font("Segoe UI", Font.BOLD, 14));
            setHorizontalAlignment(CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            return this;
        }
    }
}
