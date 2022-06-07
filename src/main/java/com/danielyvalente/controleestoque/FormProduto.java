package com.danielyvalente.controleestoque;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devsys-a daniely
 */
public class FormProduto extends javax.swing.JFrame {
    
    List<Produtos> listaProdutos;

  
    public FormProduto() {
        listaProdutos = new ArrayList<Produtos>();
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lbliDProd = new javax.swing.JLabel();
        txtIDProd = new javax.swing.JTextField();
        lblDescricaoProd = new javax.swing.JLabel();
        txtDescricaoProd = new javax.swing.JTextField();
        lblQtdAtual = new javax.swing.JLabel();
        txtQtdAtual = new javax.swing.JTextField();
        lblValorUnit = new javax.swing.JLabel();
        txtValorUnit = new javax.swing.JTextField();
        lblListadeProdutos = new javax.swing.JLabel();
        bntNovo = new javax.swing.JButton();
        bntSalvarProd = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();

        setTitle("Lista de Produtos");

        lblProdutos.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        lblProdutos.setText("Produtos");

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Qtd. Atual", "R$ Unit.", "R$ Total"
            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProdutosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        lbliDProd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbliDProd.setText("ID");

        txtIDProd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblDescricaoProd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblDescricaoProd.setText("Descrição");

        txtDescricaoProd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblQtdAtual.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblQtdAtual.setText("Qtd Atual");

        txtQtdAtual.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblValorUnit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblValorUnit.setText("Valor Unit");

        txtValorUnit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblListadeProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListadeProdutos.setText("Lista de Produtos");

        bntNovo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bntNovo.setText("Novo");
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        bntSalvarProd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bntSalvarProd.setText("Salvar");
        bntSalvarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarProdActionPerformed(evt);
            }
        });

        bntExcluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblProdutos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblDescricaoProd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbliDProd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricaoProd, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtIDProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQtdAtual)
                                .addGap(18, 18, 18)
                                .addComponent(txtQtdAtual))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValorUnit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(bntNovo)
                        .addGap(55, 55, 55)
                        .addComponent(bntSalvarProd)
                        .addGap(49, 49, 49)
                        .addComponent(bntExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListadeProdutos)
                .addGap(17, 647, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblProdutos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQtdAtual)
                            .addComponent(txtQtdAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricaoProd)
                            .addComponent(txtDescricaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorUnit)
                            .addComponent(txtValorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbliDProd)
                            .addComponent(txtIDProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNovo)
                    .addComponent(bntSalvarProd)
                    .addComponent(bntExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(lblListadeProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntSalvarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarProdActionPerformed
        // TODO add your handling code here:
        //Primeiro recuperar os dados preenchidos no form
        
        Produtos p = new Produtos();
        
        p.setId(Integer.parseInt(txtIDProd.getText()));
        p.setDescricao(txtDescricaoProd.getText());
        p.setQtdAtual(txtQtdAtual.getText());
        p.setValorUnit(txtValorUnit.getText());
        
        //conta valor total
        //int qtd = Integer.parseInt(qtdAtual);
        //int valorunit = Integer.parseInt(valorUnit);
        
        //int valorTot = qtd * valorunit;
        
        //exibição dos dados
        DefaultTableModel tabelaProduto = (DefaultTableModel) tblProdutos.getModel();
        
        Object[] novoProduto = new Object[]{
            p.getId(), //posição 1 do array
            p.getDescricao(), //posição 2 do array
            p.getQtdAtual(), //posição 3 do array
            p.getValorUnit(), //posição 4 do array
            p.getValorTot() //posição 5 do array
        };
        
        //add linhas
        tabelaProduto.addRow(novoProduto);  
        
        //add lista
        listaProdutos.add(p);
    }//GEN-LAST:event_bntSalvarProdActionPerformed

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
        // TODO add your handling code here:
        //limpar campos
        txtIDProd.setText("");
        txtDescricaoProd.setText("");
        txtQtdAtual.setText("");
        txtValorUnit.setText("");
    }//GEN-LAST:event_bntNovoActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        // TODO add your handling code here:
        //excluir um dado/linha
        int linhaSelect = tblProdutos.getSelectedRow(); //variavel para selecionar a linha
        
        //condição para ecluir a linha
        if(linhaSelect == -1){
            JOptionPane.showMessageDialog(this, "Por Favor Selecione uma linha!"); // menssagem
        }
        else {
            DefaultTableModel tabelaProduto = (DefaultTableModel) tblProdutos.getModel();
            tabelaProduto.removeRow(linhaSelect);
        } // fim da condição
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void tblProdutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMousePressed
        // TODO add your handling code here:
        //dois cliques muda a frame
        JTable tblProdutos =(JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = tblProdutos.rowAtPoint(point);
        Produtos aux = new Produtos();
         
        if (evt.getClickCount() == 2 && tblProdutos.getSelectedRow() != -1) {
            aux = listaProdutos.get(row);
            FormMovimento mov = new FormMovimento(aux);
            mov.setVisible(true);
            
        }
        
        
    }//GEN-LAST:event_tblProdutosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntSalvarProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricaoProd;
    private javax.swing.JLabel lblListadeProdutos;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQtdAtual;
    private javax.swing.JLabel lblValorUnit;
    private javax.swing.JLabel lbliDProd;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtDescricaoProd;
    private javax.swing.JTextField txtIDProd;
    private javax.swing.JTextField txtQtdAtual;
    private javax.swing.JTextField txtValorUnit;
    // End of variables declaration//GEN-END:variables
}
