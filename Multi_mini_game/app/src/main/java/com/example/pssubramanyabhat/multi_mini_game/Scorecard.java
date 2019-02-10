/*package com.example.pssubramanyabhat.multi_mini_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Scorecard extends AppCompatActivity {
    DatabaseHelper mDatabaseHelper;
    Button views,save;
    //Button btnAdd;
    EditText namelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorecard);
        views = (Button)findViewById(R.id.views);
        save = (Button)findViewById(R.id.save);
        namelist = (EditText) findViewById(R.id.namelist);
        mDatabaseHelper = new DatabaseHelper(this);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = namelist.getText().toString();
                if (namelist.length()!=0)
                {
                    AddData(newEntry);
                    namelist.setText("");
                }
                else
                {
                    toastMessage("Add something in the text field");
                }
            }
        });

        views.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scorecard.this,ListDataActivity.class);
                startActivity(intent);
            }
        });


    }

    public void AddData(String newEntry)
    {
        boolean insertData = mDatabaseHelper.addData(newEntry);

        if (insertData)
        {
            toastMessage("Data Successfully Inserted");
        }
        else
        {
            toastMessage("Something went wrong");
        }
    }

    private void toastMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}*/
