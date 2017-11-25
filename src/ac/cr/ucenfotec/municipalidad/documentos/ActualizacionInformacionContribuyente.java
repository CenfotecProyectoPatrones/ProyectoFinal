package ac.cr.ucenfotec.municipalidad.documentos;

public class ActualizacionInformacionContribuyente implements IDocumento {
	private String provincia;
	private String distrito;
	private String canton;
	private String direccion;
	private boolean estado;
	private String estadoCivil;
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}
