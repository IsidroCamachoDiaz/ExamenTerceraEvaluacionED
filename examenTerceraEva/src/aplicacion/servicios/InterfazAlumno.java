package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Alumno;

public interface InterfazAlumno {
	/**Crea un nuevo alumno con los valores que meta y lo mete en la lista* */
	public List <Alumno> MatriculaAlumno(List <Alumno> bd);
	/**Borrar un alumno de la lista a partir del identificador del alumno y devuelve la lista* */
	 public List <Alumno> BorraAlumno(List <Alumno> bd);
	 /**Muestra los avlores de cada alumno de la lista que se pasa* */
	 public void ListarAlumno(List <Alumno> bd);
}
