package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Alumno;

public class ImplementacionId implements InterfazId {

	@Override
	public int daId(List<Alumno> bd) {
		int id=0;
		 for(int i=0;i<bd.size();i++) {
			 int j=bd.get(i).getIdentificador();
			 if(id<j)
				 id=j;
		 }
		 return id+1;
	}

}
