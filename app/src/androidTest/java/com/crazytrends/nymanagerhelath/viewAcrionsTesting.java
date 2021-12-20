package com.crazytrends.nymanagerhelath;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.crazytrends.nymanagerhelath.bmi.BMI_Calculator;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import kotlin.jvm.JvmField;

@RunWith(AndroidJUnit4.class)

public class viewAcrionsTesting {


    @Rule
    @JvmField
    public ActivityTestRule<BMI_Calculator> mainWorkOut = new ActivityTestRule<>(BMI_Calculator.class);


    @Test
    public void viewActionCheck() {
        String age = "20";
        String heghit = "10";
        String weight = "100";


        onView(withId(R.id.et_age)).perform(typeText(age), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.et_height)).perform(typeText(heghit), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.et_weight)).perform(typeText(weight), ViewActions.closeSoftKeyboard());


        onView(withId(R.id.et_age)).check(matches(withText(age)));
        onView(withId(R.id.et_height)).check(matches(withText(heghit)));
        onView(withId(R.id.et_weight)).check(matches(withText(weight)));

        onView(withId(R.id.tv_search_bmi)).perform(click());

        onView(withId(R.id.tv_bmi)).check(matches(is(withText("Body Mass Index Calculator"))));
        onView(withId(R.id.tv_bmi)).check(matches(not(is(withText("Body Mass Index Calculator")))));
        onView(withId(R.id.tv_bmi)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_bmi)).check(matches(isCompletelyDisplayed()));
    }

}
