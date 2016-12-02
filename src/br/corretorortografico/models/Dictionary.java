package br.corretorortografico.models;

import java.util.List;

import br.corretorortografico.dao.WordDAO;

public class Dictionary {
	private List<Word> dictionary;
	
	public Dictionary() {
		WordDAO wordDAO = new WordDAO();
		dictionary = wordDAO.all(); 
	}

	public List<Word> getDictionary() {
		return dictionary;
	}

	public void addWord(Word word){
		dictionary.add(word);
	}

	public void setDictionary(List<Word> dictionary) {
		this.dictionary = dictionary;
	}
	
}
