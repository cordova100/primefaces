/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import tecsup.primefaces.model.Rol;
import tecsup.primefaces.model.Usuario;
import tecsup.primefaces.services.GestionRol;

/**
 *
 * @author lcordovas
 */
@ManagedBean(name="rolBean")
@RequestScoped
public class RolBean {
    
    private List<Rol> roles;
    private List<Usuario> usuarios;
    private Usuario seleccionado;

    public RolBean() {
        
        GestionRol generar = new GestionRol();
        roles = generar.listarrol();
         System.out.println("Total de roles: " + roles.size());
                
    }

    public Usuario getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Usuario seleccionado) {
        this.seleccionado = seleccionado;
    }
       

    public  void cargarUsuarios(Long id){
    
        GestionRol generar = new GestionRol();
        usuarios = generar.listarPorUsuario(id);       
        
    }
    
    public List<Rol> getRoles() {
        return roles;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
