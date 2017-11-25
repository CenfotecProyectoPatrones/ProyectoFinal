package ac.cr.ucenfotec.municipalidad.documentos;

import java.time.LocalDate;

public class LicenciaMunicipalFuncionamiento extends Documento {
	private LocalDate fechaVencimiento;

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	
	
}
