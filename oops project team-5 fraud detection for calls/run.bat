@echo off
REM This batch file is used to run the Carbon Emission Tracker application.

REM Navigate to the project directory
cd /d "%~dp0"

REM Clean and compile the project using Maven
mvn clean compile

REM Run the application using JavaFX Maven plugin
mvn javafx:run

pause