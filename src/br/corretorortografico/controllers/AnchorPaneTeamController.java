package br.corretorortografico.controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class AnchorPaneTeamController implements Initializable {
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private ImageView imageView1;
	@FXML
	private ImageView imageView2;
	@FXML
	private ImageView imageView3;
	@FXML
	private ImageView imageView4;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image image1 = new Image("br/corretorortografico/images/tbone.jpg");

		Image image2 = new Image("br/corretorortografico/images/fer_mongolao.jpg");

		Image image3 = new Image("br/corretorortografico/images/fer_mongolino.jpg");

		Image image4 = new Image("br/corretorortografico/images/paguii.jpg");

		imageView1.setImage(image1);
		imageView2.setImage(image2);
		imageView3.setImage(image3);
		imageView4.setImage(image4);
	}

}
