package edu.tacoma.uw.rabin001;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    private static final String TAG_MESSAGE = "DisplayMessageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView msgTextView = findViewById(R.id.textView);
        msgTextView.setText(message);
        Log.i(TAG_MESSAGE, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG_MESSAGE, "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG_MESSAGE, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_MESSAGE, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG_MESSAGE, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG_MESSAGE, "onDestroy");
    }
}