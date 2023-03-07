package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Alumno;

public interface InterfazId {
	/**Da un nuevo id al Alumno**/
	 public int daId(List <Alumno> bd);
}
