package teoria.pkg2;

import java.awt.SystemColor;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crear_Empresa = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Emp_nom = new javax.swing.JTextField();
        emp_cif = new javax.swing.JTextField();
        emp_direct = new javax.swing.JTextField();
        Emp_direccion = new javax.swing.JTextField();
        C_Empresa = new javax.swing.JButton();
        Menu_Creacion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();

        jLabel1.setText("Creación Empresa");

        jLabel2.setText("Nombre");

        jLabel3.setText("CIF");

        jLabel4.setText("Director");

        jLabel5.setText("Direccion");

        C_Empresa.setText("Crear Empresa");

        javax.swing.GroupLayout Crear_EmpresaLayout = new javax.swing.GroupLayout(Crear_Empresa.getContentPane());
        Crear_Empresa.getContentPane().setLayout(Crear_EmpresaLayout);
        Crear_EmpresaLayout.setHorizontalGroup(
            Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_EmpresaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(Crear_EmpresaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Crear_EmpresaLayout.createSequentialGroup()
                        .addGroup(Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(73, 73, 73)
                        .addGroup(Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Emp_nom)
                            .addComponent(emp_cif)
                            .addComponent(emp_direct)
                            .addComponent(Emp_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Crear_EmpresaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(C_Empresa)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        Crear_EmpresaLayout.setVerticalGroup(
            Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Crear_EmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Emp_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emp_cif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emp_direct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Crear_EmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Emp_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(C_Empresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu_Creacion.setMinimumSize(new java.awt.Dimension(300, 300));
        Menu_Creacion.setModal(true);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Empresa");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 42, -1, -1));

        jButton2.setText("Persona");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 108, -1, -1));

        jButton3.setText("Puesto Trabajo");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 173, -1, -1));

        javax.swing.GroupLayout Menu_CreacionLayout = new javax.swing.GroupLayout(Menu_Creacion.getContentPane());
        Menu_Creacion.getContentPane().setLayout(Menu_CreacionLayout);
        Menu_CreacionLayout.setHorizontalGroup(
            Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Menu_CreacionLayout.setVerticalGroup(
            Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_CreacionLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar.setText("ELIMINAR");
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Modificar.setText("MODIFICAR");
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        Crear.setText("CREAR");
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseClicked
        Menu_Creacion.setLocationRelativeTo(this);
        Menu_Creacion.pack();
        Menu_Creacion.setModal(true);
        Menu_Creacion.setVisible(true);
    }//GEN-LAST:event_CrearMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Crear_Empresa.setLocationRelativeTo(this);
        Crear_Empresa.pack();
        Crear_Empresa.setModal(true);
        Crear_Empresa.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C_Empresa;
    private javax.swing.JButton Crear;
    private javax.swing.JDialog Crear_Empresa;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Emp_direccion;
    private javax.swing.JTextField Emp_nom;
    private javax.swing.JDialog Menu_Creacion;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField emp_cif;
    private javax.swing.JTextField emp_direct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
