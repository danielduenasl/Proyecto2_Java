/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import static javax.swing.SwingConstants.CENTER;


public class CustomPassField extends JPasswordField {

    public CustomPassField() {
        this(20);
    }

    public CustomPassField(int columns) {
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
    
}