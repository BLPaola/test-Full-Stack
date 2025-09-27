package com.test.dev.controller;

import com.test.dev.entitie.Usuario;
import com.test.dev.repository.UsuarioRepository;
import com.test.dev.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:3004")
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final ApplicationEventPublisher applicationEventPublisher;

    public UsuarioController(UsuarioService usuarioService, ApplicationEventPublisher applicationEventPublisher) {
        this.usuarioService = usuarioService;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    //Listar todos
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    // Agregar
    @PostMapping
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.agregarUsuario(usuario));
    }

    //  Editar usuario
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> editarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.editarUsuario(id, usuario));
    }

    //  Eliminar usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
