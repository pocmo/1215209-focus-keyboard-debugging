package org.mozilla.focustest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    private ViewGroup container;
    private TestView testView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (ViewGroup) findViewById(R.id.container);

        testView = (TestView) findViewById(R.id.testView);
        testView.requestFocus();
    }

    public void onButtonClicked(final View view) {
        container.removeView(view);
        testView.requestFocus();
    }
}
