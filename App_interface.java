/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_giaodien;

/**
 *
 * @author Admin
 */
public class App_interface extends javax.swing.JFrame {

    /**
     * Creates new form App_interface
     */
    public App_interface() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonBaiHat = new javax.swing.JButton();
        ButtonPlayList = new javax.swing.JButton();
        ButtonTaoPlayList = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextTimKiem = new javax.swing.JTextField();
        ButtonTimKiem = new javax.swing.JButton();
        ButtonThemBH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonNguoiDung = new javax.swing.JButton();
        ButtonTai1 = new javax.swing.JButton();
        ButtonTai2 = new javax.swing.JButton();
        ButtonTai3 = new javax.swing.JButton();
        ButtonTai5 = new javax.swing.JButton();
        ButtonTai4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/icon.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 51));

        buttonBaiHat.setBackground(new java.awt.Color(153, 255, 255));
        buttonBaiHat.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        buttonBaiHat.setForeground(new java.awt.Color(255, 0, 255));
        buttonBaiHat.setText("Bài Hát");
<<<<<<< Updated upstream
=======
        buttonBaiHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaiHatActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes

        ButtonPlayList.setBackground(new java.awt.Color(153, 255, 255));
        ButtonPlayList.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        ButtonPlayList.setForeground(new java.awt.Color(255, 0, 255));
        ButtonPlayList.setText("PlayList");
<<<<<<< Updated upstream
=======
        ButtonPlayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlayListActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes

        ButtonTaoPlayList.setBackground(new java.awt.Color(153, 255, 255));
        ButtonTaoPlayList.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        ButtonTaoPlayList.setForeground(new java.awt.Color(255, 0, 255));
        ButtonTaoPlayList.setText("Tạo PlayList");

<<<<<<< Updated upstream
        jList1.setBackground(new java.awt.Color(153, 255, 255));
        jList1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 0, 255));
=======
        jList1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 255));
>>>>>>> Stashed changes
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "tên bài hat 1 - tác giả", "tên bài hat 2 - tác giả", "tên bài hat 3 - tác giả", "tên bài hat 4 - tác giả", "tên bài hat 5 - tác giả" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jList1);

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Danh Sách Nhạc Đề Xuất");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 0));

        TextTimKiem.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        TextTimKiem.setForeground(new java.awt.Color(51, 204, 255));

        ButtonTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/images-removebg-preview (1).png"))); // NOI18N

        ButtonThemBH.setBackground(new java.awt.Color(153, 255, 255));
        ButtonThemBH.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        ButtonThemBH.setForeground(new java.awt.Color(255, 0, 255));
        ButtonThemBH.setText("Thêm Bài Hát");

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("Số Lượng:");

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("Số Lượng:");

        ButtonNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/anhtaikhoan.png"))); // NOI18N
<<<<<<< Updated upstream
=======
        ButtonNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNguoiDungActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes

        ButtonTai1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/tải.jpg"))); // NOI18N

        ButtonTai2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/tải.jpg"))); // NOI18N

        ButtonTai3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/tải.jpg"))); // NOI18N

        ButtonTai5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/tải.jpg"))); // NOI18N

        ButtonTai4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl_giaodien/tải.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonPlayList)
                            .addComponent(buttonBaiHat))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonThemBH, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonTaoPlayList, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TextTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonNguoiDung))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
<<<<<<< Updated upstream
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> Stashed changes
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonTai1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonTai5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonTai4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonTai2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonTai3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonNguoiDung)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(TextTimKiem))
                                .addGap(12, 12, 12)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBaiHat)
                            .addComponent(ButtonThemBH)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonPlayList)
                            .addComponent(ButtonTaoPlayList)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonTai1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonTai2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonTai3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(ButtonTai4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonTai5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream
=======
    private void ButtonNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNguoiDungActionPerformed
        // TODO add your handling code here:
        dispose();
        User_information user_information =  new User_information();
        user_information.setVisible(true);
    }//GEN-LAST:event_ButtonNguoiDungActionPerformed

    private void buttonBaiHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaiHatActionPerformed
        // TODO add your handling code here:
        dispose();
        SongList songList = new SongList();
        songList.setVisible(true);
    }//GEN-LAST:event_buttonBaiHatActionPerformed

    private void ButtonPlayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlayListActionPerformed
        // TODO add your handling code here:
        dispose();
        PlayList playList = new PlayList();
        playList.setVisible(true);
    }//GEN-LAST:event_ButtonPlayListActionPerformed

>>>>>>> Stashed changes
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
            java.util.logging.Logger.getLogger(App_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNguoiDung;
    private javax.swing.JButton ButtonPlayList;
    private javax.swing.JButton ButtonTai1;
    private javax.swing.JButton ButtonTai2;
    private javax.swing.JButton ButtonTai3;
    private javax.swing.JButton ButtonTai4;
    private javax.swing.JButton ButtonTai5;
    private javax.swing.JButton ButtonTaoPlayList;
    private javax.swing.JButton ButtonThemBH;
    private javax.swing.JButton ButtonTimKiem;
    private javax.swing.JTextField TextTimKiem;
    private javax.swing.JButton buttonBaiHat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
