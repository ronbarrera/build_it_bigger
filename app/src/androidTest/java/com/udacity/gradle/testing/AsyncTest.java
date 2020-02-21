package com.udacity.gradle.testing;

import androidx.test.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class AsyncTest {

    MainActivity activity;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp()  {
        activity = mActivityRule.getActivity();
    }

    @Test
    public void testJokeGCE() throws Exception {
        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);
        MainActivity.EndpointsAsyncTask testTask = new MainActivity.EndpointsAsyncTask(activity) {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                if (result != null){
                    assertTrue(result.length() > 0);
                    latch.countDown();
                }
            }
        };
        testTask.execute();
        latch.await();
    }
}
