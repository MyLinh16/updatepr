
package com.mycompany.project1.ui;
import javax.swing.ImageIcon;

public class MainForm extends javax.swing.JFrame {
    private InforPanel mInforpersonPanel;
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        tplMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        danhmucPanel = new javax.swing.JMenu();
        thongtinuser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        dinhduongcacmonanPanel = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        chisocothePanel = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Trang chủ ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        danhmucPanel.setBackground(new java.awt.Color(50, 50, 50));
        danhmucPanel.setText("Danh mục");
        danhmucPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danhmucPanelActionPerformed(evt);
            }
        });

        thongtinuser.setBackground(new java.awt.Color(155, 155, 155));
        thongtinuser.setText("Thông tin người dùng");
        thongtinuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongtinuserActionPerformed(evt);
            }
        });
        danhmucPanel.add(thongtinuser);
        danhmucPanel.add(jSeparator2);

        dinhduongcacmonanPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/food1.png"))); // NOI18N
        dinhduongcacmonanPanel.setText("Dinh dưỡng các món ăn");
        dinhduongcacmonanPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinhduongcacmonanPanelActionPerformed(evt);
            }
        });
        danhmucPanel.add(dinhduongcacmonanPanel);
        danhmucPanel.add(jSeparator3);

        chisocothePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dumbbell.png"))); // NOI18N
        chisocothePanel.setText("Chỉ số cơ thể");
        chisocothePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chisocothePanelActionPerformed(evt);
            }
        });
        danhmucPanel.add(chisocothePanel);

        jMenuBar1.add(danhmucPanel);

        jMenu4.setText("Hệ thống ");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Giới thiệu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_CANCEL, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit-32.png"))); // NOI18N
        jMenuItem2.setText("Thoát ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 437, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tplMainBoard)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void danhmucPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danhmucPanelActionPerformed
        
    }//GEN-LAST:event_danhmucPanelActionPerformed

    private void thongtinuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongtinuserActionPerformed
       if(mInforpersonPanel == null ){
          mInforpersonPanel  = new InforPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/icon/userperson.png"));
         tplMainBoard.addTab("Thông tin người dùng", icon, mInforpersonPanel, "Thông tin người dùng");
 }
       tplMainBoard.setSelectedComponent(mInforpersonPanel);
 
    }//GEN-LAST:event_thongtinuserActionPerformed

    private void dinhduongcacmonanPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinhduongcacmonanPanelActionPerformed
       

    }//GEN-LAST:event_dinhduongcacmonanPanelActionPerformed

    private void chisocothePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chisocothePanelActionPerformed
         
    }//GEN-LAST:event_chisocothePanelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem chisocothePanel;
    private javax.swing.JMenu danhmucPanel;
    private javax.swing.JMenuItem dinhduongcacmonanPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem thongtinuser;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
