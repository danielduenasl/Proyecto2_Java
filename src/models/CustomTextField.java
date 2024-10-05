/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.*;
import java.awt.*;

public class CustomTextField extends JTextField {

    public CustomTextField() {
        this(20);
    }

    public CustomTextField(int columns) {
        super(columns);
        initUI();
    }

    private void initUI() {
        setBorder(BorderFactory.createEmptyBorder());
        setFocusTraversalKeysEnabled(false);
        setOpaque(false);
        setHorizontalAlignment(CENTER);
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Arial", Font.BOLD, 14));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
    }

    public void getText(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
