package view;

import controller.Produto;
import fachada.Fachada;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class EstoqueView extends javax.swing.JFrame {
    private DefaultTableModel dtmEstoque;
    private static Fachada fachada;
    private Boolean ehPrimeiraVez = true;
    
    public EstoqueView(Fachada fachada) {
        initComponents();
        this.fachada = fachada;
        dtmEstoque = (DefaultTableModel) jTableProdutos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jTableProdutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jTextFieldProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto");

        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade");

        jButtonAdicionar.setBackground(new java.awt.Color(153, 255, 153));
        jButtonAdicionar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ESTOQUE");

        jButtonExcluir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(298, 298, 298))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButtonAdicionar)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        //Adiciona um produto a tabela e ao Banco de Dados
        //=================VARIAVEIS=================
        //Pega os textos
        String produtoNome = jTextFieldProduto.getText();
        Integer produtoQuantidade;
        
        //Algumas formatações do texto
        if(jTextFieldQuantidade.getText().isBlank()){
            produtoQuantidade = 0;
        } else {
            try{
                produtoQuantidade = Integer.parseInt(jTextFieldQuantidade.getText());
            } catch(NumberFormatException err){
                produtoQuantidade = 0;
            }
        }
        
        ArrayList<Produto> produtos = fachada.retornarProdutos();        //Pede a fachada para retornar os produtos que estão no Banco de dados
        //=============================================
        //Se a fachada conseguir adicionar o produto(passando pelas validações)
        if(fachada.adicionarProduto(produtoNome, produtoQuantidade)){
            //Caso seja a primeira vez que esteja sendo usado, ele adicionara somente um dado na tabela
            if(ehPrimeiraVez){
                Object[] dado = {produtos.get(0).getNome(), produtos.get(0).getQuantidade()};
                dtmEstoque.addRow(dado);

                ehPrimeiraVez = false;
            } else {
                //Caso não, ele adicionara todos os produtos existentes na tabela 
                for(int i = 0; i < produtos.size(); i++){
                    Object[] dado = {produtos.get(i).getNome(), produtos.get(i).getQuantidade()};
                    dtmEstoque.addRow(dado);
                }

            }
        }
        
        
        
        //Limpa a variavel de produtos;
        produtos.clear();

    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void jTextFieldProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProdutoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String produtoNome = jTextFieldProduto.getText();
        //Procura o produto digitado na tabela, se encontrar, exclui ele.
        for(int i = 0; i < dtmEstoque.getRowCount(); i++){
            if(dtmEstoque.getValueAt(i, 0).equals(produtoNome)){
                dtmEstoque.removeRow(i);
                fachada.removerProduto(produtoNome);
            } else {
                System.out.println("Produto não encontrado!");
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueView(fachada).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
