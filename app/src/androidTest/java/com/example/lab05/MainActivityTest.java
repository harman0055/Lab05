package com.example.lab05;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(5966);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        ViewInteraction appCompatEditText2 = onView(withId(R.id.passwordEditText));
        appCompatEditText2.perform(replaceText("12345"), closeSoftKeyboard());


        ViewInteraction appCompatButton = onView(withId(R.id.checkButton));

        appCompatButton.perform(click());

        ViewInteraction textView = onView(withId(R.id.textView));
        textView.check(matches(withText("You shall not pass!")));
    }
@Test
    public void FindMissingUpperLetter(){
    try {
        Thread.sleep(5966);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        //find the view
        ViewInteraction appcompactEditText= onView(withId(R.id.passwordEditText));
        //type the password nidhi@1234
        appcompactEditText.perform(replaceText("harman633@"));
        //find the Button
        ViewInteraction button= onView(withId(R.id.checkButton));
        //click the Button
        button.perform(click());

        //find the TextView
        ViewInteraction textview =onView(withId(R.id.textView));
        //check the text
        textview.check(matches(withText("You Shall not Pass")));
    }
    @Test
    public void FindMissingLowerLetter(){
        try {
            Thread.sleep(5966);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //find the view
        ViewInteraction AppcompactEditText= onView(withId(R.id.passwordEditText));
        //type the password NIDHI@1234
        AppcompactEditText.perform(replaceText("HARMAN633@"));
        //find the Button
        ViewInteraction button= onView(withId(R.id.checkButton));
        //click the Button
        button.perform(click());

        //find the TextView
        ViewInteraction textview =onView(withId(R.id.textView));
        //check the text
        textview.check(matches(withText("You Shall not Pass")));
    }
@Test
    public void FindMissingNumber(){
        //find the view
        ViewInteraction appcompactEditText= onView(withId(R.id.passwordEditText));
        //type the password Nidhi@#
        appcompactEditText.perform(replaceText("Harman633@#"));
        //find the Button
        ViewInteraction button= onView(withId(R.id.checkButton));
        //click the Button
        button.perform(click());

        //find the TextView
        ViewInteraction textview =onView(withId(R.id.textView));
        //check the text
        textview.check(matches(withText("You Shall not Pass")));
    }
    @Test
    public void FindMissingSpecialLetter() {
        //find the view
        ViewInteraction appcompactEditText = onView(withId(R.id.passwordEditText));
        //type the password Nidhi1234
        appcompactEditText.perform(replaceText("Harman633@"));
        //find the Button
        ViewInteraction button = onView(withId(R.id.checkButton));
        //click the Button
        button.perform(click());

        //find the TextView
        ViewInteraction textview = onView(withId(R.id.textView));
        //check the text
        textview.check(matches(withText("You Shall not Pass")));

    }
    }


