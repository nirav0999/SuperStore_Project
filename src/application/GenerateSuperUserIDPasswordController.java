package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class GenerateSuperUserIDPasswordController {
	@FXML private ImageView MainImage;
    @FXML private Label UserIDField;//The UserID for Super generated by the System Goes here
    @FXML private Label PasswordField;//The Password for SuperUser generated by the System 
    @FXML private Button LoginButton;//Login Button for SuperUser
    @FXML private Button DeleteButton;//Delete Account for SuperUser when he/she does not want to login at first 
}
