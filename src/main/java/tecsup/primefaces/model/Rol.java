/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.model;

import java.util.List;

/**
 *
 * @author lcordovas
 */
public class Rol {
    
   private Long id;
   private String nombre;
   private List<Usuario> usuarios;

    public Rol(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

   
   
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
   
   
    
}
