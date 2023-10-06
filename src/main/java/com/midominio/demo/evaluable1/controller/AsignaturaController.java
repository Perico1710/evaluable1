package com.midominio.demo.evaluable1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.demo.evaluable1.model.Asignatura;

@Controller
@RequestMapping ("/asignatura/listado")
public class AsignaturaController {

	@ModelAttribute ("titulo")
	public String tituloGeneral() {
		return "Evaluación";
	}
	
	
	@GetMapping ("/con")
	public String listaAsignaturaNumeroAlumnos(Model model) {
		
	
		model.addAttribute("H1", "Esta es la relacion de alumnos");
		model.addAttribute("listadoAsignatura", Asignatura.dameListaDeAsignatura());
		
		
		return "asignatura/listado-asignatura-numero-alumnos";
	}
	
	@GetMapping ("/sin")

	public String listaAsignaturaSinNumeroAlumnos(Model model) {
		
	
		model.addAttribute("H1", "Esta es la relacion de alumnos");
		model.addAttribute("listadoAsignatura", Asignatura.dameListaDeAsignatura());
		
		
		return "asignatura/listado-asignatura-sin-numero-alumnos";
	}
	
	
	@GetMapping ("/lista")
	public String listaAsignatura(@RequestParam String nombre, @RequestParam(required = false, defaultValue = "1000") int cantidad, Model model) {
		List<Asignatura> listaRecortada = new ArrayList<>();
		if (Asignatura.listaPorAsignatura(nombre).size() <= cantidad) {
			listaRecortada = Asignatura.listaPorAsignatura(nombre);
		}else {
			for (int i = 0; i < cantidad; i++) {
				listaRecortada.add(Asignatura.listaPorAsignatura(nombre).get(i));
			}
		}
		
		model.addAttribute("H1", "Esta es la relacion de alumnos");
		model.addAttribute("listadoAsignatura", listaRecortada);
		
		return "asignatura/listado-asignatura-numero-alumnos";
		
	}
	
}
