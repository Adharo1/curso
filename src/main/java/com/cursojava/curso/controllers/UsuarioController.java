package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Fabian");
        usuario.setApellido("Falcón");
        usuario.setEmail("dfalconlainez@gmail.com");
        usuario.setTelefono("960887747");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario141")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Fabian");
        usuario.setApellido("Falcón");
        usuario.setEmail("dfalconlainez@gmail.com");
        usuario.setPassword("960887747");
        return usuario;
    }

    @RequestMapping(value = "usuario2412")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Fabian");
        usuario.setApellido("Falcón");
        usuario.setEmail("dfalconlainez@gmail.com");
        usuario.setPassword("960887747");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Fabian");
        usuario.setApellido("Falcón");
        usuario.setEmail("dfalconlainez@gmail.com");
        usuario.setPassword("960887747");
        return usuario;
    }
}
