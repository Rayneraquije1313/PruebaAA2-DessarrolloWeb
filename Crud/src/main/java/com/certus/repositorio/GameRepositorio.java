package com.certus.repositorio;


import com.certus.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepositorio extends JpaRepository<Game,Long> {
}
