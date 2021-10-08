package com.example.searchablespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchableSpinner searchableSpinner= findViewById(R.id.searchablespinner);
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("wedday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("sunday");
        searchableSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, days ));
searchableSpinner.setTitle("Select days");

searchableSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String  SpinerValue3 = parent.getItemAtPosition(position).toString();

        Toast.makeText(getBaseContext(),
                "You have selected  : " + SpinerValue3,
                Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});


    }
}