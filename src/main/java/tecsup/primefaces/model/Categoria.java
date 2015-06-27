/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.model;

import java.util.List;

/**
 *
 * @author PCC-SABADO
 */

public class Categoria {
    
    private Long id;
    private String descripcion;
    private List<Producto> productos;

    public Categoria(Long id, String descripcion) {
    
        this.id = id;
        this.descripcion = descripcion;
    
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }  
    
    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
