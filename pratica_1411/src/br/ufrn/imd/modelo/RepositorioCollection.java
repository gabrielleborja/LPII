package br.ufrn.imd.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RepositorioCollection {
	
	private Map<String, Collection<?>> collectionsMap;
	
	public RepositorioCollection() {
		this.collectionsMap = new HashMap<>();
	}
	
	//Metodo para adicionar uma coleção ao mapa
	public <T> void addCollection(String key, Collection<T> collection) {
		collectionsMap.put(key, collection);
		System.out.println(key + " inserido(a)");
	}
	
	//Metodo para obter uma coleção do mapa com o tipo apropriado
	@SuppressWarnings("unchecked")
	public <T> Collection<T> getCollection(String key, Class<T> type) {
		return (Collection<T>) collectionsMap.get(key);
	}
	
	//Metodo para remover uma coleçao do mapa
	public void removeCollection(String key) {
		collectionsMap.remove(key);
	}
}
