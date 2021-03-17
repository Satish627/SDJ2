package MVVM.UppercaseConverter;

import MVVM.UppercaseConverter.Core.ModelFactory;
import MVVM.UppercaseConverter.Core.ViewHandler;
import MVVM.UppercaseConverter.Core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class UppercaseApp extends Application
{
  @Override public void start(Stage stage) throws Exception
  {
    ModelFactory mf= new ModelFactory();
    ViewModelFactory vmf= new ViewModelFactory(mf);
    ViewHandler vh= new ViewHandler(vmf);
    vh.start();

  }
}
