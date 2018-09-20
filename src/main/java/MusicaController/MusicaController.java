package MusicaController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciandt.mymusic.model.Musica;
import br.com.ciandt.mymusic.repository.MusicaRepository;

@RestController
@RequestMapping("/api")
public class MusicaController {

	@Autowired
    private MusicaRepository musicaRepository;
	
	@GetMapping("/musica")
	public List<Musica> getAllNotes() {
	    return musicaRepository.findAll();
	}
	
	@PostMapping("/musica")
	public Musica createNote(@Valid @RequestBody Musica musica) {
	    return musicaRepository.save(musica);
	}
	
	@GetMapping("/musica/{id}")
	public Musica getNoteById(@PathVariable(value = "id") Long noteId) {
	    return musicaRepository.findById(noteId).get();
	}
}
