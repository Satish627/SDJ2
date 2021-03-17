package MVVM_Sockets.UppercaseConverter.Core;

import MVVM_Sockets.UppercaseConverter.View.uppercase.UppercaseViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{
  private Scene uppercaseScene;
  private Stage stage;
  private ViewModelFactory vmf;

  public ViewHandler(ViewModelFactory vmf){
  this.vmf=vmf;
  }
  public void start(){
    stage= new Stage();
    openToUppercase();

  }
  public void openToUppercase(){
    if (uppercaseScene== null){
      try
      {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("../View/uppercase/UppercaseView.fxml"));
        Parent root=loader.load();

        UppercaseViewController ctrl=loader.getController();
        ctrl.init(vmf.getUppercaseViewModel());

        stage.setTitle("Upper case");
        uppercaseScene= new Scene(root);
      }
      catch (IOException e){
        e.printStackTrace();
      }
    }
    stage.setScene(uppercaseScene);
    stage.show();
  }
}
