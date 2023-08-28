package br.edu.ifpb.progdist.lab2_apirest.controller;

import br.edu.ifpb.progdist.lab2_apirest.model.Usuario;
import br.edu.ifpb.progdist.lab2_apirest.service.UsuariosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private UsuariosService usuariosService = new UsuariosService();

    @GetMapping("/lista")
    public List<Usuario> getUsuarios() {
        return usuariosService.getUsuarios();
    }

    @GetMapping("/{codigo}")
    public Usuario getUsuarioPorCodigo(@PathVariable int codigo) {
        return this.usuariosService.getUsuarioPorCodigo(codigo);
    }
}
