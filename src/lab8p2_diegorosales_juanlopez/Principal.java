/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_diegorosales_juanlopez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jjlm1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jR_Administrador.setActionCommand("Administrador");
        jR_Participante.setActionCommand("Participante");
        bG_botones.add(jR_Administrador);
        bG_botones.add(jR_Participante);
        
    }

    private void llenarTorneosDisponibles() throws IOException{
        Adm adm = new Adm("./Guardados.jd");
        adm.cargarArchivo();
        DefaultListModel model =(DefaultListModel) jL_torneosdisponibles.getModel();
        for(Torneo t : adm.getTorneos()){
            if(t.isFlag_abierto()==true){
                model.addElement(t);
            }
        }
        jL_torneosdisponibles.setModel(model);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_pantalla_admin = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jb_salir3 = new javax.swing.JButton();
        bt_ganador = new javax.swing.JButton();
        bt_cerrar_torneo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_participantes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_torneos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_crear = new javax.swing.JButton();
        jf_nuevo_torneo = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre_torneo = new javax.swing.JTextField();
        bt_crear_torneo = new javax.swing.JButton();
        js_rondas = new javax.swing.JSpinner();
        jF_SignUp = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jB_salir2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jR_Participante = new javax.swing.JRadioButton();
        jR_Administrador = new javax.swing.JRadioButton();
        jB_Crear = new javax.swing.JButton();
        jT_crearnombre = new javax.swing.JTextField();
        jT_crearcontra = new javax.swing.JTextField();
        bG_botones = new javax.swing.ButtonGroup();
        jF_pantalla_participante = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        bT_salir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jL_torneoscerrados = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jL_torneosdisponibles = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jL_torneosganados = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        bT_unirsetorneo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        bt_signup = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();

        jf_pantalla_admin.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jb_salir3.setText("Salir");
        jb_salir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salir3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jb_salir3)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 397, Short.MAX_VALUE)
                .addComponent(jb_salir3))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 420));

        bt_ganador.setBackground(new java.awt.Color(255, 0, 0));
        bt_ganador.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        bt_ganador.setForeground(new java.awt.Color(255, 255, 255));
        bt_ganador.setText("Marcar Ganador");
        bt_ganador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_ganador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ganadorMouseClicked(evt);
            }
        });
        jPanel3.add(bt_ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 100, 30));

        bt_cerrar_torneo.setBackground(new java.awt.Color(102, 0, 51));
        bt_cerrar_torneo.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        bt_cerrar_torneo.setForeground(new java.awt.Color(255, 255, 255));
        bt_cerrar_torneo.setText("Cerrar Torneo");
        bt_cerrar_torneo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_cerrar_torneo.setPreferredSize(new java.awt.Dimension(81, 20));
        bt_cerrar_torneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrar_torneoMouseClicked(evt);
            }
        });
        jPanel3.add(bt_cerrar_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, 30));

        jl_participantes.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_participantes);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 170, 240));

        jl_torneos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_torneos);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, 240));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Personas dentro del torneo");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Torneos");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        bt_crear.setBackground(new java.awt.Color(0, 102, 102));
        bt_crear.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        bt_crear.setForeground(new java.awt.Color(255, 255, 255));
        bt_crear.setText("Crear Torneo");
        bt_crear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearMouseClicked(evt);
            }
        });
        jPanel3.add(bt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 90, 30));

        javax.swing.GroupLayout jf_pantalla_adminLayout = new javax.swing.GroupLayout(jf_pantalla_admin.getContentPane());
        jf_pantalla_admin.getContentPane().setLayout(jf_pantalla_adminLayout);
        jf_pantalla_adminLayout.setHorizontalGroup(
            jf_pantalla_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jf_pantalla_adminLayout.setVerticalGroup(
            jf_pantalla_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jf_nuevo_torneo.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 420));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Nombre del Torneo");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Rondas");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        tf_nombre_torneo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jPanel5.add(tf_nombre_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, 30));

        bt_crear_torneo.setBackground(new java.awt.Color(204, 0, 0));
        bt_crear_torneo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_crear_torneo.setForeground(new java.awt.Color(255, 255, 255));
        bt_crear_torneo.setText("Crear Torneo");
        bt_crear_torneo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_crear_torneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crear_torneoMouseClicked(evt);
            }
        });
        bt_crear_torneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crear_torneoActionPerformed(evt);
            }
        });
        jPanel5.add(bt_crear_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 120, 50));

        js_rondas.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jPanel5.add(js_rondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, 30));

        javax.swing.GroupLayout jf_nuevo_torneoLayout = new javax.swing.GroupLayout(jf_nuevo_torneo.getContentPane());
        jf_nuevo_torneo.getContentPane().setLayout(jf_nuevo_torneoLayout);
        jf_nuevo_torneoLayout.setHorizontalGroup(
            jf_nuevo_torneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_nuevo_torneoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jf_nuevo_torneoLayout.setVerticalGroup(
            jf_nuevo_torneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jF_SignUp.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(51, 255, 102));

        jB_salir2.setText("Salir");
        jB_salir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_salir2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jB_salir2)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jB_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre de Usuario");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");

        jR_Participante.setForeground(new java.awt.Color(0, 0, 0));
        jR_Participante.setSelected(true);
        jR_Participante.setText("Participante");
        jR_Participante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_ParticipanteActionPerformed(evt);
            }
        });

        jR_Administrador.setForeground(new java.awt.Color(0, 0, 0));
        jR_Administrador.setText("Administrador");

        jB_Crear.setBackground(new java.awt.Color(51, 255, 102));
        jB_Crear.setForeground(new java.awt.Color(0, 0, 0));
        jB_Crear.setText("Crear Usuario");
        jB_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_CrearMouseClicked(evt);
            }
        });
        jB_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_Crear)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jT_crearcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jR_Participante, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jR_Administrador))
                                .addComponent(jT_crearnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 205, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jT_crearnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jT_crearcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Participante)
                    .addComponent(jR_Administrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jB_Crear)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jF_SignUpLayout = new javax.swing.GroupLayout(jF_SignUp.getContentPane());
        jF_SignUp.getContentPane().setLayout(jF_SignUpLayout);
        jF_SignUpLayout.setHorizontalGroup(
            jF_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jF_SignUpLayout.setVerticalGroup(
            jF_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 102, 0));

        bT_salir.setText("Salir");
        bT_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bT_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(bT_salir)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 360, Short.MAX_VALUE)
                .addComponent(bT_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 420));

        jL_torneoscerrados.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jL_torneoscerrados);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, 240));

        jScrollPane4.setPreferredSize(new java.awt.Dimension(150, 300));

        jL_torneosdisponibles.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jL_torneosdisponibles);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, 240));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Torneos Cerrados");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 51));
        jLabel10.setText("Torneos Disponibles");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jScrollPane5.setViewportView(jL_torneosganados);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 140, 240));

        jLabel11.setForeground(new java.awt.Color(0, 255, 0));
        jLabel11.setText("Torneos Ganados");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        bT_unirsetorneo.setText("Unirse a Torneo");
        jPanel9.add(bT_unirsetorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        javax.swing.GroupLayout jF_pantalla_participanteLayout = new javax.swing.GroupLayout(jF_pantalla_participante.getContentPane());
        jF_pantalla_participante.getContentPane().setLayout(jF_pantalla_participanteLayout);
        jF_pantalla_participanteLayout.setHorizontalGroup(
            jF_pantalla_participanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        jF_pantalla_participanteLayout.setVerticalGroup(
            jF_pantalla_participanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 420));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nombre de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));
        jPanel1.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, 30));

        bt_login.setBackground(new java.awt.Color(204, 0, 0));
        bt_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setText("Iniciar Sesión");
        bt_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_loginMouseEntered(evt);
            }
        });
        jPanel1.add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 120, 50));

        bt_signup.setBackground(new java.awt.Color(0, 102, 102));
        bt_signup.setForeground(new java.awt.Color(255, 255, 255));
        bt_signup.setText("Registrar");
        bt_signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_signupMouseClicked(evt);
            }
        });
        jPanel1.add(bt_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, 50));
        jPanel1.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearMouseClicked
        // TODO add your handling code here:
        jf_nuevo_torneo.pack();
        jf_nuevo_torneo.setLocationRelativeTo(this);
        jf_nuevo_torneo.setVisible(true);
    }//GEN-LAST:event_bt_crearMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        // TODO add your handling code here:
        Adm adm = new Adm("./Guardados.jd");
        try {
            adm.cargarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean flag = false;
        
        for (int i = 0; i < adm.getUsuarios().size(); i++) {
            if(tf_username.getText().equals(adm.getUsuarios().get(i).getUser()) && pf_password.getText().equals(adm.getUsuarios().get(i).getPassword())){
                flag=true;
                pos=i;
                break;
            }
            
        }
        if(flag){
           if(adm.getUsuarios().get(pos) instanceof Admin){
               jf_pantalla_admin.pack();
                jf_pantalla_admin.setLocationRelativeTo(this);
                jf_pantalla_admin.setVisible(true);
                        this.setVisible(false);
           }
           else{
               try {
                   llenarTorneosDisponibles();
               } catch (IOException ex) {
                   Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
               }
               jF_pantalla_participante.pack();
               jF_pantalla_participante.setVisible(true);
               this.setVisible(false);
               
           }
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Usuario invalido");
        }
        
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_crear_torneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crear_torneoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bt_crear_torneoMouseClicked

    private void bt_cerrar_torneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrar_torneoMouseClicked
        // TODO add your handling code here:
        Adm adm = new Adm("./Guardados.jd");
        try {
            adm.cargarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(jl_torneos.getSelectedIndex()>=0){
            if(adm.getTorneos().get(jl_torneos.getSelectedIndex()).isFlag_abierto()==true){
            adm.getTorneos().get(jl_torneos.getSelectedIndex()).setFlag_abierto(false);
            JOptionPane.showMessageDialog(jf_pantalla_admin, "Torneo cerrado");
            }else{
             JOptionPane.showMessageDialog(jf_pantalla_admin, "El torneo ya está cerrado");   
            }
        }
    }//GEN-LAST:event_bt_cerrar_torneoMouseClicked

    private void bt_ganadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ganadorMouseClicked
        // TODO add your handling code here:
        Adm adm = new Adm("./Guardados.jd");
        try {
            adm.cargarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(jl_participantes.getSelectedIndex()>=0&&jl_torneos.getSelectedIndex()>=0){
        File archivo=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
            try {
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write("El participante "+adm.getTorneos().get(jl_torneos.getSelectedIndex()).getNombre()+" ha ganado el torneo "+adm.getTorneos().get(jl_torneos.getSelectedIndex()));
            } catch (Exception e) {
            }
            
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bt_ganadorMouseClicked

    private void jR_ParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_ParticipanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_ParticipanteActionPerformed

    private void jB_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_CrearMouseClicked
        if(!jT_crearnombre.getText().equals("") && !jT_crearcontra.getText().equals("")){
            Adm adm = new Adm("./Guardados.jd");

            if(bG_botones.getSelection().getActionCommand().equals("Administrador")){
                User u = new Admin(
                    0,
                    jT_crearnombre.getText(),
                    jT_crearcontra.getText());
                try {
                    adm.cargarArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                adm.getUsuarios().add(u);
                try {
                    adm.escribirArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Has creado un Administrador");
                jT_crearcontra.setText("");
                jT_crearnombre.setText("");
            }

            else if(bG_botones.getSelection().getActionCommand().equals("Participante")){
                User u = new Participante(
                jT_crearnombre.getText(),
                jT_crearcontra.getText()
                );
                try {
                    adm.cargarArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                adm.getUsuarios().add(u);
                try {
                    adm.escribirArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Has creado un Participante");
                jT_crearcontra.setText("");
                jT_crearnombre.setText("");
                JOptionPane.showMessageDialog(this, adm.getUsuarios());
            }

        }
        else{
            JOptionPane.showMessageDialog(this, "Hay un campo vacio");
        }

    }//GEN-LAST:event_jB_CrearMouseClicked

    private void jB_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_CrearActionPerformed

    private void bt_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_signupMouseClicked
        jF_SignUp.pack();
        jF_SignUp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_signupMouseClicked

    private void bt_crear_torneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crear_torneoActionPerformed
       Adm adm = new Adm("./Guardados.jd");
        
        DefaultListModel mm=(DefaultListModel)jl_torneos.getModel();
        boolean flag1=true;
        boolean flag2 = false;
        
        Torneo t = new Torneo(tf_nombre_torneo.getText(),flag1,flag2);
        
        
        try {
            adm.cargarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        adm.getTorneos().add(t);
        try {
            adm.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        mm.addElement(t);
        jl_torneos.setModel(mm);
        jf_nuevo_torneo.setVisible(false);
    }//GEN-LAST:event_bt_crear_torneoActionPerformed

    private void bT_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bT_salirMouseClicked
       jF_pantalla_participante.setVisible(false);
       this.pack();
       this.setVisible(true);
    }//GEN-LAST:event_bT_salirMouseClicked

    private void bt_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_loginMouseEntered

    private void jB_salir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_salir2MouseClicked
       jF_SignUp.setVisible(false);
       this.pack();
       this.setVisible(true);
    }//GEN-LAST:event_jB_salir2MouseClicked

    private void jb_salir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salir3MouseClicked
        jf_pantalla_admin.setVisible(false);
        this.pack();
        this.setVisible(true);
    }//GEN-LAST:event_jb_salir3MouseClicked

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
int pos=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.ButtonGroup bG_botones;
    private javax.swing.JButton bT_salir;
    private javax.swing.JButton bT_unirsetorneo;
    private javax.swing.JButton bt_cerrar_torneo;
    private javax.swing.JButton bt_crear;
    private javax.swing.JButton bt_crear_torneo;
    private javax.swing.JButton bt_ganador;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_signup;
    private javax.swing.JButton jB_Crear;
    private javax.swing.JButton jB_salir2;
    private javax.swing.JFrame jF_SignUp;
    private javax.swing.JFrame jF_pantalla_participante;
    private javax.swing.JList<String> jL_torneoscerrados;
    private javax.swing.JList<String> jL_torneosdisponibles;
    private javax.swing.JList<String> jL_torneosganados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jR_Administrador;
    private javax.swing.JRadioButton jR_Participante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jT_crearcontra;
    private javax.swing.JTextField jT_crearnombre;
    private javax.swing.JButton jb_salir3;
    private javax.swing.JFrame jf_nuevo_torneo;
    private javax.swing.JFrame jf_pantalla_admin;
    private javax.swing.JList<String> jl_participantes;
    private javax.swing.JList<String> jl_torneos;
    private javax.swing.JSpinner js_rondas;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_nombre_torneo;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
