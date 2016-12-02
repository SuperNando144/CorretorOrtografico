package br.corretorortografico.models;

import java.util.ArrayList;
import java.util.List;

public class Suggestions {
	private List<Word> suggestions;
	
	public Suggestions() {
		suggestions = new ArrayList<Word>();
	}
	
	public List<Word> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(List<Word> suggestions) {
		this.suggestions = suggestions;
	}
	
	public void addSuggestions(Word word){
		this.suggestions.add(word);
	}
	
}
