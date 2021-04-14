package com.example.tugass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txttampil;
    EditText edtnama,edtnpm,edtjeniskelamin,edtnotelepon;
    Button btnsubmit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txttampil = (TextView) findViewById(R.id.txtnamadannpm);
       edtnama = (EditText) findViewById(R.id.edtnama);
        edtnpm = (EditText) findViewById(R.id.edtnpm);
        edtjeniskelamin = (EditText) findViewById(R.id.edtjeniskelamin);
        edtnotelepon = (EditText) findViewById(R.id.edtnotelepon);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnama = edtnama.getText().toString();
                String strnpm = edtnpm.getText().toString();
                String strjeniskelamin = edtjeniskelamin.getText().toString();
                String strnotelepon = edtnotelepon.getText().toString();

                txttampil.setText(strnama +"\n" + strnpm +"\n" + strjeniskelamin +"\n" + strnotelepon);

            }
        });

    }
}