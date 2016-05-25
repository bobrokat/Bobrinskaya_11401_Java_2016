package itis.bobrinskaya.view;

import itis.bobrinskaya.model.Product;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ProductEditDialogController {

    @FXML
    private TextField nameField;
    @FXML
    private TextField priceField;
    @FXML
    private TextField descriptiontField;
    @FXML
    private TextField photoField;



    private Stage dialogStage;
    private Product product;
    private boolean okClicked = false;


    @FXML
    private void initialize() {
    }


    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }


    public void setProduct(Product product) {
        this.product = product;

        nameField.setText(product.getName());
        priceField.setText(String.valueOf(product.getPrice()));
        descriptiontField.setText(product.getDescription());
        photoField.setText(product.getPhoto());

    }


    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleOk() {
        if (isInputValid()) {
            product.setName(nameField.getText());
            product.setPrice(Integer.valueOf(priceField.getText()));
            product.setDescription(descriptiontField.getText());
            product.setPhoto(photoField.getText());


            okClicked = true;
            dialogStage.close();
        }
    }


    @FXML
    private void handleCancel() {
        dialogStage.close();
    }


    private boolean isInputValid() {
        String errorMessage = "";

        if (nameField.getText() == null || nameField.getText().length() == 0) {
            errorMessage += "No valid first name!\n"; 
        }
        if (priceField.getText() == null || priceField.getText().length() == 0) {
            errorMessage += "No valid last name!\n"; 
        }
        if (descriptiontField.getText() == null || descriptiontField.getText().length() == 0) {
            errorMessage += "No valid street!\n"; 
        }
        if (photoField.getText() == null || photoField.getText().length() == 0) {
            errorMessage += "No valid street!\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {

            return false;
        }
    }
}