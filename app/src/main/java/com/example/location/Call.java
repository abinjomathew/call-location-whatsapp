package com.example.location;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Call extends AppCompatActivity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        b1=(Button)findViewById(R.id.b1);
        e1=(EditText)findViewById(R.id.e1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+s));
                if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(intent);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();

            }
        });
    }
}
