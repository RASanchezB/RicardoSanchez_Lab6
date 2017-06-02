package lab6_ricardosanchez;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Lab6 extends javax.swing.JFrame {
    
    public Lab6() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_MenuUsuario = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_NombreC = new javax.swing.JTextField();
        tf_Edad = new javax.swing.JTextField();
        jb_GuardarC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cb_ElimCliente = new javax.swing.JComboBox<>();
        jb_BorrarC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_NombreP = new javax.swing.JTextField();
        tf_Categoria = new javax.swing.JTextField();
        tf_Precio = new javax.swing.JTextField();
        tf_Descuento = new javax.swing.JTextField();
        jb_GuardarP = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cb_ElimProducto = new javax.swing.JComboBox<>();
        jb_BorrarP = new javax.swing.JButton();
        jb_ActualizarElimP = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cb_ModProductos = new javax.swing.JComboBox<>();
        jb_ModProducto = new javax.swing.JButton();
        jb_ActualizarModP = new javax.swing.JButton();
        jd_MenuCliente = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        cb_Compra = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_Productos = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jb_ActualizarLista = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jd_MenuUsuario.setTitle("Menu Usuario");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Nuevo Clientes");

        jLabel4.setText("Nombre");

        jLabel5.setText("Edad");

        jb_GuardarC.setText("Guardar");
        jb_GuardarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarCMouseClicked(evt);
            }
        });
        jb_GuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_NombreC)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_GuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_NombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_GuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Cliente", jPanel1);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel11.setText("Clientes");

        jb_BorrarC.setText("Borrar");
        jb_BorrarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_BorrarCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_ElimCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jb_BorrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cb_ElimCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jb_BorrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Cliente", jPanel4);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("Nuevo Producto");

        jLabel7.setText("Nombre del producto");

        jLabel8.setText("Categoria del producto");

        jLabel9.setText("Precio del producto");

        jLabel10.setText("Descuento del producto");

        jb_GuardarP.setText("Guardar");
        jb_GuardarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_NombreP)
                                    .addComponent(tf_Categoria)
                                    .addComponent(tf_Precio)
                                    .addComponent(tf_Descuento, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_GuardarP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_GuardarP, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Producto", jPanel3);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setText("Productos");

        jb_BorrarP.setText("Borrar");
        jb_BorrarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_BorrarPMouseClicked(evt);
            }
        });

        jb_ActualizarElimP.setText("Actualizar ");
        jb_ActualizarElimP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ActualizarElimPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cb_ElimProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jb_BorrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jb_ActualizarElimP)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ElimProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ActualizarElimP))
                .addGap(46, 46, 46)
                .addComponent(jb_BorrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Producto", jPanel5);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel13.setText("Productos");

        jb_ModProducto.setText("Modificar");
        jb_ModProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ModProductoMouseClicked(evt);
            }
        });

        jb_ActualizarModP.setText("Actualizar");
        jb_ActualizarModP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ActualizarModPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jb_ModProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_ModProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_ActualizarModP)
                .addGap(134, 134, 134))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ModProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ActualizarModP))
                .addGap(38, 38, 38)
                .addComponent(jb_ModProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Producto", jPanel6);

        javax.swing.GroupLayout jd_MenuUsuarioLayout = new javax.swing.GroupLayout(jd_MenuUsuario.getContentPane());
        jd_MenuUsuario.getContentPane().setLayout(jd_MenuUsuarioLayout);
        jd_MenuUsuarioLayout.setHorizontalGroup(
            jd_MenuUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_MenuUsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jd_MenuUsuarioLayout.setVerticalGroup(
            jd_MenuUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_MenuUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel14.setText("Compras");

        cb_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CompraActionPerformed(evt);
            }
        });

        jLabel15.setText("Cliente");

        jl_Productos.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_Productos);

        jLabel16.setText("Productos:");

        jButton3.setText("Comprar");

        jb_ActualizarLista.setText("Acrualizar lista");
        jb_ActualizarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ActualizarListaMouseClicked(evt);
            }
        });

        jButton4.setText("Factorar");

        javax.swing.GroupLayout jd_MenuClienteLayout = new javax.swing.GroupLayout(jd_MenuCliente.getContentPane());
        jd_MenuCliente.getContentPane().setLayout(jd_MenuClienteLayout);
        jd_MenuClienteLayout.setHorizontalGroup(
            jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_MenuClienteLayout.createSequentialGroup()
                .addGroup(jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_MenuClienteLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_MenuClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cb_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel16)))
                        .addGroup(jd_MenuClienteLayout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addComponent(jLabel14))))
                .addGroup(jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_MenuClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_ActualizarLista)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_MenuClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(29, 29, 29))))
        );
        jd_MenuClienteLayout.setVerticalGroup(
            jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_MenuClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(11, 11, 11)
                .addGroup(jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(2, 2, 2)
                .addGroup(jd_MenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_MenuClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))
                    .addGroup(jd_MenuClienteLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_ActualizarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(43, 43, 43))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("MENU PRINCIPAL");

        jButton1.setText("Cliente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Usuario");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setText("Es usted un:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_MenuCliente.setModal(true);
        jd_MenuCliente.pack();
        jd_MenuCliente.setLocationRelativeTo(this);
        jd_MenuCliente.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jd_MenuUsuario.setModal(true);
        jd_MenuUsuario.pack();
        jd_MenuUsuario.setLocationRelativeTo(this);
        jd_MenuUsuario.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jb_GuardarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarCMouseClicked
        String Nombre = tf_NombreC.getText();
        int Edad = Integer.parseInt(tf_Edad.getText());
        Clientes C = new Clientes(Nombre,Edad);
        tf_NombreC.setText("");
        tf_Edad.setText("");
        JOptionPane.showMessageDialog(this, "Guardado");
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_ElimCliente.getModel();
        modelo.addElement(C);
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_Compra.getModel();
        modelo2.addElement(C);
    }//GEN-LAST:event_jb_GuardarCMouseClicked

    private void jb_GuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarCActionPerformed
        
    }//GEN-LAST:event_jb_GuardarCActionPerformed

    private void jb_GuardarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarPMouseClicked
        
        String NombreP = tf_NombreP.getText();
        String Categoria = tf_Categoria.getText();
        double Precio = Double.parseDouble(tf_Precio.getText());
        double Descuento = Double.parseDouble(tf_Descuento.getText());
        Productos P = new Productos(NombreP,Categoria,Precio,Descuento);
        A.getListaP().add(new Productos(NombreP,Categoria,Precio,Descuento));
        JOptionPane.showMessageDialog(this, "Guardado");
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_ElimProducto.getModel();
        modelo.addElement(P);
        try {
            A.cargarArchivo();
            A.escribirArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jb_GuardarPMouseClicked

    private void jb_BorrarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_BorrarCMouseClicked
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_ElimCliente.getModel();
        cb_ElimCliente.removeItem(cb_ElimCliente.getSelectedItem());
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_Compra.getModel();
        cb_Compra.removeItem(cb_Compra.getSelectedItem());
    }//GEN-LAST:event_jb_BorrarCMouseClicked

    private void jb_BorrarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_BorrarPMouseClicked
       DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_ElimProducto.getModel();
       modelo.removeElement(modelo.getSelectedItem());
       
    }//GEN-LAST:event_jb_BorrarPMouseClicked

    private void jb_ActualizarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ActualizarListaMouseClicked
        A.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_Productos.getModel();
        modelo.clear();
        for (int i = 0; i < A.getListaP().size(); i++) {
            Productos p = A.getListaP().get(i);
            modelo.addElement(p);
        }
    }//GEN-LAST:event_jb_ActualizarListaMouseClicked

    private void jb_ActualizarElimPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ActualizarElimPMouseClicked
        A.cargarArchivo();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cb_ElimProducto.getModel();
        cb_ElimProducto.removeAll();
        for (int i = 0; i < A.getListaP().size(); i++) {
            Productos p = A.getListaP().get(i);
            modelo.addElement(p);
        }
        
    }//GEN-LAST:event_jb_ActualizarElimPMouseClicked

    private void jb_ActualizarModPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ActualizarModPMouseClicked
        A.cargarArchivo();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cb_ModProductos.getModel();
        cb_ModProductos.removeAll();
        for (int i = 0; i < A.getListaP().size(); i++) {
            Productos p = A.getListaP().get(i);
            modelo.addElement(p);
        }
    }//GEN-LAST:event_jb_ActualizarModPMouseClicked

    private void jb_ModProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ModProductoMouseClicked
        A.cargarArchivo();
        String Nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
        String Categoria = JOptionPane.showInputDialog("Ingrese la categoria");
        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
        double Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento"));
        int pos = cb_ModProductos.getSelectedIndex();
        A.getListaP().set(pos, new Productos(Nombre,Categoria,Precio,Descuento));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cb_ModProductos.getModel();
        modelo.insertElementAt(A.getListaP().get(pos), pos);
        modelo.removeElementAt(pos + 1);
    }//GEN-LAST:event_jb_ModProductoMouseClicked

    private void cb_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_CompraActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Compra;
    private javax.swing.JComboBox<String> cb_ElimCliente;
    private javax.swing.JComboBox<String> cb_ElimProducto;
    private javax.swing.JComboBox<String> cb_ModProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_ActualizarElimP;
    private javax.swing.JButton jb_ActualizarLista;
    private javax.swing.JButton jb_ActualizarModP;
    private javax.swing.JButton jb_BorrarC;
    private javax.swing.JButton jb_BorrarP;
    private javax.swing.JButton jb_GuardarC;
    private javax.swing.JButton jb_GuardarP;
    private javax.swing.JButton jb_ModProducto;
    private javax.swing.JDialog jd_MenuCliente;
    private javax.swing.JDialog jd_MenuUsuario;
    private javax.swing.JList<String> jl_Productos;
    private javax.swing.JTextField tf_Categoria;
    private javax.swing.JTextField tf_Descuento;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_NombreC;
    private javax.swing.JTextField tf_NombreP;
    private javax.swing.JTextField tf_Precio;
    // End of variables declaration//GEN-END:variables
Administracion A = new Administracion("./Salida.txt");
}
