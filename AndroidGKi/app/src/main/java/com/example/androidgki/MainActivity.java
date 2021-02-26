package com.example.androidgki;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //khai báo các edittext và button
    TextView  txtDaySo,TenGT;
    Button btnNhapDS, btnSapXep, btnChonGT, btnDong;
    int[] arr = new int[1000];
    String[] chitiet = new String[1000];
    String s = "";
    String giaithuat ="";
    double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDaySo = (TextView) findViewById(R.id.txtDaySo);
        btnNhapDS = (Button) findViewById(R.id.btnNhapDS);
        btnSapXep = (Button) findViewById(R.id.btnSapXep);
        btnChonGT = (Button) findViewById(R.id.btnChonGT);
        btnDong = (Button) findViewById(R.id.btnDong);

        TenGT = (TextView) findViewById(R.id.TenGT);
        btnNhapDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Nhap.class);
                startActivityForResult(i,999);
            }
        });

        btnChonGT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ChonGt.class);
                startActivityForResult(i,998);
            }
        });
        btnDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        btnSapXep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] input = txtDaySo.getText().toString().split(" ");
                int[] arr = new int[input.length];
                String[] chitiet = new String[1000];
                for(int i=0;i<input.length;i++)
                    arr[i] = Integer.parseInt(input[i].toString());
                //gọi hàm sắp xếp
//                BubbleSort bubble = new BubbleSort();
//                bubble.sort(arr,input.length, chitiet);
                String ten= (String) TenGT.getText();
                switch(ten) {
                    case "Selection":
                        SelectionSort selectionSort = new SelectionSort();
                        selectionSort.sort(arr, input.length, chitiet);
                        break;
                    case "Bubble":
                        BubbleSort bubbleSort = new BubbleSort();
                        bubbleSort.sort(arr, input.length, chitiet);
                        break;
                    case "Intertion":
                        IntertionSort intertionSort = new IntertionSort();
                        intertionSort.sort(arr, input.length, chitiet);
                        break;
                    case "Merge":
                        MergeSort mergeSort = new MergeSort();
                        mergeSort.sort(arr, input.length, chitiet);
                        break;
                    case "Quick":
                        QuickSort quickSort = new QuickSort();
                        quickSort.sort(arr, input.length, chitiet);
                        break;
                    case "Shell":
                        ShellSort shellSort = new ShellSort();
                        shellSort.sort(arr, input.length, chitiet);
                        break;
                    case "Interchage":
                        IntertionSort intertionSort1 = new IntertionSort();
                        intertionSort1.sort(arr, input.length, chitiet);
                        break;
                    case "Radix":
                        RadixSort radixSort=new RadixSort();
                        radixSort.sort(arr,input.length,chitiet);
}

                    //chuyển màn hình
                Intent intent = new Intent(MainActivity.this,ketqua.class);
                //đóng gói dữ liệu
                Bundle bundle = new Bundle();
                bundle.putIntArray("chuoi",arr);
                bundle.putStringArray("chitiet", chitiet);
                intent.putExtra("nhom9",bundle);
                Toast.makeText(getApplicationContext(),"Bubble Sort.",Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });


        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 999) {

            // resultCode được set bởi DetailActivity
            // RESULT_OK chỉ ra rằng kết quả này đã thành công
            if (resultCode == Activity.RESULT_OK) {
                 s=data.getStringExtra("chuoi");
                 String pt=s;
                 txtDaySo.setText(pt);
        }
        }
        else {
            Toast.makeText(this, "Result: Loi nhap ", Toast.LENGTH_LONG).show();
        }
        if(requestCode == 998) {

            // resultCode được set bởi DetailActivity
            // RESULT_OK chỉ ra rằng kết quả này đã thành công
            if (resultCode == Activity.RESULT_OK) {

                giaithuat=data.getStringExtra("giaithuat");
                String gt=giaithuat;
                TenGT.setText(gt);
            }
        }
        else {
            Toast.makeText(this, "Result: Loi nhap ", Toast.LENGTH_LONG).show();
        }
    }
}