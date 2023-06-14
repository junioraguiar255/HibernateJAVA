/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerTarefas;

import dominio.Autor;
import dominio.Genero;
import dominio.Idioma;
import dominio.Livro;
import intergraph.MenuBuscar;
import intergraph.MenuEmprestimo;
import intergraph.MenuLivro;
import intergraph.MenuPessoa;
import intergraph.MenuPrincipal;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author gabri
 */
public class GerInterface {

    MenuPrincipal mnuPrincipal = null;
    MenuEmprestimo mnuEmprestimo = null;
    MenuBuscar mnuBuscar = null;
    MenuLivro mnuLivro = null;
    MenuPessoa mnuPessoa = null;
    GerDominio gerDominio;
    
    public GerInterface() {
        try {
            gerDominio = new GerDominio();
        } catch (HibernateException  ex) {
            JOptionPane.showMessageDialog(mnuPrincipal, "Erro de conexão com o banco. " + ex.getMessage() );
                System.exit(-1);
        } 
    }
    
    public GerDominio getGerDominio() {
        return gerDominio;
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerInterface.class ).newInstance(parent,true,this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() );
            } 
        }        
        dlg.setVisible(true); 
        return dlg;
    }
    
    public void abrirJanPrincipal(){
        if(mnuPrincipal == null){
            mnuPrincipal = new MenuPrincipal(this);    
        }
        mnuPrincipal.setVisible(true);
    }    
    public void abrirJanEmprestimo(){
        abrirJanela(mnuPrincipal,mnuEmprestimo,MenuEmprestimo.class);
    }
    public void abrirJanCadPessoa(){
        abrirJanela(mnuPrincipal,mnuPessoa,MenuPessoa.class);
    }
    public void abrirJanCadLivro(){
        abrirJanela(mnuPrincipal,mnuLivro,MenuLivro.class);
    }
    public void abrirJanBuscar(){
        abrirJanela(mnuPrincipal,mnuBuscar,MenuBuscar.class);
    }
    public void carregarComboAutores(JComboBox combo) throws SQLException{
        List<Autor> lista = gerDominio.listarAutores();
        combo.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    public void carregarComboGeneros(JComboBox combo) throws SQLException{
        List<Genero> lista = gerDominio.listarGeneros();
        combo.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    public void carregarComboIdiomas(JComboBox combo) throws SQLException{
        List<Idioma> lista = gerDominio.listarIdiomas();
        combo.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    public void carregarComboLivros(JComboBox combo) throws SQLException{
        List<Livro> lista = gerDominio.listarLivros();
        combo.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    
    public static void main(String args[]) {
        //Inicializando Interface
        GerInterface gerIG = new GerInterface();
        /*
        //Dando insert nos autores
        gerIG.gerDominio.inserirAutor("William Shakespeare");
        gerIG.gerDominio.inserirAutor("J.K. Rowling");
        gerIG.gerDominio.inserirAutor("George Orwell");
        
        //Dando insert nos generos
        gerIG.gerDominio.inserirGenero("Comédia");
        gerIG.gerDominio.inserirGenero("Romance");
        gerIG.gerDominio.inserirGenero("Aventura");
        
        gerIG.gerDominio.inserirIdioma("Português");
        gerIG.gerDominio.inserirIdioma("Inglês");
        gerIG.gerDominio.inserirIdioma("Espanhol");
        */
        gerIG.abrirJanPrincipal();
    }
    
}
