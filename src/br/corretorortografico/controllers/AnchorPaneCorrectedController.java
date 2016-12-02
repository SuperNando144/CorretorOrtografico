package br.corretorortografico.controllers;

import java.io.IOException;

import br.corretorortografico.models.Suggestions;
import br.corretorortografico.models.Word;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class AnchorPaneCorrectedController {
	@FXML
	private ListView<Word> listViewSuggestions;
	@FXML
	private Button buttonNovaPalavra;
	@FXML
	private AnchorPane anchorPane;

	private String[] wordsToBeCorrected;
	private Suggestions suggestions;
	

	public void initData(String[] wordsToBeCorrected, Suggestions list) {
		this.wordsToBeCorrected = wordsToBeCorrected;
		this.suggestions = list;
		
		ObservableList<Word> items = FXCollections.observableArrayList(suggestions.getSuggestions());
		
		if(items.isEmpty()){
			System.out.println("vazio");
		}else{
			//fazer mostrar na list view sugestoes
			listViewSuggestions = new ListView<Word>(items);
		}
	}

	@FXML
	private void handleButtonNovaPalavra() throws IOException {
		AnchorPane ap = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneToBeCorrected.fxml"));
		this.anchorPane.getChildren().setAll(ap);

	}

}
