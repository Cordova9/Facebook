package com.example.facebook;

import android.graphics.Bitmap;

public class Persona {
    String txt_mnombre;
    String imag_perfil;
    String publicaion;
    Bitmap imag_foto;
    String fecha;


    public Persona(String txt_mnombre, String img_perfil, String publicaion, Bitmap imag_foto, String fecha) {
        this.txt_mnombre = txt_mnombre;
        this.imag_perfil = img_perfil;
        this.publicaion = publicaion;
        this.imag_foto = imag_foto;
        this.fecha = fecha;

    }

    public String getTxt_mnombre() {
        return txt_mnombre;
    }

    public void setTxt_mnombre(String txt_mnombre) {
        this.txt_mnombre = txt_mnombre;
    }

    public String getImg_perfil() {
        return imag_perfil;
    }

    public void setImg_perfil(String img_perfil) {
        this.imag_perfil = img_perfil;
    }

    public String getPublicaion() {
        return publicaion;
    }

    public void setPublicaion(String publicaion) {
        this.publicaion = publicaion;
    }

    public Bitmap getImag_foto() {
        return imag_foto;
    }

    public void setImag_foto(Bitmap imag_foto) {
        this.imag_foto = imag_foto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
