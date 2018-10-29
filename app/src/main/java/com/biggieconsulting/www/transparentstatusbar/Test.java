package com.biggieconsulting.www.transparentstatusbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class Test extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mToolbar;
    private TextView mTextViewTitle;
    private EditText mEditTextName;
    private EditText mEditTextEmail;
    private Spinner mSpinnerFeedbackType;
    private EditText mEditTextFeedbackBody;
    private CheckBox mCheckBoxResponse;
    private Button mButtonSendFeedback;
    private ScrollView mScrollView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mTextViewTitle = (TextView) findViewById(R.id.TextViewTitle);
        mEditTextName = (EditText) findViewById(R.id.EditTextName);
        mEditTextEmail = (EditText) findViewById(R.id.EditTextEmail);
        mSpinnerFeedbackType = (Spinner) findViewById(R.id.SpinnerFeedbackType);
        mEditTextFeedbackBody = (EditText) findViewById(R.id.EditTextFeedbackBody);
        mCheckBoxResponse = (CheckBox) findViewById(R.id.CheckBoxResponse);
        mButtonSendFeedback = (Button) findViewById(R.id.ButtonSendFeedback);
        mButtonSendFeedback.setOnClickListener(this);
        mScrollView01 = (ScrollView) findViewById(R.id.ScrollView01);
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.ButtonSendFeedback:
                break;
        }
    }
}
