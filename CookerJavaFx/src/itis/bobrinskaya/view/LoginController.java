package itis.bobrinskaya.view;

import itis.bobrinskaya.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class LoginController {

    private MainApp mainApp;
    @FXML
    private TextField login;
    @FXML
    private TextField password;

    public MainApp getMainApp() {
        return mainApp;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

@FXML
    public void maiInit(){
        mainApp.initRootLayout();
        mainApp.showPersonOverview();
    System.out.println(login.getCharacters() + " " + password.getCharacters());
    }
}
