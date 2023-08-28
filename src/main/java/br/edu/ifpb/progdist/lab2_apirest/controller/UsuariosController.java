package br.edu.ifpb.progdist.lab2_apirest.controller;

import br.edu.ifpb.progdist.lab2_apirest.model.Usuario;
import br.edu.ifpb.progdist.lab2_apirest.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

}
