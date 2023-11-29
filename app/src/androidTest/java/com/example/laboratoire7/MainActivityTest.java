package com.example.laboratoire7;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import android.widget.TextView;
import androidx.test.annotation.UiThreadTest;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    private MainActivity mActivity = null;
    private TextView text;

    @Before
    public void setUp() throws Exception {
        mActivityTestRule.getScenario().onActivity(activity -> mActivity = activity);
    }

    @Test
    @UiThreadTest
    public void checkFirstName() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.textView1));
        text = mActivity.findViewById(R.id.username);
        text.setText("user1");
        String name = text.getText().toString();
        assertNotEquals("user", name);
    }
}