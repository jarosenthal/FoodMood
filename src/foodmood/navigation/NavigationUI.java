/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.navigation;

/**
 *
 * @author justi
 */
public class NavigationUI extends javax.swing.JFrame {

    private final NavigationController theCntl;

    /**
     * Creates new form NavigationUI
     *
     * @param theCntl
     */
    public NavigationUI(NavigationController theCntl) {
        initComponents();
        this.theCntl = theCntl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        addFoodButton = new javax.swing.JButton();
        addMoodButton = new javax.swing.JButton();
        foodHistoryButton = new javax.swing.JButton();
        moodHistoryButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 200));

        addFoodButton.setText("Add Food");
        addFoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodButtonActionPerformed(evt);
            }
        });

        addMoodButton.setText("Add Mood");
        addMoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoodButtonActionPerformed(evt);
            }
        });

        foodHistoryButton.setText("View Food History");
        foodHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodHistoryButtonActionPerformed(evt);
            }
        });

        moodHistoryButton.setText("View Mood History");
        moodHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodHistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addFoodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMoodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foodHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moodHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addFoodButton)
                .addGap(18, 18, 18)
                .addComponent(addMoodButton)
                .addGap(18, 18, 18)
                .addComponent(foodHistoryButton)
                .addGap(18, 18, 18)
                .addComponent(moodHistoryButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addFoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodButtonActionPerformed
        theCntl.hideNavigationUI();
        theCntl.getFoodMoodController().showFoodUI();
    }//GEN-LAST:event_addFoodButtonActionPerformed

    private void foodHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodHistoryButtonActionPerformed
        theCntl.hideNavigationUI();
        theCntl.getFoodMoodController().showFoodHistoryUI();
    }//GEN-LAST:event_foodHistoryButtonActionPerformed

    private void moodHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodHistoryButtonActionPerformed
        theCntl.hideNavigationUI();
        theCntl.getFoodMoodController().showMoodHistoryUI();
    }//GEN-LAST:event_moodHistoryButtonActionPerformed

    private void addMoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMoodButtonActionPerformed
        theCntl.hideNavigationUI();
        theCntl.getFoodMoodController().showMoodUI();
    }//GEN-LAST:event_addMoodButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFoodButton;
    private javax.swing.JButton addMoodButton;
    private javax.swing.JButton foodHistoryButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton moodHistoryButton;
    // End of variables declaration//GEN-END:variables
}
