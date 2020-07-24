// @author Kako

package psicologa;

//Se importan las librerías a utilizar
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Inicio extends javax.swing.JFrame {

    //Se crea un nuevo modelo default para las tablas
    DefaultTableModel ModeloTabla = new DefaultTableModel();

    public Inicio() {
        initComponents();

        //Seteo de ícono
        ImageIcon icon = new ImageIcon("C:\\Users\\Kako\\Documents\\NetBeansProjects\\Psicologa\\src\\psicologa\\images\\Logo.png");
        this.setIconImage(icon.getImage());
        //Seteo color del background y posición en la que se abrira la ventana
        this.getContentPane().setBackground(new java.awt.Color(255, 204, 102));
        this.setLocationRelativeTo(null);

        //Se llama a las funciones para generar y cargar la tabla
        GenerarTabla();
        CargarTabla();
        
        //Se desactiva el botón para editar fichas y se active solo al momemto que se haga clic sobre la tabla
        ButtonEditar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelInicio = new javax.swing.JLabel();
        LabelRut = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        TextRut = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        LabelFicha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonLimpiar = new javax.swing.JButton();
        ButtonPaciente = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        LabelInicio.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LabelInicio.setForeground(new java.awt.Color(0, 153, 51));
        LabelInicio.setText("INICIO");

        LabelRut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelRut.setForeground(new java.awt.Color(0, 153, 51));
        LabelRut.setText("Rut:");

        LabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(0, 153, 51));
        LabelNombre.setText("Nombre:");

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/psicologa/images/Logo transparente.png"))); // NOI18N

        TextRut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroRut(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteRut(evt);
            }
        });

        TextNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNombre(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteNombre(evt);
            }
        });

        LabelFicha.setForeground(new java.awt.Color(255, 204, 102));
        LabelFicha.setText("0");

        Tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RUT", "Nombre", "ID Ficha", "Fecha", "Ubicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickTabla(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        ButtonLimpiar.setBackground(new java.awt.Color(0, 173, 58));
        ButtonLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLimpiar.setText("Limpiar");
        ButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Limpiar(evt);
            }
        });

        ButtonPaciente.setBackground(new java.awt.Color(0, 173, 58));
        ButtonPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonPaciente.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPaciente.setText("Ir a Ficha Clínica");
        ButtonPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirFicha(evt);
            }
        });

        ButtonEditar.setBackground(new java.awt.Color(0, 173, 58));
        ButtonEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEditar.setText("Editar ficha");
        ButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Editar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelInicio)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelRut)
                            .addComponent(LabelNombre))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLogo))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelFicha))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(105, Short.MAX_VALUE)
                        .addComponent(ButtonLimpiar)
                        .addGap(145, 145, 145)
                        .addComponent(ButtonPaciente)
                        .addGap(140, 140, 140)
                        .addComponent(ButtonEditar)
                        .addGap(109, 109, 109)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LabelInicio)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelRut)
                            .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNombre)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LabelLogo))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPaciente)
                    .addComponent(ButtonLimpiar)
                    .addComponent(ButtonEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(LabelFicha))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Se crea la función para generar la tabla
    private void GenerarTabla() {
        //Se añaden las columnas al modelo de tabla
        ModeloTabla.addColumn("RUT");
        ModeloTabla.addColumn("Nombre");
        ModeloTabla.addColumn("ID ficha");
        ModeloTabla.addColumn("Fecha");
        ModeloTabla.addColumn("Ubicación");
        
        //Se aplica el modelo a la tabla creada
        Tabla.setModel(ModeloTabla);

        //Se aplica el ancho deseado para las distintas columnas de la tabla
        Tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        Tabla.getColumnModel().getColumn(1).setPreferredWidth(270);
        Tabla.getColumnModel().getColumn(2).setPreferredWidth(10);
        Tabla.getColumnModel().getColumn(3).setPreferredWidth(70);
        Tabla.getColumnModel().getColumn(4).setPreferredWidth(85);
    }

    //Se crea la función para cargar la tabla
    private void CargarTabla() {
        Connection C = null;
        Statement stmt = null;
        String ConsultaRut;
        String array[] = new String[5];

        try {
            Class.forName("org.postgresql.Driver");
            C = DriverManager.getConnection("jdbc:postgresql://localhost:5432/psicologa", "Kako", "kirino");
            stmt = C.createStatement();

            ConsultaRut = "SELECT paciente.*, registro_ficha.* "
                    + "FROM public.paciente INNER JOIN public.registro_ficha ON paciente.rut = registro_ficha.paciente_rut";

            ResultSet rs = stmt.executeQuery(ConsultaRut);

            while (rs.next()) {
                array[0] = rs.getString("rut").trim();
                array[1] = rs.getString("nombre").trim();
                array[2] = rs.getString("id_registro_ficha");
                array[3] = rs.getString("fecha_registro").trim();
                array[4] = rs.getString("observaciones").trim();

                ModeloTabla.addRow(array);
            }

            //Se define la orientación de los textos al ser recibidos en la tabla
            ((DefaultTableCellRenderer) Tabla.getTableHeader().getDefaultRenderer()).setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);
            DefaultTableCellRenderer Center = new DefaultTableCellRenderer();
            Center.setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(Center);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(Center);

            rs.close();
            stmt.close();
            C.close();
        } catch (Exception e) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Se crea la función para filtrar los datos de la tabla
    private void Filtro(String x){
        TableRowSorter<DefaultTableModel> Filter = new TableRowSorter<DefaultTableModel>(ModeloTabla);
        Tabla.setRowSorter(Filter);
        Filter.setRowFilter(RowFilter.regexFilter(x));
    }
    
    //Se crean los eventos para bloquear el largo de caracteres y dar formmato a los TextField
    private void LimiteRut(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteRut
        char x = evt.getKeyChar();
        String rut = TextRut.getText();

        if ((!Character.isDigit(x)) && x != KeyEvent.VK_MINUS && x != KeyEvent.VK_K) {
            evt.consume();
        }

        if (rut.length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_LimiteRut

    private void LimiteNombre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteNombre
        char x = evt.getKeyChar();
        String nombre = TextNombre.getText();

        if (!Character.isLetter(x) && x != KeyEvent.VK_SPACE) {
            evt.consume();
        }

        if (nombre.length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_LimiteNombre

    //Botón para abrir la ventana ficha clínica
    private void AbrirFicha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirFicha
        LabelFicha.setText("0");
        FichaClinica x = new FichaClinica();
        x.setVisible(true);
    }//GEN-LAST:event_AbrirFicha

    //Se da formato a los JTextField para que se deshabilite el del nombre si se escribe en el del rut
    private void FiltroRut(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroRut
        String rut = TextRut.getText();

        Filtro(rut);
        
        if(TextRut.getText().length() != 0){
            TextNombre.setEnabled(false);
        }
        else{
            TextNombre.setEnabled(true);
        }
    }//GEN-LAST:event_FiltroRut

    //Se da formato a los JTextField para que se deshabilite el del rut si se escribe en el del nombre
    private void FiltroNombre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNombre
        String nombre = TextNombre.getText();
        
        Filtro(nombre);
        
        if(TextNombre.getText().length() != 0){
            TextRut.setEnabled(false);
        }
        else{
            TextRut.setEnabled(true);
        }
    }//GEN-LAST:event_FiltroNombre

    //Se arma el evento para que la tabla reaccione al ser clickeada
    private void ClickTabla(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickTabla
        int x = Tabla.getSelectedRow();
        TableModel mo = Tabla.getModel();
        
        TextRut.setText(mo.getValueAt(x, 0).toString().trim());
        TextNombre.setText(mo.getValueAt(x, 1).toString().trim());
        LabelFicha.setText(mo.getValueAt(x, 2).toString());
        
        TextRut.setEnabled(false);
        TextNombre.setEnabled(false);
        ButtonEditar.setEnabled(true);
    }//GEN-LAST:event_ClickTabla

    //Botón para borrar los campos y reiniciar la tabla y el formulario
    private void Limpiar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Limpiar
        TextRut.setText("");
        TextNombre.setText("");
        LabelFicha.setText("0");
        
        TextRut.setEnabled(true);
        TextNombre.setEnabled(true);
        ButtonEditar.setEnabled(false);
    }//GEN-LAST:event_Limpiar

    //Botón para ir a editar una ficha en específico
    private void Editar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar
        if(ButtonEditar.isEnabled() == true){
            FichaClinica x = new FichaClinica();
            x.setVisible(true);
            FichasPacientes y = new FichasPacientes();
            y.setVisible(true);
        }
    }//GEN-LAST:event_Editar

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JButton ButtonPaciente;
    public static javax.swing.JLabel LabelFicha;
    private javax.swing.JLabel LabelInicio;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelRut;
    private javax.swing.JTable Tabla;
    public static javax.swing.JTextField TextNombre;
    public static javax.swing.JTextField TextRut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
