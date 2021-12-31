package com.example.dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.dbapp.Data.DbHandler;
import com.example.dbapp.model.Contacts;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DbHandler db = new DbHandler(MainActivity.this);

        Contacts Ahmad = new Contacts();
        Contacts Ali = new Contacts();

        Ahmad.setContactNumber("9090909090");
        Ahmad.setName("Ahmad Khan");
        Ali.setContactNumber("9090459090");
        Ali.setName("Ali Asif");

        db.addContact(Ahmad);
        db.addContact(Ali);

        List<Contacts> allContacts = db.getAllContacts();
        for(Contacts contact: allContacts){
            Log.d("Database class", "\nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n"+
                    "Phone Number: " + contact.getContactNumber() + "\n" );


        }


    }
}