package com.example.dungpc.ivanhao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sinhvien svien = new sinhvien();

        svien.tensv = "Dang Van Kha";
        svien.diachi= "Nam Dinh";
        //svien.namsinh= 2000;
        svien.setNamsinh(2015);

        Toast.makeText(this, svien.tensv + svien.getNamsinh(), Toast.LENGTH_SHORT).show();
    }
}
