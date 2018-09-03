package com.vdishub.simplerecyclerviewexample;

import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<Contact> myContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        myContacts=DummyData.getData();
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myContacts);
        mRecyclerView.setAdapter(mAdapter);
        // row click listener
        mRecyclerView.addOnItemTouchListener(new RecyclerListener(getApplicationContext(), mRecyclerView, new RecyclerListener.ClickListener(){
            @Override
            public void onClick(View view, int position) {
                Contact contact = myContacts.get(position);
                Toast.makeText(getApplicationContext(), "Contact name ="+contact.getName()+"\n" +"Number = "+ contact.getNumber(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        }
}
