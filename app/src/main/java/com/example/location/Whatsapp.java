package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Whatsapp extends AppCompatActivity {
    Button b1;
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);
        b1=(Button)findViewById(R.id.b1);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String s1,s2;
            s1=e1.getText().toString();
            s2=e2.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone="+s2+"&text="+s1));
                startActivity(intent);
                Toast.makeText(getApplicationContext(),s1+s2,Toast.LENGTH_LONG).show();

            }
        });
    }
}
