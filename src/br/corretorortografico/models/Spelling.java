package br.corretorortografico.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import info.debatty.java.stringsimilarity.Levenshtein;

public class Spelling {
	
	public Suggestions checkSpelling(Word word){
		Dictionary dict = new Dictionary();
		Pattern p = Pattern.compile("[a-z,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�,�]+");
		Matcher matcher = p.matcher(word.getWord().toLowerCase());	
		Suggestions suggestions = new Suggestions();
		
		String temp;
		Levenshtein l = new Levenshtein();
		
		
		if(matcher.find()){
			for(int i=0; i<dict.getDictionary().size(); i++){
				temp = dict.getDictionary().get(i).getWord();
				
				if(l.distance(temp, word.getWord()) == 0){
					System.out.println("Palavra correta!");
					break;
				}
				
				if(l.distance(temp, word.getWord()) > -6 && l.distance(temp, word.getWord()) < 6){
					suggestions.addSuggestions(dict.getDictionary().get(i));
				}
			}
		}
		
		return suggestions;
	}
}
