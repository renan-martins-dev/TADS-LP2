package br.edu.ifsp.biblioteca.repository;

import br.edu.ifsp.biblioteca.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository {

    Optional<Usuario> findByEmailIgnoreCase(String email);

    boolean existsByEMailIgnoreCase(String email)

}
