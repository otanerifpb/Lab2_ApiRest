package br.edu.ifpb.progdist.lab2_apirest.service;

import br.edu.ifpb.progdist.lab2_apirest.dao.UsuariosDAO;
import br.edu.ifpb.progdist.lab2_apirest.model.Usuario;

import java.util.List;
import java.util.Optional;

public class UsuariosService {
    private UsuariosDAO usuariosDAO = new UsuariosDAO();

    public List<Usuario> getUsuarios() {
        return usuariosDAO.getUsuarios();
    }

    public Usuario getUsuarioPorCodigo(int codigo) {
        Usuario usuarioPesquisado = null;
        Optional<Usuario> optUsuario = getUsuarios().stream()
                .filter(usuario -> usuario.getCodigo() == codigo)
                .findFirst();

        if(optUsuario.isPresent()) {
            usuarioPesquisado = optUsuario.get();
            System.out.println("Usuário(a) " +usuarioPesquisado.getNome()+ " encontrado(a) com sucesso!");
        } else {
            System.out.println("Usuário(a) com o código " +codigo+ " não está cadastrado(a) no sistema!");
        }
        return usuarioPesquisado;
    }
}
