# Getting Started with Carbon Emission Tracker

Welcome to the **Carbon Emission Tracker** (also known as **CarbonSense**)! This guide will help you get started with the application, providing you with the necessary steps to set it up and begin tracking your carbon footprint.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

1. **Java Development Kit (JDK)**
   - Version: 17 or higher (Java 25 recommended)
   - Download from: [Adoptium](https://adoptium.net/)

2. **Apache Maven**
   - Version: 3.6 or higher
   - Download from: [Maven](https://maven.apache.org/download.cgi)

3. **IDE (Optional but Recommended)**
   - IntelliJ IDEA Community Edition
   - Eclipse with JavaFX plugin
   - VS Code with Java extensions

## Installation Steps

1. **Clone the Repository**
   - Use Git to clone the repository to your local machine:
     ```
     git clone https://github.com/YOUR_USERNAME/carbon-emission-tracker.git
     ```

2. **Navigate to the Project Directory**
   - Open a terminal and navigate to the project folder:
     ```
     cd carbon-emission-tracker
     ```

3. **Build the Project**
   - Use Maven to build the project:
     ```
     mvn clean install
     ```

4. **Run the Application**
   - You can run the application using one of the following methods:

   **Method 1: Using IntelliJ IDEA**
   - Open the project in IntelliJ IDEA.
   - Right-click on `CarbonTrackerApp.java` and select `Run`.

   **Method 2: Using Command Line**
   - Run the application with Maven:
     ```
     mvn javafx:run
     ```

   **Method 3: Using Scripts**
   - For Windows, use the provided batch script:
     ```
     run.bat
     ```
   - For PowerShell, use:
     ```
     run.ps1
     ```

## Using the Application

Once the application is running, you will see the main interface where you can:

- **Track Emissions**: Input your transportation, energy, and food consumption data.
- **View Analytics**: Check your carbon footprint through visual analytics and statistics.
- **Get Tips**: Receive personalized recommendations to reduce your carbon emissions.

## Troubleshooting

If you encounter any issues during installation or while running the application, refer to the `TROUBLESHOOTING.md` file for common problems and solutions.

## Conclusion

Thank you for choosing Carbon Emission Tracker! By using this application, you are taking a step towards understanding and reducing your carbon footprint. Happy tracking!