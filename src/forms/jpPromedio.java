/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package forms;

import data.Conexion;
import data.Courses;
import data.Grade;
import data.Student;
import frames.DatosModif;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import models.SQLMethods;

/**
 *
 * @author niza
 */
public class jpPromedio extends javax.swing.JPanel {

    private Conexion conexion = null;
    private Student studentS = null;
    private String mat = null;
    private SQLMethods SQL = null;
    /** Creates new form jpPromedio */
    public jpPromedio(Conexion Con, Student student, String materia) {
        initComponents();
        
        conexion = Con;
        studentS = student;
        mat = materia;
        SQL = new SQLMethods(conexion);
        
        if(student != null){
            txtEstudiante.setText(student.getName() + " " + student.getLastName());
        }
        if(materia != ""){
            if (materia.equals("Lenguaje"))
            {
                customComboBox1.setSelectedIndex(0);
            } else if (materia.equals("Matematicas")){ 
                customComboBox1.setSelectedIndex(1);
            } else if (materia.equals("Sociales")){ 
                customComboBox1.setSelectedIndex(2);
            } else if (materia.equals("Naturales")){ 
                customComboBox1.setSelectedIndex(3);
            } else if (materia.equals("Artes")){ 
                customComboBox1.setSelectedIndex(4);
            } else if (materia.equals("Fisica")){ 
                customComboBox1.setSelectedIndex(5);
            } 
        }
        if (student != null && materia != ""){
            Courses course = FiltrarNotas(materia, student.getCourse());
            txtCarnet.setText(student.getCarnet());
            txtNota1.setText(String.valueOf(course.getScore().getScore1()));
            txtNota2.setText(String.valueOf(course.getScore().getScore2()));
            txtNota3.setText(String.valueOf(course.getScore().getScore3()));
            txtNota4.setText(String.valueOf(course.getScore().getScore4()));
        }
        
        MostarPromedio();
        Aprueba();
        
        txtNota1.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    if (!txtNota1.getText().isEmpty()){
                        MostarPromedio();
                        Aprueba();
                    }                
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }
            });
        txtNota2.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    if (!txtNota2.getText().isEmpty()){
                        MostarPromedio();
                        Aprueba();
                    }   
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }
            });
        txtNota3.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    if (!txtNota3.getText().isEmpty()){
                        MostarPromedio();
                        Aprueba();
                    }   
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }
            });
        txtNota4.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    if (!txtNota4.getText().isEmpty()){
                        MostarPromedio();
                        Aprueba();
                    }   
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    MostarPromedio();
                    Aprueba();
                }
            });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        txtNota1 = new models.CustomTextField();
        txtNota2 = new models.CustomTextField();
        txtNota3 = new models.CustomTextField();
        txtNota4 = new models.CustomTextField();
        txtPromedio = new models.CustomTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEstudiante = new models.CustomTextField();
        customComboBox1 = new models.CustomComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCarnet = new models.CustomTextField();
        jpBtnGuardar = new javax.swing.JPanel();
        jlBtnGuardar = new javax.swing.JLabel();
        jpAprueba = new javax.swing.JPanel();
        jlAprueba = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLTitulo.setText("CALCULO DE PROMEDIO");

        txtNota1.setForeground(new java.awt.Color(51, 51, 51));
        txtNota1.setText("0");
        txtNota1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNota1InputMethodTextChanged(evt);
            }
        });
        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });

        txtNota2.setForeground(new java.awt.Color(51, 51, 51));
        txtNota2.setText("0");

        txtNota3.setForeground(new java.awt.Color(51, 51, 51));
        txtNota3.setText("0");

        txtNota4.setText("0");
        txtNota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota4ActionPerformed(evt);
            }
        });

        txtPromedio.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NOTA 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOTA 2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NOTA 4");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PROMEDIO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("NOTA 3");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("CARNET");

        customComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lenguaje", "Matematicas", "Sociales", "Naturales", "Artes", "Fisica" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("MATERIA");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("ESTUDIANTE");

        jpBtnGuardar.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnGuardar.setLayout(new java.awt.BorderLayout());

        jlBtnGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnGuardar.setText("GUARDAR DATOS");
        jlBtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBtnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBtnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBtnGuardarMouseExited(evt);
            }
        });
        jpBtnGuardar.add(jlBtnGuardar, java.awt.BorderLayout.CENTER);

        jpAprueba.setBackground(new java.awt.Color(222, 8, 163));
        jpAprueba.setLayout(new java.awt.BorderLayout());
        jpAprueba.add(jlAprueba, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jpBtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNota3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jpAprueba, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(txtNota2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNota4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(customComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNota2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jpAprueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

   public Courses FiltrarNotas(String materiabusq, List<Courses> course) {

        for (Courses cours : course) {
            if (cours.getName().equals(materiabusq)) {
                return cours;
            }
        }
        return null;
    }
   
    private void txtNota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota4ActionPerformed

    private void jlBtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnGuardarMouseClicked
        try{
            Courses course = FiltrarNotas(mat, studentS.getCourse());
            int result = SQL.UpdateNotas(course.getScore());
            if (result > 0){
                txtCarnet.setText("");
                txtEstudiante.setText("");
                txtNota1.setText("0");
                txtNota2.setText("0");
                txtNota3.setText("0");
                txtNota4.setText("0");
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (Exception ex){
            
        }
        jpBtnGuardar.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnGuardarMouseClicked

    private void jlBtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnGuardarMouseEntered
        jpBtnGuardar.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnGuardarMouseEntered

    private void jlBtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnGuardarMouseExited
        jpBtnGuardar.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnGuardarMouseExited

    private void txtNota1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNota1InputMethodTextChanged

    }//GEN-LAST:event_txtNota1InputMethodTextChanged

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
        
    }//GEN-LAST:event_txtNota1ActionPerformed

    DatosModif DM = null;
    private void MostarPromedio(){
        float n1 = Float.parseFloat(txtNota1.getText());
        float n2 = Float.parseFloat(txtNota2.getText());
        float n3 = Float.parseFloat(txtNota3.getText());
        float n4 = Float.parseFloat(txtNota4.getText());
        txtPromedio.setText(String.valueOf((n1 + n2 + n3 + n4)/ 4));
    }
    
    private void Aprueba(){
        ImageIcon No = new ImageIcon(getClass().getResource("/images/NoAprob.png"));
        ImageIcon SI = new ImageIcon(getClass().getResource("/images/SiAprob.png"));
        if (Float.parseFloat(txtPromedio.getText()) >= 60){
            jlAprueba.setIcon(SI);
            jlAprueba.setHorizontalAlignment(CENTER);
            jlAprueba.setVerticalAlignment(CENTER);
            jpAprueba.setBackground(Color.green);
        } else {
            jlAprueba.setIcon(No);
            jlAprueba.setHorizontalAlignment(CENTER);
            jlAprueba.setVerticalAlignment(CENTER);
            jpAprueba.setBackground(Color.red);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.CustomComboBox customComboBox1;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAprueba;
    private javax.swing.JLabel jlBtnGuardar;
    private javax.swing.JPanel jpAprueba;
    private javax.swing.JPanel jpBtnGuardar;
    private models.CustomTextField txtCarnet;
    private models.CustomTextField txtEstudiante;
    private models.CustomTextField txtNota1;
    private models.CustomTextField txtNota2;
    private models.CustomTextField txtNota3;
    private models.CustomTextField txtNota4;
    private models.CustomTextField txtPromedio;
    // End of variables declaration//GEN-END:variables

}
