/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.conexion;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 *
 * @author Diana
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        apagar();
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    JFileChooser selector = new JFileChooser();
    File archivo;
    String ruta;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void cargarsonido(String ruta) {
        File sonido = new File(ruta);
        try {
            Clip misonido = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(sonido);
            misonido.open(ais);
            misonido.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void cambiarestados() {
        ImageIcon imagen = new ImageIcon("src/imagenes/conectado.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Desconectado.getWidth(), Desconectado.getHeight(), 0));
        Desconectado.setIcon(icono);
        this.repaint();
        j_conectado.setText("CONECTADO");
        j_conectado.setForeground(Color.red);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void apagar() {
        btn_abrir.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_borrart.setEnabled(true);
        btn_desconectar.setEnabled(false);
        btn_examinar.setEnabled(false);
        btn_subir.setEnabled(false);
        btn_descargar.setEnabled(false);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Desconectado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        j_estado = new javax.swing.JLabel();
        txt_servidor = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        j_conectado = new javax.swing.JLabel();
        btn_conectar = new javax.swing.JButton();
        btn_desconectar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_examinar = new javax.swing.JButton();
        btn_subir = new javax.swing.JButton();
        txt_ruta = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_descargar = new javax.swing.JButton();
        btn_abrir = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_borrart = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaarchivos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listadescarga = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conectar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        Desconectado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desconectado.png"))); // NOI18N
        Desconectado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DesconectadoPropertyChange(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SERVIDOR");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA");

        j_estado.setForeground(new java.awt.Color(255, 255, 255));
        j_estado.setText("ESTADO: ");

        txt_servidor.setBackground(new java.awt.Color(255, 255, 255));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));

        txt_contraseña.setBackground(new java.awt.Color(255, 255, 255));

        j_conectado.setForeground(new java.awt.Color(255, 255, 255));
        j_conectado.setText("Desconectado");

        btn_conectar.setBackground(new java.awt.Color(255, 255, 255));
        btn_conectar.setForeground(new java.awt.Color(0, 0, 0));
        btn_conectar.setText("Conectar");
        btn_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conectarActionPerformed(evt);
            }
        });

        btn_desconectar.setBackground(new java.awt.Color(255, 255, 255));
        btn_desconectar.setForeground(new java.awt.Color(0, 0, 0));
        btn_desconectar.setText("Desconectar");
        btn_desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_servidor)
                            .addComponent(txt_usuario)
                            .addComponent(txt_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_conectar)
                        .addGap(78, 78, 78)
                        .addComponent(btn_desconectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j_estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j_conectado)
                        .addGap(118, 118, 118)))
                .addComponent(Desconectado)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desconectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_estado)
                    .addComponent(j_conectado)
                    .addComponent(btn_conectar)
                    .addComponent(btn_desconectar))
                .addGap(10, 10, 10))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subir archivo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btn_examinar.setBackground(new java.awt.Color(255, 255, 255));
        btn_examinar.setForeground(new java.awt.Color(0, 0, 0));
        btn_examinar.setText("Examinar");
        btn_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examinarActionPerformed(evt);
            }
        });

        btn_subir.setBackground(new java.awt.Color(255, 255, 255));
        btn_subir.setForeground(new java.awt.Color(0, 0, 0));
        btn_subir.setText("Subir");
        btn_subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirActionPerformed(evt);
            }
        });

        txt_ruta.setBackground(new java.awt.Color(102, 102, 102));
        txt_ruta.setForeground(new java.awt.Color(255, 255, 255));
        txt_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_examinar)
                .addGap(31, 31, 31)
                .addComponent(btn_subir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_examinar)
                    .addComponent(btn_subir)
                    .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión de archivos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Listado de archivos");

        jLabel5.setText("Mis descargas");

        btn_descargar.setBackground(new java.awt.Color(255, 255, 255));
        btn_descargar.setForeground(new java.awt.Color(0, 0, 0));
        btn_descargar.setText("Descargar archivo seleccionado");
        btn_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descargarActionPerformed(evt);
            }
        });

        btn_abrir.setBackground(new java.awt.Color(255, 255, 255));
        btn_abrir.setForeground(new java.awt.Color(0, 0, 0));
        btn_abrir.setText("Abrir seleccionado");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_borrar.setText("Borrar seleccionado");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_borrart.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrart.setForeground(new java.awt.Color(0, 0, 0));
        btn_borrart.setText("Borrar todo");
        btn_borrart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrartActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.gif"))); // NOI18N

        listaarchivos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaarchivosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaarchivos);

        listadescarga.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listadescargaValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listadescarga);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btn_descargar))
                        .addGap(152, 152, 152))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(59, 59, 59)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_abrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrart))
                    .addComponent(jScrollPane4))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_descargar)
                            .addComponent(btn_abrir)
                            .addComponent(btn_borrar)
                            .addComponent(btn_borrart)))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesconectadoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DesconectadoPropertyChange

    }//GEN-LAST:event_DesconectadoPropertyChange
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void btn_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examinarActionPerformed
        selector.showOpenDialog(selector);
        archivo = selector.getSelectedFile();
        ruta = archivo.getAbsolutePath();
        txt_ruta.setText(ruta);
        if (txt_ruta.getText() != "") {
            btn_subir.setEnabled(true);
        }
    }//GEN-LAST:event_btn_examinarActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void btn_subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirActionPerformed

        conexion.subir(ruta);
        conexion.listaarchivos(listaarchivos);
    }//GEN-LAST:event_btn_subirActionPerformed

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void btn_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conectarActionPerformed

        if (txt_contraseña.getText().equals("") && txt_servidor.getText().equals("") && txt_usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error, campos vacios");
        } else if (conexion.conectar(txt_servidor.getText(), txt_usuario.getText(), txt_contraseña.getText())) {
            cambiarestados();
            cargarsonido("sonidos/conexion.wav");
            btn_conectar.setEnabled(false);
            btn_desconectar.setEnabled(true);
            btn_examinar.setEnabled(true);
            conexion.listaarchivos(listaarchivos);
            conexion.listadescargas(listadescarga);
        } else {
            cargarsonido("sonidos/error_conexion.wav");
            txt_contraseña.setText("");
            txt_servidor.setText("");
            txt_usuario.setText("");
        }
    }//GEN-LAST:event_btn_conectarActionPerformed

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    

    private void btn_desconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desconectarActionPerformed
        conexion.desconectar();
        btn_conectar.setEnabled(true);
        btn_desconectar.setEnabled(false);
        ImageIcon imagen = new ImageIcon("src/imagenes/desconectado.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Desconectado.getWidth(), Desconectado.getHeight(), 0));
        Desconectado.setIcon(icono);
        this.repaint();
        j_conectado.setText("DESCONECTADO");
        j_conectado.setForeground(Color.GRAY);
        apagar();
        btn_borrart.setEnabled(false);
        txt_contraseña.setText("");
        txt_servidor.setText("");
        txt_contraseña.setText("");
        listaarchivos.setListData(new String[0]);
        listadescarga.setListData(new String [0]);
        
    }//GEN-LAST:event_btn_desconectarActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void txt_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutaActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void btn_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descargarActionPerformed

        conexion.descargar(listaarchivos.getSelectedValue().toString());
        conexion.listadescargas(listadescarga);

    }//GEN-LAST:event_btn_descargarActionPerformed

    private void listaarchivosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaarchivosValueChanged
        if (listaarchivos.getSelectedIndex() == -1) {
            btn_descargar.setEnabled(false);
        } else {
            btn_descargar.setEnabled(true);
        }
    }//GEN-LAST:event_listaarchivosValueChanged

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        conexion.abrirf(listadescarga);
        listadescarga.setSelectedValue(null, false);
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        conexion.borrar(listadescarga);
        listadescarga.setSelectedValue(null, false);
        conexion.listadescargas(listadescarga);
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_borrartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrartActionPerformed
        conexion.borrart("/Descargas/Pruebaftp/");
        conexion.listadescargas(listadescarga);
        btn_borrar.setEnabled(false);
        btn_borrart.setEnabled(false);
        btn_abrir.setEnabled(false);
    }//GEN-LAST:event_btn_borrartActionPerformed

    private void listadescargaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listadescargaValueChanged
        if (listadescarga.getSelectedIndex() == -1) {
            btn_borrar.setEnabled(false);
            btn_abrir.setEnabled(false);
        } else {
            btn_borrar.setEnabled(true);
            btn_abrir.setEnabled(true);
        }
    }//GEN-LAST:event_listadescargaValueChanged
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Desconectado;
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_borrart;
    private javax.swing.JButton btn_conectar;
    private javax.swing.JButton btn_descargar;
    private javax.swing.JButton btn_desconectar;
    private javax.swing.JButton btn_examinar;
    private javax.swing.JButton btn_subir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel j_conectado;
    private javax.swing.JLabel j_estado;
    private javax.swing.JList<String> listaarchivos;
    private javax.swing.JList<String> listadescarga;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_ruta;
    private javax.swing.JTextField txt_servidor;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
