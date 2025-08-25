package com.einovice;

import io.cucumber.core.cli.Main;

public class App {
    public static void main(String[] args) {
        // Arguments to run Cucumber CLI
        String[] cucumberOptions = new String[] {
            "--glue", "com.einovice.stepdefinitions",
            "src/test/resources/features"
        };

        // Run Cucumber
        byte exitStatus = Main.run(cucumberOptions, Thread.currentThread().getContextClassLoader());

        // Exit with the appropriate status
        System.exit(exitStatus);
    }
}
