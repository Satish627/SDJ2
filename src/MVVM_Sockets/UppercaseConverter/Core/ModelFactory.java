package MVVM_Sockets.UppercaseConverter.Core;

import MVVM_Sockets.UppercaseConverter.Model.TextConverter;
import MVVM_Sockets.UppercaseConverter.Model.TextConverterModel;

public class ModelFactory
{
  private TextConverter textConverter;

  public TextConverter getTextConverter(){
    if (textConverter==null);{
      textConverter= new TextConverterModel();
      return textConverter;
    }
  }
}
