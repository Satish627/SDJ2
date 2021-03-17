package MVVM.UppercaseConverter.Core;

import MVVM.UppercaseConverter.View.uppercase.UppercaseViewModel;

public class ViewModelFactory
{
  private UppercaseViewModel uppercaseViewModel;
  private ModelFactory mf;

  public ViewModelFactory(ModelFactory mf)
  {
    this.mf=mf;
  };

  public UppercaseViewModel getUppercaseViewModel()

  {
    if (uppercaseViewModel == null)
    {
      uppercaseViewModel = new UppercaseViewModel(mf.getTextConverter());
    }
    return uppercaseViewModel;

  }


}
