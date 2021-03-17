package SEP2.view.loginAndRegister;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLOutput;

public class LoginViewController
{
  public PasswordField passwordTextfield;
  public TextField userIdTextfield;

  public void onLoginButton(ActionEvent actionEvent)
  {
    System.out.println("Tried to login");
  }



  public void onNewAccountButton(ActionEvent actionEvent) throws IOException
  {
    Stage register_stage = new Stage();
    System.out.println("Tried to create an account");
    Parent register_page =  FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
    Scene register_scene= new Scene(register_page);
    register_stage.setScene(register_scene);
    register_stage.show();
  }
}
