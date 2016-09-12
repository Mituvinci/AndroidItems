package com.androiditems.mitu.androiditems.SqLiteDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androiditems.mitu.androiditems.R;

public class AddActivity extends AppCompatActivity {

    EditText etName, etPhone;
    DBHelper dbHelper;
    int _id;
    TextView tv;
    Button del;
    DataBaseActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        etName = (EditText) findViewById(R.id.editText);
        tv = (TextView)findViewById(R.id.textView1);
        del = (Button)findViewById(R.id.delete1);
        dbHelper = new DBHelper(getApplicationContext());
        del.setVisibility(View.INVISIBLE);

        Intent i = getIntent();
        _id = i.getIntExtra("_id",-1);
        if(_id>0){
            String name = i.getStringExtra("namep");
            etName.setText(name);
            tv.setText("Edit Contact");
            del.setVisibility(View.VISIBLE);
        }
    }

    public void addContact(View v){
        String name = etName.getText().toString();
        NameModel ch = new NameModel(name);
        if(_id > 0){
            dbHelper.updatec(_id, ch);
        }else
            dbHelper.insertContact(ch);
        //startActivity( new Intent(getApplicationContext(),MainActivity.class) );
        setResult(RESULT_OK);
        finish();

    }

    public void deletecontact(View v){
        dbHelper.deleteContact(_id);
        // startActivityForResult( new Intent(getApplicationContext(),MainActivity.class),102 );
        setResult(RESULT_OK);
        finish();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 102){
            if(resultCode == RESULT_OK){
                mainActivity.clicklist();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    public void back(View v){
        // startActivity( new Intent(getApplicationContext(),MainActivity.class) );
        setResult(RESULT_OK);
        finish();
    }

}
