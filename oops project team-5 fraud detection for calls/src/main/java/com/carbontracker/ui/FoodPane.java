package com.carbontracker.ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class FoodPane extends VBox {
    private TextField beefInput;
    private TextField porkInput;
    private TextField chickenInput;
    private TextField vegetarianInput;
    private Button addBeefButton;
    private Button addPorkButton;
    private Button addChickenButton;
    private Button addVegetarianButton;
    private Label successMessage;

    public FoodPane() {
        setPadding(new Insets(20));
        setSpacing(15);

        // Create input fields
        beefInput = new TextField();
        porkInput = new TextField();
        chickenInput = new TextField();
        vegetarianInput = new TextField();

        // Create buttons
        addBeefButton = new Button("Add Beef");
        addPorkButton = new Button("Add Pork");
        addChickenButton = new Button("Add Chicken");
        addVegetarianButton = new Button("Add Vegetarian Meals");

        // Create success message label
        successMessage = new Label();

        // Set up layout
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Label("Beef (kg):"), 0, 0);
        grid.add(beefInput, 1, 0);
        grid.add(addBeefButton, 2, 0);
        grid.add(new Label("Pork (kg):"), 0, 1);
        grid.add(porkInput, 1, 1);
        grid.add(addPorkButton, 2, 1);
        grid.add(new Label("Chicken (kg):"), 0, 2);
        grid.add(chickenInput, 1, 2);
        grid.add(addChickenButton, 2, 2);
        grid.add(new Label("Vegetarian Meals:"), 0, 3);
        grid.add(vegetarianInput, 1, 3);
        grid.add(addVegetarianButton, 2, 3);
        grid.add(successMessage, 0, 4, 3, 1);

        getChildren().add(grid);

        // Set button actions
        addBeefButton.setOnAction(e -> addFoodEmission("beef", beefInput));
        addPorkButton.setOnAction(e -> addFoodEmission("pork", porkInput));
        addChickenButton.setOnAction(e -> addFoodEmission("chicken", chickenInput));
        addVegetarianButton.setOnAction(e -> addVegetarianMeals());
    }

    private void addFoodEmission(String type, TextField inputField) {
        try {
            double value = Double.parseDouble(inputField.getText());
            if (value > 0) {
                // Call the emission calculator method (to be implemented)
                // EmissionCalculator.addFoodEmission(type, value);
                successMessage.setText(value + " kg of " + type + " added.");
                inputField.clear();
            } else {
                successMessage.setText("Please enter a positive number.");
            }
        } catch (NumberFormatException ex) {
            successMessage.setText("Please enter a valid number.");
        }
    }

    private void addVegetarianMeals() {
        try {
            int meals = Integer.parseInt(vegetarianInput.getText());
            if (meals > 0) {
                // Call the emission calculator method (to be implemented)
                // EmissionCalculator.addVegetarianMeal(meals);
                successMessage.setText(meals + " vegetarian meals added.");
                vegetarianInput.clear();
            } else {
                successMessage.setText("Please enter a positive number.");
            }
        } catch (NumberFormatException ex) {
            successMessage.setText("Please enter a valid number.");
        }
    }
}