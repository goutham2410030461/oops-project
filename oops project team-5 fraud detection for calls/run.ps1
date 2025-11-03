# PowerShell script to run the Carbon Emission Tracker application

# Navigate to the project directory
cd "$(dirname $PSScriptRoot)"

# Clean and compile the project
mvn clean compile

# Run the application with JavaFX
mvn javafx:run