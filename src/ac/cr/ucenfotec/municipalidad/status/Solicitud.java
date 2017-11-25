package ac.cr.ucenfotec.municipalidad.status;

import ac.cr.ucenfotec.municipalidad.documentos.IDocumento;

public abstract  class Solicitud implements State{
	protected State estado;
	protected IDocumento documento;
	
	
	public Solicitud(State estado, IDocumento documento) {
		super();
		this.estado = estado;
		this.documento = documento;
	}
	
	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}

	public IDocumento getDocumento() {
		return documento;
	}

	public void setDocumento(IDocumento documento) {
		this.documento = documento;
	}

	@Override
	public abstract String solicitar();
	@Override
	public abstract String aceptar();
	@Override
	public abstract String rechazar();
	@Override
	public abstract String verificar();
	@Override
	public abstract String notificar();
	@Override
	public abstract String finalizar();
	
	
}
