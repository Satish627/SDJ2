package MVVM.UppercaseConverter.Core;

import MVVM.UppercaseConverter.Model.TextConverter;
import MVVM.UppercaseConverter.Model.TextConverterModel;

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
