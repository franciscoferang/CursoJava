package ejercicioAA9;

import java.util.List;

public class Vuelos implements TotalGanancia{

	private String destino;
	private Integer pasajesVendidos;
	private String vuelo;

	

	public Vuelos(String destino, Integer pasajesVendidos, String vuelo) {
		this.destino = destino;
		this.pasajesVendidos = pasajesVendidos;
		this.vuelo = vuelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getPasajesVendidos() {
		return pasajesVendidos;
	}

	public void setPasajesVendidos(Integer pasajesVendidos) {
		this.pasajesVendidos = pasajesVendidos;
	}

	public String getVuelo() {
		return vuelo;
	}

	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}
	
	public Integer getGananciaNeta(List<Integer> l) {
		Integer res = 0;
		for(int i =0;i<l.size();i++) {
			res = res + l.get(i);
		}
		return res;
	}
	
	public Integer getGanancia() {
		return this.pasajesVendidos*50;
	}
	
	public Integer getPasajeros() {
		return this.pasajesVendidos/2;
	}

	public String toString() {
		return "Vuelos [destino=" + destino + ", pasajesVendidos=" + pasajesVendidos + ", vuelo=" + vuelo + "]";
	}



	
	
}
