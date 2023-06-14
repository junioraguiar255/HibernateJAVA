/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerTarefas;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.LivroDAO;
import dao.PessoaDAO;
import dominio.Autor;
import dominio.Endereco;
import dominio.Genero;
import dominio.Idioma;
import dominio.Livro;
import dominio.Pessoa;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author gabri
 */
public class GerDominio {
    private GenericDAO genDAO;
    private PessoaDAO pesDAO;
    private LivroDAO livroDAO;
    public GerDominio() {
        ConexaoHibernate.getSessionFactory();
        pesDAO = new PessoaDAO();
        genDAO = new GenericDAO();
        livroDAO = new LivroDAO();
    }
    

    public int inserirPessoa(String bairro, String celular, String cep, String cidade, String complemento, String cpf, Date dt, String endereco, String nome, int numero, String referencia, char sexo, String email) {
        Pessoa pes = new Pessoa(bairro,celular,cep,cidade,complemento,cpf,dt,endereco,nome,numero,referencia,sexo,email);
        pesDAO.inserir(pes);
        return pes.getIdPessoa();
    }
    
    public int inserirLivro(Livro livro){
       livroDAO.inserir(livro);
       return livro.getIdLivro();
    }
    
    public void inserirAutor(String nome){
        Autor aut = new Autor(nome);
        genDAO.inserir(aut);
    }
    public void inserirGenero(String nome){
        Genero gen = new Genero(nome);
        genDAO.inserir(gen);
    }
    public void inserirIdioma(String nome){
        Idioma idi = new Idioma(nome);
        genDAO.inserir(idi);
    }
    public List<Autor> listarAutores(){
        return genDAO.listar(Autor.class);
    }
    public List<Genero> listarGeneros(){
        return genDAO.listar(Genero.class);
    }
    public List<Idioma> listarIdiomas(){
        return genDAO.listar(Idioma.class);
    }
    public List<Livro> listarLivros(){
        return genDAO.listar(Livro.class);
    }
    
    public Pessoa findPessoaByID(Integer id){
        return (Pessoa) genDAO.get(Pessoa.class,id);
    }
    public Pessoa findPessoaByCPF(String cpf) {
        return (Pessoa) genDAO.getByString(Pessoa.class,cpf,"cpf");
    }

    public Livro findLivroByID(Integer id){
        return (Livro) livroDAO.get(Livro.class,id);
    }
        
    public boolean excluirPessoa(int id){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(id);
        genDAO.excluir(pessoa);
        return true;
    }
    public boolean editarPessoa(Pessoa pessoa){
        genDAO.alterar(pessoa);
        return true;
    }
    public boolean excluirLivro(int id){
        Livro livro = new Livro();
        livro.setIdLivro(id);
        livroDAO.excluir(livro);
        return true;
    }
        
    public boolean editarLivro(Livro livro){
        livroDAO.alterar(livro);
        return true;
    }
}
