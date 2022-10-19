package ejercicioAA9;

import java.util.List;

public class Aerolineas {
	
	private String nombre;
	private String ubicacion;
	private String ceo;
	private List<Vuelos> vuelos;
	
	public Aerolineas(String nombre, String ubicacion, String ceo, List<Vuelos> vuelos) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.ceo = ceo;
		this.vuelos = vuelos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public List<Vuelos> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelos> vuelos) {
		this.vuelos = vuelos;
	}
	

}
