package aplicacion.servicios;

public class ImplementacionMenu implements InterfazMenu {

	@Override
	public void MostrarMenu() {
		System.out.println("		MENU");
		System.out.println("--------------------------------------");
		System.out.println("1-Matricular Alumno");
		System.out.println("2-Borrar Alumno");
		System.out.println("3-Listar Alumnos");
		System.out.println("0-Salir");
		System.out.println("--------------------------------------");
	}

}
