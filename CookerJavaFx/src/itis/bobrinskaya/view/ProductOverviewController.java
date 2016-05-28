package itis.bobrinskaya.view;

import com.itis.bobrinskaya.model.Product;
import itis.bobrinskaya.MainApp;
import itis.bobrinskaya.service.ProductService;
import itis.bobrinskaya.service.impl.ProductServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Collections;


public class ProductOverviewController {

	private ProductService productService = new ProductServiceImpl();
    @FXML
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, String> idColumn;
    @FXML
    private TableColumn<Product, String> nameColumn;

    @FXML
    private Label idLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label priceLabel;
    @FXML
    private Label descriptionLabel;
	@FXML
	private Label photoLabel;



    private MainApp mainApp;

    public ProductOverviewController() {

    }

    @FXML
    private void initialize() {

        idColumn.setCellValueFactory(
				cellData -> cellData.getValue().idProperty());
        nameColumn.setCellValueFactory(
				cellData -> cellData.getValue().nameProperty());
        

        showPersonDetails(null);


		productTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showPersonDetails(newValue));
    }


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;


        productTable.setItems(getProducts());
    }

	public Product getProd(String name){
		return productService.getOneProd(name).getBody();
	}

	public ObservableList<Product> getProducts(){
		ObservableList<Product> productData = FXCollections.observableArrayList();
		Product[] products = productService.getProds().getBody();
		Collections.addAll(productData, products);
		return productData;
	}
    

    private void showPersonDetails(Product product) {
    	if (product != null) {

    		idLabel.setText(String.valueOf(product.getId()));
    		nameLabel.setText(product.getName());
    		priceLabel.setText(String.valueOf(product.getPrice()));
    		descriptionLabel.setText((product.getDescription()));
			photoLabel.setText(product.getPhoto());


    	} else {

    		idLabel.setText("");
    		nameLabel.setText("");
    		priceLabel.setText("");
    		descriptionLabel.setText("");
			photoLabel.setText("");

    	}
    }


	@FXML
	private void handleDeletePerson() {
		int selectedIndex = productTable.getSelectionModel().getSelectedIndex();
		if (selectedIndex >= 0) {
			Product product = productTable.getItems().get(selectedIndex);
			productTable.getItems().remove(selectedIndex);

			System.out.println(product.getName());
			productService.deleteProduct(product.getId());
		} else {

		}
	}
	

	@FXML
	private void handleNewPerson() {
		Product tempProduct = new Product();
		boolean okClicked = mainApp.showPersonEditDialog(tempProduct);
		if (okClicked) {
			mainApp.getProductData().add(tempProduct);
		}
	}


	@FXML
	private void handleEditPerson() {
		Product selectedProduct = productTable.getSelectionModel().getSelectedItem();
		if (selectedProduct != null) {
			boolean okClicked = mainApp.showPersonEditDialog(selectedProduct);
			if (okClicked) {
				showPersonDetails(selectedProduct);
			}

		} else {


		}
	}
}