/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelo.Numero;

/**
 *
 * @author daniel
 */
public class vista extends javax.swing.JFrame implements ActionListener {

    protected String pantalla = "", operacion = "";

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panel = new javax.swing.JPanel();
        n0 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        operar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        base = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        mostrar = new javax.swing.JTextPane();
        error = new javax.swing.JLabel();
        rbase = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcul@dora");
        setBackground(new java.awt.Color(138, 140, 144));

        n0.setBackground(new java.awt.Color(51, 60, 78));
        n0.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n0.setForeground(java.awt.Color.white);
        n0.setText("0");
        n0.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n0.setName("numero"); // NOI18N

        n2.setBackground(new java.awt.Color(51, 60, 78));
        n2.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n2.setForeground(java.awt.Color.white);
        n2.setText("2");
        n2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n2.setName("numero"); // NOI18N

        restar.setBackground(new java.awt.Color(18, 26, 40));
        restar.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        restar.setForeground(java.awt.Color.white);
        restar.setText("-");
        restar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        restar.setName("operacion"); // NOI18N

        sumar.setBackground(new java.awt.Color(18, 26, 40));
        sumar.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        sumar.setForeground(java.awt.Color.white);
        sumar.setText("+");
        sumar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        sumar.setName("operacion"); // NOI18N

        operar.setBackground(new java.awt.Color(95, 180, 131));
        operar.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        operar.setForeground(java.awt.Color.white);
        operar.setText("=");
        operar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        operar.setName("operacion"); // NOI18N

        borrar.setBackground(new java.awt.Color(18, 26, 40));
        borrar.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        borrar.setForeground(java.awt.Color.white);
        borrar.setText("C");
        borrar.setBorder(null);
        borrar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        borrar.setName("operacion"); // NOI18N

        dividir.setBackground(new java.awt.Color(18, 26, 40));
        dividir.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        dividir.setForeground(java.awt.Color.white);
        dividir.setText("/");
        dividir.setBorder(null);
        dividir.setMargin(new java.awt.Insets(2, 2, 2, 2));
        dividir.setName("operacion"); // NOI18N

        multiplicar.setBackground(new java.awt.Color(18, 26, 40));
        multiplicar.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        multiplicar.setForeground(java.awt.Color.white);
        multiplicar.setText("X");
        multiplicar.setBorder(null);
        multiplicar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        multiplicar.setName("operacion"); // NOI18N

        n7.setBackground(new java.awt.Color(51, 60, 78));
        n7.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n7.setForeground(java.awt.Color.white);
        n7.setText("7");
        n7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n7.setName("numero"); // NOI18N

        n8.setBackground(new java.awt.Color(51, 60, 78));
        n8.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n8.setForeground(java.awt.Color.white);
        n8.setText("8");
        n8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n8.setName("numero"); // NOI18N

        n9.setBackground(new java.awt.Color(51, 60, 78));
        n9.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n9.setForeground(java.awt.Color.white);
        n9.setText("9");
        n9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n9.setName("numero"); // NOI18N

        n6.setBackground(new java.awt.Color(51, 60, 78));
        n6.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n6.setForeground(java.awt.Color.white);
        n6.setText("6");
        n6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n6.setName("numero"); // NOI18N

        n4.setBackground(new java.awt.Color(51, 60, 78));
        n4.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n4.setForeground(java.awt.Color.white);
        n4.setText("4");
        n4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n4.setName("numero"); // NOI18N

        n5.setBackground(new java.awt.Color(51, 60, 78));
        n5.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n5.setForeground(java.awt.Color.white);
        n5.setText("5");
        n5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n5.setName("numero"); // NOI18N

        n3.setBackground(new java.awt.Color(51, 60, 78));
        n3.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n3.setForeground(java.awt.Color.white);
        n3.setText("3");
        n3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n3.setName("numero"); // NOI18N

        decimal.setBackground(new java.awt.Color(51, 60, 78));
        decimal.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        decimal.setForeground(java.awt.Color.white);
        decimal.setText("<");
        decimal.setBorder(null);
        decimal.setMargin(new java.awt.Insets(2, 2, 2, 2));
        decimal.setName("operacion"); // NOI18N

        n1.setBackground(new java.awt.Color(51, 60, 78));
        n1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        n1.setForeground(java.awt.Color.white);
        n1.setText("1");
        n1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        n1.setName("numero"); // NOI18N

        base.setBackground(new java.awt.Color(18, 26, 40));
        base.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        base.setForeground(java.awt.Color.white);
        base.setText("B");
        base.setMargin(new java.awt.Insets(2, 2, 2, 2));
        base.setName("operacion"); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(n0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(operar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(operar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        n0.addActionListener(this);
        n2.addActionListener(this);
        restar.addActionListener(this);
        sumar.addActionListener(this);
        operar.addActionListener(this);
        borrar.addActionListener(this);
        dividir.addActionListener(this);
        multiplicar.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n6.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n3.addActionListener(this);
        decimal.addActionListener(this);
        n1.addActionListener(this);
        base.addActionListener(this);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mostrar.setEditable(false);
        mostrar.setBorder(null);
        mostrar.setContentType("text/html"); // NOI18N
        mostrar.setText("");

        error.setBackground(new java.awt.Color(255, 255, 255));
        error.setForeground(new java.awt.Color(255, 0, 0));

        rbase.setBackground(new java.awt.Color(255, 255, 255));
        rbase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "9", "8", "7", "6", "5", "4", "3", "2" }));
        rbase.setFocusable(false);
        rbase.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbase, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(rbase, javax.swing.GroupLayout.PREFERRED_SIZE, 16, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        );

        rbase.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton base;
    public javax.swing.JButton borrar;
    public javax.swing.JButton decimal;
    public javax.swing.JButton dividir;
    public javax.swing.JLabel error;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextPane mostrar;
    public javax.swing.JButton multiplicar;
    public javax.swing.JButton n0;
    public javax.swing.JButton n1;
    public javax.swing.JButton n2;
    public javax.swing.JButton n3;
    public javax.swing.JButton n4;
    public javax.swing.JButton n5;
    public javax.swing.JButton n6;
    public javax.swing.JButton n7;
    public javax.swing.JButton n8;
    public javax.swing.JButton n9;
    public javax.swing.JButton operar;
    public javax.swing.JPanel panel;
    public javax.swing.JComboBox<String> rbase;
    public javax.swing.JButton restar;
    public javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton boton = (JButton) ae.getSource();
        String[] partes;

        if (boton.getName().equals("numero")) {
            pantalla += boton.getText();
            if (operacion.equals("")) {
                partes = pantalla.split("<sub>");
                if (partes.length == 1) {
                    Numero n1 = new Numero(partes[0]);
                } else {
                    Numero n1 = new Numero(partes[0], partes[1]);
                    if (n1.getBase() != Integer.parseInt(partes[1])) {
                        this.error.setText("Base invalida");
                    }
                }
            } else {
                partes = pantalla.split("\\"+operacion);
                partes = partes[1].split("<sub>");
                if (partes.length == 1) {
                    Numero n2 = new Numero(partes[0]);
                } else {
                    Numero n2 = new Numero(partes[0], partes[1]);
                    if (n2.getBase() != Integer.parseInt(partes[1])) {
                        this.error.setText("Base invalida");
                    }
                }
            }
            mostrar();
        } else {
            switch (boton.getText()) {
                case "=":
                    if (this.error.getText().equals("") && !operacion.equals("")) {
                        //realizaOperacion();
                    }
                    break;

                case "C":
                    break;

                case "<":
                    if (pantalla.substring(pantalla.length() - 5, pantalla.length()).equals("<sub>")) {
                        pantalla = pantalla.substring(0, pantalla.length() - 5);
                    } else if (pantalla.substring(pantalla.length() - 6, pantalla.length()).equals("</sub>")) {
                        pantalla = pantalla.substring(0, pantalla.length() - 6);
                    }
                    if (pantalla.length() > 0) {
                        this.error.setText("");
                        pantalla = pantalla.substring(0, pantalla.length() - 1);
                        mostrar();
                    }
                    break;

                case "B":
                    if (pantalla.length() > 0) {
                        if (operacion.equals("")) {
                            if (!pantalla.contains("<sub>")) {
                                pantalla += "<sub>";
                            }
                        } else {
                            partes = pantalla.split("\\"+operacion);
                            if (!partes[1].contains("<sub>")) {
                                pantalla += "<sub>";
                            }
                        }
                    }
                    break;

                default:
                    if (this.error.getText().equals("") && operacion.equals("")) {
                        operacion = boton.getText();
                        pantalla += "</sub>" + boton.getText();

                        mostrar();
                    }

                    break;
            }
        }
    }

    public void mostrar() {
        String resultado = "";
        mostrar.setText("<div style='text-align:right;font-size:30px'><span>" + resultado + "</span><br /><span>" + pantalla + "</span></div>");
    }

}
