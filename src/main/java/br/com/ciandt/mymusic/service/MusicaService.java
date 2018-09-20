package br.com.ciandt.mymusic.service;

import br.com.ciandt.mymusic.model.Musica;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.List;

@Validated
public interface MusicaService {

    List<Musica> listarMusicas(@Valid @Size(min = 3, max = 200) String filtro);

}
