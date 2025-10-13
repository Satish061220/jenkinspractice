

package com.einovice;

import io.cucumber.core.cli.Main;

public class App {
    public static void main(String[] args) {//comment hellooooo
        // Point to the classpath for main/resources/features
        String[] cucumberOptions = new String[] {
            "--glue", "com.einovice.stepdefinitions",
            "classpath:features"
        };

        byte exitStatus = Main.run(cucumberOptions, Thread.currentThread().getContextClassLoader());
        System.exit(exitStatus);
    }
}

