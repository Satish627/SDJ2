package SEP2;

import SEP2.core.LoginViewHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RentalApp extends Application
{
  private Scene scene;

  @Override public void start(Stage stage) throws Exception
  {
    LoginViewHandler lvh=new LoginViewHandler();
    lvh.start();

  }
}
