package com.ndtaylor.lib2;

import android.app.Application;
import android.test.ApplicationTestCase;
import com.ndtaylor.lib1.AnInterface;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
        AnInterface anInterface = null;
    }
}
