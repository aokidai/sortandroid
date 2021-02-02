package com.example.androidgki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //khai báo các edittext và button
    EditText txtNhap;
    Button btnBubble, btnIntertion, btnMerge, btnQuick, btnSelection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ các edittext và button với layout
        txtNhap = (EditText)findViewById(R.id.txtNhap);
        btnBubble = (Button)findViewById(R.id.btnBubble);
        btnIntertion = (Button)findViewById(R.id.btnIntertion);
        btnMerge = (Button)findViewById(R.id.btnMerge);
        btnQuick = (Button)findViewById(R.id.btnQuick);
        btnSelection = (Button)findViewById(R.id.btnSelection);
        //tạo sự kiện
        btnBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chuyển chuỗi kí tự thành chuỗi số
                String[] input = txtNhap.getText().toString().split(" ");
                int[] arr = new int[input.length];
                String[] chitiet = new String[1000];
                for(int i=0;i<input.length;i++)
                    arr[i] = Integer.parseInt(input[i].toString());
                //gọi hàm sắp xếp
                BubbleSort bubble = new BubbleSort();
                bubble.sort(arr,input.length, chitiet);
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
        btnIntertion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chuyển chuỗi kí tự thành chuỗi số
                String[] input = txtNhap.getText().toString().split(" ");
                int[] arr = new int[input.length];
                String[] chitiet = new String[1000];
                for (int i = 0; i < input.length; i++)
                    arr[i] = Integer.parseInt(input[i].toString());
                //gọi hàm sắp xếp
                IntertionSort intertion = new IntertionSort();
                intertion.sort(arr, input.length, chitiet);
                //chuyển màn hình
                Intent intent = new Intent(MainActivity.this, ketqua.class);
                    //đóng gói dữ liệu
                    Bundle bundle = new Bundle();
                    bundle.putIntArray("chuoi", arr);
                    bundle.putStringArray("chitiet", chitiet);
                    intent.putExtra("nhom9", bundle);
                Toast.makeText(getApplicationContext(),"Intertion Sort.",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        btnQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chuyển chuỗi kí tự thành chuỗi số
                String[] input = txtNhap.getText().toString().split(" ");
                int[] arr = new int[input.length];
                String[] chitiet = new String[1000];
                for (int i = 0; i < input.length; i++)
                    arr[i] = Integer.parseInt(input[i].toString());
                //gọi hàm sắp xếp
                QuickSort quick = new QuickSort();
                quick.sort(arr, input.length, chitiet);
                //chuyển màn hình
                Intent intent = new Intent(MainActivity.this, ketqua.class);
                //đóng gói dữ liệu
                Bundle bundle = new Bundle();
                bundle.putIntArray("chuoi", arr);
                bundle.putStringArray("chitiet", chitiet);
                intent.putExtra("nhom9", bundle);
                Toast.makeText(getApplicationContext(),"Quick Sort.",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        btnSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chuyển chuỗi kí tự thành chuỗi số
                String[] input = txtNhap.getText().toString().split(" ");
                int[] arr = new int[input.length];
                String[] chitiet = new String[1000];
                for (int i = 0; i < input.length; i++)
                    arr[i] = Integer.parseInt(input[i].toString());
                //gọi hàm sắp xếp
                SelectionSort selection = new SelectionSort();
                selection.sort(arr, input.length, chitiet);
                //chuyển màn hình
                Intent intent = new Intent(MainActivity.this, ketqua.class);
                //đóng gói dữ liệu
                Bundle bundle = new Bundle();
                bundle.putIntArray("chuoi", arr);
                bundle.putStringArray("chitiet", chitiet);
                intent.putExtra("nhom9", bundle);
                Toast.makeText(getApplicationContext(),"Selection Sort.",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        btnMerge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chuyển chuỗi kí tự thành chuỗi số
                String[] input = txtNhap.getText().toString().split(" ");
                int[] arr = new int[input.length];
                String[] chitiet = new String[1000];
                for (int i = 0; i < input.length; i++)
                    arr[i] = Integer.parseInt(input[i].toString());
                //gọi hàm sắp xếp
                MergeSort merge = new MergeSort();
                merge.sort(arr, input.length-1, chitiet);
                //chuyển màn hình
                Intent intent = new Intent(MainActivity.this, ketqua.class);
                //đóng gói dữ liệu
                Bundle bundle = new Bundle();
                bundle.putIntArray("chuoi", arr);
                bundle.putStringArray("chitiet", chitiet);
                intent.putExtra("nhom9", bundle);
                Toast.makeText(getApplicationContext(),"Merge Sort.",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}