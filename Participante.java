package quiz6;


public class Participante implements Comparable<Participante>{
	private String nombre;
	private int juegos;
	private int puntos;
	
	public Participante(String pNombre, int pJuegos, int pPuntos) {
		this.nombre = pNombre;
		this.juegos = pJuegos;
		this.puntos = pPuntos;
	}
	
	public int compareTo(Participante o) {
		if(juegos == o.juegos && puntos == o.juegos) {
			return 0;
		}
		else if(juegos == o.juegos && puntos < o.puntos) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getJuegos() {
		return juegos;
	}

	public void setJuegos(int juegos) {
		this.juegos = juegos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


}