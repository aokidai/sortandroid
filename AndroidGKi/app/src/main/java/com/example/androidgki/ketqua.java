package com.example.androidgki;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ketqua extends AppCompatActivity {
    EditText txtKetQua, txtChiTiet;
    Button btnThoat;
    int[] arr = new int[1000];
    String[] chitiet = new String[1000];
    String s = "", chitietketqua = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);
        txtKetQua = (EditText)findViewById(R.id.txtKetqua);
        txtChiTiet = (EditText)findViewById(R.id.txtChitiet);
        btnThoat = (Button)findViewById(R.id.btnThoat);
//        nhận dữ liệu
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("nhom9");
        arr = bundle.getIntArray("chuoi");
        chitiet = bundle.getStringArray("chitiet");
        //xử lí kết quả
        for (int i=0;i<arr.length;i++)
        {
            s+= " " + String.valueOf(arr[i]);
        }
        int m=0;
        while(chitiet[m]!=null)
        {
            chitietketqua += chitiet[m] + System.getProperty("line.separator");
            m++;
        }
        txtKetQua.setText(s);
        txtChiTiet.setText(chitietketqua);
//        Bundle bundle = intent.getBundleExtra("nhom9");
//        arr = bundle.getIntArray("chuoi");
//        chitiet = bundle.getStringArray("chitiet");
//        //xử lí kết quả
//        for (int i=0;i<arr.length;i++)
//        {
//            s+= " " + String.valueOf(arr[i]);
//        }

//        int m=0;
//        while(chitiet[m]!=null)
//        {
//            chitietketqua += chitiet[m] + System.getProperty("line.separator");
//            m++;
//        }
//        txtKetQua.setText(s);
//        txtChiTiet.setText(chitietketqua);
//        tạo sự kiện cho các button
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == Activity.RESULT_OK) {
//            s=data.getStringExtra("chuoi");
//            String pt=s+"";
//            txtKetQua.setText(pt);

//        }
    }
}