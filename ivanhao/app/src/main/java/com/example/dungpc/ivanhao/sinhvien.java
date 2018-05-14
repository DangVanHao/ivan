package com.example.dungpc.ivanhao;

public class sinhvien {
    public String tensv;
    public  String diachi;
    // public int namsinh;
    private int namsinh;

    public void setNamsinh(int ns) {
       // this.namsinh = ns;
        if (ns >= 2000){
            namsinh = 2000;
        }else {
            namsinh = ns;
        }
    }
    public int getNamsinh(){

        return namsinh;
    }
}
