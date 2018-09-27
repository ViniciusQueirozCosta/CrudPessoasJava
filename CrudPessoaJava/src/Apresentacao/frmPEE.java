
package Apresentacao;

import Modelo.Controle;
import Modelo.Pessoa;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmPEE extends javax.swing.JDialog
{

    /**
     * Creates new form frmPEE
     */
    public frmPEE(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        btnPesquisarPorID = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txfID = new javax.swing.JTextField();
        txfNome = new javax.swing.JTextField();
        txfCPF = new javax.swing.JTextField();
        txfRG = new javax.swing.JTextField();
        btnPesquisarPorNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa, Edição e Exclusão");
        setResizable(false);

        lblID.setText("ID:");

        lblNome.setText("Nome");

        lblRG.setText("RG:");

        lblCPF.setText("CPF:");

        btnPesquisarPorID.setText("Pesquisar por ID");
        btnPesquisarPorID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarPorIDActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        txfID.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txfIDKeyPressed(evt);
            }
        });

        txfNome.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txfNomeKeyPressed(evt);
            }
        });

        btnPesquisarPorNome.setText("Pesquisar por nome");
        btnPesquisarPorNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarPorNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisarPorNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(btnPesquisarPorID))
                                    .addComponent(lblID)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExcluir)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfNome)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisarPorNome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluir)
                            .addComponent(btnEditar))
                        .addGap(20, 20, 20))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarPorID()
    {
        
        ArrayList DadosPessoa = new ArrayList();
        Pessoa pessoa = new Pessoa();
        DadosPessoa.add(0, txfID.getText());
        Modelo.Controle controle = new Controle();
        pessoa = controle.PesquisarPessoaPorID(DadosPessoa);
        if(controle.mensagem.equals(""))
        {
            txfID.setText(Integer.toString(pessoa.id));
            txfNome.setText(pessoa.nome);
            txfRG.setText(pessoa.rg);
            txfCPF.setText(pessoa.cpf);
        }
        else
            JOptionPane.showMessageDialog(null, controle.mensagem);
        
    }
    
    private void PesquisarPorNome()
    {
        
        JOptionPane.showMessageDialog(null, "Not implemented yet");
        
    }
    
    private void btnPesquisarPorIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarPorIDActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarPorIDActionPerformed
        
        PesquisarPorID();
        
    }//GEN-LAST:event_btnPesquisarPorIDActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        ArrayList DadosPessoa = new ArrayList();
        Pessoa pessoa = new Pessoa();
        DadosPessoa.add(0, txfID.getText());
        Modelo.Controle controle = new Controle();
        controle.ExcluirPessoa(DadosPessoa);
        JOptionPane.showMessageDialog(null, controle.mensagem);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed

        ArrayList DadosPessoa = new ArrayList();
        Pessoa pessoa = new Pessoa();
        DadosPessoa.add(0, txfID.getText());
        DadosPessoa.add(1, txfNome.getText());
        DadosPessoa.add(2, txfRG.getText());
        DadosPessoa.add(3, txfCPF.getText());
        Modelo.Controle controle = new Controle();
        controle.EditarPessoa(DadosPessoa);
        JOptionPane.showMessageDialog(null, controle.mensagem);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void txfIDKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txfIDKeyPressed
    {//GEN-HEADEREND:event_txfIDKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            PesquisarPorID();
        
    }//GEN-LAST:event_txfIDKeyPressed

    private void txfNomeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txfNomeKeyPressed
    {//GEN-HEADEREND:event_txfNomeKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            PesquisarPorNome();
        
    }//GEN-LAST:event_txfNomeKeyPressed

    private void btnPesquisarPorNomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarPorNomeActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarPorNomeActionPerformed

        PesquisarPorNome();
        
    }//GEN-LAST:event_btnPesquisarPorNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPEE dialog = new frmPEE(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisarPorID;
    private javax.swing.JButton btnPesquisarPorNome;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRG;
    private javax.swing.JTextField txfCPF;
    private javax.swing.JTextField txfID;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfRG;
    // End of variables declaration//GEN-END:variables
}