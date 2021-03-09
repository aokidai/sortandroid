package com.example.androidgki;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class ChonGt extends AppCompatActivity {
    RadioButton rdBubble,rdIntertion,rdMerge,rdSelection,rdQuick,rdShell,rdInterchage,rdRadix;
    Button btnDongGT,button;
    TextView textView3;
    String giaithuat = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_gt);
        rdBubble=(RadioButton)findViewById(R.id.rdBubble);
        rdMerge=(RadioButton)findViewById(R.id.rdMerge);
        rdIntertion=(RadioButton)findViewById(R.id.rdIntertion);
        rdQuick=(RadioButton)findViewById(R.id.rdQuick);
        rdSelection=(RadioButton)findViewById(R.id.rdSelection);
        rdShell=(RadioButton)findViewById(R.id.rdShell);
        rdInterchage=(RadioButton)findViewById(R.id.rdInterchage);
        rdRadix=(RadioButton)findViewById(R.id.rdRadix);
        btnDongGT=(Button)findViewById(R.id.btnDongGT);

        btnDongGT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInformation();
                Intent i=new Intent();
                Bundle bundle = new Bundle();
                //đóng gói dữ liệu
//                Bundle bundle = new Bundle();
//
//                bundle.putString("giaithuat", giaithuat);
//                intent.putExtra("nhom9",bundle);
                i.putExtra("giaithuat",giaithuat);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });


    }
    private void showInformation() {
        if (rdBubble.isChecked())
            giaithuat += rdBubble.getText();
        if (rdIntertion.isChecked())
            giaithuat += rdIntertion.getText();
        if (rdMerge.isChecked())
            giaithuat += rdMerge.getText();
        if (rdQuick.isChecked())
            giaithuat += rdQuick.getText();
        if (rdShell.isChecked())
            giaithuat += rdShell.getText();
        if (rdInterchage.isChecked())
            giaithuat += rdInterchage.getText();
        if (rdRadix.isChecked())
            giaithuat += rdRadix.getText();
        if (rdSelection.isChecked())
            giaithuat += rdSelection.getText();
    }
}