package com.einovice;

import io.cucumber.core.cli.Main;

public class App {
    public static void main(String[] args) {
        // Corrected arguments to run Cucumber CLI
        String[] cucumberOptions = new String[] {
            "--glue", "com.einovice.stepdefinitions",
            "classpath:features"
        };

        byte exitStatus = Main.run(cucumberOptions, Thread.currentThread().getContextClassLoader());
        System.exit(exitStatus);
    }
}
