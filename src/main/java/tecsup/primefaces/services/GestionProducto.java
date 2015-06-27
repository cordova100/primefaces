/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tecsup.primefaces.model.Categoria;
import tecsup.primefaces.model.Producto;

/**
 *
 * @author PCC-SABADO
 */
public class GestionProducto {

    public List<Categoria> listar() {

        Categoria cat = new Categoria(1l, "Libros");
        Categoria cat1 = new Categoria(2l, "Electronicos");
        Categoria cat2 = new Categoria(3l, "Niños");

        List<Categoria> categorias = Arrays.asList(cat, cat1, cat2);

        return categorias;

    }

    public List<Producto> listarPorCategoria(Long id) {

        List<Producto> productos = new ArrayList<Producto>();

        switch (id.intValue()) {

            case 1:
                productos.add(new Producto(1l, "Viajes de gulliver", "Intersanto"));
                productos.add(new Producto(2l, "la lista del tesoro", "Intersanto2"));
                productos.add(new Producto(3l, "Viajes de gulliver3", "Intersanto3"));
                break;

            case 2:

                productos.add(new Producto(4l, "Viajes de gulliver4", "Intersanto4"));
                productos.add(new Producto(5l, "Viajes de gulliver5", "Intersanto5"));
                productos.add(new Producto(6l, "Viajes de gulliver6", "Intersanto6"));
                break;
                
            case 3:

                productos.add(new Producto(7l, "Viajes de gulliver7", "Intersanto7"));
                productos.add(new Producto(8l, "Viajes de gulliver8", "Intersanto8"));
                productos.add(new Producto(9l, "Viajes de gulliver9", "Intersanto9"));
                break;

        }
        
        return productos;
    }
}
