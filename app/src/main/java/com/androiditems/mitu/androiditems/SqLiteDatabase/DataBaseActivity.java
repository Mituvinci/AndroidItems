package com.androiditems.mitu.androiditems.SqLiteDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.androiditems.mitu.androiditems.R;

import java.util.ArrayList;

public class DataBaseActivity extends AppCompatActivity {

    DBHelper dbHelper;
    private RecyclerView mRecyclerView;
    public static RecyclerContactAdapter mAdapter;    // ImageView img;
    ArrayList<NameModel> alContacts =  new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);
        mRecyclerView = (RecyclerView) findViewById(R.id.listView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //img = (ImageView)findViewById(R.id.contactimage);
        dbHelper = new DBHelper(getApplicationContext());
        //new start

       /* alContacts = dbHelper.getContactList();
        //new end


        mAdapter = new RecyclerContactAdapter(getApplicationContext(), alContacts);
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mAdapter);*/

        clicklist();
        mAdapter.setOnItemClickListener(new RecyclerContactAdapter.customInterface1() {
            @Override
            public void onItemClick(int position, View v) {
                int _id = alContacts.get(position).id;

                String namec = alContacts.get(position).name;

                //  Toast.makeText(getApplicationContext(),String.valueOf(_id),Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), AddActivity.class);
                i.putExtra("_id", _id);
                i.putExtra("namep", namec);
                startActivityForResult(i, 101);

                //edit end


            }
        });
        mRecyclerView.setNestedScrollingEnabled(false);

    }


    public void clicklist(){
        alContacts = dbHelper.getContactList();
        mAdapter = new RecyclerContactAdapter(getApplicationContext(), alContacts);
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mAdapter);
    }


    public void goToAdd(View v){
        startActivityForResult(new Intent(getApplicationContext(), AddActivity.class),100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 100){
            if(resultCode == RESULT_OK){
                clicklist();
            }
        }
        else if(requestCode == 101){
            if(resultCode == RESULT_OK){
                clicklist();
            }
        }
        if(requestCode == 102){
            if(resultCode == RESULT_OK){
                clicklist();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


}
