package com.example.dungpc.ivanhao002;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<HeDieuHanh> traicayList;

    public TraiCayAdapter(Context context, int layout, List<HeDieuHanh> heDieuHanhList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = heDieuHanhList;
    }



    @Override
    public int getCount() {
        return traicayList.size();//tra het trong list
    }

    @Override
    public Object getItem(int position) {
        return traicayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        //ax
        TextView txtten = (TextView) convertView.findViewById(R.id.textvten);
        TextView txtmota = (TextView) convertView.findViewById(R.id.txvmota);
        ImageView img1 = (ImageView) convertView.findViewById(R.id.imghinh);


        // gan gt
        HeDieuHanh heDieuHanh = traicayList.get(position);


        txtten.setText(heDieuHanh.getTen());
        txtmota.setText(heDieuHanh.getMoTa());
        img1.setImageResource(heDieuHanh.getHinh());

        return convertView;
    }
}
