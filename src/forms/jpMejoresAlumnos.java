/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import java.awt.Color;
import models.nada;

/**
 *
 * @author PC
 */
public class jpMejoresAlumnos extends javax.swing.JPanel {

    /**
     * Creates new form jpMejoresAlumnos
     */
    public jpMejoresAlumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MEJORES ALUMNOS");

        jpBtnInfo.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("YA NO HAY NADA");
        jlBtnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseExited(evt);
            }
        });
        jpBtnInfo.add(jlBtnInfo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 447, Short.MAX_VALUE)
                .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked
        nada nd = new nada();
        nd.show();
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseClicked

    private void jlBtnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseEntered
        jpBtnInfo.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnInfoMouseEntered

    private void jlBtnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseExited
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JPanel jpBtnInfo;
    // End of variables declaration//GEN-END:variables
}
