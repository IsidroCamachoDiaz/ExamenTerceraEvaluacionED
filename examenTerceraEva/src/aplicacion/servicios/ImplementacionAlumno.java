package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Alumno;

public class ImplementacionAlumno implements InterfazAlumno {

	@Override
	public List<Alumno> MatriculaAlumno(List<Alumno> bd) {
		 Alumno a1= new Alumno();
		 InterfazId interfaz = new ImplementacionId();
		 Scanner leer = new Scanner(System.in);
		 System.out.println("Introduzca el nombre del Alumno: ");
		 a1.setNombre(leer.next());
		 System.out.println("Introduzca los apellidos del Alumno: ");
		 a1.setApellidos(leer.next());
		 System.out.println("Introduzca el telefono del Alumno: ");
		 a1.setTelefono(leer.nextInt());
		 System.out.println("Introduzca la marca del portatil: ");
		 a1.setMarca(leer.next());
		 System.out.println("Introduzca el modelo del portatil: ");
		 a1.setModelo(leer.next());
		 a1.setIdentificador(interfaz.daId(bd));
		 if(a1.getMarca().length()<3||a1.getModelo().length()<3) {
			 String llena;
			 llena =a1.getMarca() +"         ";
			 a1.setMarca(llena);
			 llena = a1.getModelo()+"        ";
			 a1.setModelo(llena);
		 }
		 a1.setIdPortatil(a1.getMarca().substring(0,3)+"-"+a1.getModelo().substring(0,3));
		 System.out.println("Su id es: "+a1.getIdentificador());
		 bd.add(a1);
		 return bd;
	}

	@Override
	public List<Alumno> BorraAlumno(List<Alumno> bd) {
		Scanner leer = new Scanner(System.in);
		 boolean borrado= false;
		 int idBorrar;
		 System.out.println("Introduzca el idetificadro de solicitud del alumno a borrar: ");
		 idBorrar=leer.nextInt();
		 for(int i=0;i<bd.size();i++) {
			 if(idBorrar==bd.get(i).getIdentificador()) {
				 bd.remove(i);
			 System.out.println("El usuario se ha borrado");
			 borrado=true;
			 }
		 }
		 if(!borrado) {
			 System.out.println("No se encontro el usuario");
		 }
		 return bd;
	}

	@Override
	public void ListarAlumno(List<Alumno> bd) {
		 if(!bd.isEmpty()) {
			 for(int i=0;i<bd.size();i++) {
				 System.out.println("--------------------------------------");
				 System.out.println("Identificador: "+bd.get(i).getIdentificador());
				 System.out.println("Nombre: "+bd.get(i).getNombre());
				 System.out.println("Apellidos: "+bd.get(i).getApellidos());
				 System.out.println("Telefono: "+bd.get(i).getTelefono());
				 System.out.println("Identificador Portatil: "+bd.get(i).getIdPortatil());
				 System.out.println("--------------------------------------");
			 }
			}
			 if(bd.isEmpty())
				 System.out.println("No hay registrado ningun alumno");
	}

}
