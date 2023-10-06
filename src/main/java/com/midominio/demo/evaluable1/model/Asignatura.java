package com.midominio.demo.evaluable1.model;

import java.util.ArrayList;
import java.util.List;



public class Asignatura {

	
	
	//Propiedades
	
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numeroCreditos;
	private int numAlumnosMatriculados;
	
	
	//Constructor
	
	public Asignatura() {
		
	}




	public Asignatura(int id, String nombre, String descripcion, String tipo, int numeroCreditos,
			int numAlumnosMatriculados) {
	
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.numAlumnosMatriculados = numAlumnosMatriculados;
	}
	
	
	public static List<Asignatura> dameListaDeAsignatura(){
		
	
	// Declaración de una lista para almacenar las asignaturas
	List<Asignatura> listaAsignaturas = new ArrayList<>();

	// Agregar las 20 instancias de asignaturas a la lista
	listaAsignaturas.add(new Asignatura(1, "Matemáticas", "Curso de matemáticas básicas", "ciencias", 4, 0));
	listaAsignaturas.add(new Asignatura(2, "Lengua Española", "Estudio de la gramática y la literatura en español", "letras", 6, 0));
	listaAsignaturas.add(new Asignatura(3, "Historia Universal", "Repaso de la historia de la humanidad", "sociales", 8, 0));
	listaAsignaturas.add(new Asignatura(4, "Biología", "Estudio de los seres vivos", "ciencias", 9, 0));
	listaAsignaturas.add(new Asignatura(5, "Química", "Ciencia que estudia la composición y las propiedades de la materia", "ciencias", 4,0));
	listaAsignaturas.add(new Asignatura(6, "Física", "Estudio de las propiedades de la materia y la energía", "ciencias", 6, 0));
	listaAsignaturas.add(new Asignatura(7, "Inglés", "Aprendizaje del idioma inglés", "letras", 9, 0));
	listaAsignaturas.add(new Asignatura(8, "Educación Física", "Clases de deportes y actividad física", "mixto", 10, 0));
	listaAsignaturas.add(new Asignatura(9, "Arte", "Exploración de diversas formas de arte", "artístico", 11, 0));
	listaAsignaturas.add(new Asignatura(10, "Música", "Estudio de la música y sus elementos", "artístico", 8, 0));
	listaAsignaturas.add(new Asignatura(11, "Geografía", "Estudio de la Tierra y sus características", "sociales", 6, 0));
	listaAsignaturas.add(new Asignatura(12, "Economía", "Conceptos económicos y sistemas económicos", "ciencias", 9, 0));
	listaAsignaturas.add(new Asignatura(13, "Informática", "Introducción a la programación y la informática", "mixto", 8,0));
	listaAsignaturas.add(new Asignatura(14, "Psicología", "Estudio de la mente y el comportamiento humano", "sociales", 12, 0));
	listaAsignaturas.add(new Asignatura(15, "Sociología", "Análisis de la sociedad y las interacciones humanas", "sociales", 8, 0));
	listaAsignaturas.add(new Asignatura(16, "Filosofía", "Exploración de cuestiones filosóficas", "sociales", 6, 0));
	listaAsignaturas.add(new Asignatura(17, "Derecho", "Estudio del sistema legal", "letras", 4, 0));
	listaAsignaturas.add(new Asignatura(18, "Medicina", "Ciencia y práctica médica", "ciencias", 6, 0));
	listaAsignaturas.add(new Asignatura(19, "Diseño Gráfico", "Diseño visual y comunicación gráfica", "artístico", 9, 0));
	listaAsignaturas.add(new Asignatura(20, "Nutrición", "Estudio de la alimentación y la nutrición", "mixto", 12, 0));

	return listaAsignaturas;
	}
	
	
	
	public static List<Asignatura> listaPorAsignatura(String nombre) {
		List<Asignatura> listaAsignaturas = new ArrayList<>();
		for (Asignatura a: Asignatura.dameListaDeAsignatura()) {
			if (nombre.equalsIgnoreCase(a.getNombre())) { 
				listaAsignaturas.add(a);
			}		
		}
		return listaAsignaturas;		
	}
	
	


	//Solo get

	public int getId() {
		return id;
	}




	public String getNombre() {
		return nombre;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public String getTipo() {
		return tipo;
	}




	public int getNumeroCreditos() {
		return numeroCreditos;
	}




	public int getNumAlumnosMatriculados() {
		return numAlumnosMatriculados;
	}
	
	
	
	
	
	
	
	
}
