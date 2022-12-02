
package java_project_1;

import javax.swing.JOptionPane;

public class Loading_1 extends javax.swing.JFrame {

    public Loading_1() {
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

        BackGroungPanel = new javax.swing.JPanel();
        MainLogo = new javax.swing.JLabel();
        Logo_1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Loading = new javax.swing.JProgressBar();
        LoadingLabel_1 = new javax.swing.JLabel();
        LoadingLabel_2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackGroungPanel.setBackground(new java.awt.Color(153, 153, 255));
        BackGroungPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        BackGroungPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_project_1/Assets/Loading_1_origin_thumbnail.png"))); // NOI18N
        BackGroungPanel.add(MainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 550, 420));

        Logo_1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        Logo_1.setForeground(new java.awt.Color(0, 0, 102));
        Logo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo_1.setText("MIRTC");
        BackGroungPanel.add(Logo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 260, 70));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_project_1/Assets/logo.png"))); // NOI18N
        BackGroungPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 140));

        Loading.setBackground(new java.awt.Color(204, 255, 204));
        Loading.setForeground(new java.awt.Color(204, 255, 204));
        BackGroungPanel.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 860, 20));

        LoadingLabel_1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        LoadingLabel_1.setForeground(new java.awt.Color(51, 51, 255));
        LoadingLabel_1.setText("Loading....");
        BackGroungPanel.add(LoadingLabel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 210, 20));

        LoadingLabel_2.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        LoadingLabel_2.setForeground(new java.awt.Color(51, 51, 255));
        LoadingLabel_2.setText("0%");
        BackGroungPanel.add(LoadingLabel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 50, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_project_1/Assets/Atlas.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        BackGroungPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGroungPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGroungPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Loading_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Loading_1 lo = new Loading_1();
        lo.setVisible(true);
        
        
        try {
            
            for(int i=0 ; i<=100; i++)
            {
                Thread.sleep(100);
                lo.LoadingLabel_2.setText(i+"%");
                
                if(i==10)
                {
                    lo.LoadingLabel_1.setText("Turning on Modules....");
                }
                if(i==20)
                {
                    lo.LoadingLabel_1.setText("Loading Modules....");
                }
                if(i==50)
                {
                    lo.LoadingLabel_1.setText("Connecting to Database....");
                }
                if(i==70)
                {
                    lo.LoadingLabel_1.setText("Connection Successful....");
                }
                if(i==80)
                {
                    lo.LoadingLabel_1.setText("Launching Application....");
                }
                lo.Loading.setValue(i);
            }
            new Login_2().setVisible(true);
            
//            new Loading_1().setVisible(false);
            
        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Loading_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroungPanel;
    private javax.swing.JProgressBar Loading;
    private javax.swing.JLabel LoadingLabel_1;
    private javax.swing.JLabel LoadingLabel_2;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo_1;
    private javax.swing.JLabel MainLogo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
