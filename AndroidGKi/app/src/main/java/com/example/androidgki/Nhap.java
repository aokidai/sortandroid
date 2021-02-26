package com.example.androidgki;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Nhap extends AppCompatActivity {
    Button btnNhap;
    EditText edtNhapDS;

    double a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nhap);
        btnNhap=(Button)findViewById(R.id.btnNhap);
        edtNhapDS=(EditText) findViewById(R.id.edtNhapDS);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] input = edtNhapDS.getText().toString().split(" ");
                int[] arr = new int[input.length];
                String[] chitiet = new String[1000];
                for(int i=0;i<input.length;i++)
                    arr[i] = Integer.parseInt(input[i].toString());
//                gọi hàm sắp xếp
//                BubbleSort bubble = new BubbleSort();

                //chuyển màn hình
               Intent i=new Intent();
                Bundle bundle = new Bundle();
                    //đóng gói dữ liệu
                String s = "";
                for (int o = 0; o < arr.length; o++) {
                    s += String.valueOf(arr[o])+" ";
                }
                    i.putExtra("chuoi",s);



                setResult(Activity.RESULT_OK, i);
                finish();

            }
        });

    }
}