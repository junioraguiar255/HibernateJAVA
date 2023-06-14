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
public class Idioma implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdioma;
    private String lingua;

    public Idioma() {
    }

    public Idioma(String lingua) {
        this.lingua = lingua;
    }
    
    @Override
    public String toString() {
        return lingua;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }
    
    
}
