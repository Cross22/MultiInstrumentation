package example.multiinstrumentation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import example.mylibrary.SomeLibraryClass;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Activity has dependency on library class
    public SomeLibraryClass getLibraryClass() {
        return new SomeLibraryClass();
    }

}
