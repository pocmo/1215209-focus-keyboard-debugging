package org.mozilla.focustest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(final View view) {
        view.focusSearch(View.FOCUS_DOWN).requestFocus();
        ((ViewGroup) view.getParent()).removeView(view);
    }
}
