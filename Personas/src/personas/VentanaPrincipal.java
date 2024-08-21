package personas;

import java.util.*;
import javax.swing.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class VentanaPrincipal extends javax.swing.JFrame {
       
    private ListaPersonas lista;
    private DefaultListModel modelo = new DefaultListModel();;
    
    
    public VentanaPrincipal() {
        initComponents();
        lista = new ListaPersonas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        labelDirec = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldApellido = new javax.swing.JTextField();
        textFieldTel = new javax.swing.JTextField();
        textFieldDirec = new javax.swing.JTextField();
        Añadir = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        BorrarLista = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("PERSONAS");

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");

        labelApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelApellido.setText("Apellido:");

        labelTel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTel.setText("Telefono:");

        labelDirec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDirec.setText("Direccion:");

        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        BorrarLista.setText("Borrar lista");
        BorrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarListaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Eliminar)
                        .addGap(97, 97, 97)
                        .addComponent(BorrarLista))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelApellido)
                            .addComponent(labelNombre)
                            .addComponent(labelDirec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombre)
                            .addComponent(textFieldApellido)
                            .addComponent(textFieldTel)
                            .addComponent(textFieldDirec, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Añadir)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTel)
                    .addComponent(textFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDirec)
                    .addComponent(textFieldDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(BorrarLista))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        
        Persona persona = new Persona(
                textFieldNombre.getText(),
                textFieldApellido.getText(),
                textFieldTel.getText(),
                textFieldDirec.getText());
        
        lista.añadirPersona(persona);
        
        String item = textFieldNombre.getText() +"-"+ 
                      textFieldApellido.getText() +"-"+ 
                      textFieldTel.getText() +"-"+ 
                      textFieldDirec.getText();
       
        modelo.addElement(item);
        jList1.setModel(modelo);
        
        textFieldNombre.setText("");
        textFieldApellido.setText("");
        textFieldTel.setText("");
        textFieldDirec.setText("");
        
    }//GEN-LAST:event_AñadirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        if (jList1.getSelectedIndex() >= 0) {
            modelo.removeElementAt(jList1.getSelectedIndex());
            lista.eliminarPersona(jList1.getSelectedIndex()+1);
            
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error ", JOptionPane.ERROR_MESSAGE);
        } 
 
    }//GEN-LAST:event_EliminarActionPerformed

    private void BorrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarListaActionPerformed
        
        lista.borrarLista();
        modelo.clear();
        
    }//GEN-LAST:event_BorrarListaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JButton BorrarLista;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelDirec;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTel;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldDirec;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTel;
    // End of variables declaration//GEN-END:variables
}
