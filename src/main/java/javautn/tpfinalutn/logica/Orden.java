
package javautn.tpfinalutn.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Orden")
public class Orden implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_orden;
    
    @Column(name = "descripcion_orden", nullable = false)
    private String descripcion_orden;
    
    @Column(name = "costo", nullable = false)
    private double costo;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_orden", nullable = false)
    private Date fecha_orden;
    
    @Column(name = "estado", nullable = false)
    private String estado;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cliente_dni")
    private Cliente cliente;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="categoria_id")
    private Categoria categoria;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tecnico_id")
    private Tecnico tecnico;

    
    
    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public String getDescripcion_orden() {
        return descripcion_orden;
    }

    public void setDescripcion_orden(String descripcion_orden) {
        this.descripcion_orden = descripcion_orden;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha_orden() {
        return fecha_orden;
    }

    public void setFecha_orden(Date fecha_orden) {
        this.fecha_orden = fecha_orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
