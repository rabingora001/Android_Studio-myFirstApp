package edu.tacoma.uw.rabin001;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "edu.tacoma.uw.rabin001.MESSAGE";
    private static final String TAG_MESSAGE = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText msgEditText = (EditText) findViewById(R.id.editText);
        String message = msgEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}