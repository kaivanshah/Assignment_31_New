package com.kaivanshah.assignment_31;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_Search;
    EditText EditText_Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Search = (Button) (this.findViewById(R.id.btn_Search));
        EditText_Search = (EditText) (this.findViewById(R.id.EditText_Search));
        btn_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri objURI = Uri.parse("http://www.google.co.in/#q=" + EditText_Search.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, objURI);
                startActivity(intent);
            }});

    }
}

