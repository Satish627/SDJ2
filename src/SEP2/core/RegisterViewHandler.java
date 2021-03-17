package SEP2.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class RegisterViewHandler
{

  Button onSignInButton, onCancelButton;
  public void switchToRegister() throws IOException
  {
    Parent root= FXMLLoader.load(getClass().getResource("../view/loginAndRegister/RegisterView.fxml"));


  }

  public void change() throws IOException
  {
   Stage stage= new Stage();
    switchToRegister();

}
}
