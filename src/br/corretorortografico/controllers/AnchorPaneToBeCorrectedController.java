package br.corretorortografico.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

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
		AnchorPane ap = (AnchorPane) FXMLLoader.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneCorrected.fxml"));
		AnchorPaneCorrectedController controller = new AnchorPaneCorrectedController();
		controller.initData(wordsToBeCorrected);
		this.anchorPane.getChildren().setAll(ap);
		
	}
}
