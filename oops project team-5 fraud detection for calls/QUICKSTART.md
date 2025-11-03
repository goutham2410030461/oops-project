# QUICKSTART.md

## Quick Installation Guide for Carbon Emission Tracker

### Prerequisites

1. **Java Development Kit (JDK)**
   - Ensure you have JDK 17 or higher installed.
   - You can download it from [Adoptium](https://adoptium.net/).
   - Verify installation by running: 
     ```
     java -version
     ```

2. **Apache Maven**
   - You can either install Maven on your system or use the bundled Maven wrapper included in this project.
   - To install Maven, download it from [Maven's official site](https://maven.apache.org/download.cgi) and follow the installation instructions.

### Installation Steps

1. **Clone the Repository**
   - Open your terminal and run:
     ```
     git clone https://github.com/YOUR_USERNAME/carbon-emission-tracker.git
     cd carbon-emission-tracker
     ```

2. **Build the Project**
   - If you have Maven installed, run:
     ```
     mvn clean install
     ```
   - If using the bundled Maven wrapper, run:
     ```
     ./mvnw clean install
     ```

3. **Run the Application**
   - You can run the application using one of the following methods:

   **Method 1: Using IntelliJ IDEA**
   - Open the project in IntelliJ IDEA.
   - Wait for Maven to sync the dependencies.
   - Right-click on `CarbonTrackerApp.java` and select `Run`.

   **Method 2: Command Line**
   - Run the following command:
     ```
     mvn javafx:run
     ```

   **Method 3: Using Scripts**
   - For Windows, run:
     ```
     run.bat
     ```
   - For PowerShell, run:
     ```
     run.ps1
     ```

### First Run

- On the first run, Maven will download the necessary dependencies.
- The application window will open, and you can start tracking your carbon emissions.

### Troubleshooting

- If you encounter issues, refer to the `TROUBLESHOOTING` section in the documentation for common problems and solutions.

### Enjoy Tracking Your Carbon Footprint!

This guide should help you get started quickly with the Carbon Emission Tracker. For more detailed information, refer to the `README.md` and `START_HERE.md` files.