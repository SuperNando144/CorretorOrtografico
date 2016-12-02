package br.corretorortografico.controllers;

import java.awt.List;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import br.corretorortografico.models.Suggestions;
import br.corretorortografico.models.Word;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class AnchorPaneCorrectedController implements Initializable {
	@FXML
	private ListView<String> listViewSuggestions;
	@FXML
	private Button buttonNovaPalavra;
	@FXML
	private AnchorPane anchorPane;

	private static String[] wordsToBeCorrected;
	private static Suggestions suggestions;

	public static String[] getWordsToBeCorrected() {
		return wordsToBeCorrected;
	}

	public static void setWordsToBeCorrected(String[] wordsToBeCorrected) {
		AnchorPaneCorrectedController.wordsToBeCorrected = wordsToBeCorrected;
	}

	public static Suggestions getSuggestions() {
		return suggestions;
	}

	public static void setSuggestions(Suggestions suggestions) {
		AnchorPaneCorrectedController.suggestions = suggestions;
	}

	@FXML
	private void handleButtonNovaPalavra() throws IOException {
		AnchorPane ap = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneToBeCorrected.fxml"));
		this.anchorPane.getChildren().setAll(ap);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ArrayList<String> listWord = new ArrayList<String>();

		for (int i = 0; i < this.suggestions.getSuggestions().size(); i++) {
			listWord.add(suggestions.getSuggestions().get(i).getWord());
		}

		ObservableList<String> items = FXCollections.observableArrayList(listWord);

		if (items.isEmpty()) {
			items.add("Sem sugestões");
		}

		listViewSuggestions.setItems(items);

	}

}
