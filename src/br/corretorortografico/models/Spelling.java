package br.corretorortografico.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import info.debatty.java.stringsimilarity.Levenshtein;

public class Spelling {
	
	private Suggestions suggestions;

	public Spelling() {
		suggestions = new Suggestions();
	}
	
	public Suggestions checkSpelling(Word word){
		Dictionary dict = new Dictionary();
		Pattern p = Pattern.compile("[a-z,á,í,ó,ú,é,ä,ï,ö,ü,ë,à,ì,ò,ù,è,ã,õ,â,î,ô,û,ê,ç]+");
		Matcher matcher = p.matcher(word.getWord().toLowerCase());	
		
		String temp;
		Levenshtein l = new Levenshtein();
		
		
		if(matcher.find()){
			for(int i=0; i<dict.getDictionary().size(); i++){
				temp = dict.getDictionary().get(i).getWord();
				
				if(l.distance(temp, word.getWord()) == 0){
					System.out.println("Palavra correta!");
					break;
				}
				
				if(l.distance(temp, word.getWord()) > -3 && l.distance(temp, word.getWord()) < 3){
					suggestions.addSuggestions(dict.getDictionary().get(i));
				}
			}
		}
		
		return this.suggestions;
	}
}
