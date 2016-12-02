package br.corretorortografico.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class AnchorPaneCorrectedController {
	@FXML
	private ListView<String> listViewSuggestions;
	@FXML
	private Button buttonNovaPalavra;
	@FXML
	private AnchorPane anchorPane;

	private String[] wordsToBeCorrected;

	public void initData(String[] wordsToBeCorrected) {
		this.wordsToBeCorrected = wordsToBeCorrected;
		System.out.println(this.wordsToBeCorrected[0]);

	}

	@FXML
	private void handleButtonNovaPalavra() throws IOException {
		AnchorPane ap = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneToBeCorrected.fxml"));
		this.anchorPane.getChildren().setAll(ap);

	}

}
