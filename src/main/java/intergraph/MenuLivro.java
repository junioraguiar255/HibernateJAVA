/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package intergraph;

import dominio.Autor;
import dominio.Genero;
import dominio.Idioma;
import dominio.Livro;
import gerTarefas.GerInterface;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class MenuLivro extends javax.swing.JDialog {

    /**
     * Creates new form menuLivro
     */
    private GerInterface gerIG;
    public MenuLivro(java.awt.Frame parent, boolean modal, GerInterface gerIG) {
        super(parent, modal);
        this.gerIG = gerIG;
        initComponents();
        cmbTipo.setSelectedIndex(1);//somente tipo por id
        cmbTipo.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox();
        jTextField13 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spnQtd = new javax.swing.JSpinner();
        cmbAutor = new javax.swing.JComboBox<>();
        txtAno = new javax.swing.JFormattedTextField();
        cmbIdioma = new javax.swing.JComboBox<>();
        cmbGenero = new javax.swing.JComboBox<>();
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
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraph/img/lupa.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        cmbTipo.setEditable(true);
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "ID" }));

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Livro"));

        lblNome.setText("Nome:");

        lblAutor.setText("Autor:");

        lblGenero.setText("Gênero:");

        lblAno.setText("Ano:");

        lblIdioma.setText("Idioma:");

        lblQtd.setText("Quantidade:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Foto");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "William Shakespeare", "Mark Twain", "Mark Twain", "J.K. Rowling" }));

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Inglês" }));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Comédia", "Terror", "Documentário" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblAutor)
                    .addComponent(lblGenero)
                    .addComponent(lblAno)
                    .addComponent(lblIdioma)
                    .addComponent(lblQtd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(cmbAutor, 0, 210, Short.MAX_VALUE)
                    .addComponent(spnQtd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAno)
                    .addComponent(cmbIdioma, javax.swing.GroupLayout.Alignment.TRAILING, 0, 210, Short.MAX_VALUE)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.Alignment.TRAILING, 0, 210, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutor)
                            .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdioma)
                            .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtd))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

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

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
            //pesquisa por id
            String idBusca = jTextField13.getText();
            
            Livro livro = gerIG.getGerDominio().findLivroByID(Integer.parseInt(idBusca));
            
            if(livro==null){
                JOptionPane.showMessageDialog(this, "Livro não encontrado.", "Biuscar livro", JOptionPane.INFORMATION_MESSAGE  );
            }
            
            
            txtNome.setText(livro.getNome());
            cmbAutor.setName(livro.getAutor().toString());
            cmbGenero.setName(livro.getGenero().toString());
            txtAno.setText(Integer.toString(livro.getAno()));
            cmbIdioma.setName(livro.getIdioma().toString());
            spnQtd.setValue(livro.getQtd());
            
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nome = txtNome.getText();
        
        Autor autorSelecionado = (Autor) cmbAutor.getSelectedItem();
        Genero generoSelecionado = (Genero) cmbGenero.getSelectedItem();
        Idioma idiomaSelecionado = (Idioma) cmbIdioma.getSelectedItem();
        
        String genero = cmbGenero.getSelectedItem().toString();
        String ano = txtAno.getText();
        String idioma = cmbIdioma.getSelectedItem().toString();
        //String qtd = txtQtd
        Livro livro = new Livro();
        livro.setNome(nome);
        livro.setAutor(autorSelecionado);
        livro.setGenero(generoSelecionado);
        livro.setAno(2023);
        livro.setQtd(1);
        livro.setIdioma(idiomaSelecionado);
        
        
        int id = gerIG.getGerDominio().inserirLivro(livro);
            JOptionPane.showMessageDialog(this, "Livro " + id + " inserido com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  );
        
        
        if(validarCampos() ){
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            gerIG.carregarComboAutores(cmbAutor);   // TODO add your handling code here:
            gerIG.carregarComboGeneros(cmbGenero);
            gerIG.carregarComboIdiomas(cmbIdioma);

        } catch (SQLException ex) {
            Logger.getLogger(MenuLivro.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jTextField13.getText());
        
        if(gerIG.getGerDominio().excluirLivro(id)){
            JOptionPane.showMessageDialog(this, "Livro " + id + " excluido com sucesso.", "Excluir Livro", JOptionPane.INFORMATION_MESSAGE  );
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao tentar excluir Livro " + id + ".", "Excluir Livro", JOptionPane.INFORMATION_MESSAGE  );
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             //Excluir por id
                int id = Integer.parseInt(jTextField13.getText());
                
                Livro livro = new Livro();
                livro.setIdLivro(id);
                livro.setNome(txtNome.getText());                
                Autor autorSelecionado = (Autor) cmbAutor.getSelectedItem();
                livro.setAutor(autorSelecionado);
                //fazer isso com os demais
                
                
                if(gerIG.getGerDominio().editarLivro(livro)){
            JOptionPane.showMessageDialog(this, "Livro " + id + " alterado com sucesso.", "Alterar Livro", JOptionPane.INFORMATION_MESSAGE  );
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao tentar alterar Livro " + id + ".", "Alterar Livro", JOptionPane.INFORMATION_MESSAGE  );
        }
                
                
                
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean validarCampos(){
        String nome = txtNome.getText();
        String autor = cmbAutor.getSelectedItem().toString();
        String genero = cmbGenero.getSelectedItem().toString();
        String ano = txtAno.getText();
        String idioma = cmbIdioma.getSelectedItem().toString();
        lblNome.setForeground(Color.black);
        lblAutor.setForeground(Color.black);
        lblGenero.setForeground(Color.black);
        lblAno.setForeground(Color.black);
        lblIdioma.setForeground(Color.black);
        
        
        String msgErro = "";
        
        if(nome.isEmpty()){
            msgErro = msgErro + "Digite o Nome.\n";
            lblNome.setForeground(Color.red);
        }
        if(autor.isEmpty()){
            msgErro = msgErro + "Digite o Autor.\n";
            lblAutor.setForeground(Color.red);
        }
        if(genero.isEmpty()){
            msgErro = msgErro + "Digite o Gênero.\n";
            lblGenero.setForeground(Color.red);
        }
        if(ano.equals("    ")){
            msgErro = msgErro + "Digite o Ano.\n";
            lblAno.setForeground(Color.red);
        }
        if(idioma.isEmpty()){
            msgErro = msgErro + "Digite o Idioma.\n";
            lblIdioma.setForeground(Color.red);
        }
        
        
        if(msgErro.isEmpty()){
            return true;
        }else
            JOptionPane.showMessageDialog(this, msgErro, "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbAutor;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}