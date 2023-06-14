/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author gabri
 */
@Entity
public class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPessoa;
    
    @Column(length=200)
    private String nome;
    
    @Column(updatable = false, length = 14, nullable = false)
    private String cpf;
    private String celular;
    @Column(updatable = false)
    @Temporal(TemporalType.DATE)
    private Date dtNasc;
    
    @Column(length = 1)
    private char sexo;
    
    @Column(length = 9)
    private String cep;
    private String ender;
    private String email;
    private int num;
    private String comple;
    private String cidade;
    private String bairro;
    private String referencia;


    public Pessoa() {
    }

    public Pessoa(String bairro, String celular, String cep, String cidade, String complemento, String cpf, Date dtnas, String endereco, String nome, int num, String referencia, char sexo, String email) {
    this.bairro = bairro;
    this.celular = celular;
    this.cep = cep;
    this.cidade = cidade;
    this.comple= complemento;
    this.cpf = cpf;
    this.dtNasc= dtnas;
    this.ender = endereco;
    this.nome = nome;
    this.num = num;
    this.referencia = referencia;
    this.sexo = sexo;
    this.email = email;
    }
    
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComple() {
        return comple;
    }

    public void setComple(String comple) {
        this.comple = comple;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
