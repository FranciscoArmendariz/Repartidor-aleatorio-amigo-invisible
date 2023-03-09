package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class amigoInvisible {
	
	private List<Persona> listaPersonas = new ArrayList<Persona>();

	public amigoInvisible() {
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	
	public boolean agregarPersona(String nombre) {
		int id = 1;
		if (listaPersonas.size()>0) {
			id = listaPersonas.get(listaPersonas.size()-1).getNumero()+1;
		}
		Persona nuevaPersona = new Persona(nombre, id);
		return listaPersonas.add(nuevaPersona);
	}
	
	public boolean asignarAmigos() {
		int tamanio = listaPersonas.size();
		int i;
		int aleatorio = -1;
		Random r = new Random();
		List<Integer> personasLibres = new ArrayList<Integer>();
		// se agregan todas las personas a la lista de personas disponibles para ser amigo invisible
		for (i=0;i<tamanio;i++) {
			personasLibres.add(listaPersonas.get(i).getNumero());
		}
		// se recorren la lista de personas asignando a cada una aleatoriamente una persona de la lista de personas libres, si le toca si misma se elige otra persona
		for (i=0;i<tamanio-2;i++) {
			while ((aleatorio==-1)||(personasLibres.get(aleatorio)==listaPersonas.get(i).getNumero()))
				aleatorio = r.nextInt(personasLibres.size());
			listaPersonas.get(i).setNumeroAmigo(personasLibres.get(aleatorio));
			personasLibres.remove(aleatorio);
			aleatorio=-1;
		// una vez asignado el amigo se remueve a esa persona de la lista de personas disponibles
		}
		//los ultimos dos se asignan por separado para asegurarse que no queda la ultima persona asignada a si misma
		if ((listaPersonas.get(tamanio-2).getNumero()==personasLibres.get(0))||(listaPersonas.get(tamanio-1).getNumero()==personasLibres.get(1))) {
			listaPersonas.get(tamanio-2).setNumeroAmigo(personasLibres.get(1));
			listaPersonas.get(tamanio-1).setNumeroAmigo(personasLibres.get(0));
		}else {
			listaPersonas.get(tamanio-2).setNumeroAmigo(personasLibres.get(0));
			listaPersonas.get(tamanio-1).setNumeroAmigo(personasLibres.get(1));
		}
		
		return true;		
	}
	
	
	public boolean imprimirResultado() {
		int i;
		int j;
		String amigo = "";
		for (i=0;i<listaPersonas.size();i++) {
			for (j=0;j<listaPersonas.size();j++) {
				if (listaPersonas.get(j).getNumero()==listaPersonas.get(i).getNumeroAmigo())
					amigo = listaPersonas.get(j).getNombre();
			}
			System.out.println(listaPersonas.get(i).toString() + "------->" + amigo + "\n");
		}
		return true;
	}
	
}

	
	



