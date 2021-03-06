package controller;

import fxapp.MainFXApplication;
import javafx.fxml.FXML;

/**
 * Controller for welcome screen
 */
public class WelcomeScreenController {

    /** reference back to mainApplication if needed */
    private MainFXApplication mainApplication;

    /**
     * allow for calling back to the main application code if necessary
     * @param main   the reference to the FX Application instance
     * */
    public void setMainApp(MainFXApplication main) {
        mainApplication = main;
    }

    /**
     * Login Button in Login Screen
     */
    @FXML
    private void logButtonWelPressed() {
        mainApplication.showLoginScreen();

    }

    /**
     * Cancel button in Login Screen
     */
    @FXML
    private void regButtonWelPressed() {
        mainApplication.showRegistrationScreen();
    }
}
