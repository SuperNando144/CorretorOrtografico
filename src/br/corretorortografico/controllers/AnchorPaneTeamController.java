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
        File file1 = new File("/images/tbone.jpg");
        Image image1 = new Image(file1.toURI().toString());
        
        File file2 = new File("/images/tbone.jpg");
        Image image2 = new Image(file2.toURI().toString());
        
        File file3 = new File("/images/tbone.jpg");
        Image image3 = new Image(file3.toURI().toString());
        
        File file4 = new File("/images/tbone.jpg");
        Image image4 = new Image(file4.toURI().toString());
        
        imageView1.setImage(image1);
        imageView2.setImage(image2);
        imageView3.setImage(image3);
        imageView4.setImage(image4);
    }

}
