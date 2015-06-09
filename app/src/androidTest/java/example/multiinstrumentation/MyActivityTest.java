package example.multiinstrumentation;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.TestMethod;

import example.mylibrary.TestMe;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MyActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        getActivity();
    }

    public void testLibImport() {
        TestMe t= new TestMe();
        assertTrue("Will always be true", t.test());
    }
}