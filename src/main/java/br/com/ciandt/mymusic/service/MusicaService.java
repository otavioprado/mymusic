package br.com.ciandt.mymusic.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import br.com.ciandt.mymusic.model.Musica;

@Validated
public interface MusicaService {

    List<Musica> listarMusicas(@Valid @Size(min = 3, max = 200) String filtro);

}
