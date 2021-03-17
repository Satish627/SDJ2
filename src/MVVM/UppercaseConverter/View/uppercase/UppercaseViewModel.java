package MVVM.UppercaseConverter.View.uppercase;

import MVVM.UppercaseConverter.Model.TextConverter;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.awt.*;

public class UppercaseViewModel
{
  private StringProperty request;
  private StringProperty reply;
  private StringProperty error;
  private TextConverter textConverter;

  public UppercaseViewModel(TextConverter textConverter){
    this.textConverter= textConverter;
    request=new SimpleStringProperty();
    reply=new SimpleStringProperty();
    error=new SimpleStringProperty();
  }
  public void convert(){
    String input= request.get();
    if (input!= null && !" ".equals(input)){
      String result = textConverter.toUppercase(input);
      reply.set(result);
    }
    else error.set("Input cannot be empty");
  }

  public StringProperty requestProperty() { return request;}
  public StringProperty replyProperty() { return reply;}
  public StringProperty errorProperty() { return error;}
}
