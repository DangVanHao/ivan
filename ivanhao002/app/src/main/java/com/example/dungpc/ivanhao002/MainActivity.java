package com.example.dungpc.ivanhao002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewtrc;
    ArrayList<HeDieuHanh> arrayList;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter = new TraiCayAdapter(this, R.layout.layout_dong, arrayList);
        listViewtrc.setAdapter(adapter);

    }
    private void Anhxa(){
        listViewtrc = (ListView)findViewById(R.id.listviewshow);
        arrayList = new ArrayList<>();

        arrayList.add((new HeDieuHanh("Orange", "Cam cao phong", R.drawable.imagecam)));
        arrayList.add(new HeDieuHanh("Banana","chuoi ngu", R.drawable.imagechuoi));
        arrayList.add(new HeDieuHanh("Cherry", "Dau quang Binh", R.drawable.imagedautay));
        arrayList.add(new HeDieuHanh("Apple", "Apple Trung Quoc", R.drawable.imagetao));
        arrayList.add(new HeDieuHanh("Yelow","Xoai tuong", R.drawable.imagexoai));

    }
}
