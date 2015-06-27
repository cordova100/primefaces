/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsup.primefaces.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tecsup.primefaces.model.Rol;
import tecsup.primefaces.model.Usuario;

/**
 *
 * @author lcordovas
 */
public class GestionRol {

    public List<Rol> listarrol() {

        Rol r1 = new Rol(1L, "Administrador");
        Rol r2 = new Rol(2L, "Supervisor");
        Rol r3 = new Rol(3L, "Terapeuta");
        Rol r4 = new Rol(4L, "Apoderado");

        List<Rol> roles = Arrays.asList(r1, r2, r3, r4);

        return roles;

    }

    public List<Usuario> listarPorUsuario(Long id) {

        List<Usuario> usuarios = new ArrayList<Usuario>();

        switch (id.intValue()) {

            case 1:
                usuarios.add(new Usuario(1l, "Luis", "Cordova", "Saldaña", "cordova100@gmail.com"));
                usuarios.add(new Usuario(2l, "Chaly", "Cordova", "Saldaña", "chaly@gmail.com"));
                usuarios.add(new Usuario(3l, "Mili", "Cordova", "Saldaña", "mili@gmail.com"));

                break;

            case 2:

                usuarios.add(new Usuario(4l, "Carlos", "rodriguez", "Saldaña", "cordova100@perumail.com"));
                usuarios.add(new Usuario(5l, "Claudia", "Rodriguez", "Saldaña", "chaly@perumail.com"));
                usuarios.add(new Usuario(6l, "Angel", "Rodriguez", "Saldaña", "mili@perumail.com"));
                break;

            case 3:

                usuarios.add(new Usuario(7l, "Raquel", "Bautista", "Saldaña", "cordova100@mail.com"));
                usuarios.add(new Usuario(8l, "Erasmo", "Bautista", "Saldaña", "chaly@mail.com"));
                usuarios.add(new Usuario(9l, "Leticia", "Bautista", "Saldaña", "mili@mail.com"));
                break;

            case 4:

                usuarios.add(new Usuario(9l, "Raquel", "Vera", "Saldaña", "cordova100@hotmail.com"));
                usuarios.add(new Usuario(10l, "Patricia", "Vera", "Saldaña", "chaly@hotmail.com"));
                usuarios.add(new Usuario(11l, "Jorge", "Vera", "Saldaña", "mili@hotmail.com"));
                break;

        }

        return usuarios;
    }
}
