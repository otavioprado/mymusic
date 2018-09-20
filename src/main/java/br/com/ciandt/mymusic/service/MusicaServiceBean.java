package br.com.ciandt.mymusic.service;

import br.com.ciandt.mymusic.model.Musica;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Service
public class MusicaServiceBean implements MusicaService {
    
    public List<Musica> listarMusicas(String filtro){

        return null;
    }

}
