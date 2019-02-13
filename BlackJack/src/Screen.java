
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Screen extends javax.swing.JFrame {

    DefaultListModel GameWindow = new DefaultListModel();
    DefaultListModel NPCWindow = new DefaultListModel();

    int playerCardSum = 0;
    int NPCCardSum = 0;

    int playerCardValue = 0;
    int NPCCardValue = 0;

    int playerPoints = 0;
    int NPCPoints = 0;
    int y = 0;

    public Screen() {
        initComponents();
    }

    private void addGameWindow(String name) {
        jList1.setModel(GameWindow);
        GameWindow.addElement(name);
    }

    private void addNPCWindow(String name) {
        jList2.setModel(NPCWindow);
        NPCWindow.addElement(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        takeCard = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<String>();
        NPC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerSum = new javax.swing.JTextField();
        NPCSum = new javax.swing.JTextField();
        playerResult = new javax.swing.JTextField();
        NPCResult = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        takeCard.setText("Traukti");
        takeCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeCardActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pasiduoti");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        NPC.setText("Krupje");

        jLabel2.setText("Player");

        playerResult.setText("0");

        NPCResult.setText("0");
        NPCResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPCResultActionPerformed(evt);
            }
        });

        jLabel3.setText("Zaidejo rezultatas");

        jLabel4.setText("Krupje rezultatas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerResult, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerSum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(takeCard)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(NPC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPCSum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(NPCResult, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPCSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NPCResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NPC)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(playerResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(takeCard))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void takeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeCardActionPerformed

        playerCardSum = playerCardSumCount(playerCardValue, playerCardSum);
        playerSumCheck(playerCardSum);


    }//GEN-LAST:event_takeCardActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        NPCCardSum = NPCCardCount(playerCardSum, NPCCardSum);
        restartas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NPCResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPCResultActionPerformed
        NPCCardSum = NPCCardCount(NPCCardValue, NPCCardSum);
        NPCSumCheck(NPCCardSum);
    }//GEN-LAST:event_NPCResultActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NPC;
    private javax.swing.JTextField NPCResult;
    private javax.swing.JTextField NPCSum;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField playerResult;
    private javax.swing.JTextField playerSum;
    private javax.swing.JButton takeCard;
    // End of variables declaration//GEN-END:variables

    private int more(int playerCardSum) {

        JOptionPane.showMessageDialog(null, "Suma virsijo 21 jus pralaimejote");
        GameWindow.clear();
        playerSum.setText(String.valueOf(0));
        playerCardSum = 0;

        NPCPoints++;
        NPCResult.setText(String.valueOf(NPCPoints));

        return playerCardSum;
    }

    private int NPCCardCount(int playerCardSum, int NPCCardSum) {

        while (NPCCardSum < 17) {

            NPCCardValue = Calc.takeCard();

            String card = "" + NPCCardValue;
            NPCCardSum += NPCCardValue;

            NPCSum.setText(String.valueOf(NPCCardSum));
            addNPCWindow(card);

        }

        System.out.print(playerCardSum + " " + NPCCardSum);
        if (NPCCardSum < 21) {
            check(playerCardSum, NPCCardSum);
        } else {
            JOptionPane.showMessageDialog(null, "Jus laimejote ");
            playerPoints++;
            playerResult.setText(String.valueOf(playerPoints));
        }

        return NPCCardSum;
    }

    private int playerCardSumCount(int playerCardValue, int playerCardSum) {

        playerCardValue = Calc.takeCard();
        playerCardSum += playerCardValue;
        String card = "" + playerCardValue;
        playerSum.setText(String.valueOf(playerCardSum));
        addGameWindow(card);

        if (playerCardSum > 21) {

            playerCardSum = more(playerCardSum);
        }

        return playerCardSum;
    }

    private void playerSumCheck(int playerCardSum) {

        if (playerCardSum > 21) {
            playerCardSum = 0;
            NPCResult.setText(String.valueOf(NPCPoints));

        }
    }
    
        private void NPCSumCheck(int NPCCardSum) {

        if (NPCCardSum > 21) {
            NPCCardSum = 0;
            playerResult.setText(String.valueOf(playerPoints));

        }
    }

    private void check(int playerCardSum, int NPCCardSum) {
        if (playerCardSum > NPCCardSum) {
            playerPoints++;
            playerResult.setText(String.valueOf(playerPoints));
            JOptionPane.showMessageDialog(null, "Sveikiname Laimejote ");
        }
        if (playerCardSum < NPCCardSum) {
            NPCPoints++;
            NPCResult.setText(String.valueOf(NPCPoints));
            JOptionPane.showMessageDialog(null, "Laimejo Krupje");
        }
    }

    private void restartas() {
        playerCardSum = 0;
        NPCCardSum = 0;
        NPCSum.setText(String.valueOf(0));
        playerSum.setText(String.valueOf(0));
        NPCWindow.clear();
        GameWindow.clear();
    }

}
