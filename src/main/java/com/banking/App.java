package com.banking;

import com.banking.models.Bank;
import com.banking.models.humans.BankWorker;
import com.banking.models.humans.DataBaseAdministrator;
import com.banking.models.humans.Guest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class App {

    public static int maxTries = 3;
    static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        final Logger logger = LogManager.getLogger(App.class);
        logger.info("Entering application.");
        printLine();

        Bank solvdBank = new Bank();

        //Adds all initial information to bank collections with DBA singleton class;
        DataBaseAdministrator dba = DataBaseAdministrator.getDBA();
        dba.dbMigration(solvdBank);

        logger.info("Welcome to " + solvdBank.getName() + " !\n" + "Please Insert your ID Number to operate:");
        int idNumber = keyboardInput.nextInt();

        //Guest tries to take a credit.
        logger.warn("You are a guest, you need an account to ask for a credit");

        //Client with low credit score
        //if (!client1.checkEligibilityForCredit()) {
        //System.out.println(client1.getName() + ", your credit score of " + client1.getCreditScore() + " is too low.");

        //Adding client that tests methods
        //OPTIONS MENU

        logger.info("Exiting application.");
        System.exit(-1);
    }

    public static void guestApp(Bank bank, Guest guest) {
    }


    public static void bankWorkerApp(Bank bank, Class<? extends BankWorker> worker) {
    }

    public static void printLine() {
        System.out.println("-----------------------------------------------------");
    }

}

