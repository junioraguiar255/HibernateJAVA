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
public class Genero implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGenero;
    private String tipo;

    public Genero() {
    }

    public Genero(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return tipo;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
