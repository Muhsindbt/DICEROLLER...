package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.diceroller.MainActivity.list;

public class DisplayMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }
    public void saveclick(View view) {
        EditText et = this.findViewById(R.id.editText);
        Intent returnBtn = new Intent (this, MainActivity.class);
        startActivity(returnBtn);
    }
        public void cancel_click(View view) {
        EditText et = this.findViewById(R.id.editText);
        Intent returnBtn = new Intent (this, MainActivity.class);
        startActivity(returnBtn);
        }
        public void cancel_cick(View view) {
            Intent returnBtn = new Intent(this, MainActivity.class);
            startActivity(returnBtn);
            finish();
        }
}
