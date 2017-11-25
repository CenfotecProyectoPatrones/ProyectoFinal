package ac.cr.ucenfotec.municipalidad.documentos;

import java.time.LocalDate;

public class Documento implements IDocumento {
	protected LocalDate fechaSolicitud;
	protected LocalDate fechaResolucion;
	protected Propiedad propiedad;
	
	
	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public LocalDate getFechaResolucion() {
		return fechaResolucion;
	}
	public void setFechaResolucion(LocalDate fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}
	public Propiedad getPropiedad() {
		return propiedad;
	}
	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
	
	
}
