package com.certus.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certus.model.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

}
