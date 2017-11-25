package ac.cr.ucenfotec.municipalidad.personas;

public class FuncionarioMunicipal extends Persona {
	
	private boolean numeroEmpleado;
	private String nombreMiembro;
	private String nombreDepartamento;
	
	
	public boolean isNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(boolean numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getNombreMiembro() {
		return nombreMiembro;
	}
	public void setNombreMiembro(String nombreMiembro) {
		this.nombreMiembro = nombreMiembro;
	}
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}
	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	

}
