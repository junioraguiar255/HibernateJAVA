package intergraph;

import dominio.Autor;
import dominio.Endereco;
import dominio.Livro;
import dominio.Pessoa;
import gerTarefas.CorreiosAPI;
import gerTarefas.FuncoesUteis;
import gerTarefas.GerInterface;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.hibernate.HibernateException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class MenuPessoa extends javax.swing.JDialog {
   
        // Define o estilo para Metal

            // Caso ocorra algum erro ao configurar o estilo, trate aqui.
        
    /**
     * Creates new form menuPessoa
     * 
     * 
     */
    private GerInterface gerIG;
    public MenuPessoa(java.awt.Frame parent, boolean modal, GerInterface gerIG) {
        super(parent, modal);
        this.gerIG = gerIG;
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

        btnGrpSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblCel = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblCEP = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblReferencia = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCel = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraph/img/lupa.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lblNome.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF:");

        lblCel.setText("Celular:");

        lblData.setText("Data Nascimento:");

        lblEmail.setText("E-mail:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblSexo.setText("Sexo:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Foto");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGrpSexo.add(jRadioButton1);
        jRadioButton1.setMnemonic('M');
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Masculino");

        btnGrpSexo.add(jRadioButton2);
        jRadioButton2.setMnemonic('F');
        jRadioButton2.setText("Feminino");

        lblCEP.setText("CEP:");

        lblEndereco.setText("Endereço:");

        lblNumero.setText("Número:");

        lblComplemento.setText("Complemento:");

        lblCidade.setText("Cidade:");

        lblBairro.setText("Bairro:");

        lblReferencia.setText("Referência:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtCPF)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblCEP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtCEP))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblReferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCel)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCEP)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReferencia)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
            String idBusca = txtID.getText();
            
            Pessoa pessoa = gerIG.getGerDominio().findPessoaByID(Integer.parseInt(idBusca));
            
            
            txtNome.setText(pessoa.getNome());
            txtCPF.setText(pessoa.getCpf());
            txtCel.setText(pessoa.getCelular());
            Date dtNasc = pessoa.getDtNasc();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String dtNascString = formato.format(dtNasc);
            txtData.setText(dtNascString);
            txtEmail.setText(pessoa.getEmail());
            char sexoArmazenado = pessoa.getSexo(); // Valor obtido do banco de dados
            Enumeration<AbstractButton> buttons = btnGrpSexo.getElements();
            while (buttons.hasMoreElements()) {
                AbstractButton button = buttons.nextElement();
                if (button.getMnemonic() == sexoArmazenado) {
                    button.setSelected(true);
                    break;
                }
            }
            txtCEP.setText(pessoa.getCep());
            txtEndereco.setText(pessoa.getEnder());
            int num = pessoa.getNum();
            txtNumero.setText(String.valueOf(num));
            txtComplemento.setText(pessoa.getComple());
            txtCidade.setText(pessoa.getCidade());
            txtBairro.setText(pessoa.getBairro());
            txtReferencia.setText(pessoa.getReferencia());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String celular = txtCel.getText();
        String dtnas = txtData.getText();
        String email = txtEmail.getText();
        char sexo = (char) btnGrpSexo.getSelection().getMnemonic();
        String cep = txtCEP.getText();
        String endereco = txtEndereco.getText();
        String num = txtNumero.getText();
        String complemento = txtComplemento.getText();
        String cidade = txtCidade.getText();
        String bairro = txtBairro.getText();
        String referencia = txtReferencia.getText();       
        
        if ( validarCampos() ) {
            // INSERIR NO BANCO
            Date dt = null;
            try {
                dt = FuncoesUteis.strToDate(dtnas);
            } catch (ParseException ex) {
                Logger.getLogger(MenuPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
            int numero = Integer.parseInt(num);
            
            int id = gerIG.getGerDominio().inserirPessoa(bairro,celular,cep,cidade,complemento,cpf,dt,endereco,nome,numero,referencia,sexo, email);
            JOptionPane.showMessageDialog(this, "Cliente " + id + " inserido com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  );
           
            
        
        }
        
      
    
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
        String cep = txtCEP.getText();
        String cepEnder = cep.replace("-", "");
        Endereco endereco = CorreiosAPI.buscarEndereco(cepEnder);
 
        txtEndereco.setText(endereco.getLogradouro());
        txtBairro.setText(endereco.getBairro());
        txtCidade.setText(endereco.getLocalidade());
        txtComplemento.setText(endereco.getComplemento());
    }//GEN-LAST:event_txtCEPFocusLost

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
     
    }//GEN-LAST:event_formComponentShown

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int id = Integer.parseInt(txtID.getText());
        
        if(gerIG.getGerDominio().excluirPessoa(id)){
            JOptionPane.showMessageDialog(this, "Pessoa " + id + " excluido com sucesso.", "Excluir Pessoa", JOptionPane.INFORMATION_MESSAGE  );
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao tentar excluir Pessoa.", "Excluir Pessoa", JOptionPane.INFORMATION_MESSAGE  );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id = Integer.parseInt(txtID.getText());
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(id);
        pessoa.setNome(txtNome.getText());
        pessoa.setCpf(txtCPF.getText());
        pessoa.setCelular(txtCel.getText());
        String dataString = txtData.getText();
        DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataNascimento = formatoData.parse(dataString);
            pessoa.setDtNasc(dataNascimento);
        } catch (ParseException e) {
            // Lida com a exceção se a string não estiver no formato esperado
            e.printStackTrace();
        }
        //pessoa.setDtNasc(txtData.getText());
        pessoa.setEmail(txtEmail.getText());
        pessoa.setSexo((char) btnGrpSexo.getSelection().getMnemonic());
        pessoa.setCep(txtCEP.getText());
        pessoa.setEnder(txtEndereco.getText());
        pessoa.setNum(Integer.parseInt(txtNumero.getText()));
        //pessoa.setNum(txtNumero.getText());
        pessoa.setComple(txtComplemento.getText());
        pessoa.setCidade(txtCidade.getText());
        pessoa.setBairro(txtBairro.getText());
        pessoa.setReferencia(txtReferencia.getText());           
                
        if(gerIG.getGerDominio().editarPessoa(pessoa)){
            JOptionPane.showMessageDialog(this, "Pessoa " + id + " alterado com sucesso.", "Alterar Pessoa", JOptionPane.INFORMATION_MESSAGE  );
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao tentar alterar Pessoa " + id + ".", "Alterar Pessoa", JOptionPane.INFORMATION_MESSAGE  );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validarCampos(){
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String celular = txtCel.getText();
        String dtnas = txtData.getText();
        String email = txtEmail.getText();
        String cep = txtCEP.getText();
        String endereco = txtEndereco.getText();
        String num = txtNumero.getText();
        String cidade = txtCidade.getText();
        String bairro = txtBairro.getText();
        lblNome.setForeground(Color.black);
        lblCPF.setForeground(Color.black);
        lblCel.setForeground(Color.black);
        lblData.setForeground(Color.black);
        lblEmail.setForeground(Color.black);
        lblCEP.setForeground(Color.black);
        lblEndereco.setForeground(Color.black);
        lblNumero.setForeground(Color.black);
        lblCidade.setForeground(Color.black);
        lblBairro.setForeground(Color.black);
        
        String msgErro = "";
        
        if(nome.isEmpty()){
            msgErro = msgErro + "Digite seu nome.\n";
            lblNome.setForeground(Color.red);
        }
        if(cpf.equals("   .   .   -  ")){
            msgErro = msgErro + "Digite seu CPF.\n";
            lblCPF.setForeground(Color.red);
        }
        if(!validarCPF(cpf)){
            msgErro = msgErro + "Digite um CPF Válido.\n";
        }
        if(celular.equals("(  )      -    ")){
            msgErro = msgErro + "Digite seu Celular.\n";
            lblCel.setForeground(Color.red);
        }
        if(dtnas.equals("  /  /    ")){
            msgErro = msgErro + "Digite sua Data de Nascimento.\n";
            lblData.setForeground(Color.red);
        }
        if(email.isEmpty()){
            msgErro = msgErro + "Digite seu E-mail.\n";
            lblEmail.setForeground(Color.red);
        }
        if(cep.equals("     -   ")){
            msgErro = msgErro + "Digite seu CEP.\n";
            lblCEP.setForeground(Color.red);
        }
        if(endereco.isEmpty()){
            msgErro = msgErro + "Digite seu Endereco.\n";
            lblEndereco.setForeground(Color.red);
        }
        if(num.isEmpty()){
            msgErro = msgErro + "Digite seu Número.\n";
            lblNumero.setForeground(Color.red);
        } 
        if(cidade.isEmpty()){
            msgErro = msgErro + "Digite sua Cidade.\n";
            lblCidade.setForeground(Color.red);
        }
        if(bairro.isEmpty()){
            msgErro = msgErro + "Digite seu Bairro.\n";
            lblBairro.setForeground(Color.red);
        }
        
        
        
        
        if(msgErro.isEmpty()){
            return true;
        }else
            JOptionPane.showMessageDialog(this, msgErro, "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            return false;
    }
    public static boolean validarCPF(String cpf) {
        // Remover pontos e hífens do CPF
        cpf = cpf.replace(".", "").replace("-", "");

        // Verificar se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Calcular o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        // Calcular o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        // Verificar se os dígitos verificadores estão corretos
        return cpf.charAt(9) == Character.forDigit(digito1, 10)
                && cpf.charAt(10) == Character.forDigit(digito2, 10);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpSexo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblReferencia;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCel;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}