/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;

/**
 *
 * @author mono-
 */
public class Principal extends javax.swing.JFrame {


    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public JButton getClientes() {
        return Clientes;
    }

    public void setClientes(JButton Clientes) {
        this.Clientes = Clientes;
    }

    public JButton getDirecciones() {
        return Direcciones;
    }

    public void setDirecciones(JButton Direcciones) {
        this.Direcciones = Direcciones;
    }

    public JButton getFactCliente() {
        return FactCliente;
    }

    public void setFactCliente(JButton FactCliente) {
        this.FactCliente = FactCliente;
    }

    public JButton getFacturas() {
        return Facturas;
    }

    public void setFacturas(JButton Facturas) {
        this.Facturas = Facturas;
    }

    public JButton getPedidos() {
        return Pedidos;
    }

    public void setPedidos(JButton Pedidos) {
        this.Pedidos = Pedidos;
    }

    public JButton getProdFactura() {
        return ProdFactura;
    }

    public void setProdFactura(JButton ProdFactura) {
        this.ProdFactura = ProdFactura;
    }

    public JButton getProductos() {
        return Productos;
    }

    public void setProductos(JButton Productos) {
        this.Productos = Productos;
    }

    public JButton getProveedores() {
        return Proveedores;
    }

    public void setProveedores(JButton Proveedores) {
        this.Proveedores = Proveedores;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Clientes = new javax.swing.JButton();
        Direcciones = new javax.swing.JButton();
        Facturas = new javax.swing.JButton();
        Pedidos = new javax.swing.JButton();
        Productos = new javax.swing.JButton();
        Proveedores = new javax.swing.JButton();
        FactCliente = new javax.swing.JButton();
        ProdFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 169));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 169));

        jPanel2.setBackground(new java.awt.Color(71, 168, 244));
        jPanel2.setMaximumSize(new java.awt.Dimension(171, 42));
        jPanel2.setMinimumSize(new java.awt.Dimension(171, 42));

        jLabel1.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tablas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Clientes.setBackground(new java.awt.Color(71, 168, 244));
        Clientes.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        Clientes.setText("Clientes");
        Clientes.setToolTipText("");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });

        Direcciones.setBackground(new java.awt.Color(71, 168, 244));
        Direcciones.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        Direcciones.setText("Direcciones");
        Direcciones.setToolTipText("");
        Direcciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionesActionPerformed(evt);
            }
        });

        Facturas.setBackground(new java.awt.Color(71, 168, 244));
        Facturas.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        Facturas.setText("Facturas");
        Facturas.setToolTipText("");
        Facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturasActionPerformed(evt);
            }
        });

        Pedidos.setBackground(new java.awt.Color(71, 168, 244));
        Pedidos.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        Pedidos.setText("Pedidos");
        Pedidos.setToolTipText("");
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });

        Productos.setBackground(new java.awt.Color(71, 168, 244));
        Productos.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        Productos.setText("Productos");
        Productos.setToolTipText("");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });

        Proveedores.setBackground(new java.awt.Color(71, 168, 244));
        Proveedores.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        Proveedores.setText("Proveedores");
        Proveedores.setToolTipText("");
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });

        FactCliente.setBackground(new java.awt.Color(71, 168, 244));
        FactCliente.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        FactCliente.setText("Factura Cliente");
        FactCliente.setToolTipText("");
        FactCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactClienteActionPerformed(evt);
            }
        });

        ProdFactura.setBackground(new java.awt.Color(71, 168, 244));
        ProdFactura.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        ProdFactura.setText("Producto Factura");
        ProdFactura.setToolTipText("");
        ProdFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Direcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FactCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Proveedores)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FactCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
    }//GEN-LAST:event_ClientesActionPerformed

    private void DireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionesActionPerformed

    }//GEN-LAST:event_DireccionesActionPerformed

    private void FacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturasActionPerformed

    }//GEN-LAST:event_FacturasActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed

    }//GEN-LAST:event_PedidosActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProveedoresActionPerformed

    private void FactClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FactClienteActionPerformed

    private void ProdFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdFacturaActionPerformed

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
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Direcciones;
    private javax.swing.JButton FactCliente;
    private javax.swing.JButton Facturas;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton ProdFactura;
    private javax.swing.JButton Productos;
    private javax.swing.JButton Proveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
