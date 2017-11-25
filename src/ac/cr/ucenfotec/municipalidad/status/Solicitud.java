package ac.cr.ucenfotec.municipalidad.status;

import ac.cr.ucenfotec.municipalidad.documentos.IDocumento;

public abstract  class Solicitud implements State{
	protected State estado;
	protected IDocumento documento;
	
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
