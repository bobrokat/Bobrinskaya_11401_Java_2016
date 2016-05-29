package itis.bobrinskaya.view;


import com.itis.bobrinskaya.model.Product;
import com.itis.bobrinskaya.model.enums.ProductTypeEnum;
import itis.bobrinskaya.service.ProductService;
import itis.bobrinskaya.service.impl.ProductServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ProductEditDialogController {
    private ProductService productService = new ProductServiceImpl();
    ObservableList<String> values = FXCollections.observableArrayList("COMBO", "ROLL", "PIZZA", "DESERT", "DRINK", "ANOTHER");
    @FXML
    private TextField nameField;
    @FXML
    private TextField priceField;
    @FXML
    private TextField descriptiontField;

    @FXML
    private ComboBox<String> comboBox;




    private Stage dialogStage;
    private Product product;
    private boolean okClicked = false;

    public boolean isNewProd() {
        return newProd;
    }

    public void setNewProd(boolean newProd) {
        this.newProd = newProd;
    }

    private boolean newProd;


    @FXML
    private void initialize() {
        comboBox.setValue("PIZZA");
        comboBox.setItems(values);
    }


    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }


    public void setProduct(Product product) {
        this.product = product;

        nameField.setText(product.getName());
        priceField.setText(String.valueOf(product.getPrice()));
        descriptiontField.setText(product.getDescription());


    }


    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleOk() {
        if (isInputValid()) {
            ProductTypeEnum type = product.getType();
            product.setName(nameField.getText());
            product.setPrice(Double.parseDouble(priceField.getText()));
            product.setDescription(descriptiontField.getText());
            ProductTypeEnum productTypeEnum = null;
            switch (comboBox.getValue()){
                case "PIZZA": productTypeEnum = ProductTypeEnum.PIZZA;
                    break;
                case "ROLL": productTypeEnum = ProductTypeEnum.ROLL;
                    break;
                case "WOK": productTypeEnum = ProductTypeEnum.WOK;
                    break;
                case "DESERT": productTypeEnum = ProductTypeEnum.DESERT;
                    break;
                case "DRINK": productTypeEnum = ProductTypeEnum.DRINK;
                    break;
                case "ANOTHER": productTypeEnum = ProductTypeEnum.ANOTHER;
                    break;
                case "ÑOMBO": productTypeEnum = ProductTypeEnum.KOMBO;
            }
            product.setType(productTypeEnum);
            okClicked = true;
            dialogStage.close();
            productService.addProd(nameField.getText(), priceField.getText(), descriptiontField.getText(), comboBox.getValue());
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


        if (errorMessage.length() == 0) {
            return true;
        } else {

            return false;
        }
    }
}