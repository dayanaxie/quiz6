package quiz6;

import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static void main(String[] args) {
		ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
		listaParticipantes.add(new Participante("maria", 11, 23));
		listaParticipantes.add(new Participante("kristel", 11, 21));
		listaParticipantes.add(new Participante("maria", 13, 23));
		listaParticipantes.add(new Participante("lucia", 14, 25));
		listaParticipantes.add(new Participante("laura", 13, 19));
		listaParticipantes.add(new Participante("ana", 13, 23));
		
		Collections.sort(listaParticipantes);
		for(Participante participanteActual : listaParticipantes) {
			System.out.println(participanteActual.getNombre()+ " " +  participanteActual.getJuegos()+ " " + participanteActual.getPuntos());
		}
		
		
	}
}
