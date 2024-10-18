package com.example.agechecker;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class FormController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField ageField;

    @FXML
    protected void onSubmitButtonClick() {
        String name = nameField.getText();
        String ageText = ageField.getText();

        try {
            int age = Integer.parseInt(ageText);

            if (age < 18) {
                showWarning("Age Warning", "You must be 18 or older to proceed.");
            } else {
                showMessage("Form Submitted", "Name: " + name + "\nAge: " + age);
            }
        } catch (NumberFormatException e) {
            showWarning("Input Error", "Please enter a valid age.");
        }
    }

    private void showWarning(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void showMessage(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
