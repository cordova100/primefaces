/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import tecsup.primefaces.model.Categoria;
import tecsup.primefaces.model.Producto;
import tecsup.primefaces.services.GestionProducto;

/**
 *
 * @author lcordovas
 */
@ManagedBean(name = "productoBean")
@RequestScoped
public class ProductoBean {

    private int idProducto;
    private String nombre;
    private String descripcion;
    private float precio;
    private List<Producto> productos;
    private Producto seleccionado;

    public ProductoBean() {
        
        GestionProducto negocio = new GestionProducto();
        List<Categoria> categorias = negocio.listar();
        
        for (Categoria categoria : categorias) {
            productos = negocio.listarPorCategoria(categoria.getId());
        }       
      
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Producto getSeleccionado() {
        return seleccionado;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setSeleccionado(Producto seleccionado) {
        this.seleccionado = seleccionado;
    }

}
