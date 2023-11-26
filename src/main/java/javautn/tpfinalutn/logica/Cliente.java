
package javautn.tpfinalutn.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {
    
    @Id
    @Column (name="dni", unique = true)
    private int dni;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "direccion", nullable = false)
    private String direccion;
    
    @Column(name = "mail", nullable = false)
    private String mail;

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String direccion, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
