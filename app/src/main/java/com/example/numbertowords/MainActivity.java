package com.example.numbertowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText Edit1;
 private  Button btnclick;
 private TextView tvresult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edit1=findViewById(R.id.Edit1);
        btnclick=findViewById(R.id.btnclick);
        tvresult=findViewById(R.id.tvresult);
        btnclick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String result = Sandesh_numbertowords.convert(Long.parseLong(Edit1.getText().toString()));
        tvresult.setText(result);
    }
}
