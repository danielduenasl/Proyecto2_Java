/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateField extends JFormattedTextField {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public CustomDateField() {
        initUI();
    }

    private void initUI() {
        DateFormatter dateFormatter = new DateFormatter(dateFormat);
        setFormatterFactory(new DefaultFormatterFactory(dateFormatter));

        setBorder(new EmptyBorder(5, 10, 5, 10));
        setBackground(Color.LIGHT_GRAY); 
        setForeground(Color.DARK_GRAY);   
        setFont(new Font("Arial", Font.BOLD, 14)); 
    }

    public Date getDate() throws ParseException {
        String text = getText();
        return dateFormat.parse(text);
    }

    public void setDate(Date date) {
        setText(dateFormat.format(date));
    }
}
