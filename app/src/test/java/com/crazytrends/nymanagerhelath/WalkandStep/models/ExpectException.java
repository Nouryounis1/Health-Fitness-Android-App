package com.crazytrends.nymanagerhelath.WalkandStep.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExpectException {

    @BeforeClass
    public static void runOnceBeforeClass() {

        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    @Before
    public void runBeforeTestMethod() {

        System.out.println("@Before - runBeforeTestMethod");
    }


    @Test
    public void testThatMethodThrowsException() {
        try {
            String maleOrFemale = "male";
            double weightInPounds = 50.0;
            double heightFeet = 3.0;
            double heightInches = 2.0;
            double age = 20;
            double heightInInches = (heightFeet * 12) + heightInches;
            double heightInMeters = heightInInches / 0;
            double weightInKilograms = weightInPounds / 2.2046;
            double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
            double basalMetabolicRate = 0;
            double expectedBMR = 730.0;
            System.out.println(maleOrFemale);
            if (maleOrFemale.equals("male") || maleOrFemale.equals("m")) {
                basalMetabolicRate = 66 + (6.23 * weightInPounds) + (12.7 * heightInInches) - (6.8 * age);
                System.out.println("male selected");
                //female
            } else if (maleOrFemale.equals("female") || maleOrFemale.equals("f")) {
                basalMetabolicRate = 655 + (4.35 * weightInPounds) + (4.7 * heightInInches) - (4.7 * age);
                System.out.println("female selected");
            }
            Assert.fail("Should have thrown Arithmetic exception");
        } catch (ArithmeticException e) {
            System.out.println("Divides on zero exception");
        }


    }


    @Test
    public void testThatMethodThrowsException2() {

        try {
            double hrr, min, max, maxHr;
            int age = 21;
            int rhr = 90;
            double minPer = 50;
            double maxPer = 120;

            maxHr = 206.9 - (0.67 * age);
            hrr = (maxHr - rhr);
            min = (hrr * (minPer / 100)) + rhr;
            max = (hrr * (maxPer / 100)) + rhr;
            System.out.println("Target Heart Rate zone is between " + min + " to " + max);
            Assert.fail("Should have thrown Number Format  exception");
        } catch (NumberFormatException e) {
            System.out.println("Format Not Allowed");
        }


    }


    @After
    public void runAfterTestMethod() {

        System.out.println("@After - runAfterTestMethod");
    }

    @AfterClass
    public static void runOnceAfterClass() {

        System.out.println("@AfterClass - runOnceAfterClass");
    }


}


