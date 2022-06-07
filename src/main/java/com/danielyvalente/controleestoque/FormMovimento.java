/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielyvalente.controleestoque;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devsys-a daniely
 */
public class FormMovimento extends javax.swing.JFrame {

    public FormMovimento() {
        initComponents();
    }

    
    public FormMovimento(Produtos aux) {
        initComponents();
        
        txtIDMove.setText(String.valueOf(aux.getId()));
        txtDescricaoMove.setText(aux.getDescricao());
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMovimento = new javax.swing.JLabel();
        lbliDMove = new javax.swing.JLabel();
        txtIDMove = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtDescricaoMove = new javax.swing.JTextField();
        lblDescricaoMove = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        lblQtd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimento = new javax.swing.JTable();
        bntSalvarMove = new javax.swing.JButton();
        bntAtt = new javax.swing.JButton();

        setTitle("Movimento");

        lblMovimento.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        lblMovimento.setText("Movimento");

        lbliDMove.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        lbliDMove.setText("ID");

        txtIDMove.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        txtIDMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDMoveActionPerformed(evt);
            }
        });

        txtData.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        lblData.setText("Data");

        txtDescricaoMove.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N

        lblDescricaoMove.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        lblDescricaoMove.setText("Descrição");

        txtQtd.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N

        lblQtd.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        lblQtd.setText("Qtd");

        tblMovimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "ID", "Descrição", "Qtd"
            }
        ));
        jScrollPane1.setViewportView(tblMovimento);

        bntSalvarMove.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bntSalvarMove.setText("Salvar");
        bntSalvarMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarMoveActionPerformed(evt);
            }
        });

        bntAtt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntAtt.setText("Atualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMovimento))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntSalvarMove)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbliDMove)
                                            .addComponent(lblData))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(txtIDMove))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDescricaoMove)
                                            .addComponent(lblQtd))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDescricaoMove, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(txtQtd))))))
                        .addGap(0, 199, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bntAtt)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMovimento)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDMove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricaoMove)
                    .addComponent(txtDescricaoMove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbliDMove))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQtd)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntSalvarMove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntAtt)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntSalvarMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarMoveActionPerformed
        // TODO add your handling code here:
        //Primeiro recuperar os dados preenchidos no form
        String id = txtIDMove.getText();
        String descricao = txtDescricaoMove.getText();
        String data = txtData.getText();
        String qtd = txtQtd.getText();
        
        DefaultTableModel tabelaProduto = (DefaultTableModel) tblMovimento.getModel();
        
        Object[] novoProduto = new Object[]{ 
            data, //posição 1 do array
            id, //posição 2 do array
            descricao, //posição 3 do array
            qtd //posição 4 do array
            
        };
        
        //add linhas
        tabelaProduto.addRow(novoProduto);
    }//GEN-LAST:event_bntSalvarMoveActionPerformed

    private void txtIDMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDMoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMoveActionPerformed

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
            java.util.logging.Logger.getLogger(FormMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMovimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtt;
    private javax.swing.JButton bntSalvarMove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricaoMove;
    private javax.swing.JLabel lblMovimento;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lbliDMove;
    private javax.swing.JTable tblMovimento;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricaoMove;
    private javax.swing.JTextField txtIDMove;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
