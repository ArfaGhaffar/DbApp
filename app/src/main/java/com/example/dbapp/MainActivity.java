package com.example.dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dbapp.Data.DbHandler;
import com.example.dbapp.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int images[] = {R.drawable.contacts,R.drawable.contacts,R.drawable.contacts,R.drawable.contacts,R.drawable.contacts};
        DbHandler db = new DbHandler(MainActivity.this);

        Contact harry = new Contact();
        harry.setContactNumber("9090909090");
        harry.setName("Harry");
        db.addContact(harry);


       Contact larry = new Contact();
        larry.setContactNumber("9090459090");
        larry.setName("Larry");
        db.addContact(larry);

       List<String> c1 = new ArrayList<>();
        List<String> c2 = new ArrayList<>();
         listView = findViewById(R.id.listView);


        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts){

             c1.add(contact.getName());
            c2.add(contact.getContactNumber());
        }

       // String[] mTitle =String{};
       // String[] mDescription ={};
        String[] mTitle = new String[ c1.size() ];
        c1.toArray(mTitle);
        String[] mDescription = new String[ c2.size() ];
        c2.toArray(mDescription);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription);
        listView.setAdapter(adapter);

        }


    }
