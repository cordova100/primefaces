/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lcordovas
 */
@ManagedBean(name = "fechaBean")
@RequestScoped
public class FechaBean {

    private Date fecha;
    private String fechaMinima;
    private String fechaMaxima;

    public FechaBean() {
        fechaMinima = "2014-09-18";
        fechaMaxima = "2014-09-24";
    }

    public Date getFecha() {
        return fecha;
    }

    public String getFechaMinima() {
        return fechaMinima;
    }

    public String getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setFechaMinima(String fechaMinima) {
        this.fechaMinima = fechaMinima;
    }

    public void setFechaMaxima(String fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }

    
    
}
