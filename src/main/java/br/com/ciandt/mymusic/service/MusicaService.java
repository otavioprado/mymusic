package br.com.ciandt.mymusic.service;

import br.com.ciandt.mymusic.model.Musica;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Validated
public interface MusicaService {

    List<Musica> listarMusicas(@Size(min = 3) @Valid String filtro);

}
