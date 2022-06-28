/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerPessoa;
import controller.ControllerProduto;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import model.Produto;

/**
 *
 * @author felipe
 */
public class ViewAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ViewAdmin
     */
    public ViewAdmin() throws SQLException {
        initComponents();
        this.labelErro.setVisible(false);
        this.labelErro1.setVisible(false);
        this.montaTabela();
        this.montaTabelaProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        textConfirmarSenha = new javax.swing.JPasswordField();
        textLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        radioButtonAdmin = new javax.swing.JRadioButton();
        labelErro = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textPreco = new javax.swing.JTextField();
        labelErro1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textNomeProduto = new javax.swing.JTextField();
        textTipo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jButton.setText("Adicionar");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        jLabel9.setText("Telefone");

        textConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConfirmarSenhaActionPerformed(evt);
            }
        });

        jLabel10.setText("Login");

        jLabel11.setText("Senha");

        jLabel12.setText("Admin");

        labelErro.setForeground(new java.awt.Color(255, 51, 51));
        labelErro.setText("Erro");

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Email", "Telefone", "Login", "Admin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(1).setHeaderValue("CPF");
            tabela.getColumnModel().getColumn(4).setHeaderValue("Login");
            tabela.getColumnModel().getColumn(5).setMaxWidth(60);
            tabela.getColumnModel().getColumn(5).setHeaderValue("Admin");
        }

        jLabel13.setText("Nome");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        jLabel14.setText("CPF");

        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });

        jLabel15.setText("Email");

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });

        jLabel16.setText("Confirmar Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textCpf)
                    .addComponent(textNome)
                    .addComponent(textEmail)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonAdmin)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(labelErro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(textConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButtonAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuários", jPanel1);

        textPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecoActionPerformed(evt);
            }
        });

        labelErro1.setForeground(new java.awt.Color(255, 51, 51));
        labelErro1.setText("Erro");

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Tipo", "Quantidade", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela1MouseClicked(evt);
            }
        });
        tabela1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabela1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabela1);

        jLabel20.setText("Preço");

        jLabel21.setText("Nome");

        textNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeProdutoActionPerformed(evt);
            }
        });

        jLabel23.setText("Tipo");

        jLabel24.setText("Quantidade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelErro1))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(38, 38, 38)
                .addComponent(labelErro1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Produtos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton)
                    .addComponent(buttonVoltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        if(this.jTabbedPane1.getSelectedIndex() == 1){
            String nome = this.textNomeProduto.getText();
            float preco = Float.parseFloat(this.textPreco.getText());
            String tipo = this.textTipo.getText();
            int quantidade = (int) this.jSpinner.getValue();
            
            Produto produto = new Produto(nome, preco, tipo, quantidade, 1);
            
            if(ControllerProduto.insere(produto)){
                this.labelErro1.setText("Cadastrado com sucesso!");
                this.labelErro1.setForeground(new Color(8, 163, 0));
                
                this.textNomeProduto.setText(null);
                this.textPreco.setText(null);
                this.textTipo.setText(null);
                this.jSpinner.setValue(0);
            }
            else{
                this.labelErro.setText("Erro");
                this.labelErro.setForeground(Color.red);
            }
            this.labelErro1.setVisible(true);
            try {
                montaTabelaProdutos();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
        
        String nome = this.textNome.getText();
        String cpf = this.textCpf.getText();
        String email = this.textEmail.getText();
        String telefone = this.textTelefone.getText();
        String login = this.textLogin.getText();
        String senha = this.textSenha.getText();
        String senhaConfirmada = this.textConfirmarSenha.getText();
        int nivelDeAcesso;
        if(this.radioButtonAdmin.isSelected()){
            nivelDeAcesso = 1;
        }
        else{
            nivelDeAcesso = 0;
        }
        
        if(!senha.equals(senhaConfirmada)){
            this.labelErro.setText("Confirmação de senha inválida");
            this.labelErro.setForeground(Color.red);
            this.labelErro.setVisible(true);
            return;
        }
        
        Pessoa pessoa = new Pessoa(1, nivelDeAcesso, nome, email, telefone, cpf, login, senha);
        try {
            if(ControllerPessoa.cadastro(pessoa)){
                this.labelErro.setText("Cadastrado com sucesso!");
                this.labelErro.setForeground(new Color(8, 163, 0));
                
                this.textConfirmarSenha.setText(null);
                this.textCpf.setText(null);
                this.textEmail.setText(null);
                this.textLogin.setText(null);
                this.textNome.setText(null);
                this.textSenha.setText(null);
                this.textTelefone.setText(null);
                this.radioButtonAdmin.setSelected(false);
            }
            else{
                this.labelErro.setText("Erro");
                this.labelErro.setForeground(Color.red);
            }
            this.labelErro.setVisible(true);
            this.montaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            this.montaTabela();
            this.montaTabelaProdutos();
        } catch (SQLException ex) {
            Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void textConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConfirmarSenhaActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if(evt.getClickCount() == 2){
            JTable clicked = (JTable) evt.getSource();
            int linha = clicked.getSelectedRow();
            String cpf = (String) this.tabela.getValueAt(linha, 1);
            Pessoa pessoa;
            try {
                pessoa = ControllerPessoa.getPessoa(cpf);
                new ViewUsuario(pessoa, true).setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                this.montaTabela();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DELETE){           
            int [] selecionados = this.tabela.getSelectedRows();
            
            JOptionPane optionPane = new JOptionPane();
            int resposta = optionPane.showConfirmDialog(null, "Tem ceretza que deseja apagar os itens selecionados?", "Excluir itens", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION){
                for(int i = 0; i < selecionados.length; i++){
                    try {
                        ControllerPessoa.deletaPessoa((String) this.tabela.getValueAt(selecionados[i], 1));
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_tabelaKeyPressed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecoActionPerformed

    private void tabela1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela1MouseClicked
        if(evt.getClickCount() == 2){
            JTable clicked = (JTable)evt.getSource();
            int linha = clicked.getSelectedRow();
            String nome = (String) this.tabela1.getValueAt(linha, 0);
            float preco = (float) this.tabela1.getValueAt(linha, 1);
            String tipo = (String) this.tabela1.getValueAt(linha, 2);
            int quantidade = (int) this.tabela1.getValueAt(linha, 3);
            
            try {
                Produto produto = ControllerProduto.getProduto(nome, preco, tipo, quantidade);
                new ViewProduto(produto).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tabela1MouseClicked

    private void tabela1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela1KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_DELETE){           
            int [] selecionados = this.tabela1.getSelectedRows();
            
            JOptionPane optionPane = new JOptionPane();
            int resposta = optionPane.showConfirmDialog(null, "Tem ceretza que deseja apagar os itens selecionados?", "Excluir itens", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION){
                for(int i = 0; i < selecionados.length; i++){
                    Produto produto = new Produto();
                    produto.setNome((String) this.tabela1.getValueAt(selecionados[i], 0));
                    produto.setPreco((Float) this.tabela1.getValueAt(selecionados[i], 1));
                    produto.setQuantidade((Integer) this.tabela1.getValueAt(selecionados[i], 3));
                    produto.setTipo((String) this.tabela1.getValueAt(selecionados[i], 2));
                    try {
                        ControllerProduto.deletaProduto(produto);
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return;
            }
            
            return;
        }
    }//GEN-LAST:event_tabela1KeyPressed

    private void textNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeProdutoActionPerformed
    
    public void montaTabela() throws SQLException{
        List<Pessoa> lista = ControllerPessoa.getPessoas();
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
        Object rowData [] = new Object[8];
        for(int i = 0; i < lista.size(); i++){
            rowData[0] = lista.get(i).getNome();
            rowData[1] = lista.get(i).getCpf();
            rowData[2] = lista.get(i).getEmail();
            rowData[3] = lista.get(i).getTelefone();
            rowData[4] = lista.get(i).getLogin();
            int acesso = lista.get(i).getNivelDeAcesso();
            if(acesso == 0){
                rowData[5] = "Não";
            }
            else{
                rowData[5] = "Sim";
            }
            
            model.addRow(rowData);
        }
    }
    
    public void montaTabelaProdutos() throws SQLException{
        List<Produto> lista = ControllerProduto.getProdutos();
        
        DefaultTableModel model = (DefaultTableModel) tabela1.getModel();
        model.setRowCount(0);
        Object rowData [] = new Object[5];
        for(int i = 0; i < lista.size(); i++){
            rowData[0] = lista.get(i).getNome();
            rowData[1] = lista.get(i).getPreco();
            rowData[2] = lista.get(i).getTipo();
            rowData[3] = lista.get(i).getQuantidade();
            rowData[4] = lista.get(i).getStatus();
            model.addRow(rowData);
        }
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
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewAdmin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelErro1;
    private javax.swing.JRadioButton radioButtonAdmin;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JPasswordField textConfirmarSenha;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNomeProduto;
    private javax.swing.JTextField textPreco;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textTelefone;
    private javax.swing.JTextField textTipo;
    // End of variables declaration//GEN-END:variables
}
