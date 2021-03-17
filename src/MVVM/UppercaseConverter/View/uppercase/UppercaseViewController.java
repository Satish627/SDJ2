package MVVM.UppercaseConverter.View.uppercase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UppercaseViewController
{
  @FXML
  public TextField requestField;
  @FXML
  public TextField replyField;
  @FXML
  public Label errorLabel;
  private UppercaseViewModel viewModel;

  @FXML
  public void onSubmitButton(ActionEvent actionEvent)
  {
    viewModel.convert();
  }

  public void init(UppercaseViewModel uppercaseViewModel)
  {
    replyField.setDisable(true);
    this.viewModel = uppercaseViewModel;
    errorLabel.textProperty().bind(viewModel.errorProperty());
    requestField.textProperty().bindBidirectional(viewModel.requestProperty());
    replyField.textProperty().bind(viewModel.replyProperty());
  }
}
