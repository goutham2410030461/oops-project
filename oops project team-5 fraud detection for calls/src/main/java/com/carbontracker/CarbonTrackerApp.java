public class CarbonTrackerApp extends Application {

    private EmissionCalculator calculator;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        calculator = new EmissionCalculator();
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 1200, 700);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        createHeader(root);
        createNavigation(root);

        primaryStage.setTitle("CarbonSense");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        primaryStage.centerOnScreen();
        primaryStage.toFront();
    }

    private void createHeader(BorderPane root) {
        VBox header = new VBox();
        header.setStyle("-fx-background-color: linear-gradient(to right, #0f172a, #1e293b);");
        Label title = new Label("🌍 CarbonSense");
        title.setStyle("-fx-font-size: 24px; -fx-text-fill: #f1f5f9;");
        Label subtitle = new Label("Track, Analyze & Reduce Your Carbon Footprint");
        subtitle.setStyle("-fx-text-fill: #e2e8f0;");
        Label totalEmissionsLabel = new Label("Total Emissions: 0.00 kg CO₂");
        totalEmissionsLabel.setStyle("-fx-text-fill: #f1f5f9;");

        header.getChildren().addAll(title, subtitle, totalEmissionsLabel);
        root.setTop(header);
    }

    private void createNavigation(BorderPane root) {
        VBox navigation = new VBox();
        navigation.setStyle("-fx-background-color: #1e293b;");
        
        Button dashboardButton = new Button("📊 Dashboard");
        dashboardButton.setOnAction(e -> loadDashboard(root));
        
        Button transportButton = new Button("🚗 Transport");
        transportButton.setOnAction(e -> loadTransportPane(root));
        
        Button energyButton = new Button("⚡ Energy");
        energyButton.setOnAction(e -> loadEnergyPane(root));
        
        Button resetButton = new Button("🔄 Reset Data");
        resetButton.setOnAction(e -> resetAllData(root));

        navigation.getChildren().addAll(dashboardButton, transportButton, energyButton, resetButton);
        root.setLeft(navigation);
    }

    private void loadDashboard(BorderPane root) {
        DashboardPane dashboardPane = new DashboardPane(calculator);
        root.setCenter(dashboardPane);
    }

    private void loadTransportPane(BorderPane root) {
        TransportPane transportPane = new TransportPane(calculator);
        root.setCenter(transportPane);
    }

    private void loadEnergyPane(BorderPane root) {
        EnergyPane energyPane = new EnergyPane(calculator);
        root.setCenter(energyPane);
    }

    private void resetAllData(BorderPane root) {
        // Confirmation dialog and reset logic
    }
}