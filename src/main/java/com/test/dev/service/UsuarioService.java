package com.test.dev.service;

import com.test.dev.entitie.Usuario;
import com.test.dev.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario editarUsuario(Long id, Usuario usuarioActualizado) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setPicture_large(usuarioActualizado.getPicture_large()); // picture_large
            usuario.setName_title(usuarioActualizado.getName_title());       // name_title
            usuario.setFirst_name(usuarioActualizado.getFirst_name());       // first_name
            usuario.setLast_name(usuarioActualizado.getLast_name());         // last_name
            usuario.setGender(usuarioActualizado.getGender());             // gender
            usuario.setPhone(usuarioActualizado.getPhone());               // phone
            usuario.setEmail(usuarioActualizado.getEmail());               // email
            usuario.setState(usuarioActualizado.getState());               // state
            usuario.setCity(usuarioActualizado.getCity());                 // city
            usuario.setPostcode(usuarioActualizado.getPostcode());         // postcode
            return usuarioRepository.save(usuario);
        }).orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }


    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
