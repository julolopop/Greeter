package com.example.usuario.greeter;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<GreeterActivity> greeterActivityActivityTestRule = new ActivityTestRule<>(GreeterActivity.class);

    @Test
    public void TestGreet() throws Exception {
        onView(withId(R.id.greetEditText))
                .perform(typeText("Jake"), closeSoftKeyboard());

        onView(withText("Greet")).perform(click());

        onView(withId(R.id.messageTextView))
                .check(matches(withText("Hello, Jake!")));

    }
}
