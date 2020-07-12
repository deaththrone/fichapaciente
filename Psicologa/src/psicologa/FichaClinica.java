// @author Kako

package psicologa;

//imports
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FichaClinica extends javax.swing.JFrame {

    
    public FichaClinica() {
        initComponents();
        
        //Seteo de ícono
        ImageIcon icon = new ImageIcon("C:\\Users\\Kako\\Documents\\NetBeansProjects\\Psicologa\\src\\psicologa\\images\\Logo.png");
        this.setIconImage(icon.getImage());
        //Seteo color del background y posición en la que se abrira la ventana
        this.getContentPane().setBackground(new java.awt.Color(255,204,102));
        this.setLocationRelativeTo(null);
        
        //Obtención de fecha por parte del sistema al campo TextIngreso y seteo de formato
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMMMMMMMM yyyy");
        Date fecha = new Date(System.currentTimeMillis());
        TextIngreso.setText(formato.format(fecha));
        TextIngreso.setHorizontalAlignment(TextIngreso.CENTER);
        
        //Se desactiva el boton "Agregar ficha" para activarlo solo si existe el paciente
        ButtonAgregarFichas.setEnabled(false);
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        LabelRut = new javax.swing.JLabel();
        LabelSerie = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelNacimiento = new javax.swing.JLabel();
        LabelEdad = new javax.swing.JLabel();
        LabelDomicilio = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        LabelPrevision = new javax.swing.JLabel();
        LabelIngreso = new javax.swing.JLabel();
        LabelMotivo = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        TextRut = new javax.swing.JTextField();
        TextSerie = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        TextNacimiento = new javax.swing.JTextField();
        TextEdad = new javax.swing.JTextField();
        TextDomicilio = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        TextCorreo = new javax.swing.JTextField();
        TextIngreso = new javax.swing.JTextField();
        JScrollPane = new javax.swing.JScrollPane();
        TextMotivo = new javax.swing.JTextArea();
        ComboPrevision = new javax.swing.JComboBox<>();
        ButtonRut = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonLimpiar = new javax.swing.JButton();
        ButtonAgregarFichas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha Clínica");

        LabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 153, 51));
        LabelTitulo.setText("FICHA CLÍNICA");

        LabelRut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelRut.setForeground(new java.awt.Color(0, 153, 51));
        LabelRut.setText("Rut:");

        LabelSerie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelSerie.setForeground(new java.awt.Color(0, 153, 51));
        LabelSerie.setText("N° de serie:");

        LabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(0, 153, 51));
        LabelNombre.setText("Nombre:");

        LabelNacimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelNacimiento.setForeground(new java.awt.Color(0, 153, 51));
        LabelNacimiento.setText("Fecha de nacimiento:");

        LabelEdad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelEdad.setForeground(new java.awt.Color(0, 153, 51));
        LabelEdad.setText("Edad:");

        LabelDomicilio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelDomicilio.setForeground(new java.awt.Color(0, 153, 51));
        LabelDomicilio.setText("Domicilio:");

        LabelCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(0, 153, 51));
        LabelCorreo.setText("Correo:");

        LabelTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(0, 153, 51));
        LabelTelefono.setText("Teléfono:");

        LabelPrevision.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelPrevision.setForeground(new java.awt.Color(0, 153, 51));
        LabelPrevision.setText("Sistema previsional:");

        LabelIngreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelIngreso.setForeground(new java.awt.Color(0, 153, 51));
        LabelIngreso.setText("Fecha de ingreso:");

        LabelMotivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelMotivo.setForeground(new java.awt.Color(0, 153, 51));
        LabelMotivo.setText("Motivo de consulta:");

        LabelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kako\\Documents\\NetBeansProjects\\Psicologa\\src\\psicologa\\images\\Logo transparente.png")); // NOI18N

        TextRut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteRut(evt);
            }
        });

        TextSerie.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteSerie(evt);
            }
        });

        TextNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteNombre(evt);
            }
        });

        TextNacimiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteNacimiento(evt);
            }
        });

        TextEdad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteEdad(evt);
            }
        });

        TextDomicilio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteDomicilio(evt);
            }
        });

        TextTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextTelefono.setText("9");
        TextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteTelefono(evt);
            }
        });

        TextCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteCorreo(evt);
            }
        });

        TextIngreso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteIngreso(evt);
            }
        });

        TextMotivo.setColumns(20);
        TextMotivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextMotivo.setLineWrap(true);
        TextMotivo.setRows(5);
        TextMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteMotivo(evt);
            }
        });
        JScrollPane.setViewportView(TextMotivo);

        ComboPrevision.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ComboPrevision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fonasa", "Isapre" }));

        ButtonRut.setBackground(new java.awt.Color(0, 173, 58));
        ButtonRut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonRut.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRut.setText("Buscar");
        ButtonRut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar(evt);
            }
        });

        ButtonGuardar.setBackground(new java.awt.Color(0, 173, 58));
        ButtonGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Guardar(evt);
            }
        });

        ButtonEditar.setBackground(new java.awt.Color(0, 173, 58));
        ButtonEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEditar.setText("Editar");
        ButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Editar(evt);
            }
        });

        ButtonLimpiar.setBackground(new java.awt.Color(0, 173, 58));
        ButtonLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLimpiar.setLabel("Limpiar");
        ButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vaciar(evt);
            }
        });

        ButtonAgregarFichas.setBackground(new java.awt.Color(0, 173, 58));
        ButtonAgregarFichas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonAgregarFichas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgregarFichas.setLabel("Agregar ficha");
        ButtonAgregarFichas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerFichas(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDomicilio)
                            .addComponent(LabelCorreo)
                            .addComponent(LabelMotivo))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ComboPrevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(39, 39, 39)
                                            .addComponent(LabelIngreso)
                                            .addGap(37, 37, 37))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(ButtonLimpiar)
                                            .addGap(79, 79, 79)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextIngreso)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(15, 15, 15)
                                                    .addComponent(ButtonAgregarFichas)))
                                            .addGap(0, 16, Short.MAX_VALUE))))
                                .addComponent(TextDomicilio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelPrevision)
                                .addGap(325, 325, 325)
                                .addComponent(LabelTelefono))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelSerie)
                                    .addComponent(LabelRut))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(ButtonRut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LabelTitulo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(168, 168, 168)
                                    .addComponent(TextNacimiento)
                                    .addGap(18, 18, 18)
                                    .addComponent(LabelEdad)
                                    .addGap(10, 10, 10)
                                    .addComponent(TextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(LabelNombre)
                                    .addGap(109, 109, 109)
                                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelNacimiento)
                                    .addComponent(ButtonGuardar))
                                .addGap(105, 105, 105)
                                .addComponent(ButtonEditar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLogo))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLogo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LabelTitulo)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonRut)
                            .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRut))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSerie))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNombre))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNacimiento)
                            .addComponent(TextNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEdad)
                            .addComponent(TextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LabelDomicilio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCorreo)
                            .addComponent(LabelTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboPrevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelPrevision))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelIngreso)
                        .addComponent(TextIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(LabelMotivo)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonGuardar)
                    .addComponent(ButtonEditar)
                    .addComponent(ButtonLimpiar)
                    .addComponent(ButtonAgregarFichas))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Se crean los eventos para bloquear el largo de caracteres y dar formmato a los TextField
    private void LimiteRut(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteRut
        char x = evt.getKeyChar();
        
        if((!Character.isDigit(x)) && x != KeyEvent.VK_MINUS && x != KeyEvent.VK_K){
            evt.consume();
        }
        
        if(TextRut.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteRut

    private void LimiteSerie(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteSerie
        if(TextSerie.getText().length() == 15){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteSerie

    private void LimiteNombre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteNombre
        char x = evt.getKeyChar();
        
        if(!Character.isLetter(x) && x != KeyEvent.VK_SPACE){
           evt.consume();  
        } 
        
        if(TextNombre.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteNombre

    private void LimiteDomicilio(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteDomicilio
        if(TextDomicilio.getText().length() == 100){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteDomicilio

    private void LimiteEdad(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteEdad
        char x = evt.getKeyChar();
        
        if(!Character.isDigit(x)){
            evt.consume();
        }
        
        if(TextEdad.getText().length() == 2){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteEdad

    private void LimiteCorreo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteCorreo
        if(TextCorreo.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteCorreo

    private void LimiteTelefono(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteTelefono
        char x = evt.getKeyChar();
        
        if(!Character.isDigit(x) && x != KeyEvent.VK_SPACE){
            evt.consume();
        }
        
        if(TextTelefono.getText().length() == 11){
            evt.consume();
        }
        
        if(TextTelefono.getText().length() == 1 || TextTelefono.getText().length() == 6){
            TextTelefono.setText(TextTelefono.getText() + " ");
        }
    }//GEN-LAST:event_LimiteTelefono

    private void LimiteMotivo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteMotivo
        if(TextMotivo.getText().length() == 100){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteMotivo

    private void LimiteNacimiento(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteNacimiento
        char x = evt.getKeyChar();
        
        if(!Character.isLetter(x) && !Character.isDigit(x) && x != KeyEvent.VK_SPACE){
            evt.consume();
        }
        
        if(TextNacimiento.getText().length() == 18){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteNacimiento

    private void LimiteIngreso(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteIngreso
        char x = evt.getKeyChar();
        
        if(!Character.isLetter(x) && !Character.isDigit(x) && x != KeyEvent.VK_SPACE){
            evt.consume();
        }
        
        if(TextIngreso.getText().length() == 18){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteIngreso

    //Botón para buscar en la BD los datos de un paciente respecto a su RUT
    private void Buscar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar
        Connection C = null;
        Statement stmt = null;
        String ConsultaRut;
        String Rut = TextRut.getText();
        String Serie = "", Nombre = "", Nacimiento = "", Edad = "", Domicilio = "", Correo = "", Telefono = "", Prevision = "", Ingreso = "", Motivo = "";
        
        if(Rut.length() < 9){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Rut mal ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                Class.forName("org.postgresql.Driver");
                C = DriverManager.getConnection("jdbc:postgresql://localhost:5432/psicologa","Kako","kirino");
                stmt = C.createStatement();
                
                ConsultaRut = "SELECT * FROM public.paciente WHERE rut = '" + Rut + "'";

                ResultSet rs = stmt.executeQuery(ConsultaRut);
                
                while(rs.next()){
                    Serie = rs.getString("n_serie");
                    Nombre = rs.getString("nombre");
                    Nacimiento = rs.getString("fecha_nacimiento");
                    Edad = rs.getString("edad");
                    Domicilio = rs.getString("direccion");
                    Correo = rs.getString("correo");
                    Telefono = rs.getString("telefono");
                    Prevision = rs.getString("sistema_previsional");
                    Ingreso = rs.getString("fecha_ingreso");
                    Motivo = rs.getString("motivo_consulta");
                }
                
                if(Nombre == ""){
                    JOptionPane.showMessageDialog(null, "Paciente no existe.\nPuede proceder a agregarlo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    TextSerie.setText(Serie.trim());
                    TextNombre.setText(Nombre.trim());
                    TextNacimiento.setText(Nacimiento.trim());
                    TextEdad.setText(Edad.trim());
                    TextDomicilio.setText(Domicilio.trim());
                    TextCorreo.setText(Correo.trim());
                    TextTelefono.setText(Telefono.trim());
                    ComboPrevision.setSelectedItem(Prevision);
                    TextIngreso.setText(Ingreso.trim());
                    TextMotivo.setText(Motivo.trim());
                    ButtonAgregarFichas.setEnabled(true);
                }
                
                rs.close();
                stmt.close();
                C.close();
            }
            catch(Exception e){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Buscar

    //Botón para guardar en la BD los datos de un paciente
    private void Guardar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Guardar
        Connection C = null;
        Statement stmt = null;
        String ConsultaGuardar;
        String Rut = TextRut.getText();
        String Serie = TextSerie.getText();
        String Nombre = TextNombre.getText();
        String Nacimiento = TextNacimiento.getText();
        int Edad = Integer.parseInt(TextEdad.getText());
        String Domicilio = TextDomicilio.getText();
        String Correo = TextCorreo.getText();
        String Telefono = TextTelefono.getText();
        String Prevision = ComboPrevision.getSelectedItem().toString();
        String Ingreso = TextIngreso.getText();
        String Motivo = TextMotivo.getText();
        
        if(Rut.isEmpty() || Nombre.isEmpty() || Nacimiento.isEmpty() || 
                Domicilio.isEmpty() || Ingreso.isEmpty() || Motivo.isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Hay campos que no pueden quedar en blanco.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                Class.forName("org.postgresql.Driver");
                C = DriverManager.getConnection("jdbc:postgresql://localhost:5432/psicologa","Kako","kirino");
                stmt = C.createStatement();
                
                ConsultaGuardar = "INSERT INTO public.paciente VALUES ('" + Rut + "', '" + Serie + "', '" + Nombre + "', "
                        + "'" + Nacimiento + "', '" + Domicilio + "', '" + Edad + "', '" + Telefono + "', '" + Correo + "', "
                        + "'" + Prevision + "', '" + Ingreso + "', '" + Motivo + "')";
                
                stmt.executeUpdate(ConsultaGuardar);
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                stmt.close();
                C.close();
            }
            catch(Exception e){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Guardar

    //Botón para editar de la BD los datos de un paciente
    private void Editar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar
        Connection C = null;
        Statement stmt = null;
        String ConsultaEditar;
        String Rut = TextRut.getText();
        String Serie = TextSerie.getText();
        String Nombre = TextNombre.getText();
        String Nacimiento = TextNacimiento.getText();
        int Edad = Integer.parseInt(TextEdad.getText());
        String Domicilio = TextDomicilio.getText();
        String Correo = TextCorreo.getText();
        String Telefono = TextTelefono.getText();
        String Prevision = ComboPrevision.getSelectedItem().toString();
        String Ingreso = TextIngreso.getText();
        String Motivo = TextMotivo.getText();
        
        if(Rut.isEmpty() || Nombre.isEmpty() || Nacimiento.isEmpty() || 
                Domicilio.isEmpty() || Ingreso.isEmpty() || Motivo.isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Hay campos que no pueden quedar en blanco.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                Class.forName("org.postgresql.Driver");
                C = DriverManager.getConnection("jdbc:postgresql://localhost:5432/psicologa","Kako","kirino");
                stmt = C.createStatement();
                
                ConsultaEditar = "UPDATE public.paciente SET n_serie = '" + Serie + "', nombre = '" + Nombre + "'"
                        + ", fecha_nacimiento = '" + Nacimiento + "', direccion = '" + Domicilio + "', edad = '" + Edad + "'"
                        + ", telefono = '" + Telefono + "', correo = '" + Correo + "', sistema_previsional = '" + Prevision + "'"
                        + ", fecha_ingreso = '" + Ingreso + "', motivo_consulta = '" + Motivo + "' WHERE rut = '" + Rut + "'";
                
                stmt.executeUpdate(ConsultaEditar);
                JOptionPane.showMessageDialog(null, "Datos editados correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                stmt.close();
                C.close();
            }
            catch(Exception e){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Editar

    //Botón para reiniciar los valores del formulario
    private void Vaciar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vaciar
        TextRut.setText("");
        TextSerie.setText("");
        TextNombre.setText("");
        TextNacimiento.setText("");
        TextEdad.setText("");
        TextDomicilio.setText("");
        TextTelefono.setText("9");
        TextCorreo.setText("");
        TextMotivo.setText("");
        ComboPrevision.setSelectedIndex(0);
        ButtonAgregarFichas.setEnabled(false);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMMMMMMMM yyyy");
        Date fecha = new Date(System.currentTimeMillis());
        TextIngreso.setText(formato.format(fecha));
    }//GEN-LAST:event_Vaciar

    //Botón para abrir la ventana para agregar fichas
    private void VerFichas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerFichas
        if (ButtonAgregarFichas.isEnabled() == true){
            FichasPacientes x = new FichasPacientes();
        x.setVisible(true);
        }
    }//GEN-LAST:event_VerFichas

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
            java.util.logging.Logger.getLogger(FichaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaClinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarFichas;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JButton ButtonRut;
    private javax.swing.JComboBox<String> ComboPrevision;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDomicilio;
    private javax.swing.JLabel LabelEdad;
    private javax.swing.JLabel LabelIngreso;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelMotivo;
    private javax.swing.JLabel LabelNacimiento;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPrevision;
    private javax.swing.JLabel LabelRut;
    private javax.swing.JLabel LabelSerie;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextDomicilio;
    private javax.swing.JTextField TextEdad;
    private javax.swing.JTextField TextIngreso;
    private javax.swing.JTextArea TextMotivo;
    private javax.swing.JTextField TextNacimiento;
    private javax.swing.JTextField TextNombre;
    public static javax.swing.JTextField TextRut;
    private javax.swing.JTextField TextSerie;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
