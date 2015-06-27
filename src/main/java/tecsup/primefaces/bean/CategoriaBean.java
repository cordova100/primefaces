/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.bean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;
import tecsup.primefaces.model.Categoria;
import tecsup.primefaces.model.Producto;
import tecsup.primefaces.services.GestionProducto;

/**
 *
 * @author PCC-SABADO
 */
@ManagedBean(name = "categoriaBean")
@RequestScoped
public class CategoriaBean  {

    private List<Categoria> categorias;
    private List<Producto> productos;

    public CategoriaBean() {
        GestionProducto negocio = new GestionProducto();
        categorias = negocio.listar();
        System.out.println("Total de categorías: " + categorias.size());

    }

    public void cargarProductos(Long idCategoria) {

        System.out.println("Dentro de cargarProductos()");
        GestionProducto negocio = new GestionProducto();

        productos = negocio.listarPorCategoria(idCategoria);
        System.out.println("Total de productos: " + productos.size());

    }

    public void onCellEdit(CellEditEvent event) {

        Object newValue = event.getNewValue();
        Object oldValue = event.getOldValue();

        DataTable o = (DataTable) event.getSource();
        Categoria objeto = (Categoria) o.getRowData();
        System.out.println(objeto.getId());

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Actualizado", "Antes: " + oldValue + ", Después:"
                    + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
