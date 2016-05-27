package itis.bobrinskaya.view;

import itis.bobrinskaya.MainApp;
import itis.bobrinskaya.service.LoginService;
import itis.bobrinskaya.service.impl.LoginServiceImpl;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.http.ResponseEntity;

import java.io.IOException;


public class LoginController {

    private MainApp mainApp;
    private LoginService loginService = new LoginServiceImpl();
    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    private TextField error;

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
    }

    @FXML
    public void logInto() throws IOException {
        ResponseEntity<Boolean> responseEntity = loginService.signIn(login.getText(), password.getText());
        if (responseEntity.getBody()) {
            maiInit();
            System.out.println(login.getCharacters() + " " + password.getCharacters());
        } else {
            error.setVisible(true);
        }
    }
}
