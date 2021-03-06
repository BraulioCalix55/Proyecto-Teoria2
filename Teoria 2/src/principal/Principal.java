package principal;

import conexiones.SolicitudConexion;
import conexiones.PersonaConexion;
import conexiones.EmpresaConexion;
import conexiones.PlazaConexion;
import java.awt.SystemColor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crear_Empresas = new javax.swing.JDialog();
        lab_empresa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre_empresa = new javax.swing.JTextField();
        cif_empresa = new javax.swing.JTextField();
        director_empresa = new javax.swing.JTextField();
        direccion_empresa = new javax.swing.JTextField();
        C_Empresa = new javax.swing.JButton();
        Menu_Creacion = new javax.swing.JDialog();
        Btn_CreaTrabajo = new javax.swing.JButton();
        btn_CreaPersona = new javax.swing.JButton();
        btn_crearEmpresa = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btn_creaTrabajo = new javax.swing.JButton();
        Crear_Personas = new javax.swing.JDialog();
        btn_CrearPersonaFinal = new javax.swing.JButton();
        leb_perso = new javax.swing.JLabel();
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
        Crear_Solicitud = new javax.swing.JDialog();
        solicitud_id = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btn_crearSoli = new javax.swing.JButton();
        Lab_emple = new javax.swing.JLabel();
        solicitud_cif = new javax.swing.JTextField();
        Solicitud_persona = new javax.swing.JTextField();
        solicitud_puesto = new javax.swing.JTextField();
        Modificar_Personas = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_personas = new javax.swing.JTable();
        btn_modi_persona = new javax.swing.JButton();
        btn_elimi_personas = new javax.swing.JButton();
        btn_listar_personas = new javax.swing.JButton();
        Modificar_Empresas = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_empresas = new javax.swing.JTable();
        btn_modifi_empresa = new javax.swing.JButton();
        btn_elimi_empresa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Modificar_Solicitudes = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_solicitudes = new javax.swing.JTable();
        btn_mod_soli = new javax.swing.JButton();
        btn_elim_solicitud = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Modificar_Plaza = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_Plazas = new javax.swing.JTable();
        btn_modi_plaza = new javax.swing.JButton();
        btn_elimi_plaza = new javax.swing.JButton();
        btn_listar_plazas = new javax.swing.JButton();
        Crear_Plaza = new javax.swing.JDialog();
        plaza_sanita = new javax.swing.JTextField();
        plaza_años = new javax.swing.JSpinner();
        plaza_edad = new javax.swing.JSpinner();
        plaza_prom = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        plaza_gen = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        Plaza_crear = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        plaza_titulo = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        empresa_plaza = new javax.swing.JTextField();
        Mod_Empresas = new javax.swing.JDialog();
        lab_empresa1 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        nombre_empresa1 = new javax.swing.JTextField();
        cif_empresa1 = new javax.swing.JTextField();
        director_empresa1 = new javax.swing.JTextField();
        direccion_empresa1 = new javax.swing.JTextField();
        C_Empresa1 = new javax.swing.JButton();
        Mod_Solicitud = new javax.swing.JDialog();
        solicitud_id1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        btn_crearSoli1 = new javax.swing.JButton();
        Lab_emple1 = new javax.swing.JLabel();
        solicitud_cif1 = new javax.swing.JTextField();
        solicitud_persona1 = new javax.swing.JTextField();
        solicitud_puesto1 = new javax.swing.JTextField();
        Mod_Plaza = new javax.swing.JDialog();
        plaza_sanita1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        plaza_gen1 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        Plaza_crear1 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        plaza_titulo1 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        empresa_plaza1 = new javax.swing.JTextField();
        plaza_años1 = new javax.swing.JTextField();
        plaza_prom1 = new javax.swing.JTextField();
        plaza_edad1 = new javax.swing.JTextField();
        Mod_Personas = new javax.swing.JDialog();
        btn_CrearPersonaFinal1 = new javax.swing.JButton();
        leb_perso1 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        nombre_mod = new javax.swing.JTextField();
        id_mod = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        salario_mod = new javax.swing.JTextField();
        antecedentes_mod = new javax.swing.JTextField();
        enfermedad_mod = new javax.swing.JTextField();
        titulo_mod = new javax.swing.JTextField();
        estado_mod = new javax.swing.JTextField();
        tipo_mod = new javax.swing.JTextField();
        contrato_mod = new javax.swing.JTextField();
        genero_mod = new javax.swing.JTextField();
        edad_mod = new javax.swing.JTextField();
        años_mod = new javax.swing.JTextField();
        indice_mod = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Crear = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        Modificar1 = new javax.swing.JButton();

        Crear_Empresas.setTitle("Crear empresa");

        lab_empresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_empresa.setText("Creación Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CIF");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Director");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Direccion");

        C_Empresa.setText("Crear Empresa");
        C_Empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_EmpresaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Crear_EmpresasLayout = new javax.swing.GroupLayout(Crear_Empresas.getContentPane());
        Crear_Empresas.getContentPane().setLayout(Crear_EmpresasLayout);
        Crear_EmpresasLayout.setHorizontalGroup(
            Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Crear_EmpresasLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lab_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_EmpresasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Crear_EmpresasLayout.createSequentialGroup()
                        .addGroup(Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(73, 73, 73)
                        .addGroup(Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_empresa)
                            .addComponent(cif_empresa)
                            .addComponent(director_empresa)
                            .addComponent(direccion_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Crear_EmpresasLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(C_Empresa)))
                .addGap(37, 37, 37))
        );
        Crear_EmpresasLayout.setVerticalGroup(
            Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Crear_EmpresasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cif_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(director_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Crear_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(direccion_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(C_Empresa)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Menu_Creacion.setTitle("Menu de creación");
        Menu_Creacion.setMinimumSize(new java.awt.Dimension(300, 300));
        Menu_Creacion.setModal(true);

        Btn_CreaTrabajo.setText("Solicitud");
        Btn_CreaTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CreaTrabajoMouseClicked(evt);
            }
        });

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

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puesto de trabajo.png"))); // NOI18N

        btn_creaTrabajo.setText("Plaza de trabajo");
        btn_creaTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_creaTrabajoMouseClicked(evt);
            }
        });

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
                .addGap(18, 18, 18)
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_CreaTrabajo))
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_CreacionLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_CreacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_creaTrabajo)))
                .addContainerGap())
        );
        Menu_CreacionLayout.setVerticalGroup(
            Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_CreacionLayout.createSequentialGroup()
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_CreacionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(jLabel35)))
                    .addGroup(Menu_CreacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Menu_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_CreaTrabajo)
                    .addComponent(btn_CreaPersona)
                    .addComponent(btn_crearEmpresa)
                    .addComponent(btn_creaTrabajo))
                .addContainerGap())
        );

        Crear_Personas.setTitle("Crear personas");
        Crear_Personas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CrearPersonaFinal.setText("Crear");
        btn_CrearPersonaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrearPersonaFinalMouseClicked(evt);
            }
        });
        Crear_Personas.getContentPane().add(btn_CrearPersonaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        leb_perso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        leb_perso.setText("CREACION DE PERSONAS");
        Crear_Personas.getContentPane().add(leb_perso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

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

        Persona_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
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
        Crear_Personas.getContentPane().add(Personas_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 90, -1));

        Persona_enfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hipertensión", "Diabetes", "Discapacidad", "Otra" }));
        Crear_Personas.getContentPane().add(Persona_enfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 130, -1));

        Crear_Solicitud.setTitle("Crear Solicitud");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("ID");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("CIF Empresa");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Nombre Persona");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Tipo de puesto");

        btn_crearSoli.setText("Crear");
        btn_crearSoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearSoliMouseClicked(evt);
            }
        });

        Lab_emple.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lab_emple.setText("Crear solicitud de empleo");

        javax.swing.GroupLayout Crear_SolicitudLayout = new javax.swing.GroupLayout(Crear_Solicitud.getContentPane());
        Crear_Solicitud.getContentPane().setLayout(Crear_SolicitudLayout);
        Crear_SolicitudLayout.setHorizontalGroup(
            Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Crear_SolicitudLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solicitud_cif)
                    .addComponent(solicitud_id)
                    .addComponent(solicitud_puesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(Solicitud_persona, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_SolicitudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_crearSoli)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_SolicitudLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(Lab_emple)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        Crear_SolicitudLayout.setVerticalGroup(
            Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Crear_SolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lab_emple)
                .addGap(32, 32, 32)
                .addGroup(Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solicitud_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(47, 47, 47)
                .addGroup(Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(solicitud_cif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(Solicitud_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(Crear_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(solicitud_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn_crearSoli)
                .addContainerGap())
        );

        Modificar_Personas.setTitle("Modificar Personas");

        tabla_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Object", "Nombre", "Genero", "Edad", "Estado Civil", "Enfermedades", "Antecedentes", "Titulo", "Indice", "Años Exp", "Tipo Empleo", "Tipo Contrato", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_personas);

        btn_modi_persona.setText("Modificar");
        btn_modi_persona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modi_personaMouseClicked(evt);
            }
        });

        btn_elimi_personas.setText("Eliminar");
        btn_elimi_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_elimi_personasMouseClicked(evt);
            }
        });

        btn_listar_personas.setText("Listar personas");
        btn_listar_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listar_personasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Modificar_PersonasLayout = new javax.swing.GroupLayout(Modificar_Personas.getContentPane());
        Modificar_Personas.getContentPane().setLayout(Modificar_PersonasLayout);
        Modificar_PersonasLayout.setHorizontalGroup(
            Modificar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_PersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Modificar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_PersonasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(Modificar_PersonasLayout.createSequentialGroup()
                        .addComponent(btn_modi_persona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_elimi_personas)
                        .addGap(176, 176, 176)
                        .addComponent(btn_listar_personas)
                        .addGap(18, 456, Short.MAX_VALUE))))
        );
        Modificar_PersonasLayout.setVerticalGroup(
            Modificar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_PersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(Modificar_PersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modi_persona)
                    .addComponent(btn_elimi_personas)
                    .addComponent(btn_listar_personas))
                .addContainerGap())
        );

        Modificar_Empresas.setTitle("Modificar Empresas");

        tabla_empresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Object", "Nombre", "CIF", "Director", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_empresas);

        btn_modifi_empresa.setText("Modificar");
        btn_modifi_empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modifi_empresaMouseClicked(evt);
            }
        });

        btn_elimi_empresa.setText("Eliminar");
        btn_elimi_empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_elimi_empresaMouseClicked(evt);
            }
        });

        jButton1.setText("Listar Empresas");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Modificar_EmpresasLayout = new javax.swing.GroupLayout(Modificar_Empresas.getContentPane());
        Modificar_Empresas.getContentPane().setLayout(Modificar_EmpresasLayout);
        Modificar_EmpresasLayout.setHorizontalGroup(
            Modificar_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_EmpresasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Modificar_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addGroup(Modificar_EmpresasLayout.createSequentialGroup()
                        .addComponent(btn_modifi_empresa)
                        .addGap(18, 18, 18)
                        .addComponent(btn_elimi_empresa)
                        .addGap(164, 164, 164)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Modificar_EmpresasLayout.setVerticalGroup(
            Modificar_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_EmpresasLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(Modificar_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifi_empresa)
                    .addComponent(btn_elimi_empresa)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        Modificar_Solicitudes.setTitle("Modificar Empresas");

        Tabla_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Object", "ID", "CIF", "Nombre Empleado", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabla_solicitudes);

        btn_mod_soli.setText("Modificar");
        btn_mod_soli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mod_soliMouseClicked(evt);
            }
        });

        btn_elim_solicitud.setText("Eliminar");
        btn_elim_solicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_elim_solicitudMouseClicked(evt);
            }
        });

        jButton2.setText("Listar Solicitudes");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Modificar_SolicitudesLayout = new javax.swing.GroupLayout(Modificar_Solicitudes.getContentPane());
        Modificar_Solicitudes.getContentPane().setLayout(Modificar_SolicitudesLayout);
        Modificar_SolicitudesLayout.setHorizontalGroup(
            Modificar_SolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_SolicitudesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Modificar_SolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addGroup(Modificar_SolicitudesLayout.createSequentialGroup()
                        .addComponent(btn_mod_soli)
                        .addGap(18, 18, 18)
                        .addComponent(btn_elim_solicitud)
                        .addGap(146, 146, 146)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Modificar_SolicitudesLayout.setVerticalGroup(
            Modificar_SolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_SolicitudesLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(Modificar_SolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mod_soli)
                    .addComponent(btn_elim_solicitud)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        Modificar_Plaza.setTitle("Modificar Plaza");

        tabla_Plazas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Object", "Empresa", "Requisito academico (%)", "Requisito Sanitario", "Requisito de edad", "Requisito de genero", "Requisito de titulo", "Requisito Años de experiencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabla_Plazas);

        btn_modi_plaza.setText("Modificar");
        btn_modi_plaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modi_plazaMouseClicked(evt);
            }
        });

        btn_elimi_plaza.setText("Eliminar");
        btn_elimi_plaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_elimi_plazaMouseClicked(evt);
            }
        });

        btn_listar_plazas.setText("Listar Plazas");
        btn_listar_plazas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listar_plazasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Modificar_PlazaLayout = new javax.swing.GroupLayout(Modificar_Plaza.getContentPane());
        Modificar_Plaza.getContentPane().setLayout(Modificar_PlazaLayout);
        Modificar_PlazaLayout.setHorizontalGroup(
            Modificar_PlazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_PlazaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Modificar_PlazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_PlazaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_PlazaLayout.createSequentialGroup()
                        .addComponent(btn_modi_plaza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_elimi_plaza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_listar_plazas)
                        .addGap(337, 337, 337))))
        );
        Modificar_PlazaLayout.setVerticalGroup(
            Modificar_PlazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_PlazaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(Modificar_PlazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listar_plazas)
                    .addComponent(btn_elimi_plaza)
                    .addComponent(btn_modi_plaza))
                .addContainerGap())
        );

        Crear_Plaza.setTitle("Crear Plaza");
        Crear_Plaza.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Crear_Plaza.getContentPane().add(plaza_sanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 100, -1));
        Crear_Plaza.getContentPane().add(plaza_años, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 40, -1));
        Crear_Plaza.getContentPane().add(plaza_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 40, -1));
        Crear_Plaza.getContentPane().add(plaza_prom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 40, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Empresa Solicitante: ");
        Crear_Plaza.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Promedio:");
        Crear_Plaza.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Edad:");
        Crear_Plaza.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Requisito Sanitario:");
        Crear_Plaza.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        plaza_gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        Crear_Plaza.getContentPane().add(plaza_gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Genero: ");
        Crear_Plaza.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        Plaza_crear.setText("Crear Plaza");
        Plaza_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Plaza_crearMouseClicked(evt);
            }
        });
        Crear_Plaza.getContentPane().add(Plaza_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Requisito Titulo:");
        Crear_Plaza.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        plaza_titulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura", "Ingenieria", "Doctorado" }));
        Crear_Plaza.getContentPane().add(plaza_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Crear Plazas de Trabajo");
        Crear_Plaza.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Años experiencia:");
        Crear_Plaza.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        Crear_Plaza.getContentPane().add(empresa_plaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, -1));

        Mod_Empresas.setTitle("Crear empresa");

        lab_empresa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_empresa1.setText("Modificar Empresa");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Nombre");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("CIF");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Director");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Direccion");

        nombre_empresa1.setEditable(false);

        C_Empresa1.setText("Modificar Empresa");
        C_Empresa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_Empresa1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mod_EmpresasLayout = new javax.swing.GroupLayout(Mod_Empresas.getContentPane());
        Mod_Empresas.getContentPane().setLayout(Mod_EmpresasLayout);
        Mod_EmpresasLayout.setHorizontalGroup(
            Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Mod_EmpresasLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addGap(73, 73, 73)
                .addGroup(Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre_empresa1)
                    .addComponent(cif_empresa1)
                    .addComponent(director_empresa1)
                    .addComponent(direccion_empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(Mod_EmpresasLayout.createSequentialGroup()
                .addGroup(Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Mod_EmpresasLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lab_empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Mod_EmpresasLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(C_Empresa1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Mod_EmpresasLayout.setVerticalGroup(
            Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mod_EmpresasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab_empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(nombre_empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(cif_empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(director_empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Mod_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(direccion_empresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(C_Empresa1)
                .addGap(26, 26, 26))
        );

        Mod_Solicitud.setTitle("Crear Solicitud");

        solicitud_id1.setEditable(false);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("ID");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("CIF Empresa");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Nombre Persona");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Tipo de puesto");

        btn_crearSoli1.setText("Modificar solicitud");
        btn_crearSoli1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearSoli1MouseClicked(evt);
            }
        });

        Lab_emple1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lab_emple1.setText("Modificar solicitud de empleo");

        javax.swing.GroupLayout Mod_SolicitudLayout = new javax.swing.GroupLayout(Mod_Solicitud.getContentPane());
        Mod_Solicitud.getContentPane().setLayout(Mod_SolicitudLayout);
        Mod_SolicitudLayout.setHorizontalGroup(
            Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mod_SolicitudLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel50)
                        .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel49)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solicitud_cif1)
                    .addComponent(solicitud_id1)
                    .addComponent(solicitud_puesto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(solicitud_persona1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Mod_SolicitudLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(Lab_emple1)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(Mod_SolicitudLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btn_crearSoli1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Mod_SolicitudLayout.setVerticalGroup(
            Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mod_SolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lab_emple1)
                .addGap(32, 32, 32)
                .addGroup(Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solicitud_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(47, 47, 47)
                .addGroup(Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(solicitud_cif1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(solicitud_persona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(Mod_SolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(solicitud_puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn_crearSoli1)
                .addContainerGap())
        );

        Mod_Plaza.setTitle("Crear Plaza");
        Mod_Plaza.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Mod_Plaza.getContentPane().add(plaza_sanita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText("Empresa Solicitante: ");
        Mod_Plaza.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setText("Promedio:");
        Mod_Plaza.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("Edad:");
        Mod_Plaza.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("Requisito Sanitario:");
        Mod_Plaza.getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        plaza_gen1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        Mod_Plaza.getContentPane().add(plaza_gen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setText("Genero: ");
        Mod_Plaza.getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        Plaza_crear1.setText("Modificar");
        Plaza_crear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Plaza_crear1MouseClicked(evt);
            }
        });
        Mod_Plaza.getContentPane().add(Plaza_crear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText("Requisito Titulo:");
        Mod_Plaza.getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        plaza_titulo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura", "Ingenieria", "Doctorado" }));
        Mod_Plaza.getContentPane().add(plaza_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Modificar plaza de trabajo");
        Mod_Plaza.getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setText("Años experiencia:");
        Mod_Plaza.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        empresa_plaza1.setEditable(false);
        Mod_Plaza.getContentPane().add(empresa_plaza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, -1));
        Mod_Plaza.getContentPane().add(plaza_años1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 100, -1));
        Mod_Plaza.getContentPane().add(plaza_prom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, -1));
        Mod_Plaza.getContentPane().add(plaza_edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, -1));

        Mod_Personas.setTitle("Crear personas");
        Mod_Personas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CrearPersonaFinal1.setText("Guardar Cambios");
        btn_CrearPersonaFinal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrearPersonaFinal1MouseClicked(evt);
            }
        });
        Mod_Personas.getContentPane().add(btn_CrearPersonaFinal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        leb_perso1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        leb_perso1.setText("MODIFICACION DE PERSONAS");
        Mod_Personas.getContentPane().add(leb_perso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("Datos Personales");
        Mod_Personas.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("Datos Familiares");
        Mod_Personas.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel62.setText("Datos sanitarios");
        Mod_Personas.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel63.setText("Nombre");
        Mod_Personas.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel64.setText("ID");
        Mod_Personas.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel65.setText("Edad");
        Mod_Personas.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel66.setText("Genero");
        Mod_Personas.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        nombre_mod.setEditable(false);
        Mod_Personas.getContentPane().add(nombre_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, -1));

        id_mod.setEditable(false);
        Mod_Personas.getContentPane().add(id_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, -1));

        jLabel67.setText("Estado Legal");
        Mod_Personas.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel69.setText("Enfermedad");
        Mod_Personas.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setText("Datos legales");
        Mod_Personas.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel71.setText("Antecedentes");
        Mod_Personas.getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setText("Datos Academicos");
        Mod_Personas.getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel73.setText("Titulo");
        Mod_Personas.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jLabel74.setText("Indice Graduación");
        Mod_Personas.getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setText("Datos Laborales");
        Mod_Personas.getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel76.setText("Años de experiencia");
        Mod_Personas.getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setText("Tipo de empleo");
        Mod_Personas.getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        jLabel78.setText("Tipo de Empleo");
        Mod_Personas.getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setText("Preferencia de empleo");
        Mod_Personas.getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel80.setText("Tipo contrato");
        Mod_Personas.getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jLabel81.setText("Salario");
        Mod_Personas.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));
        Mod_Personas.getContentPane().add(salario_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 90, -1));
        Mod_Personas.getContentPane().add(antecedentes_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 120, -1));
        Mod_Personas.getContentPane().add(enfermedad_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 120, -1));
        Mod_Personas.getContentPane().add(titulo_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 120, -1));
        Mod_Personas.getContentPane().add(estado_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 120, -1));
        Mod_Personas.getContentPane().add(tipo_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 120, -1));
        Mod_Personas.getContentPane().add(contrato_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 130, -1));
        Mod_Personas.getContentPane().add(genero_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 100, -1));
        Mod_Personas.getContentPane().add(edad_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, -1));
        Mod_Personas.getContentPane().add(años_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 70, -1));
        Mod_Personas.getContentPane().add(indice_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 110, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Crear.setText("CREAR");
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/01.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 240));

        Modificar1.setText("GESTIONAR");
        Modificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar1MouseClicked(evt);
            }
        });
        jPanel1.add(Modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

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
        Menu_Creacion.setModal(true);
        Menu_Creacion.pack();
        Menu_Creacion.setLocationRelativeTo(this);
        Menu_Creacion.setVisible(true);
    }//GEN-LAST:event_CrearMouseClicked

    private void btn_CreaPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreaPersonaMouseClicked
        // TODO add your handling code here:
        seteo();
        persona = true;
        if (gestionar == true && persona == true) {
            btn_CrearPersonaFinal.setText("Modificar");
            leb_perso.setText("MODIFICACION DE PERSONA");
            Modificar_Personas.setModal(true);
            Modificar_Personas.pack();
            Modificar_Personas.setLocationRelativeTo(this);
            Modificar_Personas.setVisible(persona);
            Menu_Creacion.dispose();
            gestionar = false;
            persona = false;
        } else {
            btn_CrearPersonaFinal.setText("Crear");
            Crear_Personas.setModal(true);
            Crear_Personas.pack();
            Crear_Personas.setLocationRelativeTo(this);
            Crear_Personas.setVisible(true);
            Menu_Creacion.dispose();
            Persona_edad.setValue(18);
            gestionar = false;
            persona = false;
        }
    }//GEN-LAST:event_btn_CreaPersonaMouseClicked

    private void btn_CrearPersonaFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearPersonaFinalMouseClicked
        String id, genero, nombre, edad, legal, hijos, enfermedad, antecedentes, titulo, indice, años, empleo, contrato, sueldo;
        id = persona_id.getText();
        edad = Persona_edad.getValue().toString();
        Persona_edad.setValue(18);
        nombre = Persona_nombre.getText();
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
        seteo();
        if (gestionar == true) {
            //aqui se va a modificar la persona en ves de crear
            //NO SE COMO ES PARA EJECUTAR LA MODIFICACION PERO ARRIBA SE ASIGNAN LOS VALORES
            JOptionPane.showMessageDialog(this, "Persona modificada exitosamente");
        } else {
            Persona p = new Persona(id, genero, nombre, edad, legal, hijos, enfermedad, antecedentes, titulo, indice, años, empleo, contrato, sueldo);
            PersonaConexion pc = new PersonaConexion(p);
            pc.crearPersona();
            JOptionPane.showMessageDialog(this, "Persona creada exitosamente");
        }
        Crear_Personas.dispose();

    }//GEN-LAST:event_btn_CrearPersonaFinalMouseClicked

    private void btn_crearSoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearSoliMouseClicked
        String id, idempre, nompersona, tipoemp;
        id = solicitud_id.getText();
        idempre = solicitud_cif.getText();
        nompersona = Solicitud_persona.getText();
        tipoemp = solicitud_puesto.getText();
        seteo();
        if (gestionar == true) {
            //ya tiene los datos guardados para modificarse
            JOptionPane.showMessageDialog(this, "Solicitud modificado exitosamente");
        } else {
            //los crea
            Solicitud soli = new Solicitud(id, idempre,nompersona,tipoemp);
            SolicitudConexion sc = new SolicitudConexion(soli);
            sc.crearSolicitud();
            
            JOptionPane.showMessageDialog(this, "Solicitud creada exitosamente");
        }
        Crear_Solicitud.dispose();

    }//GEN-LAST:event_btn_crearSoliMouseClicked

    private void btn_crearEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearEmpresaMouseClicked
        seteo();
        empresa = true;
        if (gestionar == true && empresa == true) {
            lab_empresa.setText("MODIFICAR EMPRESA");
            C_Empresa.setText("Modificar");
            Modificar_Empresas.setModal(true);
            Modificar_Empresas.pack();
            Modificar_Empresas.setLocationRelativeTo(this);
            Modificar_Empresas.setVisible(true);
            Menu_Creacion.dispose();
            gestionar = false;
            empresa = false;
        } else {
            C_Empresa.setText("Crear");
            Crear_Empresas.setModal(true);
            Crear_Empresas.pack();
            Crear_Empresas.setLocationRelativeTo(this);
            Crear_Empresas.setVisible(true);
            Menu_Creacion.dispose();
            gestionar = false;
            empresa = false;
        }
    }//GEN-LAST:event_btn_crearEmpresaMouseClicked

    private void C_EmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_EmpresaMouseClicked
        // TODO add your handling code here:
        String nombre, cif, director, direccion;
        nombre = nombre_empresa.getText();
        cif = cif_empresa.getText();
        director = director_empresa.getText();
        direccion = direccion_empresa.getText();
        seteo();
        if (gestionar == true) {
            //espacio para hacer la modificacion
            JOptionPane.showMessageDialog(this, "Empresa Modificadaexitosamente");
        } else {
            Empresa empresa = new Empresa(nombre, cif, director, direccion);
            EmpresaConexion ec = new EmpresaConexion(empresa);
            ec.crearEmpresa();
            JOptionPane.showMessageDialog(this, "Empresa creada exitosamente");
        }
        Crear_Empresas.dispose();
    }//GEN-LAST:event_C_EmpresaMouseClicked

    private void Modificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar1MouseClicked
        // TODO add your handling code here:
        gestionar = true;
        Menu_Creacion.setModal(true);
        Menu_Creacion.pack();
        Menu_Creacion.setLocationRelativeTo(this);
        Menu_Creacion.setVisible(true);
    }//GEN-LAST:event_Modificar1MouseClicked

    private void Btn_CreaTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CreaTrabajoMouseClicked
        // TODO add your handling code here:
        seteo();
        solicitud = true;
        if (gestionar == true && solicitud == true) {
            //Lab_emple.setText("Modificar Empleo");
            //btn_crearSoli.setText("Modificar");
            Modificar_Solicitudes.setModal(true);
            Modificar_Solicitudes.pack();
            Modificar_Solicitudes.setLocationRelativeTo(this);
            Modificar_Solicitudes.setVisible(true);
            Menu_Creacion.dispose();
            solicitud = false;
            gestionar = false;
        } else {
           // btn_crearSoli.setText("Crear");
            Crear_Solicitud.setModal(true);
            Crear_Solicitud.pack();
            Crear_Solicitud.setLocationRelativeTo(this);
            Crear_Solicitud.setVisible(true);
            Menu_Creacion.dispose();
            solicitud = false;
            gestionar = false;
        }

    }//GEN-LAST:event_Btn_CreaTrabajoMouseClicked

    private void btn_listar_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listar_personasMouseClicked
        // TODO add your handling code here:
        PersonaConexion p = new PersonaConexion();
        p.obtenerPersonas(tabla_personas);
        JOptionPane.showMessageDialog(this, "Listado exitosamente");
    }//GEN-LAST:event_btn_listar_personasMouseClicked

    private void btn_modi_personaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modi_personaMouseClicked
        if(tabla_personas.getSelectedRow()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la tabla para poder modificar");
       }
       else{
           DefaultTableModel modelo=(DefaultTableModel)tabla_personas.getModel();
           String nombre=(String)modelo.getValueAt(tabla_personas.getSelectedRow(), 1);
           Persona pr=new Persona(nombre);
           PersonaConexion pc=new PersonaConexion();
           consulta=pc.obtenerPersona(pr);
           ArrayList<String> empresita=new ArrayList();
            String principal="";
            String[] p;
            principal=consulta.toString();
            p=principal.split(",");
            for (int i = 0; i <p.length; i++) {
                String f[]=p[i].split("=");
                    empresita.add(f[1]);
            }
            id_mod.setText(empresita.get(0));
            nombre_mod.setText(empresita.get(1));
            genero_mod.setText(empresita.get(2));
            edad_mod.setText(empresita.get(3));
            estado_mod.setText(empresita.get(4));
            enfermedad_mod.setText(empresita.get(5));
            antecedentes_mod.setText(empresita.get(6));
            titulo_mod.setText(empresita.get(7));
            indice_mod.setText(empresita.get(8));
            años_mod.setText(empresita.get(9));
            tipo_mod.setText(empresita.get(10));
            contrato_mod.setText(empresita.get(11));
            salario_mod.setText(empresita.get(12));

            Mod_Personas.setModal(true);
            Mod_Personas.pack();
            Mod_Personas.setLocationRelativeTo(this);
            Mod_Personas.setVisible(true);    
       }
        
        
        
        
        
        /*
       
        NO SE COMO SE CARGAN LOS DATOS PERO ESTA TODO PARA PONERLOS
        Persona_antecedentes.setSelectedItem();
        Persona_contrato.setSelectedIndex();
        Persona_edad.setValue();
        Persona_enfermedad.setSelectedIndex();
        Persona_estado.setSelectedIndex();
        Persona_experiencia.setValue();
        Persona_genero.setSelectedIndex();
        Persona_hijos.setSelectedIndex();
        Persona_indice.setValue();
        Persona_nombre.setText("");
        Persona_tipo.setSelectedIndex();
        Persona_titulo.setSelectedIndex();
        Personas_salario.setText("");
        persona_id.setText("");
         */
//        System.out.println("modi");
//        btn_CrearPersonaFinal.setText("Modificar");
//        Crear_Personas.setModal(true);
//        Crear_Personas.pack();
//        Crear_Personas.setLocationRelativeTo(this);
//        Crear_Personas.setVisible(true);
    }//GEN-LAST:event_btn_modi_personaMouseClicked

    private void btn_modifi_empresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modifi_empresaMouseClicked
        
        if(tabla_empresas.getSelectedRow()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la tabla para poder modificar");
       }
       else{
           DefaultTableModel modelo=(DefaultTableModel)tabla_empresas.getModel();
           String nombre=(String)modelo.getValueAt(tabla_empresas.getSelectedRow(), 1);
           Empresa e=new Empresa(nombre);
           EmpresaConexion ec=new EmpresaConexion();
           consulta=ec.obtenerEmpresa(e);
           ArrayList<String> empresita=new ArrayList();
           String principal="";
            String[] p;
            principal=consulta.toString();
            p=principal.split(",");
            for (int i = 0; i <p.length; i++) {
                String f[]=p[i].split("=");
                    empresita.add(f[1]);
            }
            nombre_empresa1.setText(empresita.get(1));
            cif_empresa1.setText(empresita.get(2));
            director_empresa1.setText(empresita.get(3));
            direccion_empresa1.setText(empresita.get(4));
            Mod_Empresas.setModal(true);
            Mod_Empresas.pack();
            Mod_Empresas.setLocationRelativeTo(this);
            Mod_Empresas.setVisible(true);    
       }
        /*        
        nombre_empresa.setText();
        cif_empresa.setText();
        direccion_empresa.setText(string);
        director_empresa.setText();
         */
//        Crear_Empresas.setModal(true);
//        Crear_Empresas.pack();
//        Crear_Empresas.setLocationRelativeTo(this);
//        Crear_Empresas.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modifi_empresaMouseClicked

    private void btn_mod_soliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mod_soliMouseClicked
        // TODO add your handling code here:
        if(Tabla_solicitudes.getSelectedRow()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la tabla para poder modificar");
       }
       else{
           DefaultTableModel modelo=(DefaultTableModel)Tabla_solicitudes.getModel();
           String id=(String)modelo.getValueAt(Tabla_solicitudes.getSelectedRow(), 1);
            System.out.println("ID "+id);
           Solicitud s=new Solicitud(id);
           SolicitudConexion sc=new SolicitudConexion();
           consulta=new Document();
           consulta=sc.obtenerSolicitud(s);
           ArrayList<String> empresita=new ArrayList();
           String principal="";
            String[] p;
            principal=consulta.toString();
            p=principal.split(",");
            for (int i = 0; i <p.length; i++) {
                String f[]=p[i].split("=");
                    empresita.add(f[1]);
            }
            solicitud_id1.setText(empresita.get(1));
            solicitud_cif1.setText(empresita.get(2));
            solicitud_persona1.setText(empresita.get(3));
            solicitud_puesto1.setText(empresita.get(4));
            Mod_Solicitud.setModal(true);
            Mod_Solicitud.pack();
            Mod_Solicitud.setLocationRelativeTo(this);
            Mod_Solicitud.setVisible(true);    
       }
        
        /*Solicitud_persona.setText("");
        solicitud_id.setText(string);
        solicitud_puesto.setText(string);
        solicitud_cif.setText();*/
//        Crear_Solicitud.pack();
//        Crear_Solicitud.setModal(true);
//        Crear_Solicitud.setLocationRelativeTo(this);
//        Crear_Solicitud.setVisible(true);

    }//GEN-LAST:event_btn_mod_soliMouseClicked

    private void btn_modi_plazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modi_plazaMouseClicked
        // TODO add your handling code here:
        if(tabla_Plazas.getSelectedRow()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la tabla para poder modificar");
       }
       else{
           DefaultTableModel modelo=(DefaultTableModel)tabla_Plazas.getModel();
           String empresa=(String)modelo.getValueAt(tabla_Plazas.getSelectedRow(), 1);
            System.out.println("ID "+empresa);
           Plaza pl=new Plaza(empresa);
           PlazaConexion pc=new PlazaConexion();
           consulta=new Document();
           consulta=pc.obtenerPlaza(pl);
           ArrayList<String> empresita=new ArrayList();
           String principal="";
           String[] p;
            principal=consulta.toString();
            p=principal.split(",");
            for (int i = 0; i <p.length; i++) {
                String f[]=p[i].split("=");
                    empresita.add(f[1]);
            }
            empresa_plaza1.setText(empresita.get(1));
            plaza_prom1.setText(empresita.get(2));
            plaza_sanita1.setText(empresita.get(3));
            plaza_edad1.setText(empresita.get(4));
            if(empresita.get(5)=="M"){
                plaza_gen1.setSelectedIndex(0);
            }
            else{
                plaza_gen1.setSelectedIndex(1);
            }
            if(empresita.get(6).equals("Licenciatura")){
                plaza_titulo1.setSelectedIndex(0);
            }
            else if (empresita.get(6).equals("Ingenieria")){
                plaza_titulo1.setSelectedIndex(1);
            }
            else{
                plaza_titulo1.setSelectedIndex(2);
            }
            plaza_años1.setText(empresita.get(7));
            Mod_Plaza.setModal(true);
            Mod_Plaza.pack();
            Mod_Plaza.setLocationRelativeTo(this);
            Mod_Plaza.setVisible(true);    
       }
    }//GEN-LAST:event_btn_modi_plazaMouseClicked

    private void btn_listar_plazasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listar_plazasMouseClicked
        // TODO add your handling code here:
        PlazaConexion pc=new PlazaConexion();
        pc.obtenerPlazas(tabla_Plazas);
        JOptionPane.showMessageDialog(this, "Plazas listadas exitosamente"); 
    }//GEN-LAST:event_btn_listar_plazasMouseClicked

    private void Plaza_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Plaza_crearMouseClicked
        // TODO add your handling code here:
        String empresa1,promedio,sanitario,edad,genero,titulo,años;
        empresa1=empresa_plaza.getText();
        empresa_plaza.setText("");
        promedio=plaza_prom.getValue().toString();
        sanitario=plaza_sanita.getText();
        edad=plaza_edad.getValue().toString();
        genero=plaza_gen.getSelectedItem().toString();
        años=plaza_años.getValue().toString();
        titulo=plaza_titulo.getSelectedItem().toString();
        Plaza p=new Plaza(empresa1, promedio, sanitario, edad, genero ,titulo, años);
        PlazaConexion pc=new PlazaConexion(p);
        pc.crearPlaza();
        JOptionPane.showMessageDialog(this, "Plaza creada exitosamente");
        Crear_Plaza.dispose();
    }//GEN-LAST:event_Plaza_crearMouseClicked

    private void btn_creaTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_creaTrabajoMouseClicked
        plaza=true;
        if (gestionar==true && plaza==true) {
            Modificar_Plaza.setModal(true);
            Modificar_Plaza.pack();
            Modificar_Plaza.setLocationRelativeTo(this);
            Modificar_Plaza.setVisible(true);
            gestionar=false;
            plaza=false;
            Menu_Creacion.dispose();
        }else{
        //crear
        Crear_Plaza.pack();
        Crear_Plaza.setModal(true);
        Crear_Plaza.setLocationRelativeTo(this);
        Crear_Plaza.setVisible(true);
        }
    }//GEN-LAST:event_btn_creaTrabajoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        EmpresaConexion emp =new EmpresaConexion();
        emp.obtenerEmpresas(tabla_empresas);
        JOptionPane.showMessageDialog(this, "Listado Exitosamente");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        SolicitudConexion sc=new SolicitudConexion();
        sc.obtenerPersonas(Tabla_solicitudes);
        JOptionPane.showMessageDialog(this, "Listado exitosamente");
    }//GEN-LAST:event_jButton2MouseClicked

    private void C_Empresa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_Empresa1MouseClicked
        // TODO add your handling code here:
        String nombre, cif, director, direccion;
        nombre=nombre_empresa1.getText();
        nombre_empresa1.setText("");
        cif=cif_empresa1.getText();
        cif_empresa1.setText("");
        director=director_empresa1.getText();
        director_empresa1.setText("");
        direccion=direccion_empresa1.getText();
        direccion_empresa1.setText("");
        Empresa e=new Empresa(nombre, cif, director, direccion);
        EmpresaConexion ec=new EmpresaConexion(e);
        ec.reemplazarEmpresa(consulta, e.toDocument());
        ec.obtenerEmpresas(tabla_empresas);
        JOptionPane.showMessageDialog(this, "Se modifico exitosamente");
        Mod_Empresas.dispose();
    }//GEN-LAST:event_C_Empresa1MouseClicked

    private void btn_crearSoli1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearSoli1MouseClicked
        // TODO add your handling code here:
        String id, cif, nombrePersona, tipoPuesto;
        id=solicitud_id1.getText();
        solicitud_id1.setText("");
        cif=solicitud_cif1.getText();
        solicitud_cif1.setText("");
        nombrePersona=solicitud_persona1.getText();
        solicitud_persona1.setText("");
        tipoPuesto=solicitud_puesto1.getText();
        solicitud_puesto1.setText("");
        Solicitud s=new Solicitud(id, cif, nombrePersona, tipoPuesto);
        SolicitudConexion sc=new SolicitudConexion(s);
        sc.reemplazarSolicitud(consulta, s.toDocument());
        sc.obtenerPersonas(Tabla_solicitudes);
        JOptionPane.showMessageDialog(this, "Se modifico exitosamente");
        Mod_Solicitud.dispose();
    }//GEN-LAST:event_btn_crearSoli1MouseClicked

    private void Plaza_crear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Plaza_crear1MouseClicked
        // TODO add your handling code here:
        String empresi,promedio,sanitario,edad,genero, titulo, ano;
        empresi=empresa_plaza1.getText();
        empresa_plaza1.setText("");
        promedio=plaza_prom1.getText();
        plaza_prom1.setText("");
        sanitario=plaza_sanita1.getText();
        plaza_sanita1.setText("");
        edad=plaza_edad1.getText();
        plaza_edad1.setText("");
        genero=plaza_gen1.getSelectedItem().toString();
        titulo=plaza_titulo1.getSelectedItem().toString();
        ano=plaza_años1.getText();
        plaza_años1.setText("");
        Plaza pl=new Plaza(empresi,promedio,sanitario,edad,genero,titulo,ano);
        PlazaConexion plc=new PlazaConexion(pl);
        plc.reemplazarPlaza(consulta, pl.toDocument());
        plc.obtenerPlazas(tabla_Plazas);
        JOptionPane.showMessageDialog(this, "Se modifico exitosamente");
        Mod_Plaza.dispose();
    }//GEN-LAST:event_Plaza_crear1MouseClicked

    private void btn_elimi_empresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_elimi_empresaMouseClicked
        // TODO add your handling code here:
        if(tabla_empresas.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleciconar un elemento de la tabla para poder borrarlo");
        }
        else{
            int d=JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar este elemento?");
            if(d==0){
                System.out.println("Si");
                DefaultTableModel modelo=(DefaultTableModel)tabla_empresas.getModel();
                String nombre=(String)modelo.getValueAt(tabla_empresas.getSelectedRow(), 1);
                Empresa e=new Empresa(nombre);
                EmpresaConexion ec=new EmpresaConexion();
                consulta=ec.obtenerEmpresa(e);
                ec.eliminarEmpresa(consulta);
                ec.obtenerEmpresas(tabla_empresas);
                JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");

            }
            else{
                System.out.println("No");
            }
        }
    }//GEN-LAST:event_btn_elimi_empresaMouseClicked

    private void btn_elim_solicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_elim_solicitudMouseClicked
        // TODO add your handling code here:
        if(Tabla_solicitudes.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleciconar un elemento de la tabla para poder borrarlo");
        }
        else{
            int d=JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar este elemento?");
            if(d==0){
                System.out.println("Si");
                 DefaultTableModel modelo=(DefaultTableModel)Tabla_solicitudes.getModel();
                String id=(String)modelo.getValueAt(Tabla_solicitudes.getSelectedRow(), 1);
                 System.out.println("ID "+id);
                Solicitud s=new Solicitud(id);
                SolicitudConexion sc=new SolicitudConexion();
                consulta=new Document();
                consulta=sc.obtenerSolicitud(s);
                sc.eliminarSolicitud(consulta);
                sc.obtenerPersonas(Tabla_solicitudes);
                JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");
            }
            else{
                System.out.println("No");
            }
        }
    }//GEN-LAST:event_btn_elim_solicitudMouseClicked

    private void btn_elimi_plazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_elimi_plazaMouseClicked
        // TODO add your handling code here:
        if(tabla_Plazas.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleciconar un elemento de la tabla para poder borrarlo");
        }
        else{
            int d=JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar este elemento?");
            if(d==0){
                DefaultTableModel modelo=(DefaultTableModel)tabla_Plazas.getModel();
                String empresa=(String)modelo.getValueAt(tabla_Plazas.getSelectedRow(), 1);
                System.out.println("ID "+empresa);
                Plaza pl=new Plaza(empresa);
                PlazaConexion pc=new PlazaConexion();
                consulta=new Document();
                consulta=pc.obtenerPlaza(pl);
                pc.eliminarPlaza(consulta);
                pc.obtenerPlazas(tabla_Plazas);
                JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");
            }
            else{
                System.out.println("No");
            }
        }
    }//GEN-LAST:event_btn_elimi_plazaMouseClicked

    private void btn_CrearPersonaFinal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearPersonaFinal1MouseClicked
        // TODO add your handling code here:
        String id, nombre, genero, edad,estado,enfermedades,antecedentes,titulo,indice,años,tipoEmpleo,tipoContrato, sueldo;
        id=id_mod.getText();
        id_mod.setText("");
        nombre=nombre_mod.getText();
        nombre_mod.setText("");
        genero=genero_mod.getText();
        genero_mod.setText("");
        edad=edad_mod.getText();
        edad_mod.setText("");
        estado=estado_mod.getText();
        estado_mod.setText("");
        enfermedades=enfermedad_mod.getText();
        enfermedad_mod.setText("");
        antecedentes=antecedentes_mod.getText();
        antecedentes_mod.setText("");
        titulo=titulo_mod.getText();
        titulo_mod.setText("");
        indice=indice_mod.getText();
        indice_mod.setText("");
        años=años_mod.getText();
        años_mod.setText("");
        tipoEmpleo=tipo_mod.getText();
        tipo_mod.setText("");
        tipoContrato=contrato_mod.getText();
        contrato_mod.setText("");
        sueldo=salario_mod.getText();
        salario_mod.setText("");
        Persona pr=new Persona(genero,nombre,edad,estado,enfermedades,antecedentes,titulo,indice,años,tipoEmpleo,tipoContrato,sueldo);
        PersonaConexion pc=new PersonaConexion();
        pc.reemplazarPersona(consulta, pr.toDocument());
        pc.obtenerPersonas(tabla_personas);
        JOptionPane.showMessageDialog(this, "Se modifico exitosamente");
        Mod_Personas.dispose();
    }//GEN-LAST:event_btn_CrearPersonaFinal1MouseClicked

    private void btn_elimi_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_elimi_personasMouseClicked
        // TODO add your handling code here:
        if(tabla_personas.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleciconar un elemento de la tabla para poder borrarlo");
        }
        else{
            int d=JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar este elemento?");
            if(d==0){
                DefaultTableModel modelo=(DefaultTableModel)tabla_personas.getModel();
                String nombre=(String)modelo.getValueAt(tabla_personas.getSelectedRow(), 1);
                System.out.println("ID "+nombre);
                Persona pr=new Persona(nombre);
                PersonaConexion pc=new PersonaConexion();
                consulta=new Document();
                consulta=pc.obtenerPersona(pr);
                pc.eliminarPersona(consulta);
                pc.obtenerPersonas(tabla_personas);
                JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");
            }
            else{
                System.out.println("No");
            }
        }
    }//GEN-LAST:event_btn_elimi_personasMouseClicked
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
    private javax.swing.JButton C_Empresa1;
    private javax.swing.JButton Crear;
    private javax.swing.JDialog Crear_Empresas;
    private javax.swing.JDialog Crear_Personas;
    private javax.swing.JDialog Crear_Plaza;
    private javax.swing.JDialog Crear_Solicitud;
    private javax.swing.JLabel Lab_emple;
    private javax.swing.JLabel Lab_emple1;
    private javax.swing.JDialog Menu_Creacion;
    private javax.swing.JDialog Mod_Empresas;
    private javax.swing.JDialog Mod_Personas;
    private javax.swing.JDialog Mod_Plaza;
    private javax.swing.JDialog Mod_Solicitud;
    private javax.swing.JButton Modificar1;
    private javax.swing.JDialog Modificar_Empresas;
    private javax.swing.JDialog Modificar_Personas;
    private javax.swing.JDialog Modificar_Plaza;
    private javax.swing.JDialog Modificar_Solicitudes;
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
    private javax.swing.JButton Plaza_crear;
    private javax.swing.JButton Plaza_crear1;
    private javax.swing.JTextField Solicitud_persona;
    private javax.swing.JTable Tabla_solicitudes;
    private javax.swing.JTextField antecedentes_mod;
    private javax.swing.JTextField años_mod;
    private javax.swing.JButton btn_CreaPersona;
    private javax.swing.JButton btn_CrearPersonaFinal;
    private javax.swing.JButton btn_CrearPersonaFinal1;
    private javax.swing.JButton btn_creaTrabajo;
    private javax.swing.JButton btn_crearEmpresa;
    private javax.swing.JButton btn_crearSoli;
    private javax.swing.JButton btn_crearSoli1;
    private javax.swing.JButton btn_elim_solicitud;
    private javax.swing.JButton btn_elimi_empresa;
    private javax.swing.JButton btn_elimi_personas;
    private javax.swing.JButton btn_elimi_plaza;
    private javax.swing.JButton btn_listar_personas;
    private javax.swing.JButton btn_listar_plazas;
    private javax.swing.JButton btn_mod_soli;
    private javax.swing.JButton btn_modi_persona;
    private javax.swing.JButton btn_modi_plaza;
    private javax.swing.JButton btn_modifi_empresa;
    private javax.swing.JTextField cif_empresa;
    private javax.swing.JTextField cif_empresa1;
    private javax.swing.JTextField contrato_mod;
    private javax.swing.JTextField direccion_empresa;
    private javax.swing.JTextField direccion_empresa1;
    private javax.swing.JTextField director_empresa;
    private javax.swing.JTextField director_empresa1;
    private javax.swing.JTextField edad_mod;
    private javax.swing.JTextField empresa_plaza;
    private javax.swing.JTextField empresa_plaza1;
    private javax.swing.JTextField enfermedad_mod;
    private javax.swing.JTextField estado_mod;
    private javax.swing.JTextField genero_mod;
    private javax.swing.JTextField id_mod;
    private javax.swing.JTextField indice_mod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lab_empresa;
    private javax.swing.JLabel lab_empresa1;
    private javax.swing.JLabel leb_perso;
    private javax.swing.JLabel leb_perso1;
    private javax.swing.JTextField nombre_empresa;
    private javax.swing.JTextField nombre_empresa1;
    private javax.swing.JTextField nombre_mod;
    private javax.swing.JTextField persona_id;
    private javax.swing.JSpinner plaza_años;
    private javax.swing.JTextField plaza_años1;
    private javax.swing.JSpinner plaza_edad;
    private javax.swing.JTextField plaza_edad1;
    private javax.swing.JComboBox<String> plaza_gen;
    private javax.swing.JComboBox<String> plaza_gen1;
    private javax.swing.JSpinner plaza_prom;
    private javax.swing.JTextField plaza_prom1;
    private javax.swing.JTextField plaza_sanita;
    private javax.swing.JTextField plaza_sanita1;
    private javax.swing.JComboBox<String> plaza_titulo;
    private javax.swing.JComboBox<String> plaza_titulo1;
    private javax.swing.JTextField salario_mod;
    private javax.swing.JTextField solicitud_cif;
    private javax.swing.JTextField solicitud_cif1;
    private javax.swing.JTextField solicitud_id;
    private javax.swing.JTextField solicitud_id1;
    private javax.swing.JTextField solicitud_persona1;
    private javax.swing.JTextField solicitud_puesto;
    private javax.swing.JTextField solicitud_puesto1;
    private javax.swing.JTable tabla_Plazas;
    private javax.swing.JTable tabla_empresas;
    private javax.swing.JTable tabla_personas;
    private javax.swing.JTextField tipo_mod;
    private javax.swing.JTextField titulo_mod;
    // End of variables declaration//GEN-END:variables
boolean gestionar;
    boolean persona;
    boolean empresa;
    boolean solicitud;
    boolean plaza;
   Document consulta;
    String nada;
    Persona p;
    
    public void seteo() {
        //limpia los text que son los importantes
        Persona_nombre.setText("");
        Personas_salario.setText("");
        persona_id.setText("");
        nombre_empresa.setText("");
        cif_empresa.setText("");
        director_empresa.setText("");
        direccion_empresa.setText("");
        solicitud_id.setText("");
        solicitud_cif.setText("");
        Solicitud_persona.setText("");
        solicitud_puesto.setText("");
    }
}
