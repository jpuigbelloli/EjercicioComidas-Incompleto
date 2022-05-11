package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public abstract class Paciente {

	private String nombre;
	private String apellido;
	private Integer dni;

	private ArrayList<DietaDiaria> ingesta;

	public abstract void agregarDietaDiaria(DietaDiaria dieta);
}
