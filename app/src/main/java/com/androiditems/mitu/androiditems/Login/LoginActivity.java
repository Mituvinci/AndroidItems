package com.androiditems.mitu.androiditems.Login;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androiditems.mitu.androiditems.R;

import java.util.HashMap;

public class LoginActivity extends AppCompatActivity {
    private EditText mValueEditText;
    private Button mOkButton;
    private TextView mShowTextView;
    private String mValue;
    private SessionManager mSessionManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mValueEditText = (EditText) findViewById(R.id.valueText);
        mOkButton = (Button) findViewById(R.id.okButton);
        mShowTextView = (TextView) findViewById(R.id.showtextView);
        mSessionManager = new SessionManager(getApplicationContext());
        mOkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValue = mValueEditText.getText().toString();
                mSessionManager.store(mValue);
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
                HashMap<String, String> user = mSessionManager.getValue();

                String districtname = user.get(SessionManager.VALUE);
                mShowTextView.setText(districtname);

            }
        });
    }
}
