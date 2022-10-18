package ejercicio11;

public class Provincia {

	
	private String nombre;
	private String cod;
	private String numeroHabitantes;
	private Boolean esCapital;
	
	
	public Provincia(String nombre, String cod, String numeroHabitantes, Boolean esCapital) {
		this.nombre = nombre;
		this.cod = cod;
		this.numeroHabitantes = numeroHabitantes;
		this.esCapital = esCapital;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCod() {
		return cod;
	}


	public void setCod(String cod) {
		this.cod = cod;
	}


	public String getNumeroHabitantes() {
		return numeroHabitantes;
	}


	public void setNumeroHabitantes(String numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}


	public Boolean getEsCapital() {
		return esCapital;
	}


	public void setEsCapital(Boolean esCapital) {
		this.esCapital = esCapital;
	}
	
	
	
}
