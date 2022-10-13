package ejercicio15;

public class PeliculaRecaudacion extends Pelicula{
	
	private String brutoMundial;
	private String brutoNacional;
	private String brutoExtranjero;
	
	public PeliculaRecaudacion(Integer ranking, String nombre, Integer año, String brutoMundial, String brutoNacional,
			String brutoExtranjero) {
		super(ranking, nombre, año);
		this.brutoMundial = brutoMundial;
		this.brutoNacional = brutoNacional;
		this.brutoExtranjero = brutoExtranjero;
	}

	public String getBrutoMundial() {
		return brutoMundial;
	}

	public void setBrutoMundial(String brutoMundial) {
		this.brutoMundial = brutoMundial;
	}

	public String getBrutoNacional() {
		return brutoNacional;
	}

	public void setBrutoNacional(String brutoNacional) {
		this.brutoNacional = brutoNacional;
	}

	public String getBrutoExtranjero() {
		return brutoExtranjero;
	}

	public void setBrutoExtranjero(String brutoExtranjero) {
		this.brutoExtranjero = brutoExtranjero;
	}


	public String toString() {
		return "Ranking = "+getRanking()+", Nombre = "+getNombre()+"(año "+getAño()+"), bruto mundial = "
				+brutoMundial+", bruto nacional = "+brutoNacional+", bruto extranjero = "
				+brutoExtranjero;
	}
	
	

}
