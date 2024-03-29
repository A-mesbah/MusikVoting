/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MusikwunschService;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Gast;
import model.Musikwunsch;
import model.Vote;

/**
 *
 * @author amesbah
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    MusikwunschService ms;
    
    public View() throws SQLException {
        initComponents();
        this.ms = new MusikwunschService();
        customeTableHeader();
        getAllSongs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        downPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBand = new javax.swing.JTextField();
        txtGenre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        songtitelValidation = new javax.swing.JLabel();
        bandValidation = new javax.swing.JLabel();
        genreValidation = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        upPanel.setBackground(new java.awt.Color(213, 232, 212));
        upPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 36)); // NOI18N
        jLabel1.setText("SOUND OF AXE AND FIRE");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(upPanel, java.awt.BorderLayout.PAGE_START);

        downPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setBackground(new java.awt.Color(0, 204, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setText("Vote");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setText("Voting Result");

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout downPanelLayout = new javax.swing.GroupLayout(downPanel);
        downPanel.setLayout(downPanelLayout);
        downPanelLayout.setHorizontalGroup(
            downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        downPanelLayout.setVerticalGroup(
            downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, downPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        getContentPane().add(downPanel, java.awt.BorderLayout.PAGE_END);

        rightPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Song ");

        txtSong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSong.setText("Songtitel");
        txtSong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSongKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Band");

        txtBand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBand.setText("Band");
        txtBand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBandKeyTyped(evt);
            }
        });

        txtGenre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGenre.setText("Genre");
        txtGenre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGenreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Genre");

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("EINFÜGEN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        songtitelValidation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        songtitelValidation.setForeground(new java.awt.Color(255, 51, 51));

        bandValidation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bandValidation.setForeground(new java.awt.Color(255, 51, 51));

        genreValidation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        genreValidation.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGenre)
                            .addComponent(songtitelValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSong)
                            .addComponent(txtBand)
                            .addComponent(bandValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genreValidation, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                        .addContainerGap(70, Short.MAX_VALUE))))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(txtSong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(songtitelValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBand, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(bandValidation)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(genreValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        getContentPane().add(rightPanel, java.awt.BorderLayout.LINE_START);

        centerPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Songtitle", "Band", "Genre", "SongId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Songtitle");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Band");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Genre");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("SongId");
        }

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private boolean isTextFieldEmpty(String string) {
        if (string.isEmpty()) {
            return true;
        } else {
            return false;
        }
        
    }
    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String songName = txtSong.getText();
        String songBand = txtBand.getText();
        String songGenre = txtGenre.getText();
        if (isTextFieldEmpty(songName)) {
            songtitelValidation.setText("Songtitel kann nicht leer sein");
        } else {
            songtitelValidation.setText("");
        }
        if (isTextFieldEmpty(songBand)) {
            bandValidation.setText("Band kann nicht leer sein");
        } else {
            songtitelValidation.setText("");
        }
        if (isTextFieldEmpty(songGenre)) {
            bandValidation.setText("Genre kann nicht leer sein");
        } else {
            songtitelValidation.setText("");
        }
        if(!isTextFieldEmpty(songName)&&!isTextFieldEmpty(songBand)&&!isTextFieldEmpty(songGenre)){
        
         try {
            ms.addMusikWunsch(new Musikwunsch(songName, songBand, songGenre));
            deleteAllSongs();
            getAllSongs();
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "ADDED Successfully");
        
        }
        else    JOptionPane.showMessageDialog(this, "kein erfolgreich Process ", "Fahler", JOptionPane.ERROR_MESSAGE);;
        
       
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtSong.setText("");
        txtBand.setText("");
        txtGenre.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            ms.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String userName = JOptionPane.showInputDialog(this, "Ihre Name");
        boolean isNameEmpty = isTextFieldEmpty(userName);
        if (!isNameEmpty) {
            try {
                ms.addnewGust(new Gast(userName));
                int songId = Integer.parseInt(JOptionPane.showInputDialog(this, "Ihr Song Id "));
                if (isNumberExist(songId) ) {
                    JOptionPane.showMessageDialog(this, "Sie haben erfolgrich gevotet ", "Info", JOptionPane.INFORMATION_MESSAGE);
                    ms.addnewVote(new Vote(songId, userName));
                } else {
                    JOptionPane.showMessageDialog(this, "Dise song Id existiert nicht ", "Fehler", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Der Name ist Erforderlich ", "Fahler", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtSongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSongKeyTyped
        songtitelValidation.setText("");
    }//GEN-LAST:event_txtSongKeyTyped

    private void txtBandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBandKeyTyped
   
        bandValidation.setText("");
    }//GEN-LAST:event_txtBandKeyTyped

    private void txtGenreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenreKeyTyped
    
        genreValidation.setText("");     
         
    }//GEN-LAST:event_txtGenreKeyTyped
    private void getAllSongs() throws SQLException {
        ArrayList<Musikwunsch> allmusikwunsches = ms.getAllmusikwunsches();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < allmusikwunsches.size(); i++) {
            row[0] = allmusikwunsches.get(i).getSongtitle();
            row[1] = allmusikwunsches.get(i).getBand();
            row[2] = allmusikwunsches.get(i).getGenre();
            row[3] = String.valueOf(allmusikwunsches.get(i).getSongId());
            model.addRow(row);
            
        }
        
    }
    
    private boolean isNumberExist(int number) throws SQLException {
        MusikwunschService ms = new MusikwunschService();
        ArrayList<Musikwunsch> allmusikwunsches = ms.getAllmusikwunsches();
        boolean isExist = false;
        for (int i = 0; i < allmusikwunsches.size(); i++) {
            int songId = allmusikwunsches.get(i).getSongId();
            if (songId == number) {
                isExist = true;
                return isExist;
            }
        }
        return isExist;
        
    }
    
    private void deleteAllSongs() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
    }
    
    private void customeTableHeader() {
        JTableHeader tableHeader = jTable1.getTableHeader();
        tableHeader.setBackground(Color.LIGHT_GRAY);
        tableHeader.setFont(new Font("Tahome", Font.BOLD, 20));
        //jTable1.setFont(font);

    }

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new View().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandValidation;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel downPanel;
    private javax.swing.JLabel genreValidation;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel songtitelValidation;
    private javax.swing.JTextField txtBand;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtSong;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables
}
