/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import data.Conexion;
import data.Courses;
import data.Grade;
import data.Professor;
import data.Score;
import data.Student;
import frames.MainMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.SQLMethods;

/**
 *
 * @author PC
 */
public class jpCalificaciones extends javax.swing.JPanel {

    private MainMenu mainMenu; 
    private Conexion conexion;
    private List<Grade> grades = null;
    private SQLMethods SQL = null;
    /**
     * Creates new form jpCalificaciones
     */
    public jpCalificaciones(MainMenu mainM, Conexion Con) {
        initComponents();
        
        conexion = Con;
        mainMenu = mainM;
        grades = new ArrayList();
        SQL = new SQLMethods(conexion);
        ConsultarDatos();
        addRows(grades.get(0).getStudents());
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tableCalif.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        
        cbxGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGradoActionPerformed(evt);
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
        jLabel3 = new javax.swing.JLabel();
        cbxGrade = new models.CustomComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCalif = new models.CustomTable();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(760, 606));
        setPreferredSize(new java.awt.Dimension(760, 606));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CALIFICACIONES");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("GRADO");

        cbxGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));

        tableCalif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Carnet", "Nombre", "Materia", "Nota 1", "Nota 2", "Nota 3", "Nota 4"
            }
        ));
        tableCalif.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jScrollPane2.setViewportView(tableCalif);

        jpBtnInfo.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("MODIFICAR CALIFICACIONES");
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
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(jpBtnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    
    private void cbxGradoActionPerformed(java.awt.event.ActionEvent evt) {
         String gradoSeleccionado = (String) cbxGrade.getSelectedItem();
    
        DefaultTableModel modelo = (DefaultTableModel) tableCalif.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de añadir nuevas filas

        int SelectGrade = 0;
        modelo.setRowCount(0);
        int i = 0;

        if (gradoSeleccionado.equals("Primero")){
            SelectGrade = 1;
        } else if (gradoSeleccionado.equals("Segundo")) {
            SelectGrade = 2;
        } else if (gradoSeleccionado.equals("Tercero")) {
            SelectGrade = 3;
        } else if (gradoSeleccionado.equals("Cuarto")) {
            SelectGrade = 4;
        } else if (gradoSeleccionado.equals("Quinto")) {
            SelectGrade = 5;
        } else if (gradoSeleccionado.equals("Sexto")) {
            SelectGrade = 6;
        }
        
        for (Grade grade : grades) {
            if (grade.getIdGrade() == SelectGrade) {
                for (Student estudiante : grade.getStudents()) {
                    List<Courses> courses = estudiante.getCourse();

                    if (courses == null || courses.isEmpty()) {
                        System.out.println("El estudiante no tiene cursos asignados.");
                        continue;
                    }

                    for (int a = 0; a < Math.min(courses.size(), 6); a++) {
                        Score score = courses.get(a).getScore();
                        Object[] fila = {
                            estudiante.getCarnet(),
                            estudiante.getName(),
                            courses.get(a).getName(),
                            score.getScore1(),
                            score.getScore2(),
                            score.getScore3(),
                            score.getScore4(),
                        };
                        modelo.addRow(fila);
                    }
                }
                break;
            }
        }
    }
    
    private void addRows(List<Student> students) {
        DefaultTableModel modelo = (DefaultTableModel) tableCalif.getModel();
        modelo.setRowCount(0);
        for (Student student : students) {
            List<Courses> courses = student.getCourse();
            int a = 0;

            while (a < courses.size() && a < 6) {
                Score score = courses.get(a).getScore();
                Object[] fila = {
                    student.getCarnet(),
                    student.getName(),
                    courses.get(a).getName(),
                    score.getScore1(),
                    score.getScore2(),
                    score.getScore3(),
                    score.getScore4(),
                };
                modelo.addRow(fila);
                a++;
            }
        }
        tableCalif.setModel(modelo);
    }
    
    public void ConsultarDatos(){    
        int i = 0;
        Grade newGrade = null;
        while (i < 6){
            Professor professor = SQL.SelectProfessor((i + 1));
            newGrade = new Grade();
            newGrade.setProfessor(professor);
            List<Student> students = SQL.SelectStudents((i + 1));
            newGrade.setIdGrade((i + 1));
            newGrade.setStudents(students);
            grades.add(newGrade);
            i++;
        }
    }
    
    
    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked
        Student student = null;
        jpPromedio modificarNotas = new jpPromedio(conexion, student, "");
        modificarNotas.setSize(760, 606);
        modificarNotas.setLocation(0, 0);

        jpContentMain contentMain = new jpContentMain();
        contentMain.removeAll();
        contentMain.add(mainMenu.jpBarHeader, BorderLayout.NORTH);
        contentMain.add(modificarNotas, BorderLayout.CENTER);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.CustomComboBox cbxGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JPanel jpBtnInfo;
    private models.CustomTable tableCalif;
    // End of variables declaration//GEN-END:variables
}
