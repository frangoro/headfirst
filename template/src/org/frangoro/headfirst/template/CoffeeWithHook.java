package org.frangoro.headfirst.template;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Brew coffee grinds");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {

        String answer = getCustomerResponse();

        if ("y".equalsIgnoreCase(answer)) {
            return true;
        } else {
            return false;
        }
    }

    private String getCustomerResponse() {

        String response = "y";

        System.out.println("Would you like condiments? (Y/N)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = in.readLine();
        } catch (IOException e) {
            System.err.println("Error reading your answer.");
        }

        return response;
    }
}
