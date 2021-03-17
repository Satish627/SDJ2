package SEP2.view.loginAndRegister;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterViewController
{

  public void onSignInButton(ActionEvent actionEvent)
  {
    System.out.println("Tried to sign in");
  }

  public void onCancelButton(ActionEvent actionEvent) throws IOException
  {
    System.out.println("Action cancelled");
    Parent cancel_action= FXMLLoader.load(getClass().getResource("LoginView.fxml"));
    Scene cancel_scene= new Scene(cancel_action);
    Stage cancel_stage= new Stage();
    cancel_stage.setScene(cancel_scene);
    cancel_stage.show();
  }
}
