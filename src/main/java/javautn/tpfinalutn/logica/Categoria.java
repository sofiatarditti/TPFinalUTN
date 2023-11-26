
package javautn.tpfinalutn.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="Categoria")
public class Categoria implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id_categoria", unique = true)
    private int id_categoria;
    
    @Column(name = "descripcion_categoria", nullable = false)
    private String descripcion_categoria;

    public Categoria() {
    }

    public Categoria(int id_categoria, String descripcion_categoria) {
        this.id_categoria = id_categoria;
        this.descripcion_categoria = descripcion_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }
    
    
    
    
}
