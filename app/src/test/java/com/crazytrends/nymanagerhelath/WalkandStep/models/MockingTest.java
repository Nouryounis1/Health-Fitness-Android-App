package com.crazytrends.nymanagerhelath.WalkandStep.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;


@RunWith(MockitoJUnitRunner.class)

public class MockingTest {

    @Mock
    Training training = new Training();
    @Mock
    Pregnancy pregnancy = new Pregnancy();

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void trainingModesTest() {

        Mockito.when(training.getName()).thenReturn("Mode 1");
        String name = training.getName();

        Mockito.when(training.getDescription()).thenReturn("Morning Running Training");
        String description = training.getDescription();

        Mockito.when(training.getSteps()).thenReturn(1200.0);
        double steps = training.getSteps();

        Mockito.when(training.getDistance()).thenReturn(300.0);
        double distance = training.getDistance();

        Mockito.when(training.getCalories()).thenReturn(128.0);
        double calories = training.getCalories();

        assertEquals("Mode 2", name);
        assertEquals("Morning Running Training", description);
        assertTrue(1200 >= (int) steps);
        assertTrue(300 >= (int) distance);
        assertTrue(128.0 >= (int) calories);

    }

    @Test
    public void pregnancyDateTest() {
        String expectedDueDate = "2021-02-19";

        Mockito.when(pregnancy.getDate()).thenReturn("2020-11-12");
        String pregnancyDate = pregnancy.getDate();

        LocalDate date = LocalDate.parse(pregnancyDate);
        date = date.plusDays(280);

        assertEquals("2021-08-19", expectedDueDate);

        System.out.println(date);

    }


}
