package modeloExamen;

import java.time.LocalDate;

public class Paciente extends Persona implements EsperanzaVida {


	private int id;
	private String enfermedad;
	private String medicina;
	private Double valorMedicina;
	private String seguroMedico;

	public Paciente(String nombre, LocalDate fechaNacimiento, int id, String enfermedad, String medicina,
			Double valorMedicina, String seguroMedico) {
		super(nombre, fechaNacimiento);
		this.id = id;
		this.enfermedad = enfermedad;
		this.medicina = medicina;
		this.valorMedicina = valorMedicina;
		this.seguroMedico = seguroMedico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnfermedad() {
		return enfermedad.replaceAll("[^\\dA-Za-z]", "");
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getMedicina() {
		return medicina.replaceAll("[^\\dA-Za-z]", "");
	}

	public void setMedicina(String medicina) {
		this.medicina = medicina;
	}

	public Double getValorMedicina() {
		return valorMedicina;
	}

	public void setValorMedicina(Double valorMedicina) {
		this.valorMedicina = valorMedicina;
	}

	public String getSeguroMedico() {
		return seguroMedico.replaceAll("[^\\dA-Za-z]", "");
	}

	public void setSeguroMedico(String seguroMedico) {
		this.seguroMedico = seguroMedico;
	}

	public String getRecargo() {
		String res ="";
		if(seguroMedico.equals("No Posee")) {
			res = "No cobrar recargo";
		}else if(seguroMedico.equals("Swiss Medical")) {
			Double recargo = valorMedicina + ((valorMedicina*5)/100);
			res = "Cobrar un regargo del 5% siendo el precio final = "+recargo;
		}else {
			Double recargo = valorMedicina +  ((valorMedicina*10)/100);
			res = "Cobrar un recargo del 10% siendo el precio final = "+recargo;
		}
		return res;
	}
	
	public String getEsperanzaVida() {
		String res ="";
		if(getEdad()>=30 && enfermedad.equals("Alergia")) {
			res ="baja";
		}else if(getEdad()>=30 && !enfermedad.equals("Alergia")) {
			res = "media";
		}else if(getEdad()<30 && enfermedad.equals("Rosacea")) {
			res = "media";
		}else {
			res = "alta";
		}
		return res;
	}

	public String toString() {
		return "El paciente "+getNombre()+" (id = "+id+") Nacido el "+getFechaNacimiento()+" ("+getEdad()+" años), "
				+ "tiene la enfermedad "+enfermedad+", por lo que su esperanza de vida es "+getEsperanzaVida()+
				", tiene como tratamiento la medicina "+medicina+
				", dicha medicina tiene un valor numerico = "+valorMedicina+", al tener como seguro medico "+
				seguroMedico+ ", al paciente se le debe "+getRecargo();
	}

	
}
