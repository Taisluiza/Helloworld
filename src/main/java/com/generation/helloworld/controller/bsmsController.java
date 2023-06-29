package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class bsmsController {
	
	@GetMapping
	public String bsms() {
		return "Persistência, Proatividade, Comunicação, Responsabilidade Pessoal, Orientação ao Futuro, Trabalho em Equipe, Mentalidade de crescimento!!!";
		
	}

}