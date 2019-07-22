package com.example.myworkbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button bt_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_send = findViewById(R.id.bt_send);
        editText = findViewById(R.id.edit_message);
        bt_send.setOnClickListener(oc);
    }
    View.OnClickListener oc = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sendMessage(view);
        }
    };
    public void sendMessage(View view){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        String message = editText.getText().toString();
        intent.putExtra("2552",message);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_acticity_actions,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_search:

                return true;
            case R.id.action_setting:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
