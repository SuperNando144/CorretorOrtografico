package br.corretorortografico.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class VBoxPrincipalController  {
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private MenuItem menuItemCorrigir;
	@FXML
	private MenuItem menuItemPrincipal;
	@FXML
	private MenuItem menuItemProjeto;
	@FXML
	private MenuItem menuItemEquipe;
	
	@FXML
	private void handleMenuItemCorrigir() throws IOException{
		AnchorPane ap = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneToBeCorrected.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}
	
	@FXML
	private void handleMenuItemPrincipal() throws IOException{
		AnchorPane ap = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneMain.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}
	
	@FXML
	private void handleMenuItemProjeto() throws IOException{
		AnchorPane ap = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneProject.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}
	
	@FXML
	private void handleMenuItemEquipe() throws IOException{
		AnchorPane ap = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/br/corretorortografico/views/AnchorPaneTeam.fxml"));
		this.anchorPane.getChildren().setAll(ap);
	}

}
