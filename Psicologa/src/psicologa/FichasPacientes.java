// @author Kako

package psicologa;

//imports
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

public class FichasPacientes extends javax.swing.JFrame {

    public FichasPacientes() {
        initComponents();
        
        //Seteo de ícono
        ImageIcon icon = new ImageIcon("C:\\Users\\Kako\\Documents\\NetBeansProjects\\Psicologa\\src\\psicologa\\images\\Logo.png");
        this.setIconImage(icon.getImage());
        //Seteo color del background y posición en la que se abrira la ventana
        this.getContentPane().setBackground(new java.awt.Color(255,204,102));
        this.setLocationRelativeTo(null);
        
        //Se desactiva el campo TextRut, ya que su contenido se traerá desde otro Form y se le pasa su contenido
        TextRut.setEnabled(false);
        TextRut.setText(FichaClinica.TextRut.getText());
        
        //Obtención de fecha por parte del sistema al campo TextFecha y seteo de formato
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMMMMMMMM yyyy");
        Date fecha = new Date(System.currentTimeMillis());
        TextFecha.setText(formato.format(fecha));
        TextFecha.setHorizontalAlignment(TextFecha.CENTER);
        
        //Se realiza focus al campo TextObservacion para que este sea en donde se posicione
        //el teclado de manera automática al momento de abrir el Form
        TextObservacion.requestFocus();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        LabelRut = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        LabelObservacion = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        TextRut = new javax.swing.JTextField();
        TextFecha = new javax.swing.JTextField();
        TextObservacion = new javax.swing.JTextField();
        ButtonRegistrar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de ubicación");

        LabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 153, 51));
        LabelTitulo.setText("REGISTRO DE UBICACIÓN");

        LabelRut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelRut.setForeground(new java.awt.Color(0, 153, 51));
        LabelRut.setText("Rut:");

        LabelFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(0, 153, 51));
        LabelFecha.setText("Fecha:");

        LabelObservacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelObservacion.setForeground(new java.awt.Color(0, 153, 51));
        LabelObservacion.setText("Observaciones:");

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/psicologa/images/Logo transparente.png"))); // NOI18N

        TextRut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        TextFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteFecha(evt);
            }
        });

        TextObservacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LimiteObservacion(evt);
            }
        });

        ButtonRegistrar.setBackground(new java.awt.Color(0, 173, 58));
        ButtonRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRegistrar.setText("Registrar");

        ButtonEditar.setBackground(new java.awt.Color(0, 173, 58));
        ButtonEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEditar.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelRut)
                                    .addComponent(LabelFecha))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelObservacion)
                        .addGap(25, 25, 25)
                        .addComponent(TextObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonRegistrar)
                .addGap(199, 199, 199)
                .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LabelTitulo)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelRut)
                            .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFecha)
                            .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelObservacion)
                            .addComponent(TextObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LabelLogo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonRegistrar)
                    .addComponent(ButtonEditar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Se crean los eventos para bloquear el largo de caracteres y dar formmato a los TextField
    private void LimiteFecha(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteFecha
        char x = evt.getKeyChar();
        
        if(!Character.isLetter(x) && !Character.isDigit(x) && x != KeyEvent.VK_SPACE){
            evt.consume();
        }
        
        if(TextFecha.getText().length() == 18){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteFecha

    private void LimiteObservacion(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteObservacion
        if(TextObservacion.getText().length() == 100){
            evt.consume();
        }
    }//GEN-LAST:event_LimiteObservacion

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
            java.util.logging.Logger.getLogger(FichasPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichasPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichasPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichasPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichasPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonRegistrar;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelObservacion;
    private javax.swing.JLabel LabelRut;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField TextFecha;
    private javax.swing.JTextField TextObservacion;
    private javax.swing.JTextField TextRut;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
