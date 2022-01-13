
package proyectoultimo;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.HeadlessException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.sound.sampled.LineEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class FrmJuego extends javax.swing.JFrame {
//Thread cronometro = new Thread();

    ManoDerecha manoderecha = new ManoDerecha();
    ManoIzquierda manoizquierda = new ManoIzquierda();
    AmbasManos ambasmanos = new AmbasManos();
    Jugador jugador ;
    persistenciaJugadores persistencia = new persistenciaJugadores();
    public FrmJuego(JButton btnA, JButton btnAtras, JButton btnB, JButton btnC, JButton btnComa, JButton btnContinuar, JButton btnD, JButton btnE, JButton btnF, JButton btnG, JButton btnH, JButton btnI, JButton btnIniciarJuego, JButton btnJ, JButton btnK, JButton btnL, JButton btnM, JButton btnMostrarJugadores, JButton btnN, JButton btnO, JButton btnP, JButton btnPunto, JButton btnQ, JButton btnR, JButton btnRegresar, JButton btnS, JButton btnSalir, JButton btnSalirJuego, JButton btnSalirJuego1, JButton btnSlash, JButton btnT, JButton btnU, JButton btnV, JButton btnW, JButton btnX, JButton btnY, JButton btnZ, JButton btnÑ, JComboBox<TipoDificultad> cboDificultadJuego, JComboBox<TipoMano> cboManoUtilizar, JComboBox<TipoNivel> cboNivelTeclas, JButton jBtnAceptar, JButton jBtnCrear, JPanel jPanel1, JPanel jPanel2, JPanel jPanel3, JPanel jPanel4, JPanel jPanel5, JPanel jPanel6, JPanel jPanel7, JPanel jPanel8, JPanel jPanel9, JTabbedPane jPnlPrincipal, JLabel lblConfiguracionJuego1, JLabel lblDificultadJuego, JLabel lblLetraArribaAbajo, JLabel lblLetraIzquierdaDerecha, JLabel lblManoUtilizar, JLabel lblNivelTeclas, JLabel lblNombre, JLabel lblOportunidades, JLabel lblPuntos, JTextField txtNombre, JTextField txtOportunidades, JTextField txtPuntos) throws HeadlessException {
        this.btnA = btnA;
        this.btnAtras = btnAtras;
        this.btnB = btnB;
        this.btnC = btnC;
        this.btnComa = btnComa;
        this.btnContinuar = btnContinuar;
        this.btnD = btnD;
        this.btnE = btnE;
        this.btnF = btnF;
        this.btnG = btnG;
        this.btnH = btnH;
        this.btnI = btnI;
        this.btnIniciarJuego = btnIniciarJuego;
        this.btnJ = btnJ;
        this.btnK = btnK;
        this.btnL = btnL;
        this.btnM = btnM;
        this.btnPuntajesMasAltos = btnMostrarJugadores;
        this.btnN = btnN;
        this.btnO = btnO;
        this.btnP = btnP;
        this.btnPunto = btnPunto;
        this.btnQ = btnQ;
        this.btnR = btnR;
        this.btnRegresar = btnRegresar;
        this.btnS = btnS;
        this.btnSalir = btnSalir;
        this.btnSalirJuego = btnSalirJuego;
        this.btnSalirJuego1 = btnSalirJuego1;
        this.btnSlash = btnSlash;
        this.btnT = btnT;
        this.btnU = btnU;
        this.btnV = btnV;
        this.btnW = btnW;
        this.btnX = btnX;
        this.btnY = btnY;
        this.btnZ = btnZ;
        this.btnÑ = btnÑ;
        this.cboDificultadJuego = cboDificultadJuego;
        this.cboManoUtilizar = cboManoUtilizar;
        this.cboNivelTeclas = cboNivelTeclas;
       
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jPanel3 = jPanel3;
        this.jPanel4 = jPanel4;
        this.jPanel5 = jPanel5;
        this.jPanel6 = jPanel6;
        this.jPanel7 = jPanel7;
        this.jPanel8 = jPanel8;
        this.jPanel9 = jPanel9;
        this.jPnlPrincipal = jPnlPrincipal;
        this.lblConfiguracionJuego1 = lblConfiguracionJuego1;
        this.lblDificultadJuego = lblDificultadJuego;
        this.lblLetraArribaAbajo = lblLetraArribaAbajo;
        this.lblLetraIzquierdaDerecha = lblLetraIzquierdaDerecha;
        this.lblManoUtilizar = lblManoUtilizar;
        this.lblNivelTeclas = lblNivelTeclas;
        this.lblNombre = lblNombre;
        this.lblOportunidades = lblOportunidades;
        this.lblPuntos = lblPuntos;
        this.txtNombre = txtNombre;
        this.txtOportunidades = txtOportunidades;
        this.txtPuntos = txtPuntos;
        this.txtNombre.setFocusable(true);
    }
    
    
    
    
   
    public FrmJuego() {
        initComponents();
 
    }
    
    
   
        
   
   Thread cronometro = new Thread(){
   @Override
   public void run(){
       int hora=0,min=0,seg=0;
       for(;;){
           try{
               
               System.out.print(hora + ":" +min +":"+seg);
               seg++;
               if (seg>59) {
                   min=0;
                   min++;
               }
//               if(min>59){
//                   min=0;
//                   hora++;
//                   
//                   
//               }
               
               if(min==1){
                   
                   JOptionPane.showMessageDialog(null, "TIEMPO AGOTADO");
                   
                   cronometro.stop();
                    
                   jPnlPrincipal.setSelectedIndex(0);
                    jPnlPrincipal.setEnabledAt(2, false);
                    jPnlPrincipal.setEnabledAt(1, false);
                    jPnlPrincipal.setEnabledAt(0, true);
                   
                    
               }
               lblTiempo.setText(hora + ":" + min + ":"+seg);
               Thread.sleep(999);
           
           }catch(InterruptedException e){
       }
       
       
   }
   }
           };
           
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        btnPuntajesMasAltos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        btnSalirJuego = new javax.swing.JButton();
        btnSalirJuego1 = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblConfiguracionJuego1 = new javax.swing.JLabel();
        lblManoUtilizar = new javax.swing.JLabel();
        cboManoUtilizar = new javax.swing.JComboBox<>();
        lblNivelTeclas = new javax.swing.JLabel();
        cboNivelTeclas = new javax.swing.JComboBox<>();
        lblDificultadJuego = new javax.swing.JLabel();
        cboDificultadJuego = new javax.swing.JComboBox<>();
        btnIniciarJuego = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtPuntos = new javax.swing.JTextField();
        lblPuntos = new javax.swing.JLabel();
        lblOportunidades = new javax.swing.JLabel();
        txtOportunidades = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnÑ = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnSlash = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lblLetraArribaAbajo = new javax.swing.JLabel();
        lblLetraDerechaIzquierda = new javax.swing.JLabel();
        lblLetraIzquierdaDerecha = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPnlPrincipal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPnlPrincipalAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPnlPrincipalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(153, 0, 0));
        txtNombre.setFont(new java.awt.Font("Eras Bold ITC", 3, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), java.awt.Color.black));
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 280, 30));

        btnPuntajesMasAltos.setBackground(new java.awt.Color(0, 102, 102));
        btnPuntajesMasAltos.setFont(new java.awt.Font("Eras Bold ITC", 3, 14)); // NOI18N
        btnPuntajesMasAltos.setForeground(new java.awt.Color(0, 0, 0));
        btnPuntajesMasAltos.setText("PUNTAJES MÁS ALTOS");
        btnPuntajesMasAltos.setFocusable(false);
        btnPuntajesMasAltos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntajesMasAltosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPuntajesMasAltos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFocusable(false);

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("NOMBRE:");
        lblNombre.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        btnSalirJuego.setBackground(new java.awt.Color(0, 51, 102));
        btnSalirJuego.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        btnSalirJuego.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirJuego.setText("SALIR DEL JUEGO");
        btnSalirJuego.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalirJuego.setFocusable(false);
        btnSalirJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 251, 190, 30));

        btnSalirJuego1.setBackground(new java.awt.Color(0, 51, 102));
        btnSalirJuego1.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        btnSalirJuego1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirJuego1.setText("¿como se juega?");
        btnSalirJuego1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalirJuego1.setFocusable(false);
        btnSalirJuego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirJuego1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirJuego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 251, 190, 30));

        btnContinuar.setBackground(new java.awt.Color(204, 204, 0));
        btnContinuar.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar.setFocusable(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 162, 30));

        jPnlPrincipal.addTab("Inicio", jPanel1);

        jPanel3.setFocusable(false);

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setFocusable(false);

        lblConfiguracionJuego1.setBackground(new java.awt.Color(0, 0, 0));
        lblConfiguracionJuego1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblConfiguracionJuego1.setForeground(new java.awt.Color(0, 0, 0));
        lblConfiguracionJuego1.setText("             CONFIGURACIÓN DEL JUEGO");
        lblConfiguracionJuego1.setFocusable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(lblConfiguracionJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConfiguracionJuego1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        lblManoUtilizar.setBackground(new java.awt.Color(0, 0, 0));
        lblManoUtilizar.setFont(new java.awt.Font("Eras Bold ITC", 3, 14)); // NOI18N
        lblManoUtilizar.setForeground(new java.awt.Color(0, 0, 0));
        lblManoUtilizar.setText("MANO A UTILIZAR");
        lblManoUtilizar.setFocusable(false);

        cboManoUtilizar.setBackground(new java.awt.Color(102, 0, 0));
        cboManoUtilizar.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        cboManoUtilizar.setForeground(new java.awt.Color(255, 255, 255));
        cboManoUtilizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboManoUtilizar.setFocusable(false);
        cboManoUtilizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboManoUtilizarActionPerformed(evt);
            }
        });

        lblNivelTeclas.setBackground(new java.awt.Color(0, 0, 0));
        lblNivelTeclas.setFont(new java.awt.Font("Eras Bold ITC", 3, 14)); // NOI18N
        lblNivelTeclas.setForeground(new java.awt.Color(0, 0, 0));
        lblNivelTeclas.setText("NIVEL DE LAS TECLAS");
        lblNivelTeclas.setFocusable(false);

        cboNivelTeclas.setBackground(new java.awt.Color(102, 0, 0));
        cboNivelTeclas.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        cboNivelTeclas.setForeground(new java.awt.Color(255, 255, 255));
        cboNivelTeclas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboNivelTeclas.setFocusable(false);
        cboNivelTeclas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelTeclasActionPerformed(evt);
            }
        });

        lblDificultadJuego.setFont(new java.awt.Font("Eras Bold ITC", 3, 14)); // NOI18N
        lblDificultadJuego.setForeground(new java.awt.Color(0, 0, 0));
        lblDificultadJuego.setText(" DIFICULTAD DEL JUEGO");
        lblDificultadJuego.setFocusable(false);

        cboDificultadJuego.setBackground(new java.awt.Color(102, 0, 0));
        cboDificultadJuego.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        cboDificultadJuego.setForeground(new java.awt.Color(255, 255, 255));
        cboDificultadJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboDificultadJuego.setFocusable(false);
        cboDificultadJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDificultadJuegoActionPerformed(evt);
            }
        });

        btnIniciarJuego.setBackground(new java.awt.Color(102, 0, 0));
        btnIniciarJuego.setFont(new java.awt.Font("Eras Bold ITC", 3, 18)); // NOI18N
        btnIniciarJuego.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarJuego.setText("Iniciar Juego");
        btnIniciarJuego.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciarJuego.setFocusable(false);
        btnIniciarJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarJuegoMouseClicked(evt);
            }
        });
        btnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJuegoActionPerformed(evt);
            }
        });
        btnIniciarJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIniciarJuegoKeyPressed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(204, 102, 0));
        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setFocusable(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNivelTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboNivelTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboDificultadJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDificultadJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboManoUtilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManoUtilizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblManoUtilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboManoUtilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(lblNivelTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboNivelTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDificultadJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboDificultadJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 73, Short.MAX_VALUE))
        );

        jPnlPrincipal.addTab("Configuraciones", jPanel3);

        jPanel2.setFocusable(false);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        jPanel6.setFocusable(false);

        btnAtras.setBackground(new java.awt.Color(204, 51, 0));
        btnAtras.setFont(new java.awt.Font("Eras Bold ITC", 3, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRAS");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        btnAtras.setFocusable(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 51, 0));
        btnSalir.setFont(new java.awt.Font("Eras Bold ITC", 3, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));
        jPanel7.setFocusable(false);

        txtPuntos.setEditable(false);
        txtPuntos.setBackground(new java.awt.Color(255, 255, 255));
        txtPuntos.setForeground(new java.awt.Color(0, 0, 0));
        txtPuntos.setBorder(new javax.swing.border.MatteBorder(null));
        txtPuntos.setFocusable(false);

        lblPuntos.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntos.setText(" DESACIERTOS");
        lblPuntos.setFocusable(false);

        lblOportunidades.setBackground(new java.awt.Color(255, 255, 255));
        lblOportunidades.setForeground(new java.awt.Color(255, 255, 255));
        lblOportunidades.setText("ACIERTOS");
        lblOportunidades.setFocusable(false);

        txtOportunidades.setEditable(false);
        txtOportunidades.setBackground(new java.awt.Color(255, 255, 255));
        txtOportunidades.setForeground(new java.awt.Color(0, 0, 0));
        txtOportunidades.setBorder(new javax.swing.border.MatteBorder(null));
        txtOportunidades.setFocusable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtOportunidades, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addComponent(txtPuntos)
                        .addComponent(lblOportunidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblOportunidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOportunidades, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lblPuntos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));
        jPanel8.setFocusable(false);

        btnQ.setBackground(new java.awt.Color(0, 0, 0));
        btnQ.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnQ.setForeground(new java.awt.Color(255, 255, 255));
        btnQ.setText("Q");
        btnQ.setFocusable(false);
        btnQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQMouseClicked(evt);
            }
        });
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        btnQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnQKeyPressed(evt);
            }
        });

        btnW.setBackground(new java.awt.Color(0, 0, 0));
        btnW.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnW.setForeground(new java.awt.Color(255, 255, 255));
        btnW.setText("W");
        btnW.setFocusable(false);

        btnE.setBackground(new java.awt.Color(0, 0, 0));
        btnE.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnE.setForeground(new java.awt.Color(255, 255, 255));
        btnE.setText("E");
        btnE.setFocusable(false);

        btnR.setBackground(new java.awt.Color(0, 0, 0));
        btnR.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnR.setForeground(new java.awt.Color(255, 255, 255));
        btnR.setText("R");
        btnR.setFocusable(false);

        btnT.setBackground(new java.awt.Color(0, 0, 0));
        btnT.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnT.setForeground(new java.awt.Color(255, 255, 255));
        btnT.setText("T");
        btnT.setFocusable(false);

        btnY.setBackground(new java.awt.Color(0, 0, 0));
        btnY.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnY.setForeground(new java.awt.Color(255, 255, 255));
        btnY.setText("Y");
        btnY.setFocusable(false);

        btnU.setBackground(new java.awt.Color(0, 0, 0));
        btnU.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnU.setForeground(new java.awt.Color(255, 255, 255));
        btnU.setText("U");
        btnU.setFocusable(false);

        btnI.setBackground(new java.awt.Color(0, 0, 0));
        btnI.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnI.setForeground(new java.awt.Color(255, 255, 255));
        btnI.setText("I");
        btnI.setFocusable(false);

        btnO.setBackground(new java.awt.Color(0, 0, 0));
        btnO.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnO.setForeground(new java.awt.Color(255, 255, 255));
        btnO.setText("O");
        btnO.setFocusable(false);

        btnP.setBackground(new java.awt.Color(0, 0, 0));
        btnP.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnP.setForeground(new java.awt.Color(255, 255, 255));
        btnP.setText("P");
        btnP.setFocusable(false);

        btnA.setBackground(new java.awt.Color(0, 0, 0));
        btnA.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 255, 255));
        btnA.setText("A");
        btnA.setFocusable(false);

        btnS.setBackground(new java.awt.Color(0, 0, 0));
        btnS.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnS.setForeground(new java.awt.Color(255, 255, 255));
        btnS.setText("S");
        btnS.setFocusable(false);

        btnD.setBackground(new java.awt.Color(0, 0, 0));
        btnD.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 255, 255));
        btnD.setText("D");
        btnD.setFocusable(false);

        btnF.setBackground(new java.awt.Color(0, 0, 0));
        btnF.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnF.setForeground(new java.awt.Color(255, 255, 255));
        btnF.setText("F");
        btnF.setFocusable(false);

        btnG.setBackground(new java.awt.Color(0, 0, 0));
        btnG.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnG.setForeground(new java.awt.Color(255, 255, 255));
        btnG.setText("G");
        btnG.setFocusable(false);

        btnH.setBackground(new java.awt.Color(0, 0, 0));
        btnH.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnH.setForeground(new java.awt.Color(255, 255, 255));
        btnH.setText("H");
        btnH.setFocusable(false);

        btnJ.setBackground(new java.awt.Color(0, 0, 0));
        btnJ.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnJ.setForeground(new java.awt.Color(255, 255, 255));
        btnJ.setText("J");
        btnJ.setFocusable(false);

        btnK.setBackground(new java.awt.Color(0, 0, 0));
        btnK.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnK.setForeground(new java.awt.Color(255, 255, 255));
        btnK.setText("K");
        btnK.setFocusable(false);

        btnL.setBackground(new java.awt.Color(0, 0, 0));
        btnL.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnL.setForeground(new java.awt.Color(255, 255, 255));
        btnL.setText("L");
        btnL.setFocusable(false);

        btnÑ.setBackground(new java.awt.Color(0, 0, 0));
        btnÑ.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnÑ.setForeground(new java.awt.Color(255, 255, 255));
        btnÑ.setText("Ñ");
        btnÑ.setFocusable(false);

        btnZ.setBackground(new java.awt.Color(0, 0, 0));
        btnZ.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnZ.setForeground(new java.awt.Color(255, 255, 255));
        btnZ.setText("Z");
        btnZ.setFocusable(false);

        btnX.setBackground(new java.awt.Color(0, 0, 0));
        btnX.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnX.setForeground(new java.awt.Color(255, 255, 255));
        btnX.setText("X");
        btnX.setFocusable(false);

        btnC.setBackground(new java.awt.Color(0, 0, 0));
        btnC.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");
        btnC.setFocusable(false);

        btnV.setBackground(new java.awt.Color(0, 0, 0));
        btnV.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnV.setForeground(new java.awt.Color(255, 255, 255));
        btnV.setText("V");
        btnV.setFocusable(false);

        btnB.setBackground(new java.awt.Color(0, 0, 0));
        btnB.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 255, 255));
        btnB.setText("B");
        btnB.setFocusable(false);

        btnN.setBackground(new java.awt.Color(0, 0, 0));
        btnN.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnN.setForeground(new java.awt.Color(255, 255, 255));
        btnN.setText("N");
        btnN.setFocusable(false);

        btnM.setBackground(new java.awt.Color(0, 0, 0));
        btnM.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnM.setForeground(new java.awt.Color(255, 255, 255));
        btnM.setText("M");
        btnM.setFocusable(false);

        btnComa.setBackground(new java.awt.Color(0, 0, 0));
        btnComa.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnComa.setForeground(new java.awt.Color(255, 255, 255));
        btnComa.setText(",");
        btnComa.setFocusable(false);

        btnPunto.setBackground(new java.awt.Color(0, 0, 0));
        btnPunto.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setFocusable(false);

        btnSlash.setBackground(new java.awt.Color(0, 0, 0));
        btnSlash.setFont(new java.awt.Font("Eras Demi ITC", 3, 12)); // NOI18N
        btnSlash.setForeground(new java.awt.Color(255, 255, 255));
        btnSlash.setText("/");
        btnSlash.setFocusable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnW)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnZ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSlash))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnÑ)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnA, btnB, btnC, btnComa, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnPunto, btnQ, btnR, btnS, btnSlash, btnT, btnU, btnV, btnW, btnX, btnY, btnZ, btnÑ});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ)
                    .addComponent(btnW)
                    .addComponent(btnE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnY)
                    .addComponent(btnU)
                    .addComponent(btnI)
                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA)
                    .addComponent(btnS)
                    .addComponent(btnD)
                    .addComponent(btnF)
                    .addComponent(btnG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnH)
                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÑ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZ)
                    .addComponent(btnX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnB)
                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComa)
                    .addComponent(btnPunto)
                    .addComponent(btnSlash))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnA, btnB, btnC, btnComa, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnPunto, btnQ, btnR, btnS, btnSlash, btnT, btnU, btnV, btnW, btnX, btnY, btnZ, btnÑ});

        jPanel9.setFocusable(false);
        jPanel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel9KeyTyped(evt);
            }
        });

        lblLetraArribaAbajo.setFont(new java.awt.Font("Ebrima", 3, 36)); // NOI18N
        lblLetraArribaAbajo.setForeground(new java.awt.Color(204, 0, 0));
        lblLetraArribaAbajo.setFocusable(false);

        lblLetraDerechaIzquierda.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        lblLetraDerechaIzquierda.setForeground(new java.awt.Color(204, 0, 0));
        lblLetraDerechaIzquierda.setFocusable(false);

        lblLetraIzquierdaDerecha.setBackground(new java.awt.Color(0, 0, 0));
        lblLetraIzquierdaDerecha.setFont(new java.awt.Font("Ebrima", 3, 36)); // NOI18N
        lblLetraIzquierdaDerecha.setForeground(new java.awt.Color(204, 0, 0));
        lblLetraIzquierdaDerecha.setFocusable(false);
        lblLetraIzquierdaDerecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblLetraIzquierdaDerechaKeyPressed(evt);
            }
        });

        lblTiempo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 0, 0));
        lblTiempo.setText("0:0:0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblLetraIzquierdaDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(lblLetraDerechaIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblLetraArribaAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318)
                        .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLetraArribaAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempo))
                .addGap(62, 62, 62)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLetraIzquierdaDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLetraDerechaIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPnlPrincipal.addTab("Juego", jPanel2);

        getContentPane().add(jPnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPnlPrincipalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPnlPrincipalAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPnlPrincipalAncestorAdded

    private void jPnlPrincipalAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPnlPrincipalAncestorMoved
// TODO add your handling code here:
    }//GEN-LAST:event_jPnlPrincipalAncestorMoved

    private void btnPuntajesMasAltosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntajesMasAltosActionPerformed

        JOptionPane.showMessageDialog(this,persistenciaJugadores.listaJugadores());

    }//GEN-LAST:event_btnPuntajesMasAltosActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
  
           
        btnContinuar.requestFocus();
        
           if(!txtNombre.getText().trim().equalsIgnoreCase("")){
            Jugador jugador =new Jugador(txtNombre.getText());
            
            
         jPnlPrincipal.setEnabledAt(0, false);
         jPnlPrincipal.setSelectedIndex(1);
         jPnlPrincipal.setEnabledAt(1, true);
  
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre");
        }
         String nombre=txtNombre.getText();
        Jugador jugador=new Jugador(nombre);
   
        persistenciaJugadores.agregarJugador(jugador);
      
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirJuegoActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirJuegoActionPerformed

    private void btnSalirJuego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirJuego1ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "  El teclado será dividido en dos grupos (mano derecha o Izquierda) y cada\n" +
"grupo se dividirá en 3 niveles de tecla:\n\n" +
"Teclas para mano derecha:\n" +
"Teclas nivel 1: (q,w,e,r,t)\n" +
"Teclas nivel 2: (a,s,d,f,g)\n" +
"Teclas nivel 3: (z.x,c,v,b)\n\n" +

"Teclas para mano Izquierda:\n" +
"Teclas nivel 1: (y,u,i,o,p)\n" +
"Teclas nivel 2: (h,j,k,l,ñ)\n" +
"Teclas nivel 3: (n,m,,,.,/)\n\n" +
" Cada nivel de teclas apareceran en mayúsculas y minúsculas");
    }//GEN-LAST:event_btnSalirJuego1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
//           btnContinuar.requestFocus();
        
        if(!txtNombre.getText().trim().equalsIgnoreCase("")){
            Jugador jugador =new Jugador(txtNombre.getText());
//          
         jPnlPrincipal.setEnabledAt(0, false);
         jPnlPrincipal.setSelectedIndex(1);
         jPnlPrincipal.setEnabledAt(1, true);
        
       

        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre");
        }
         String nombre=txtNombre.getText();
       
        
        persistenciaJugadores.agregarJugador(jugador);


    }//GEN-LAST:event_btnContinuarActionPerformed

    private void cboNivelTeclasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivelTeclasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNivelTeclasActionPerformed

    private void cboManoUtilizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboManoUtilizarActionPerformed
        // TODO add your handling code here:
        btnIniciarJuego.setVisible(true);
    }//GEN-LAST:event_cboManoUtilizarActionPerformed

    private void cboDificultadJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDificultadJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDificultadJuegoActionPerformed

    private void btnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarJuegoActionPerformed

        cronometro.start();
                
            
        
    
        txtNombre.setFocusable(false);
//        cronometro.start();
        
        jPnlPrincipal.setEnabledAt(1, false);
        jPnlPrincipal.setEnabledAt(2, true);
        jPnlPrincipal.setSelectedIndex(2);
        
        
         btnQ.setEnabled(false);
          btnW.setEnabled(false);
          btnE.setEnabled(false);
          btnR.setEnabled(false);
          btnT.setEnabled(false);
          btnA.setEnabled(false);
          btnS.setEnabled(false);
          btnD.setEnabled(false);
          btnF.setEnabled(false);
          btnG.setEnabled(false);
          btnZ.setEnabled(false);
          btnX.setEnabled(false);
          btnC.setEnabled(false);
          btnV.setEnabled(false);
          btnB.setEnabled(false);
          
          btnY.setEnabled(false);
          btnU.setEnabled(false);
          btnI.setEnabled(false);
          btnO.setEnabled(false);
          btnP.setEnabled(false);
          btnÑ.setEnabled(false);
          btnL.setEnabled(false);
          btnK.setEnabled(false);
          btnJ.setEnabled(false);
          btnH.setEnabled(false);
          btnComa.setEnabled(false);
          btnM.setEnabled(false);
          btnN.setEnabled(false);
          btnPunto.setEnabled(false);
          btnSlash.setEnabled(false);
    
        // INICIO TODO EL CODIGO DE MANO IZQUIERDA  
      
      
      
     if( cboManoUtilizar.getSelectedIndex() == 0 ){   // mano izquierda
         
         
          
         
         if(cboNivelTeclas.getSelectedIndex() == 0){   // nivel 1
          
             
          
             
             
          btnY.setEnabled(true);
          btnU.setEnabled(true);
          btnI.setEnabled(true);
          btnO.setEnabled(true);
          btnP.setEnabled(true);
             
            if(cboDificultadJuego.getSelectedIndex() == 0){ 
                
             new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = -3;
                
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasNivel1());
                ////////////////////////////////////////////////////////////////////////////////////////////
                
                
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
             
            
             
             
            }else{
                
                
                if(cboDificultadJuego.getSelectedIndex()==1){
                    
                    //pegamos lo de arriba abajo movimiento
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasNivel1());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                    
                    
                    
                }else{
                    
                    //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasNivel1());  //se esta usando un solo label  prueba restaurar a arriba abajo
            }
            
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);   
            }catch(Exception e){
                
            }
        }
    }
}.start();
        
        
                            
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasNivel1());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                    
                }
            }  
             
             
         }else{
             if(cboNivelTeclas.getSelectedIndex() == 1){  // nivel 2
                 
                 
          btnÑ.setEnabled(true);
          btnH.setEnabled(true);
          btnJ.setEnabled(true);
          btnK.setEnabled(true);
          btnL.setEnabled(true);
             
                 
                 
                 if (cboDificultadJuego.getSelectedIndex() == 0) {
                     
                 
                 
                new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasnivel2());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                 }else{
                     if (cboDificultadJuego.getSelectedIndex()==1) {
                         
                         
                          new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasnivel2());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                     }else{
                               
                    //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasnivel2());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasnivel2());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                         
                     }
                 }
                 
                 
             }else{
                 if(cboNivelTeclas.getSelectedIndex() == 2){  // nivel 3
                     
          btnN.setEnabled(true);
          btnM.setEnabled(true);
          btnComa.setEnabled(true);
          btnPunto.setEnabled(true);
          btnSlash.setEnabled(true);
                     
                     
                     
                     if(cboDificultadJuego.getSelectedIndex()==0){
                     new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasNivel3());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                     
                 }else{
                         if(cboDificultadJuego.getSelectedIndex() ==1){
                             
                         
                     
               
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasNivel3());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         }else{
                             
                             
                                           //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasNivel3());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasNivel3());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                             
                
                         }
                             
                         }
                 }else{
                     if(cboNivelTeclas.getSelectedIndex() == 3){  // nivel 4
                         
          btnN.setEnabled(true);
          btnM.setEnabled(true);
          btnComa.setEnabled(true);
          btnPunto.setEnabled(true);
          btnSlash.setEnabled(true);
          btnH.setEnabled(true);
          btnJ.setEnabled(true);
          btnK.setEnabled(true);
          btnL.setEnabled(true);
          btnÑ.setEnabled(true);
          btnY.setEnabled(true);
          btnU.setEnabled(true);
          btnI.setEnabled(true);
          btnO.setEnabled(true);
          btnP.setEnabled(true);
                         
                         
                         
                          if(cboDificultadJuego.getSelectedIndex()==0){
                     new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasTodosLosNiveles());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                     
                 }else{
                         if(cboDificultadJuego.getSelectedIndex() ==1){
                             
                         
                     
               
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasTodosLosNiveles());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         }else{
                             
                             
                                           //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoizquierda.teclasTodosLosNiveles());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoizquierda.teclasTodosLosNiveles());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                     }
                  
                 }
             }
                 }
             }
         }
     
     // TERMINA TODO EL CODIGO DE MANO IZQUIERDA
             
     
     
     
     
     // INICIA CODIGO DE MANO DERECHA
     
     }else{ 
         
     if( cboManoUtilizar.getSelectedIndex() == 1 ){   // mano derecha
         
         if(cboNivelTeclas.getSelectedIndex() == 0){   // nivel 1
             
             
             
              btnQ.setEnabled(true);
          btnW.setEnabled(true);
          btnE.setEnabled(true);
          btnR.setEnabled(true);
          btnT.setEnabled(true);
             
            if(cboDificultadJuego.getSelectedIndex() == 0){ 
                
             new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasNivel1());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
             
            }else{
                
                
                if(cboDificultadJuego.getSelectedIndex()==1){
                    
                    //pegamos lo de arriba abajo movimiento
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasNivel1());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                    
                    
                    
                }else{
                    
                    //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasNivel1());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasNivel1());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                    
                }
            }  
             
             
         }else{
             if(cboNivelTeclas.getSelectedIndex() == 1){  // nivel 2
                  btnA.setEnabled(true);
          btnS.setEnabled(true);
          btnD.setEnabled(true);
          btnF.setEnabled(true);
          btnG.setEnabled(true);
                 
                 if (cboDificultadJuego.getSelectedIndex() == 0) {
                     
                 
                 
                 new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasNivel2());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                 }else{
                     if (cboDificultadJuego.getSelectedIndex()==1) {
                         
                         
                          new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasNivel2());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                     }else{
                               
                    //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasNivel2());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasNivel2());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                         
                     }
                 }
                 
                 
             }else{
                 if(cboNivelTeclas.getSelectedIndex() == 2){  // nivel 3
                     
                      btnZ.setEnabled(true);
          btnX.setEnabled(true);
          btnC.setEnabled(true);
          btnV.setEnabled(true);
          btnB.setEnabled(true);
                     
                     
                     if(cboDificultadJuego.getSelectedIndex()==0){
                     new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasNivel3());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                     
                 }else{
                         if(cboDificultadJuego.getSelectedIndex() ==1){
                             
                         
                     
               
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasNivel3());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         }else{
                             
                             
                                           //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasNivel3());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasNivel3());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                             
                
                         }
                             
                         }
                 }else{
                     if(cboNivelTeclas.getSelectedIndex() == 3){  // nivel 4
                         
                               btnZ.setEnabled(true);
          btnX.setEnabled(true);
          btnC.setEnabled(true);
          btnV.setEnabled(true);
          btnB.setEnabled(true);
          
                btnA.setEnabled(true);
          btnS.setEnabled(true);
          btnD.setEnabled(true);
          btnF.setEnabled(true);
          btnG.setEnabled(true);
          
                btnQ.setEnabled(true);
          btnW.setEnabled(true);
          btnE.setEnabled(true);
          btnR.setEnabled(true);
          btnT.setEnabled(true);
                         
                         
                         
                          if(cboDificultadJuego.getSelectedIndex()==0){
                     new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasTodosLosNiveles());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                     
                 }else{
                         if(cboDificultadJuego.getSelectedIndex() ==1){
                             
                         
                     
               
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasTodosLosNiveles());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         }else{
                             
                             
                                           //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+manoderecha.teclasTodosLosNiveles());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+manoderecha.teclasTodosLosNiveles());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                     }
                  
                 }
             }
                 }
             }
         }
     
         // TERMINA EL CODIGO DE MANO DERECHA
         
         
         
         
        
         
         
         // EMPIEZA EL CODIGO DE AMBAS MANOS
         
     }else{ 
             
             
//            if(cboManoUtilizar.getSelectedIndex() == 2){
//             
             // NO SE PONE EL IF () DE MANO A UTILIZAR PORQUE SE SABE QUE SI NO SE ELIJIERON NINGUNA DE LAS OTRAS DOS SE USA AMBAS MANOS 
         
         if(cboNivelTeclas.getSelectedIndex() == 0){
                 btnQ.setEnabled(true);
          btnW.setEnabled(true);
          btnE.setEnabled(true);
          btnR.setEnabled(true);
          btnT.setEnabled(true);
          
              btnY.setEnabled(true);
          btnU.setEnabled(true);
          btnI.setEnabled(true);
          btnO.setEnabled(true);
          btnP.setEnabled(true);
             
            if(cboDificultadJuego.getSelectedIndex() == 0){ 
                
             new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasNivel1());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
            }else{
                
                
                if(cboDificultadJuego.getSelectedIndex()==1){
                    
                    //pegamos lo de arriba abajo movimiento
                new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasNivel1());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                    
                    
                    
                }else{
                    
                    //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasNivel1());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasNivel1());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                    
                }
            }  
             
             
         }else{
             if(cboNivelTeclas.getSelectedIndex() == 1){  // nivel 2
                 
                 
                  btnA.setEnabled(true);
          btnS.setEnabled(true);
          btnD.setEnabled(true);
          btnF.setEnabled(true);
          btnG.setEnabled(true);
          
              btnH.setEnabled(true);
          btnJ.setEnabled(true);
          btnK.setEnabled(true);
          btnL.setEnabled(true);
          btnÑ.setEnabled(true);
                 
                 if (cboDificultadJuego.getSelectedIndex() == 0) {
                     
                 
                 
                 new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasNivel2());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                 }else{
                     if (cboDificultadJuego.getSelectedIndex()==1) {
                         
                         
                          new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasNivel2());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                     }else{
                               
                    //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasNivel2());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasNivel2());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         
                         
                         
                     }
                 }
                 
                 
             }else{
                 if(cboNivelTeclas.getSelectedIndex() == 2){  // nivel 3
                     
                      btnZ.setEnabled(true);
          btnX.setEnabled(true);
          btnC.setEnabled(true);
          btnV.setEnabled(true);
          btnB.setEnabled(true);
          
              btnN.setEnabled(true);
          btnM.setEnabled(true);
          btnPunto.setEnabled(true);
          btnComa.setEnabled(true);
          btnSlash.setEnabled(true);
                     
                     if(cboDificultadJuego.getSelectedIndex()==0){
                     new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasNivel3());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                     
                 }else{
                         if(cboDificultadJuego.getSelectedIndex() ==1){
                             
                         
                     
               
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasNivel3());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         }else{
                             
                             
                                           //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasNivel3());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasNivel3());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                             
                
                         }
                             
                         }
                 }else{
                     if(cboNivelTeclas.getSelectedIndex() == 3){  // nivel 4
                         
                         btnQ.setEnabled(true);
          btnW.setEnabled(true);
          btnE.setEnabled(true);
          btnR.setEnabled(true);
          btnT.setEnabled(true);
          btnA.setEnabled(true);
          btnS.setEnabled(true);
          btnD.setEnabled(true);
          btnF.setEnabled(true);
          btnG.setEnabled(true);
          btnZ.setEnabled(true);
          btnX.setEnabled(true);
          btnC.setEnabled(true);
          btnV.setEnabled(true);
          btnB.setEnabled(true);
          
          btnY.setEnabled(true);
          btnU.setEnabled(true);
          btnI.setEnabled(true);
          btnO.setEnabled(true);
          btnP.setEnabled(true);
          btnÑ.setEnabled(true);
          btnL.setEnabled(true);
          btnK.setEnabled(true);
          btnJ.setEnabled(true);
          btnH.setEnabled(true);
          btnComa.setEnabled(true);
          btnM.setEnabled(true);
          btnN.setEnabled(true);
          btnPunto.setEnabled(true);
          btnSlash.setEnabled(true);
                         
                          if(cboDificultadJuego.getSelectedIndex()==0){
                     new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasTodosLosNiveles());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(3);
            }catch(Exception e){
                
            }
        }
    }
}.start();
                     
                 }else{
                         if(cboDificultadJuego.getSelectedIndex() ==1){
                             
                         
                     
               
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasTodosLosNiveles());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(1);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                         }else{
                             
                             
                                           //el nivel avanzado
                    new Thread(){
    public  void run(){
        int x = lblLetraIzquierdaDerecha.getLocation().x;
        int y = lblLetraIzquierdaDerecha.getLocation().y;
        while(true){
            x++;
            if(x>getWidth()){
                x = 0;
                lblLetraIzquierdaDerecha.setText(""+ambasmanos.teclasTodosLosNiveles());
            }
            lblLetraIzquierdaDerecha.setLocation(x, y);
            try{
                sleep(0);
            }catch(Exception e){
                
            }
        }
    }
}.start();  
                    
                    
                    
                    
                    new Thread(){
            public  void run(){
                int x = lblLetraArribaAbajo.getLocation().x;
                int y = lblLetraArribaAbajo.getLocation().y;
                while(true){
                    y++;
                    if(y>getWidth()){
                        y = 0;
                        lblLetraArribaAbajo.setText(""+ambasmanos.teclasTodosLosNiveles());
                    }
                    lblLetraArribaAbajo.setLocation(x, y);
                    try{
                        sleep(0);
                    }catch(Exception e){
                        
                    }
                }
            }
        }.start();
                    
         
                         }
                         }
                     }
             
                 
                 
             }
             }
         }
             }
             }
     
     

    }//GEN-LAST:event_btnIniciarJuegoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
 
        
        jPnlPrincipal.setEnabledAt(0, true);
        jPnlPrincipal.setEnabledAt(1, false);
 jPnlPrincipal.setSelectedIndex(0);
txtNombre.setText("");
btnPuntajesMasAltos.setEnabled(true);
//txtNombre.setFocusable(true);


    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       jPnlPrincipal.setEnabledAt(2, false);
       
       
        cboDificultadJuego.setSelectedIndex(0);  // cuando le de regresar se ponga por default en los primeros indices de cbo
        cboManoUtilizar.setSelectedIndex(0);
        cboNivelTeclas.setSelectedIndex(0);
        
        jPnlPrincipal.setEnabledAt(1, true);

        jPnlPrincipal.setSelectedIndex(1);

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        cronometro.stop();
        FrmJuego frmjuego = new FrmJuego();
        
        

jPnlPrincipal.setSelectedIndex(0);

txtNombre.setFocusable(true);
        btnPuntajesMasAltos.setEnabled(true);
           jPnlPrincipal.setEnabledAt(1, false);
           jPnlPrincipal.setEnabledAt(2, false);
            jPnlPrincipal.setEnabledAt(0, true);
           
               txtNombre.setText("");
    
      
  
  
     
//      cronometro.destroy();
//      cronometro.stop();
      
      

    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtNombre.setFocusable(true);
        txtNombre.requestFocus();
        jPnlPrincipal.setEnabledAt(1, false);
        jPnlPrincipal.setEnabledAt(2, false);
        
          for (TipoMano mano : TipoMano.values()) {
            cboManoUtilizar.addItem(mano);
        }
        for (TipoNivel nivel : TipoNivel.values()) {
            cboNivelTeclas.addItem(nivel);
        }
        for (TipoDificultad dificultad : TipoDificultad.values()) {
            cboDificultadJuego.addItem(dificultad);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
    }//GEN-LAST:event_formKeyPressed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQActionPerformed

    private void btnQKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnQKeyPressed
    
    }//GEN-LAST:event_btnQKeyPressed

    private void btnIniciarJuegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIniciarJuegoKeyPressed
    
        
    }//GEN-LAST:event_btnIniciarJuegoKeyPressed

    private void lblLetraIzquierdaDerechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblLetraIzquierdaDerechaKeyPressed
    


        
    }//GEN-LAST:event_lblLetraIzquierdaDerechaKeyPressed

    private void btnIniciarJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarJuegoMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnIniciarJuegoMouseClicked

    private void btnQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQMouseClicked
        
    }//GEN-LAST:event_btnQMouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
     
          if(evt.getKeyChar()==lblLetraIzquierdaDerecha.getText().charAt(0)){
            
            lblLetraIzquierdaDerecha.setText("");
            JOptionPane.showMessageDialog(null, "correcto");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrecto");
        }
    
    }//GEN-LAST:event_formKeyTyped

    private void jPanel9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel9KeyTyped
       
    }//GEN-LAST:event_jPanel9KeyTyped

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      
          
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnIniciarJuego;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPuntajesMasAltos;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirJuego;
    private javax.swing.JButton btnSalirJuego1;
    private javax.swing.JButton btnSlash;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnÑ;
    private javax.swing.JComboBox<TipoDificultad> cboDificultadJuego;
    private javax.swing.JComboBox<TipoMano> cboManoUtilizar;
    private javax.swing.JComboBox<TipoNivel> cboNivelTeclas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jPnlPrincipal;
    private javax.swing.JLabel lblConfiguracionJuego1;
    private javax.swing.JLabel lblDificultadJuego;
    private javax.swing.JLabel lblLetraArribaAbajo;
    private javax.swing.JLabel lblLetraDerechaIzquierda;
    private javax.swing.JLabel lblLetraIzquierdaDerecha;
    private javax.swing.JLabel lblManoUtilizar;
    private javax.swing.JLabel lblNivelTeclas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOportunidades;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOportunidades;
    private javax.swing.JTextField txtPuntos;
    // End of variables declaration//GEN-END:variables
}
