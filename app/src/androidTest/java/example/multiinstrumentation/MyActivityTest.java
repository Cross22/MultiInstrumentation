package example.multiinstrumentation;

import android.test.ActivityInstrumentationTestCase2;

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

    // execute some code in the library
    public void testLibImport() {
        boolean result= getActivity().getLibraryClass().someLibraryFunction();
        assertTrue("will always be true",  result);
    }
}