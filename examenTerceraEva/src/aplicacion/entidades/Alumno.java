package aplicacion.entidades;

public class Alumno {
	//Atributos
	private int identificador=0;
	private String nombre;
	private String apellidos;
	private int telefono;
	private String idPortatil;
	private String marca;
	private String modelo;
	//Constructores
	public Alumno(String nombre, String apellidos, int telefono, String marca, String modelo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Alumno() {
		super();
	}

	//geters y setters
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getIdPortatil() {
		return idPortatil;
	}
	public void setIdPortatil(String idPortatil) {
		this.idPortatil = idPortatil;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
