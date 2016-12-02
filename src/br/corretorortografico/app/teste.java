package br.corretorortografico.app;

import br.corretorortografico.models.Spelling;
import br.corretorortografico.models.Word;

public class teste {

	public static void main(String[] args) {
		Spelling spell = new Spelling();
		Word word = new Word();
		
		word.setWord("gente");
		spell.checkSpelling(word);
	}

}
