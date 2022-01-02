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


        DbHandler db = new DbHandler(MainActivity.this);

        Contact harry = new Contact();
        harry.setContactNumber("9090909090");
        harry.setName("Harry");
        db.addContact(harry);


        Contact larry = new Contact();
        larry.setContactNumber("9090459090");
        larry.setName("Larry");
        db.addContact(larry);

        ArrayList<String> contacts = new ArrayList<>();
         listView = findViewById(R.id.listView);



        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts){

            Log.d("Database", "\nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n"+
                    "Phone Number: " + contact.getContactNumber() + "\n" );
            contacts.add(contact.getName() + " (" + contact.getContactNumber() + ")");
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contacts);
        listView.setAdapter(arrayAdapter);

        }


    }
