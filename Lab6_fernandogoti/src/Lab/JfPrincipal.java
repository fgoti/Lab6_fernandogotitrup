/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.jgoodies.looks.plastic.theme.DarkStar;
import com.jgoodies.looks.plastic.theme.DesertBlue;
import com.jgoodies.looks.plastic.theme.LightGray;
import com.jgoodies.looks.plastic.theme.SkyBlue;
import com.jgoodies.looks.plastic.theme.SkyPink;
import com.jgoodies.looks.plastic.theme.SkyRed;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;

/**
 *
 * @author Fernando Goti
 */
public class JfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JfPrincipal
     */
    public JfPrincipal() {
        this.Datos = new ArrayList();
        initComponents();

    }

    public JfPrincipal(JDialog About, JMenuItem About_opcion, JTree Arbol_Familias, JButton ColorB, JComboBox<String> ComboPadres, JComboBox<String> ComboTrabajo, JComboBox<String> Combo_Estado, JComboBox<String> Combo_Jefe_trabajo, JComboBox<String> Combo_edad, JMenuItem GuardarComo_opcion, JButton GuardarPersona, JMenuItem Guardar_opcion, JMenuItem Salir_opcion, JTabbedPane TabFEJC, JTabbedPane TabPrincipal, JTextField TexClientes, JTextField TexDineroCliente, JTextField TexHora_Entrada, JTextField TexHora_Salida, JTextField TexIdentidad, JTextField TexNacionalidad, JTextField TexNombre, JTextField TexTicket, JTextField TextGanancias, JTextField TextLugar, JTextField Text_Sueldo, ButtonGroup buttonGroup1, JButton jButton1, JLabel jLabel1, JLabel jLabel10, JLabel jLabel11, JLabel jLabel12, JLabel jLabel2, JLabel jLabel27, JLabel jLabel28, JLabel jLabel29, JLabel jLabel3, JLabel jLabel30, JLabel jLabel31, JLabel jLabel32, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9, JMenu jMenu1, JMenuBar jMenuBar1, JPanel jPanel1, JPanel jPanel2, JPanel jPanel3, JPanel jPanel4, JPanel jPanel5, JPanel jPanel6, JPanel jPanel7, JPanel jPanel8, JScrollPane jScrollPane1, JScrollPane jScrollPane2, JScrollPane jScrollPane3, JTextArea jTextArea1, JTree jTree1) throws HeadlessException {
        this.About = About;
        this.About_opcion = About_opcion;
        this.Arbol_Familias = Arbol_Familias;
        this.ColorB = ColorB;
        this.ComboPadres = ComboPadres;
        this.ComboTrabajo = ComboTrabajo;
        this.Combo_Estado = Combo_Estado;
        this.Combo_Jefe_trabajo = Combo_Jefe_trabajo;
        this.TexEdad = TexEdad;
        this.GuardarComo_opcion = GuardarComo_opcion;
        this.GuardarPersona = GuardarPersona;
        this.Guardar_opcion = Guardar_opcion;
        this.Salir_opcion = Salir_opcion;
        this.TabFEJC = TabFEJC;
        this.TabPrincipal = TabPrincipal;
        this.TexClientes = TexClientes;
        this.TexDineroCliente = TexDineroCliente;
        this.TexHora_Entrada = TexHora_Entrada;
        this.TexHora_Salida = TexHora_Salida;
        this.TexIdentidad = TexIdentidad;
        this.TexNacionalidad = TexNacionalidad;
        this.TexNombre = TexNombre;
        this.TexTicket = TexTicket;
        this.TextGanancias = TextGanancias;
        this.TextLugar = TextLugar;
        this.Text_Sueldo = Text_Sueldo;
        this.buttonGroup1 = buttonGroup1;
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        this.jLabel10 = jLabel10;
        this.jLabel11 = jLabel11;
        this.jLabel12 = jLabel12;
        this.jLabel2 = jLabel2;
        this.jLabel27 = jLabel27;
        this.jLabel28 = jLabel28;
        this.jLabel29 = jLabel29;
        this.jLabel3 = jLabel3;
        this.jLabel30 = jLabel30;
        this.jLabel31 = jLabel31;
        this.jLabel32 = jLabel32;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jLabel9 = jLabel9;
        this.jMenu1 = jMenu1;
        this.jMenuBar1 = jMenuBar1;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jPanel3 = jPanel3;
        this.jPanel4 = jPanel4;
        this.jPanel5 = jPanel5;
        this.jPanel6 = jPanel6;
        this.jPanel7 = jPanel7;
        this.jPanel8 = jPanel8;
        this.jScrollPane1 = jScrollPane1;
        this.jScrollPane2 = jScrollPane2;
        this.jScrollPane3 = jScrollPane3;
        this.jTextArea1 = jTextArea1;
        this.jTree1 = jTree1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        About = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TabPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Arbol_Familias = new javax.swing.JTree();
        jLabel8 = new javax.swing.JLabel();
        TabFEJC = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ComboPadres = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ComboTrabajo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TexHora_Entrada = new javax.swing.JTextField();
        TexHora_Salida = new javax.swing.JTextField();
        Text_Sueldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Combo_Estado = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Combo_Jefe_trabajo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TexClientes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextGanancias = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TexTicket = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TexDineroCliente = new javax.swing.JTextField();
        GuardarPersona = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        ColorB = new javax.swing.JButton();
        TextLugar = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        TexNacionalidad = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        TexIdentidad = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TexNombre = new javax.swing.JTextField();
        TexEdad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        Combo_Nombre = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        TexIdentidad1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        TexEdad1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        TexNacionalidad1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        TextLugar1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        ColorB1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Arbol_Familias1 = new javax.swing.JTree();
        GuardarPersona1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        TabFEJC1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ComboPadres1 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ComboTrabajo1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TexHora_Entrada1 = new javax.swing.JTextField();
        TexHora_Salida1 = new javax.swing.JTextField();
        Text_Sueldo1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Combo_Estado1 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Combo_Jefe_trabajo1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        TexClientes1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TextGanancias1 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        TexTicket1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TexDineroCliente1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        combo_nombretabla = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Guardar_opcion = new javax.swing.JMenuItem();
        GuardarComo_opcion = new javax.swing.JMenuItem();
        Salir_opcion = new javax.swing.JMenuItem();
        About_opcion = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout AboutLayout = new javax.swing.GroupLayout(About.getContentPane());
        About.getContentPane().setLayout(AboutLayout);
        AboutLayout.setHorizontalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        AboutLayout.setVerticalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabPrincipal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabPrincipalStateChanged(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton1)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(101, 101, 101))
        );

        TabPrincipal.addTab("Inicio", jPanel1);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        Arbol_Familias.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(Arbol_Familias);

        jLabel8.setText("Arbol Genialogico");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        TabFEJC.addTab("", jPanel13);

        jLabel5.setText("Padre:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(ComboPadres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboPadres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        TabFEJC.addTab("Familiar", jPanel5);

        jLabel6.setText("Seccion de Trabajo:");

        ComboTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Venta de Gatos ", "Venta de Baleadas" }));

        jLabel7.setText("Hora de Salida:");

        jLabel10.setText("Hora de Entrada:");

        jLabel11.setText("Sueldo:");

        jLabel12.setText("Estado:");

        Combo_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Disponible" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexHora_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexHora_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TexHora_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TexHora_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Text_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        TabFEJC.addTab("Empleado", jPanel6);

        jLabel2.setText("Seccion de Trabajo:");

        Combo_Jefe_trabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta de Gatos ", "Venta de Baleadas" }));

        jLabel3.setText("Numero de Clientes:");

        jLabel4.setText("Ganancias:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextGanancias))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Combo_Jefe_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TexClientes)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Combo_Jefe_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TexClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        TabFEJC.addTab("Jefes", jPanel8);

        jLabel9.setText("N° de Ticket:");

        jLabel1.setText("Cantidad de Dinero:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexDineroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TexTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TexDineroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        TabFEJC.addTab("Clientes", jPanel7);

        GuardarPersona.setText("Guardar");
        GuardarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarPersonaMouseClicked(evt);
            }
        });

        jLabel27.setText("Color de Piel:");

        ColorB.setText("Color");
        ColorB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColorBMouseClicked(evt);
            }
        });

        jLabel28.setText("Lugar de Nacimiento:");

        jLabel29.setText("Nacionalidad:");

        jLabel30.setText("Edad:");

        jLabel31.setText("N° de Identidad:");

        jLabel32.setText("Nombre:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ColorB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TexEdad)
                                    .addComponent(TexNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(TexIdentidad)
                                    .addComponent(TexNacionalidad)
                                    .addComponent(TextLugar)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TabFEJC, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(GuardarPersona)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(TexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(TexIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(TexEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(TexNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(TextLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(ColorB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(TabFEJC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(GuardarPersona)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        TabPrincipal.addTab("Personas", jPanel2);

        jLabel33.setText("Nombre:");

        Combo_Nombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Combo_NombreItemStateChanged(evt);
            }
        });

        jLabel34.setText("N° de Identidad:");

        jLabel35.setText("Edad:");

        jLabel36.setText("Nacionalidad:");

        jLabel37.setText("Lugar de Nacimiento:");

        jLabel38.setText("Color de Piel:");

        ColorB1.setText("Color");
        ColorB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColorB1MouseClicked(evt);
            }
        });

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        Arbol_Familias1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(Arbol_Familias1);

        GuardarPersona1.setText("Modificar");
        GuardarPersona1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarPersona1MouseClicked(evt);
            }
        });

        jLabel24.setText("Arbol Genialogico");

        jLabel13.setText("Padre:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addGap(31, 31, 31)
                .addComponent(ComboPadres1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ComboPadres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        TabFEJC1.addTab("Familiar", jPanel9);

        jLabel14.setText("Seccion de Trabajo:");

        ComboTrabajo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Venta de Gatos ", "Venta de Baleadas" }));

        jLabel15.setText("Hora de Salida:");

        jLabel16.setText("Hora de Entrada:");

        jLabel17.setText("Sueldo:");

        jLabel18.setText("Estado:");

        Combo_Estado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Disponible" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboTrabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexHora_Entrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexHora_Salida1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Sueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ComboTrabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TexHora_Entrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TexHora_Salida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Text_Sueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combo_Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        TabFEJC1.addTab("Empleado", jPanel10);

        jLabel19.setText("Seccion de Trabajo:");

        Combo_Jefe_trabajo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta de Gatos ", "Venta de Baleadas" }));

        jLabel20.setText("Numero de Clientes:");

        jLabel21.setText("Ganancias:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextGanancias1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Combo_Jefe_trabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TexClientes1)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Combo_Jefe_trabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TexClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TextGanancias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        TabFEJC1.addTab("Jefes", jPanel11);

        jLabel22.setText("N° de Ticket:");

        jLabel23.setText("Cantidad de Dinero:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexDineroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TexTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TexDineroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        TabFEJC1.addTab("Clientes", jPanel12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ColorB1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TexEdad1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(TexIdentidad1)
                                    .addComponent(TexNacionalidad1)
                                    .addComponent(TextLugar1)
                                    .addComponent(Combo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TabFEJC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(GuardarPersona1))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel24)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel24)
                    .addComponent(Combo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(TexIdentidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(TexEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(TexNacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(TextLugar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(ColorB1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addComponent(TabFEJC1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(GuardarPersona1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        TabPrincipal.addTab("Modificar", jPanel4);

        combo_nombretabla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_nombretablaItemStateChanged(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Nacionalidad", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(Tabla);

        jLabel25.setText("Nombre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_nombretabla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_nombretabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        TabPrincipal.addTab("Listar", jPanel3);

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Guardar_opcion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Guardar_opcion.setText("Guardar");
        Guardar_opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_opcionActionPerformed(evt);
            }
        });
        jMenu1.add(Guardar_opcion);

        GuardarComo_opcion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        GuardarComo_opcion.setText("Guardar Como");
        GuardarComo_opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarComo_opcionActionPerformed(evt);
            }
        });
        jMenu1.add(GuardarComo_opcion);

        Salir_opcion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Salir_opcion.setText("Salir");
        Salir_opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_opcionActionPerformed(evt);
            }
        });
        jMenu1.add(Salir_opcion);

        About_opcion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        About_opcion.setText("About");
        About_opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_opcionActionPerformed(evt);
            }
        });
        jMenu1.add(About_opcion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarPersonaMouseClicked
        // TODO add your handling code here:
        //atributos persona
        int edad;
        long id;
        String Nacionalidad;
        String Lugar_nacimiento;
        String Nombre;
        Color color_piel;
        DefaultTreeModel Modelo = (DefaultTreeModel) Arbol_Familias.getModel();
        DefaultMutableTreeNode Abuelo = (DefaultMutableTreeNode) Modelo.getRoot();
        DefaultMutableTreeNode Hijo = (DefaultMutableTreeNode) Modelo.getRoot();

        //atributos familica
        Personas Per = new Personas();
        //arraylist familia

        //atributos empleado
        String seccion_trabajo;
        String hora_entrada;
        String hora_salida;
        long sueldo;
        String estado;

        //atributos jefes
        //arraylisempleados
        String seccion_trabajoj;
        int numero_empleadosAtendidos;
        long ganancias;

        //clientes
        int Ticket;
        long dinero;
        //arraylis orden

        if (TabFEJC.getSelectedIndex() == 1) {
            //familia
            edad = Integer.parseInt(TexEdad.getText());
            id = Long.parseLong(TexIdentidad.getText());
            Nacionalidad = TexNacionalidad.getText();
            Lugar_nacimiento = TextLugar.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB.getBackground();
            Per = (Personas) ComboPadres.getSelectedItem();
            Hijos.add(new Familiares(edad, id, Nacionalidad, Nacionalidad, Nombre, color_piel, Per, Hijos));
//                Datos.add(new Familiares(edad, id, Nacionalidad, Lugar_nacimiento, Nombre, color_piel, a, Family));
            Nombre = TexNombre.getText();
            DefaultMutableTreeNode NodoFamilia;
            NodoFamilia = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()),
                    TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
            DefaultMutableTreeNode NFamilia;
            NFamilia = new DefaultMutableTreeNode(TexNombre.getText());
            Hijo.add(NodoFamilia);
            NodoFamilia.add(NFamilia);
            Modelo.reload();
            boolean condiciendo = true;
            for (int i = 0; i < Hijo.getChildCount(); i++) {
                if (Hijo.getChildAt(i).toString().equals(Nombre)) {
                    DefaultMutableTreeNode P = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                    condiciendo = false;
                }
            }
            if (condiciendo) {
                DefaultMutableTreeNode nom = new DefaultMutableTreeNode(Nombre);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                nom.add(p);
                Hijo.add(nom);
            }
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Hijo");

        } else if (TabFEJC.getSelectedIndex() == 2) {
            //empleado
            edad = Integer.parseInt(TexEdad.getText());
            id = Long.parseLong(TexIdentidad.getText());
            Nacionalidad = TexNacionalidad.getText();
            Lugar_nacimiento = TextLugar.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB.getBackground();
            seccion_trabajo = (String) ComboTrabajo.getSelectedItem();
            hora_entrada = TexHora_Entrada.getText();
            hora_salida = TexHora_Salida.getText();
            sueldo = Long.parseLong(Text_Sueldo.getText());
            estado = (String) Combo_Estado.getSelectedItem();
            empleado.add(new Empleado(seccion_trabajo, hora_entrada, hora_salida, sueldo, estado, edad, id, Nacionalidad, Lugar_nacimiento, Nombre, Modelo, color_piel, Hijos));
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Empleado");

        } else if (TabFEJC.getSelectedIndex() == 3) {
            //jefes
            edad = Integer.parseInt(TexEdad.getText());
            id = Long.parseLong(TexIdentidad.getText());
            Nacionalidad = TexNacionalidad.getText();
            Lugar_nacimiento = TextLugar.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB.getBackground();
            seccion_trabajoj = (String) Combo_Jefe_trabajo.getSelectedItem();
            numero_empleadosAtendidos = Integer.parseInt(TexClientes.getText());
            ganancias = Long.parseLong(TextGanancias.getText());
            Jefe.add(new Jefes(seccion_trabajoj, empleado, numero_empleadosAtendidos, ganancias, edad, id, Nacionalidad, Lugar_nacimiento, Nombre, Modelo, color_piel, Hijos));
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Jefe");

        } else if (TabFEJC.getSelectedIndex() == 4) {
            // clientes
            edad = Integer.parseInt(TexEdad.getText());
            id = Long.parseLong(TexIdentidad.getText());
            Nacionalidad = TexNacionalidad.getText();
            Lugar_nacimiento = TextLugar.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB.getBackground();
            Ticket = Integer.parseInt(TexTicket.getText());
            dinero = Long.parseLong(TexDineroCliente.getText());
            Datos.add(new Cliente(Ticket, dinero, orden, edad, id, Nacionalidad, Lugar_nacimiento, Nombre, Modelo, color_piel, Hijos));
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Cliente");

        } else {
            //personas
            edad = Integer.parseInt(TexEdad.getText());
            id = Long.parseLong(TexIdentidad.getText());
            Nacionalidad = TexNacionalidad.getText();
            Lugar_nacimiento = TextLugar.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB.getBackground();
            Datos.add(new Personas(edad, id, Nacionalidad, Lugar_nacimiento, Nombre, color_piel));

            //Treeeee
            Nombre = TexNombre.getText();
            DefaultMutableTreeNode NodoFamilia;
            NodoFamilia = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()),
                    TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
            DefaultMutableTreeNode NFamilia;
            NFamilia = new DefaultMutableTreeNode(TexNombre.getText());
            Abuelo.add(NodoFamilia);
            NodoFamilia.add(NFamilia);
            Modelo.reload();
            boolean condiciendo = true;
            for (int i = 0; i < Abuelo.getChildCount(); i++) {
                if (Abuelo.getChildAt(i).toString().equals(Nombre)) {
                    DefaultMutableTreeNode P = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                    condiciendo = false;
                }
            }
            if (condiciendo) {
                DefaultMutableTreeNode nom = new DefaultMutableTreeNode(Nombre);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                nom.add(p);
                Abuelo.add(nom);
            }
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Padre");
        }
        Modelo.insertNodeInto(Abuelo, Hijo, 1);

        TexNombre.setText("");
        TexIdentidad.setText("");
        TexEdad.setText("");
        TexNacionalidad.setText("");
        TextLugar.setText("");
        ColorB.setBackground(Color.WHITE);
        ComboTrabajo.setSelectedIndex(0);
        TexHora_Entrada.setText("");
        TexHora_Salida.setText("");
        Text_Sueldo.setText("");
        Combo_Estado.setSelectedIndex(0);
        Combo_Jefe_trabajo.setSelectedIndex(0);
        Combo_Estado.setSelectedIndex(0);
        TextGanancias.setText("");
        TexTicket.setText("");
        TexDineroCliente.setText("");
        TexClientes.setText("");


    }//GEN-LAST:event_GuardarPersonaMouseClicked

    private void Salir_opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_opcionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Salir_opcionActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void About_opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_opcionActionPerformed
        // TODO add your handling code here:
        About.setModal(true);
        About.pack(); // sirve para acoplar el tamaño de la ventana a los elementos que contiene
        About.setLocationRelativeTo(this);
        About.setVisible(true);
    }//GEN-LAST:event_About_opcionActionPerformed

    private void TabPrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabPrincipalStateChanged
        // TODO add your handling code here:
        if (this.TabPrincipal.getSelectedIndex() == 2) {
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            for (Personas temp : Datos) {
                Modelo.addElement(temp);
            }
            Combo_Nombre.setModel(Modelo);
        }
//        if (this.TabPrincipal.getSelectedIndex() == 4) {
        DefaultComboBoxModel Modelo1 = new DefaultComboBoxModel();
        for (Personas Temp : Datos) {
            Modelo1.addElement(Temp);
        }
        Combo_Nombre.setModel(Modelo1);

    }//GEN-LAST:event_TabPrincipalStateChanged

    private void GuardarComo_opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarComo_opcionActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File dir = fileChosser.getSelectedFile();
            boolean fuecreado = dir.mkdir();
            if (fuecreado) {
                DefaultTreeModel Modelo = (DefaultTreeModel) Arbol_Familias.getModel();
                DefaultMutableTreeNode Abuelo = (DefaultMutableTreeNode) Modelo.getRoot();
                String Nombre;
                Nombre = TexNombre.getText();
                DefaultMutableTreeNode NodoFamilia;
                NodoFamilia = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()),
                        TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                DefaultMutableTreeNode NFamilia;
                NFamilia = new DefaultMutableTreeNode(TexNombre.getText());
                Abuelo.add(NodoFamilia);
                NodoFamilia.add(NFamilia);
                Modelo.reload();
                boolean condiciendo = true;
                for (int i = 0; i < Abuelo.getChildCount(); i++) {
                    if (Abuelo.getChildAt(i).toString().equals(Nombre)) {
                        DefaultMutableTreeNode P = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                        condiciendo = false;
                    }
                }
                if (condiciendo) {
                    DefaultMutableTreeNode nom = new DefaultMutableTreeNode(Nombre);
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                    nom.add(p);
                    Abuelo.add(nom);
                }
                JOptionPane.showMessageDialog(this, "Directorio creado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "El directorio no fue creado");
            }
        }
    }//GEN-LAST:event_GuardarComo_opcionActionPerformed

    private void ColorBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorBMouseClicked
        ColorB.setBackground(JColorChooser.showDialog(this, "Seleccione color", Color.yellow));
    }//GEN-LAST:event_ColorBMouseClicked

    private void ColorB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorB1MouseClicked
        // TODO add your handling code here:
        ColorB1.setBackground(JColorChooser.showDialog(this, "Seleccione color", Color.yellow));
    }//GEN-LAST:event_ColorB1MouseClicked

    private void GuardarPersona1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarPersona1MouseClicked
        //boton modificar
        int edad;
        long id;
        String Nacionalidad;
        String Lugar_nacimiento;
        String Nombre;
        Color color_piel;
        DefaultTreeModel Modelo = (DefaultTreeModel) Arbol_Familias.getModel();
        DefaultMutableTreeNode Abuelo = (DefaultMutableTreeNode) Modelo.getRoot();
        DefaultMutableTreeNode Hijo = (DefaultMutableTreeNode) Modelo.getRoot();

        //atributos familica
        Personas Per = new Personas();
        //arraylist familia

        //atributos empleado
        String seccion_trabajo;
        String hora_entrada;
        String hora_salida;
        long sueldo;
        String estado;

        //atributos jefes
        //arraylisempleados
        String seccion_trabajoj;
        int numero_empleadosAtendidos;
        long ganancias;

        //clientes
        int Ticket;
        long dinero;
        //arraylis orden

        if (TabFEJC1.getSelectedIndex() == 1) {
            //familia
            edad = Integer.parseInt(TexEdad1.getText());
            id = Long.parseLong(TexIdentidad1.getText());
            Nacionalidad = TexNacionalidad1.getText();
            Lugar_nacimiento = TextLugar1.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB1.getBackground();
            Per = (Personas) ComboPadres1.getSelectedItem();
            Hijos.add(new Familiares(edad, id, Nacionalidad, Nacionalidad, Nombre, color_piel, Per, Hijos));
//                Datos.add(new Familiares(edad, id, Nacionalidad, Lugar_nacimiento, Nombre, color_piel, a, Family));
            Nombre = TexNombre.getText();
            DefaultMutableTreeNode NodoFamilia;
            NodoFamilia = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad1.getText()), Long.parseLong(TexIdentidad1.getText()),
                    TexNacionalidad1.getText(), TextLugar1.getText(), TexNombre.getText(), ColorB1.getBackground()));
            DefaultMutableTreeNode NFamilia;
            NFamilia = new DefaultMutableTreeNode(TexNombre.getText());
            Hijo.add(NodoFamilia);
            NodoFamilia.add(NFamilia);
            Modelo.reload();
            boolean condiciendo = true;
            for (int i = 0; i < Hijo.getChildCount(); i++) {
                if (Hijo.getChildAt(i).toString().equals(Nombre)) {
                    DefaultMutableTreeNode P = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad1.getText()), Long.parseLong(TexIdentidad1.getText()), TexNacionalidad1.getText(), TextLugar1.getText(), TexNombre.getText(), ColorB1.getBackground()));
                    condiciendo = false;
                }
            }
            if (condiciendo) {
                DefaultMutableTreeNode nom = new DefaultMutableTreeNode(Nombre);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad1.getText()), TexNacionalidad1.getText(), TextLugar1.getText(), TexNombre.getText(), ColorB1.getBackground()));
                nom.add(p);
                Hijo.add(nom);
            }
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Hijo");

        } else if (TabFEJC1.getSelectedIndex() == 2) {
            //empleado
            edad = Integer.parseInt(TexEdad.getText());
            id = Long.parseLong(TexIdentidad1.getText());
            Nacionalidad = TexNacionalidad1.getText();
            Lugar_nacimiento = TextLugar1.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB1.getBackground();
            seccion_trabajo = (String) ComboTrabajo1.getSelectedItem();
            hora_entrada = TexHora_Entrada1.getText();
            hora_salida = TexHora_Salida1.getText();
            sueldo = Long.parseLong(Text_Sueldo1.getText());
            estado = (String) Combo_Estado1.getSelectedItem();
            empleado.add(new Empleado(seccion_trabajo, hora_entrada, hora_salida, sueldo, estado, edad, id, Nacionalidad, Lugar_nacimiento, Nombre, Modelo, color_piel, Hijos));
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Empleado");

        } else if (TabFEJC1.getSelectedIndex() == 3) {
            //jefes
            edad = Integer.parseInt(TexEdad1.getText());
            id = Long.parseLong(TexIdentidad1.getText());
            Nacionalidad = TexNacionalidad1.getText();
            Lugar_nacimiento = TextLugar1.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB1.getBackground();
            seccion_trabajoj = (String) Combo_Jefe_trabajo1.getSelectedItem();
            numero_empleadosAtendidos = Integer.parseInt(TexClientes1.getText());
            ganancias = Long.parseLong(TextGanancias1.getText());
            Jefe.add(new Jefes(seccion_trabajoj, empleado, numero_empleadosAtendidos, ganancias, edad, id, Nacionalidad, Lugar_nacimiento, Nombre, Modelo, color_piel, Hijos));
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Jefe");

        } else if (TabFEJC1.getSelectedIndex() == 4) {
            // clientes
            edad = Integer.parseInt(TexEdad1.getText());
            id = Long.parseLong(TexIdentidad1.getText());
            Nacionalidad = TexNacionalidad1.getText();
            Lugar_nacimiento = TextLugar1.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB1.getBackground();
            Ticket = Integer.parseInt(TexTicket1.getText());
            dinero = Long.parseLong(TexDineroCliente1.getText());
            Datos.add(new Cliente(Ticket, dinero, orden, edad, id, Nacionalidad, Lugar_nacimiento, Nombre, Modelo, color_piel, Hijos));
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Cliente");

        } else {
            //personas
            edad = Integer.parseInt(TexEdad1.getText());
            id = Long.parseLong(TexIdentidad1.getText());
            Nacionalidad = TexNacionalidad1.getText();
            Lugar_nacimiento = TextLugar1.getText();
            Nombre = TexNombre.getText();
            color_piel = ColorB1.getBackground();
            Datos.add(new Personas(edad, id, Nacionalidad, Lugar_nacimiento, Nombre, color_piel));

            //Treeeee
            Nombre = TexNombre.getText();
            DefaultMutableTreeNode NodoFamilia;
            NodoFamilia = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad1.getText()), Long.parseLong(TexIdentidad1.getText()),
                    TexNacionalidad1.getText(), TextLugar1.getText(), TexNombre.getText(), ColorB1.getBackground()));
            DefaultMutableTreeNode NFamilia;
            NFamilia = new DefaultMutableTreeNode(TexNombre.getText());
            Abuelo.add(NodoFamilia);
            NodoFamilia.add(NFamilia);
            Modelo.reload();
            boolean condiciendo = true;
            for (int i = 0; i < Abuelo.getChildCount(); i++) {
                if (Abuelo.getChildAt(i).toString().equals(Nombre)) {
                    DefaultMutableTreeNode P = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                    condiciendo = false;
                }
            }
            if (condiciendo) {
                DefaultMutableTreeNode nom = new DefaultMutableTreeNode(Nombre);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Personas(Integer.parseInt(TexEdad.getText()), Long.parseLong(TexIdentidad.getText()), TexNacionalidad.getText(), TextLugar.getText(), TexNombre.getText(), ColorB.getBackground()));
                nom.add(p);
                Abuelo.add(nom);
            }
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente al Padre");
        }
        Modelo.insertNodeInto(Abuelo, Hijo, 1);
        TexNombre.setText("");
        TexIdentidad.setText("");
        TexEdad.setText("");
        TexNacionalidad.setText("");
        TextLugar.setText("");
        ColorB.setBackground(Color.WHITE);
        ComboTrabajo.setSelectedIndex(0);
        TexHora_Entrada.setText("");
        TexHora_Salida.setText("");
        Text_Sueldo.setText("");
        Combo_Estado.setSelectedIndex(0);
        Combo_Jefe_trabajo.setSelectedIndex(0);
        Combo_Estado.setSelectedIndex(0);
        TextGanancias.setText("");
        TexTicket.setText("");
        TexDineroCliente.setText("");
        TexClientes.setText("");
    }//GEN-LAST:event_GuardarPersona1MouseClicked

    private void Combo_NombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Combo_NombreItemStateChanged
        if (evt.getStateChange() == 2) {
            Personas Persona = (Personas) Combo_Nombre.getSelectedItem();

            TexIdentidad.setText(String.valueOf(Persona.getId()));
            TexEdad.setText(String.valueOf(Persona.getEdad()));
            TexNacionalidad.setText(Persona.getNacionalidad());
            TextLugar.setText(Persona.getLugar_nacimiento());
            ColorB.setBackground(Persona.getColor_piel());
        }
    }//GEN-LAST:event_Combo_NombreItemStateChanged

    private void combo_nombretablaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_nombretablaItemStateChanged
        if (evt.getStateChange() == 2) {
            Personas Persona = (Personas) combo_nombretabla.getSelectedItem();
            Object[] newrow = {Persona.getNombre(), Persona.getEdad(), Persona.getNacionalidad(), Persona.getId()};
            DefaultTableModel Modelo = (DefaultTableModel) Tabla.getModel();
            Modelo.addRow(newrow);
            Tabla.setModel(Modelo);
        }
    }//GEN-LAST:event_combo_nombretablaItemStateChanged

    private void Guardar_opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_opcionActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = jfc.getSelectedFile();
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_Guardar_opcionActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                Plastic3DLookAndFeel.setPlasticTheme(new DarkStar());
                UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog About;
    private javax.swing.JMenuItem About_opcion;
    private javax.swing.JTree Arbol_Familias;
    private javax.swing.JTree Arbol_Familias1;
    private javax.swing.JButton ColorB;
    private javax.swing.JButton ColorB1;
    private javax.swing.JComboBox<String> ComboPadres;
    private javax.swing.JComboBox<String> ComboPadres1;
    private javax.swing.JComboBox<String> ComboTrabajo;
    private javax.swing.JComboBox<String> ComboTrabajo1;
    private javax.swing.JComboBox<String> Combo_Estado;
    private javax.swing.JComboBox<String> Combo_Estado1;
    private javax.swing.JComboBox<String> Combo_Jefe_trabajo;
    private javax.swing.JComboBox<String> Combo_Jefe_trabajo1;
    private javax.swing.JComboBox<String> Combo_Nombre;
    private javax.swing.JMenuItem GuardarComo_opcion;
    private javax.swing.JButton GuardarPersona;
    private javax.swing.JButton GuardarPersona1;
    private javax.swing.JMenuItem Guardar_opcion;
    private javax.swing.JMenuItem Salir_opcion;
    private javax.swing.JTabbedPane TabFEJC;
    private javax.swing.JTabbedPane TabFEJC1;
    private javax.swing.JTabbedPane TabPrincipal;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TexClientes;
    private javax.swing.JTextField TexClientes1;
    private javax.swing.JTextField TexDineroCliente;
    private javax.swing.JTextField TexDineroCliente1;
    private javax.swing.JTextField TexEdad;
    private javax.swing.JTextField TexEdad1;
    private javax.swing.JTextField TexHora_Entrada;
    private javax.swing.JTextField TexHora_Entrada1;
    private javax.swing.JTextField TexHora_Salida;
    private javax.swing.JTextField TexHora_Salida1;
    private javax.swing.JTextField TexIdentidad;
    private javax.swing.JTextField TexIdentidad1;
    private javax.swing.JTextField TexNacionalidad;
    private javax.swing.JTextField TexNacionalidad1;
    private javax.swing.JTextField TexNombre;
    private javax.swing.JTextField TexTicket;
    private javax.swing.JTextField TexTicket1;
    private javax.swing.JTextField TextGanancias;
    private javax.swing.JTextField TextGanancias1;
    private javax.swing.JTextField TextLugar;
    private javax.swing.JTextField TextLugar1;
    private javax.swing.JTextField Text_Sueldo;
    private javax.swing.JTextField Text_Sueldo1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo_nombretabla;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Personas> Datos = new ArrayList();
    ArrayList<Familiares> Hijos = new ArrayList();
    ArrayList<Jefes> Jefe = new ArrayList();
    ArrayList<Orden> orden = new ArrayList();
    ArrayList<Empleado> empleado = new ArrayList();
}
