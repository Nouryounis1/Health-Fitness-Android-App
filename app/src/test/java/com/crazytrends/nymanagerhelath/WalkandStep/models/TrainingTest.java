package com.crazytrends.nymanagerhelath.WalkandStep.models;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

 public class TrainingTest extends TestCase {
    @BeforeClass
    public static void runOnceBeforeClass() {

        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    @Before
    public void runBeforeTestMethod() {

        System.out.println("@Before - runBeforeTestMethod");
    }


    @Test
    public void testMethod1() {
        String maleOrFemale = "male";
        double weightInPounds = 50.0;
        double heightFeet = 3.0;
        double heightInches = 2.0;
        double age = 20;

        double heightInInches = (heightFeet * 12) + heightInches;

        double heightInMeters = heightInInches / 39.370;
        double weightInKilograms = weightInPounds / 2.2046;

        double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);

        double basalMetabolicRate = 0;
        double expectedBMR = 730.0;

        System.out.println(maleOrFemale);

        //male
        if (maleOrFemale.equals("male") || maleOrFemale.equals("m")) {

            basalMetabolicRate = 66 + (6.23 * weightInPounds) + (12.7 * heightInInches) - (6.8 * age);
            System.out.println("male selected");
            //female
        } else if (maleOrFemale.equals("female") || maleOrFemale.equals("f")) {

            basalMetabolicRate = 655 + (4.35 * weightInPounds) + (4.7 * heightInInches) - (4.7 * age);
            System.out.println("female selected");
        }

        assertEquals(expectedBMR, basalMetabolicRate);

    }

    @Test
    public void testMethod2() {

        double height = 10.0;

        double weight = 200.0;
        double expectedBMi = 1406.0;

        double bmi = weight / Math.pow(height, 2) * 703;

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
        System.out.println(bmi);
        assertNotEquals(expectedBMi, bmi);

    }


    @Test
    public void testMethod3() {

        double healthy_weight, height;
        height = 2.0;
        healthy_weight = height * height * 25;
        double expectedHealthyWeight = 120.0;
        if (healthy_weight > 25)
            System.out.println("You have to lose weight.");
        if (healthy_weight >= 18.5 && healthy_weight <= 25)
            System.out.println("Your weight is considered healthy.");
        if (healthy_weight < 18.5)
            System.out.println("You have to win weight.");
        System.out.println("Value of healthy weight: " + healthy_weight);
        assertTrue(healthy_weight > expectedHealthyWeight);

    }

    @Test
    public void testMethod4() {

        double AC;
        double BAC = 24.5;
        double timehr = 26.3;
        double male;
        double wt = 56;
        double resbeer, ozbeer, reswine, ozwine, resspirit, ozspirit;
        double bachr = BAC + (timehr * 20);
        male = (bachr * wt) / (1.22 * 100);
        resbeer = male / 0.05;
        ozbeer = resbeer / 29.59;
        reswine = male / 0.12;
        ozwine = reswine / 29.59;
        resspirit = male / 0.4;
        ozspirit = resspirit / 29.59;

        System.out.println("Beer (5percent ethanol) " + resbeer + " mL " + ozbeer + " oz");
        System.out.println("Wine (12percent ethanol) " + reswine + " mL " + ozwine + " oz");
        System.out.println("Spirit (40percent ethanol) " + resspirit + " mL " + ozspirit + " oz");

        assertFalse(resbeer > ozbeer);
        assertFalse(reswine > ozwine);
        assertFalse(resspirit > resspirit);
    }

    @Test
    public void testMethod5() {
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

        assertTrue("Error, Target Heart Rate zone is too high", max >= 120);
        assertTrue("Error, random is too low", min <= 70);


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