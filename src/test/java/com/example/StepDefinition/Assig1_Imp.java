package com.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Assig1.Assig1Base;

import java.io.IOException;

import static org.example.Assig1.Assig1Base.*;

public class Assig1_Imp extends Assig1Base {


    @Given("User launches the application1")
    public void userLaunchesTheApplication() throws IOException {
        BrowserSetup();
    }

    @And("User Register to the application with user and password")
    public void userRegisterToTheApplicationWithUserAndPassword() {
        RegisterClick();
        UserRegistration();
    }


}