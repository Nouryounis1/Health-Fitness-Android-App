package com.crazytrends.nymanagerhelath;

import static android.content.Intent.getIntent;
import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.crazytrends.nymanagerhelath.general.Splash;
import com.crazytrends.nymanagerhelath.pill_reminder.Pill_MainActivity;
import com.crazytrends.nymanagerhelath.pill_reminder.ReminderAddActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class intentTesting {


    @Rule
    public ActivityTestRule<Pill_MainActivity> activityRule
            = new ActivityTestRule<>(Pill_MainActivity.class, false, false);




    @Test
    public void moveToNextActivity() {

        Intent intent = new Intent();
        activityRule.launchActivity(intent);
        SystemClock.sleep(2000);

        onView(withId(R.id.add_reminder)).perform(click());


    }


    @Test
    public void testgetData() {

        Intent intent = new Intent();
        intent.putExtra("name", "Panadol");
        activityRule.launchActivity(intent);

        onView(withId(R.id.add_reminder)).perform(click());
        String name = intent.getStringExtra("name");

        onView(withId(R.id.reminder_title)).perform(typeText(name), ViewActions.closeSoftKeyboard());


    }




}
