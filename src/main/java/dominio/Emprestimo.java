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
public class Emprestimo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmprestimo;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idPessoa")
    private Pessoa pessoa;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idLivro")
    private Livro livro;
    @Temporal (TemporalType.DATE)
    private Date dtEmprestimo;
    @Temporal (TemporalType.DATE)
    private Date dtPrevista;

    public Emprestimo() {
    }
    
    
    
}
