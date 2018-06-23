package com.udacity.gradle.builditbigger;

/**
 * Created by Lenovo on 19-06-2018.
 */

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest extends AndroidTestCase implements MyAsync.JokeResponse {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    private String joke;

    @Test
    public void asyncTaskTest() throws InterruptedException, ExecutionException, TimeoutException {
        MyAsync jokeAsync = new MyAsync();
        jokeAsync.asyncTaskResponse = this;
        jokeAsync.execute(new Pair<Context, String>(getContext(), "sayHi"));
        joke = jokeAsync.get(30, TimeUnit.SECONDS);
        assertTrue(joke, joke.length() > 0);
    }

    @Override
    public void finish(String result) {
    }
}

