package teoria.pkg2;

import java.awt.SystemColor;
import javax.swing.JOptionPane;

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
        Btn_CreaTrabajo = new javax.swing.JButton();
        btn_CreaPersona = new javax.swing.JButton();
        btn_crearEmpresa = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Crear_Personas = new javax.swing.JDialog();
        btn_CrearPersonaFinal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Persona_nombre = new javax.swing.JTextField();
        Persona_edad = new javax.swing.JSpinner();
        Persona_genero = new javax.swing.JComboBox<>();
        persona_id = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Persona_estado = new javax.swing.JComboBox<>();
        Persona_hijos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Persona_antecedentes = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Persona_titulo = new javax.swing.JComboBox<>();
        Persona_indice = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Persona_experiencia = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Persona_tipo = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Persona_contrato = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        Personas_salario = new javax.swing.JTextField();
        Persona_enfermedad = new javax.swing.JComboBox<>();
        Crear_solicitud = new javax.swing.JDialog();
        soli_nombre = new javax.swing.JComboBox<>();
        soli_idempre = new javax.swing.JComboBox<>();
        soli_id = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btn_crearSoli = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        soli_tipo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Eliminar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        Modificar1 = new javax.swing.JButton();

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

        Btn_CreaTrabajo.setText("Puesto Trabajo");

        btn_CreaPersona.setText("Persona");
        btn_CreaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CreaPersonaMouseClicked(evt);
            }
        });

        btn_crearEmpresa.setText("Empresa");
        btn_crearEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearEmpresaMouseClicked(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa.png"))); // NOI18N
        jLabel35.setText("jLabel35");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/job inter.png"))); // NOI18N
        jLabel36.setText("jLabel35");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/work.png"))); // NOI18N

        javax.swing.GroupLayout Menu_CreacionLayout = new javax.swing.GroupLayout(Menu_Creacion.getContentPane());
        Menu_Creacion.getContentPane().setLayout(Menu_CreacionLayout);
        Menu_CreacionLayout.setHorizontalGroup(
            Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_CreaPersona)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearEmpresa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_CreaTrabajo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        Menu_CreacionLayout.setVerticalGroup(
            Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_CreacionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_CreaTrabajo)
                    .addComponent(btn_CreaPersona)
                    .addComponent(btn_crearEmpresa))
                .addContainerGap())
        );

        Crear_Personas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CrearPersonaFinal.setText("Crear");
        btn_CrearPersonaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrearPersonaFinalMouseClicked(evt);
            }
        });
        Crear_Personas.getContentPane().add(btn_CrearPersonaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CREACION DE PERSONAS");
        Crear_Personas.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Datos Personales");
        Crear_Personas.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Datos Familiares");
        Crear_Personas.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Datos sanitarios");
        Crear_Personas.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel10.setText("Nombre");
        Crear_Personas.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel11.setText("ID");
        Crear_Personas.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel12.setText("Edad");
        Crear_Personas.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel13.setText("Genero");
        Crear_Personas.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));
        Crear_Personas.getContentPane().add(Persona_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, -1));
        Crear_Personas.getContentPane().add(Persona_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 41, -1));

        Persona_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        Crear_Personas.getContentPane().add(Persona_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        Crear_Personas.getContentPane().add(persona_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, -1));

        jLabel14.setText("Estado Legal");
        Crear_Personas.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel15.setText("Hijos");
        Crear_Personas.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        Persona_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorceado" }));
        Crear_Personas.getContentPane().add(Persona_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        Persona_hijos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        Crear_Personas.getContentPane().add(Persona_hijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel16.setText("Enfermedad");
        Crear_Personas.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Datos legales");
        Crear_Personas.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel18.setText("Antecedentes");
        Crear_Personas.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        Persona_antecedentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        Crear_Personas.getContentPane().add(Persona_antecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Datos Academicos");
        Crear_Personas.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel20.setText("Titulo");
        Crear_Personas.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        Persona_titulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciado", "Ingeniero", "Doctor" }));
        Crear_Personas.getContentPane().add(Persona_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 89, -1));
        Crear_Personas.getContentPane().add(Persona_indice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 41, -1));

        jLabel21.setText("Indice Graduación");
        Crear_Personas.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Datos Laborales");
        Crear_Personas.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel23.setText("Años de experiencia");
        Crear_Personas.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        Crear_Personas.getContentPane().add(Persona_experiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 41, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Tipo de empleo");
        Crear_Personas.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        jLabel25.setText("Tipo de Empleo");
        Crear_Personas.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        Persona_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marketing", "Oficina", "Administracion" }));
        Crear_Personas.getContentPane().add(Persona_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 89, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Preferencia de empleo");
        Crear_Personas.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel27.setText("Tipo contrato");
        Crear_Personas.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        Persona_contrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por hora", "Fijo" }));
        Crear_Personas.getContentPane().add(Persona_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 89, -1));

        jLabel28.setText("Salario");
        Crear_Personas.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));
        Crear_Personas.getContentPane().add(Personas_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 60, -1));

        Persona_enfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hipertensión", "Diabetes", "Discapacidad", "Otra" }));
        Crear_Personas.getContentPane().add(Persona_enfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 130, -1));

        soli_nombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        soli_idempre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel29.setText("Id");

        jLabel30.setText("Id empresa");

        jLabel31.setText("Nombre Persona");

        jLabel32.setText("tipo de empleo");

        btn_crearSoli.setText("crear");
        btn_crearSoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearSoliMouseClicked(evt);
            }
        });

        jLabel33.setText("Crear Solicitd de Empleo");

        soli_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marketing", "Oficina", "Administracion" }));

        javax.swing.GroupLayout Crear_solicitudLayout = new javax.swing.GroupLayout(Crear_solicitud.getContentPane());
        Crear_solicitud.getContentPane().setLayout(Crear_solicitudLayout);
        Crear_solicitudLayout.setHorizontalGroup(
            Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_solicitudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_crearSoli))
            .addGroup(Crear_solicitudLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(120, 120, 120)
                .addGroup(Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(soli_nombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(soli_idempre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(soli_id))
                    .addComponent(soli_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(Crear_solicitudLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel33))
        );
        Crear_solicitudLayout.setVerticalGroup(
            Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Crear_solicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(32, 32, 32)
                .addGroup(Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soli_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(70, 70, 70)
                .addGroup(Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soli_idempre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(67, 67, 67)
                .addGroup(Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soli_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(48, 48, 48)
                .addGroup(Crear_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(soli_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btn_crearSoli))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar.setText("ELIMINAR");
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 100, -1));

        Crear.setText("CREAR");
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/01.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 240));

        Modificar1.setText("MODIFICAR");
        jPanel1.add(Modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseClicked
        Menu_Creacion.setLocationRelativeTo(this);
        Menu_Creacion.pack();
        Menu_Creacion.setModal(true);
        Menu_Creacion.setVisible(true);
    }//GEN-LAST:event_CrearMouseClicked

    private void btn_CreaPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreaPersonaMouseClicked
        // TODO add your handling code here:
        Crear_Personas.setModal(true);
        Crear_Personas.pack();
        Crear_Personas.setLocationRelativeTo(this);
        Crear_Personas.setVisible(true);
        Persona_edad.setValue(18);
    }//GEN-LAST:event_btn_CreaPersonaMouseClicked

    private void btn_CrearPersonaFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearPersonaFinalMouseClicked
        String id, genero, nombre, edad, legal, hijos, enfermedad, antecedentes, titulo, indice, años, empleo, contrato, sueldo;
        id = persona_id.getText();
        persona_id.setText("");
        edad = Persona_edad.getValue().toString();
        Persona_edad.setValue(18);
        nombre = Persona_nombre.getText();
        Persona_nombre.setText("");
        genero = Persona_genero.getSelectedItem().toString();
        legal = Persona_estado.getSelectedItem().toString();
        hijos = Persona_hijos.getSelectedItem().toString();
        enfermedad = Persona_enfermedad.getSelectedItem().toString();
        Persona_enfermedad.setSelectedItem(0);
        antecedentes = Persona_antecedentes.getSelectedItem().toString();
        titulo = Persona_titulo.getSelectedItem().toString();
        indice = Persona_indice.getValue().toString();
        años = Persona_experiencia.getValue().toString();
        empleo = Persona_tipo.getSelectedItem().toString();
        contrato = Persona_contrato.getSelectedItem().toString();
        sueldo = Personas_salario.getText();
        Personas_salario.setText("");
        
        Persona P= new Persona(id, genero, nombre, edad, legal, hijos, enfermedad, antecedentes, titulo, indice, años, empleo, contrato, sueldo);
        JOptionPane.showMessageDialog(this, "persona creada");
        Crear_Personas.dispose();

    }//GEN-LAST:event_btn_CrearPersonaFinalMouseClicked

    private void btn_crearSoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearSoliMouseClicked
        String id,idempre,nompersona,tipoemp;
        id=soli_id.getText();
        soli_id.setText("");
        idempre=soli_idempre.getSelectedItem().toString();
        nompersona=soli_nombre.getSelectedItem().toString();
        tipoemp=soli_tipo.getSelectedItem().toString();
        solicitud S= new solicitud(id, idempre, nompersona, tipoemp);
        JOptionPane.showMessageDialog(this, "Solicitud creada");
        Crear_solicitud.dispose();
        
    }//GEN-LAST:event_btn_crearSoliMouseClicked

    private void btn_crearEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearEmpresaMouseClicked
        
        Crear_Empresa.setModal(true);
        Crear_Empresa.pack();
        Crear_Empresa.setLocationRelativeTo(this);
        Crear_Empresa.setVisible(true);
    }//GEN-LAST:event_btn_crearEmpresaMouseClicked
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton Btn_CreaTrabajo;
    private javax.swing.JButton C_Empresa;
    private javax.swing.JButton Crear;
    private javax.swing.JDialog Crear_Empresa;
    private javax.swing.JDialog Crear_Personas;
    private javax.swing.JDialog Crear_solicitud;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Emp_direccion;
    private javax.swing.JTextField Emp_nom;
    private javax.swing.JDialog Menu_Creacion;
    private javax.swing.JButton Modificar1;
    private javax.swing.JComboBox<String> Persona_antecedentes;
    private javax.swing.JComboBox<String> Persona_contrato;
    private javax.swing.JSpinner Persona_edad;
    private javax.swing.JComboBox<String> Persona_enfermedad;
    private javax.swing.JComboBox<String> Persona_estado;
    private javax.swing.JSpinner Persona_experiencia;
    private javax.swing.JComboBox<String> Persona_genero;
    private javax.swing.JComboBox<String> Persona_hijos;
    private javax.swing.JSpinner Persona_indice;
    private javax.swing.JTextField Persona_nombre;
    private javax.swing.JComboBox<String> Persona_tipo;
    private javax.swing.JComboBox<String> Persona_titulo;
    private javax.swing.JTextField Personas_salario;
    private javax.swing.JButton btn_CreaPersona;
    private javax.swing.JButton btn_CrearPersonaFinal;
    private javax.swing.JButton btn_crearEmpresa;
    private javax.swing.JButton btn_crearSoli;
    private javax.swing.JTextField emp_cif;
    private javax.swing.JTextField emp_direct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField persona_id;
    private javax.swing.JTextField soli_id;
    private javax.swing.JComboBox<String> soli_idempre;
    private javax.swing.JComboBox<String> soli_nombre;
    private javax.swing.JComboBox<String> soli_tipo;
    // End of variables declaration//GEN-END:variables
}
