
package javautn.tpfinalutn.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tecnico")
public class Tecnico implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id_tecnico", unique = true)
    private int id_tecnico;
    
    @Column(name = "nombreApellido", nullable = false)
    private String nombreApellido;

    public Tecnico() {
    }

    public Tecnico(int id_tecnico, String nombreApellido) {
        this.id_tecnico = id_tecnico;
        this.nombreApellido = nombreApellido;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    
    
    
}
