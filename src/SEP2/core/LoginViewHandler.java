package SEP2.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewHandler
{
  private Scene LoginScene;
  private Stage stage;

  public void openToLogin(){
    if (LoginScene==null)
    {
      try
      {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/loginAndRegister/LoginView.fxml"));
        Parent root=loader.load();
        stage.setTitle("Login");
        LoginScene = new Scene(root);
    }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    stage.setScene(LoginScene);
    stage.show();
  }
  public void start(){
    stage = new Stage();
    openToLogin();
  }
}
