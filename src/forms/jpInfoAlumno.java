/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import data.Conexion;
import data.Student;
import frames.MainMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class jpInfoAlumno extends javax.swing.JPanel {

    private MainMenu mainMenu;
    private Student stud = null;
    private Conexion conexion = null;
    /**
     * Creates new form jpInfoAlumno
     */
    public jpInfoAlumno(MainMenu mainM, Student student, Conexion Con) {
        initComponents();
        stud = student;
        conexion = Con;
        
        this.mainMenu = mainM;
        txtNombre.setText(student.getName());
        txtApellido.setText(student.getLastName());
        txtEdad.setText(String.valueOf(student.getAge()));
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        txtDateB.setText(formatoFecha.format(student.getDateOfBirth()));
        if (student.getGender().equals("M"))
        {
            cbxGenero.setSelectedIndex(0);
        } else { 
            cbxGenero.setSelectedIndex(1);
        }
        
        if (student.getGrade().equals("Primero"))
        {
            cbxGrado.setSelectedIndex(0);
        } else if (student.getGrade().equals("Segundo")){ 
            cbxGrado.setSelectedIndex(1);
        } else if (student.getGrade().equals("Tercero")){ 
            cbxGrado.setSelectedIndex(2);
        } else if (student.getGrade().equals("Cuarto")){ 
            cbxGrado.setSelectedIndex(3);
        } else if (student.getGrade().equals("Quinto")){ 
            cbxGrado.setSelectedIndex(4);
        } else if (student.getGrade().equals("Sexto")){ 
            cbxGrado.setSelectedIndex(5);
        } 
        
        Genero();
        cbxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGradoActionPerformed(evt);
            }   
        });
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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new models.CustomTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new models.CustomTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new models.CustomTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDateB = new models.CustomDateField();
        jLabel6 = new javax.swing.JLabel();
        cbxGenero = new models.CustomComboBox();
        jLabel7 = new javax.swing.JLabel();
        cbxGrado = new models.CustomComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlGenero = new javax.swing.JLabel();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INFORMACION DEL ALUMNO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("EDAD");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FECHA DE NACIMIENTO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("GENERO");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("GRADO");

        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jlGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jlGenero, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpBtnInfo.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("CONSULTAR CALIFICACIONES");
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
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpBtnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDateB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(263, 263, 263)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxGrado, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked
        Student student = stud;
        jpNotasAlumno notasAlumno = new jpNotasAlumno(mainMenu, student, conexion);
        notasAlumno.setSize(760, 606);
        notasAlumno.setLocation(0, 0);

        jpContentMain contentMain = new jpContentMain();
        contentMain.removeAll();
        contentMain.add(mainMenu.jpBarHeader, BorderLayout.NORTH);
        contentMain.add(notasAlumno, BorderLayout.CENTER);
        contentMain.revalidate();
        contentMain.repaint();
        
        mainMenu.jpContent.removeAll();
        mainMenu.jpContent.add(contentMain, BorderLayout.CENTER);
        mainMenu.jpContent.revalidate();
        mainMenu.jpContent.repaint();
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseClicked

    private void jlBtnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseEntered
        jpBtnInfo.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnInfoMouseEntered

    private void jlBtnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseExited
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseExited

    private void jComboBoxGradoActionPerformed(java.awt.event.ActionEvent evt) {
        String gradoSeleccionado = (String) cbxGenero.getSelectedItem();

        ImageIcon man = new ImageIcon(getClass().getResource("/images/man.png"));
        ImageIcon woman = new ImageIcon(getClass().getResource("/images/woman.png"));
        if (gradoSeleccionado.equals("M")){
            jlGenero.setIcon(man);
            jlGenero.setHorizontalAlignment(CENTER);
            jlGenero.setVerticalAlignment(CENTER);
        } else {
            jlGenero.setIcon(woman);
            jlGenero.setHorizontalAlignment(CENTER);
            jlGenero.setVerticalAlignment(CENTER);
        }
    }
    
    private void Genero(){
        String gradoSeleccionado = (String) cbxGenero.getSelectedItem();

        ImageIcon man = new ImageIcon(getClass().getResource("/images/man.png"));
        ImageIcon woman = new ImageIcon(getClass().getResource("/images/woman.png"));
        if (gradoSeleccionado.equals("M")){
            jlGenero.setIcon(man);
            jlGenero.setHorizontalAlignment(CENTER);
            jlGenero.setVerticalAlignment(CENTER);
        } else {
            jlGenero.setIcon(woman);
            jlGenero.setHorizontalAlignment(CENTER);
            jlGenero.setVerticalAlignment(CENTER);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.CustomComboBox cbxGenero;
    private models.CustomComboBox cbxGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JPanel jpBtnInfo;
    private models.CustomTextField txtApellido;
    private models.CustomDateField txtDateB;
    private models.CustomTextField txtEdad;
    private models.CustomTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
