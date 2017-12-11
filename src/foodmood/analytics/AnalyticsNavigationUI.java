/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.analytics;

import foodmood.navigation.NavigationController;

/**
 *
 * @author Dylan
 */
public class AnalyticsNavigationUI extends javax.swing.JFrame {

    private final AnalyticsController theCntl;

    /**
     * Creates new form analyticNavigationUI
     *
     * @param theCntl
     */
    public AnalyticsNavigationUI(AnalyticsController theCntl) {
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

        foodHistoryButton = new javax.swing.JButton();
        moodHistoryButton = new javax.swing.JButton();
        correlationButton = new javax.swing.JButton();
        chartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        correlationButton.setText("View Correlations");

        chartButton.setText("View Charts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moodHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(correlationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foodHistoryButton)
                .addGap(18, 18, 18)
                .addComponent(moodHistoryButton)
                .addGap(18, 18, 18)
                .addComponent(correlationButton)
                .addGap(18, 18, 18)
                .addComponent(chartButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void foodHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodHistoryButtonActionPerformed
        theCntl.getFoodMoodController().showFoodHistoryUI();
        this.dispose();
    }//GEN-LAST:event_foodHistoryButtonActionPerformed

    private void moodHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodHistoryButtonActionPerformed
        theCntl.getFoodMoodController().showMoodHistoryUI();
        this.dispose();
    }//GEN-LAST:event_moodHistoryButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chartButton;
    private javax.swing.JButton correlationButton;
    private javax.swing.JButton foodHistoryButton;
    private javax.swing.JButton moodHistoryButton;
    // End of variables declaration//GEN-END:variables
}
