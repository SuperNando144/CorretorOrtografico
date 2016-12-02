package br.corretorortografico.controllers;

import java.io.IOException;
import br.corretorortografico.models.Spelling;
import br.corretorortografico.models.Suggestions;
import br.corretorortografico.models.Word;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneToBeCorrectedController {
	@FXML
	private TextArea textAreaCorrigido;
	@FXML
	private Button buttonCorrigir;
	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private void handleButtonCorrigir() throws IOException{
		String[] wordsToBeCorrected = this.textAreaCorrigido.getText().split(" ");
		Spelling spell = new Spelling();
		
		Word wordToCorrect = new Word(); 
		wordToCorrect.setWord(wordsToBeCorrected[0]);
		
		Suggestions list = spell.checkSpelling(wordToCorrect);
		AnchorPaneCorrectedController.setWordsToBeCorrected(wordsToBeCorrected);
		AnchorPaneCorrectedController.setSuggestions(list);
		
		//AnchorPane ap = (AnchorPane) FXMLLoader.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneCorrected.fxml"));
		//AnchorPaneCorrectedController controller = new AnchorPaneCorrectedController();
		
		
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(AnchorPaneCorrectedController.class.getResource("/br/corretorortografico/views/AnchorPaneCorrected.fxml"));
		
		AnchorPane page = (AnchorPane) loader.load();
		
		Stage stage = new Stage();
		stage.setTitle("Sign Up");
		
		Scene scene = new Scene(page);
		
		stage.setScene(scene);
		
		//controller.initData(wordsToBeCorrected, list);
		//AnchorPaneCorrectedController controller = loader.getController();
		stage.showAndWait();
		
		
		//this.anchorPane.getChildren().setAll(ap);
	}
}
