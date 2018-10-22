package tictactoe;

import java.awt.Color;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.KeyStroke;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyWindow extends javax.swing.JFrame implements WindowListener,ActionListener {
    
    

    public Table table;
    
    public void resetGame(){
        table.resetAll();
        table.resetTurn();
        if(!(table.isPlaying())){
        table.setPlaying(true);
        jLabel1.setText("Jugador 1 elige una casilla");
        
        jButton1.setEnabled(rootPaneCheckingEnabled);
        jButton2.setEnabled(rootPaneCheckingEnabled);
        jButton3.setEnabled(rootPaneCheckingEnabled);
        jButton4.setEnabled(rootPaneCheckingEnabled);
        jButton5.setEnabled(rootPaneCheckingEnabled);
        jButton6.setEnabled(rootPaneCheckingEnabled);
        jButton7.setEnabled(rootPaneCheckingEnabled);
        jButton8.setEnabled(rootPaneCheckingEnabled);
        jButton9.setEnabled(rootPaneCheckingEnabled); 
        }else{
            try {
                Image field = ImageIO.read(new FileInputStream("src/field.png"));
                jButton1.setIcon(new ImageIcon(field));
                jButton2.setIcon(new ImageIcon(field));
                jButton3.setIcon(new ImageIcon(field));
                jButton4.setIcon(new ImageIcon(field));
                jButton5.setIcon(new ImageIcon(field));
                jButton6.setIcon(new ImageIcon(field));
                jButton7.setIcon(new ImageIcon(field));
                jButton8.setIcon(new ImageIcon(field));
                jButton9.setIcon(new ImageIcon(field));
                
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            jLabel1.setText("Jugador 1 elige una casilla");
            jButton1.setEnabled(rootPaneCheckingEnabled);
            jButton2.setEnabled(rootPaneCheckingEnabled);
            jButton3.setEnabled(rootPaneCheckingEnabled);
            jButton4.setEnabled(rootPaneCheckingEnabled);
            jButton5.setEnabled(rootPaneCheckingEnabled);
            jButton6.setEnabled(rootPaneCheckingEnabled);
            jButton7.setEnabled(rootPaneCheckingEnabled);
            jButton8.setEnabled(rootPaneCheckingEnabled);
            jButton9.setEnabled(rootPaneCheckingEnabled);
        }
    }
    
    public MyWindow(Table table) throws IOException {
        
        BufferedImage circle = null;
        BufferedImage cross = null;
        BufferedImage field = null;
        try {
        circle = ImageIO.read(new File("src/circle.png"));
        cross = ImageIO.read(new File("src/cross.png"));
        field = ImageIO.read(new File("src/field.png"));
        } catch (IOException e) {
        }
        
        setUndecorated(true);
        initComponents();
        this.table = table;
        try {
                jButton1.setIcon(new ImageIcon(field));
                jButton2.setIcon(new ImageIcon(field));
                jButton3.setIcon(new ImageIcon(field));
                jButton4.setIcon(new ImageIcon(field));
                jButton5.setIcon(new ImageIcon(field));
                jButton6.setIcon(new ImageIcon(field));
                jButton7.setIcon(new ImageIcon(field));
                jButton8.setIcon(new ImageIcon(field));
                jButton9.setIcon(new ImageIcon(field));
                
                } catch (Exception ex) {
                    System.out.println(ex);
                }
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() throws IOException {
        
        
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 450, 450, 450));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(450, 450));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Presiona F1 para jugar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 450));

        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setEnabled(false);
        jButton1.addActionListener(this);
        
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.setEnabled(false);
        jButton2.addActionListener(this);
        
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.setEnabled(false);
        jButton3.addActionListener(this);

        jButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jButton4.setEnabled(false);
        jButton4.addActionListener(this);

        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.setEnabled(false);
        jButton5.addActionListener(this);

        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jButton6.setEnabled(false);
        jButton6.addActionListener(this);

        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.setEnabled(false);
        jButton7.addActionListener(this);

        jButton8.setBorder(new javax.swing.border.MatteBorder(null));
        jButton8.setEnabled(false);
        jButton8.addActionListener(this);

        jButton9.setBorder(new javax.swing.border.MatteBorder(null));
        jButton9.setEnabled(false);
        jButton9.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        
        //Menu y sus items
        jMenu1.setText("Menu");
        jMenuItem1.setText("Empezar juego");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke("F1") );
        jMenu1.add(jMenuItem1);
        jMenuBar1.add(jMenu1);
        setJMenuBar(jMenuBar1);
            
        // Layout y los JPanel que agregamos
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );

        pack();
    }                    

    
    /* Al presionar F1 o Start Game se habilita el tablero, si
    el tablero no estaba habilitado se muestra, si ya estaban jugando
    se vuelve a limpiar el tablero y se habilitan todos los botones
    nuevamente
    */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        resetGame();
        table.resetAll();
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    
    }                                              

    public static void main(String args[]) {
            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }
                         
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;         

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Acciones del jugador y modificacion de los botones
        
    @Override
    public void actionPerformed(ActionEvent e) {
                
        table.addTurn();
        System.out.println(table.getTurn());
        boolean chessCircle = true;
        String player = null;
        
        //Segun el jugador, la ficha que se colocara
        
        if(table.isPlayer1Playing()){
            table.setChess("O");
            chessCircle = true;
            player = "Jugador 1";
            jLabel1.setText("Jugador 2 elige una casilla");
        }
        if(table.isPlayer2Playing()){
            table.setChess("X");
            chessCircle = false;            
            player = "Jugador 2";
            jLabel1.setText("Jugador 1 elige una casilla");
        }
        
        // A partir de aqui, segun cada boton el resultado
        
        if(e.getSource() == jButton1){
           table.setA1(table.getChess());
           jButton1.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
                try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton1.setIcon(new ImageIcon(circle));
                }else{
                    jButton1.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton2){
           table.setA2(table.getChess());
           jButton2.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton2.setIcon(new ImageIcon(circle));
                }else{
                    jButton2.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton3){
           table.setA3(table.getChess());
           jButton3.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton3.setIcon(new ImageIcon(circle));
                }else{
                    jButton3.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton4){
           table.setB1(table.getChess());
           jButton4.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton4.setIcon(new ImageIcon(circle));
                }else{
                    jButton4.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton5){
           table.setB2(table.getChess());
           jButton5.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton5.setIcon(new ImageIcon(circle));
                }else{
                    jButton5.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton6){
           table.setB3(table.getChess());
           jButton6.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton6.setIcon(new ImageIcon(circle));
                }else{
                    jButton6.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton7){
           table.setC1(table.getChess());
           jButton7.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton7.setIcon(new ImageIcon(circle));
                }else{
                    jButton7.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton8){
           table.setC2(table.getChess());
           jButton8.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton8.setIcon(new ImageIcon(circle));
                }else{
                    jButton8.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        if(e.getSource() == jButton9){
           table.setC3(table.getChess());
           jButton9.setEnabled(false);
           table.changePlayer1(table.isPlayer1Playing());
           try {
                Image circle = ImageIO.read(new FileInputStream("src/circle.png"));
                Image cross = ImageIO.read(new FileInputStream("src/cross.png"));
                if(chessCircle){
                    jButton9.setIcon(new ImageIcon(circle));
                }else{
                    jButton9.setIcon(new ImageIcon(cross));
                }
                
                 } catch (Exception ex) {
                    System.out.println(ex);
                 }
        }
        
        if(table.getTurn() >= 9){
    table.resetTurn();
    String ObjButtons[] = {"No","Si"};
    int PromptResult = JOptionPane.showOptionDialog(null, 
        "Jugar de Nuevo?", "Empate!", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
        ObjButtons,ObjButtons[1]);
    
    //A partir de aqui las condiciones de Victoria
    //Hacemos lo mismo que si presionaramos F1
    if(PromptResult==1){        
        resetGame();
        table.resetAll();
    }
    if(PromptResult==0)
    {
      System.exit(0);          
    }
        }
        
    checkVictory(player);
                
    }
    
    public void checkVictory(String winner){
        if((table.getA1().equals("X") && table.getA2().equals("X") && table.getA3().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getB1().equals("X") && table.getB2().equals("X") && table.getB3().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getC1().equals("X") && table.getC2().equals("X") && table.getC3().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA1().equals("X") && table.getB1().equals("X") && table.getC1().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA2().equals("X") && table.getB2().equals("X") && table.getC2().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA3().equals("X") && table.getB3().equals("X") && table.getC3().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA1().equals("X") && table.getB2().equals("X") && table.getC3().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA3().equals("X") && table.getB2().equals("X") && table.getC1().equals("X"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        //Condiciones de victoria con "O"
        
        if((table.getA1().equals("O") && table.getA2().equals("O") && table.getA3().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getB1().equals("O") && table.getB2().equals("O") && table.getB3().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getC1().equals("O") && table.getC2().equals("O") && table.getC3().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA1().equals("O") && table.getB1().equals("O") && table.getC1().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA2().equals("O") && table.getB2().equals("O") && table.getC2().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA3().equals("O") && table.getB3().equals("O") && table.getC3().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA1().equals("O") && table.getB2().equals("O") && table.getC3().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
        
        if((table.getA3().equals("O") && table.getB2().equals("O") && table.getC1().equals("O"))){
            String ObjButtons[] = {"No","Si"};
            int PromptResult = JOptionPane.showOptionDialog(null, 
            "Jugar de Nuevo?", "Ganador "+winner, 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
            ObjButtons,ObjButtons[1]);
            if(PromptResult==1){        
               resetGame();
               table.resetAll();
            }
            if(PromptResult==0)
            {
              System.exit(0);          
            }
        }
    }
}
