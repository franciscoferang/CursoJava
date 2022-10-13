package ejercicio15;

public class Pelicula {

	private Integer ranking;
	private String nombre;
	private Integer año;
	
	public Pelicula(Integer ranking, String nombre, Integer año) {
		this.ranking = ranking;
		this.nombre = nombre;
		this.año = año;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}
	
	
	
}
