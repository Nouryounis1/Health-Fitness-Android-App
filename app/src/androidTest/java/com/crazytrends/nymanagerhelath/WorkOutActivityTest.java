package com.crazytrends.nymanagerhelath;

import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.crazytrends.nymanagerhelath.WalkandStep.activities.WalkingModesActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import kotlin.jvm.JvmField;

@RunWith(AndroidJUnit4.class)
public class WorkOutActivityTest {

    @Rule
    @JvmField
    public ActivityTestRule<WalkingModesActivity> mainWorkOut = new ActivityTestRule<>(WalkingModesActivity.class);


    @Test
    public void recyclerViewCheck() {
        RecyclerView recyclerView = mainWorkOut.getActivity().findViewById(R.id.walking_modes_list);
        int itemCount = recyclerView.getAdapter().getItemCount();


        Espresso.onView(withId(R.id.walking_modes_list))
                .perform(RecyclerViewActions.scrollToPosition(itemCount - 1));


    }





}
