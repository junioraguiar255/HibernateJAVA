/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author gabri
 */
@Entity
public class Autor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutor;
    private String nome;

    public Autor() {
    }

    public Autor(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    
    
    
    
}
