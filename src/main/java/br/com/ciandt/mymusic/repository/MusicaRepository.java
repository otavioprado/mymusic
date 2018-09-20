package br.com.ciandt.mymusic.repository;

import org.springframework.stereotype.Repository;
import br.com.ciandt.mymusic.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long> {

}
