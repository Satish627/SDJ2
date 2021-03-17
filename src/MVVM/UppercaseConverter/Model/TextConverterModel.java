package MVVM.UppercaseConverter.Model;

import MVVM.UppercaseConverter.View.uppercase.UppercaseViewModel;

public class TextConverterModel implements TextConverter
{

  @Override public String toUppercase(String text)
  {
    return text.toUpperCase();
  }
}
