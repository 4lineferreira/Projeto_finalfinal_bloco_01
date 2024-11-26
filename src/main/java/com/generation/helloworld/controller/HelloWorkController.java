package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.helloworld.model.*;

@RestController
@RequestMapping("/hello-world")

public class HelloWorkController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/objetivos")
	public List<ObjetivosModel> getObjetivos() {
		return Arrays.asList(
				new ObjetivosModel(1, "Aprofundar mais no Spring Boot"),
				new ObjetivosModel(2, "Manter as atividades em dia")
				);

	}
	
	@GetMapping ("/bsm")
	public List	<BsmModel> getBsm (){
		return Arrays.asList(
				new BsmModel (1, "Orientação ao futuro"), 
				new BsmModel (2, "Responsabilidade Pessoal"), 
				new BsmModel (3, "Mentabilidade de Crescimento"),
				new BsmModel (4, "Comunicação"),
				new BsmModel (5, "Proatividade"),
				new BsmModel (6, "Orientação ao Detalhe"),
				new BsmModel (7, "Trabalho em equipe"),
				new BsmModel (8, "Persistência")
				);
	}

}
