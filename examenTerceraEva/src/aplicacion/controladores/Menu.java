package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Alumno;
import aplicacion.servicios.ImplementacionAlumno;
import aplicacion.servicios.ImplementacionMenu;
import aplicacion.servicios.InterfazAlumno;
import aplicacion.servicios.InterfazMenu;

public class Menu {

	public static void main(String[] args) {
		int opcion;
		Scanner leer = new Scanner(System.in);
		List <Alumno> Alumnos=new ArrayList <Alumno>();
		InterfazAlumno interfaz = new ImplementacionAlumno();
		InterfazMenu menu = new ImplementacionMenu();
		do {
		menu.MostrarMenu();
		System.out.println("Introduzca una opcion");
		opcion=leer.nextInt();
		switch(opcion) {
		case 1:
			interfaz.MatriculaAlumno(Alumnos);
			break;
		case 2:
			interfaz.BorraAlumno(Alumnos);
			break;
		case 3:
			interfaz.ListarAlumno(Alumnos);
			break;
		}
			
		}while(opcion!=0);
		leer.close();
		}
	}
