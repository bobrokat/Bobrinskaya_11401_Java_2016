package itis.bobrinskaya;

import itis.bobrinskaya.model.Product;
import itis.bobrinskaya.view.LoginController;
import itis.bobrinskaya.view.ProductEditDialogController;
import itis.bobrinskaya.view.ProductOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private  Stage primaryStage;
    private BorderPane rootLayout;
    

    private ObservableList<Product> productData = FXCollections.observableArrayList();


    public MainApp() {

        productData.add(new Product("1", "Muster", "photo", "test1", 135));
        productData.add(new Product("2", "Pizza", "photo", "test2", 136));

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Cooker");
        getLog();

//        initRootLayout();
//
//        showPersonOverview();
    }
    


    public void getLog() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/login.fxml"));


        Pane page = (Pane) loader.load();
        Scene scene = new Scene(page);
        primaryStage.setScene(scene);
        primaryStage.show();
        LoginController controller = loader.getController();
        controller.setMainApp(this);


    }



    public  void initRootLayout() {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  void showPersonOverview() {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ProductOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            rootLayout.setCenter(personOverview);

            ProductOverviewController controller = loader.getController();
            controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

	public boolean showPersonEditDialog(Product product) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ProductEditDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();


			Stage dialogStage = new Stage();
			dialogStage.setTitle("Внести изменения");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);


			ProductEditDialogController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			controller.setProduct(product);

			dialogStage.showAndWait();

			return controller.isOkClicked();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

    public Stage getPrimaryStage() {
    	return primaryStage;
    }
    

    public ObservableList<Product> getProductData() {
    	return productData;
    }

    public static void main(String[] args) {
        launch(args);
    }
}