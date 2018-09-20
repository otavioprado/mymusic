package br.com.ciandt.mymusic.controller;

import br.com.ciandt.mymusic.model.Musica;
import br.com.ciandt.mymusic.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MusicaController {

	@Autowired
	MusicaService musicaService;

	@GetMapping(value = "/musicas")
	public List<Musica> listMusicas(@RequestParam(value = "filtro", required = false) String filtro) {
		return musicaService.listarMusicas(filtro);
	}
}
