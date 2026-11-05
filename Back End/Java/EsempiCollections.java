import java.util.*;


public class EsempiCollections {

	public static void main(String[] args) {
		EsempiCollections esempio = new EsempiCollections();
		esempio.testSet();
		esempio.testMap();
		esempio.testLista();
	

	}

	private void testLista() {
		
		System.out.println("Test Map");
		System.out.println("Arraylist");
		
		List<String> persone = new ArrayList<String>();
		persone.add("Bepi");
		persone.add("Toni");
		persone.add("Gigio");
		persone.add("Bepi");
		persone.add("Ciano");
		
		for (String persona : persone) {
			System.out.println(persona);
		}
		
		System.out.println("-------");
		System.out.println("dopo ordinamento");
		
		Collections.sort(persone);
		for (String persona : persone) {
			System.out.println(persona);
		}
	}
	
	private void testMap() {
		System.out.println("Test Map");
		System.out.println("Hashmap");
		Map<String,String> dizionario = new HashMap<String, String>();
	
		dizionario.put("consulente", "Contratto da consulente");
		dizionario.put("docente", "Contratto da docente");
		dizionario.put("libero prof", "Contratto in partita IVA");
		
		System.out.println("lettura per chiave");
		for (String chiave : dizionario.keySet()) {
			String valore = dizionario.get(chiave);
			System.out.println(chiave + "->"+valore);			
		}
		
		System.out.println("-------");
		System.out.println("lettura per valore");
		for (String valore : dizionario.values()) {
			System.out.println(valore);			
		}
		System.out.println("*******");

		System.out.println("Treemap");
		dizionario = new TreeMap<String, String>();
	
		dizionario.put("consulente", "Contratto da consulente");
		dizionario.put("docente", "Contratto da docente");
		dizionario.put("libero prof", "Contratto in partita IVA");
		
		for (String chiave : dizionario.keySet()) {
			String valore = dizionario.get(chiave);
			System.out.println(chiave + "->"+valore);			
		}

		System.out.println("-------");
		System.out.println("lettura per valore");
		for (String valore : dizionario.values()) {
			System.out.println(valore);			
		}
		System.out.println("*******");

	}
	
	
	private void testSet() {
		System.out.println("Test Set");
		System.out.println("Hashset");
		Set<String> elementiUnivoci = new HashSet<String>();
		
		elementiUnivoci.add("ciao");
		elementiUnivoci.add("a");
		elementiUnivoci.add("tutti");
		elementiUnivoci.add("ciao");
		
		for (String elemento : elementiUnivoci) {
			System.out.println(elemento + " hash: "+elemento.hashCode());
		}
		System.out.println("----------");
		
		System.out.println("Treeset");
		elementiUnivoci = new TreeSet<String>();
		
		elementiUnivoci.add("ciao");
		elementiUnivoci.add("a");
		elementiUnivoci.add("tutti");
		elementiUnivoci.add("ciao");
		
		for (String elemento : elementiUnivoci) {
			System.out.println(elemento + " hash: "+elemento.hashCode());
		}
		System.out.println("----------");
	}
}
