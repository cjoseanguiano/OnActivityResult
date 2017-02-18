package com.onactivityresult.devix.onactivityresult;
/*
 *Created by Carlos Anguiano on 18/02/17.
 */

import android.os.Parcel;
import android.os.Parcelable;

public class Alumno implements Parcelable {

    private String nombre;
    private int nUno;
    private int nDos;

    public Alumno(String nombre, int nUno, int nDos) {
        this.nombre = nombre;
        this.nUno = nUno;
        this.nDos = nDos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnUno() {
        return nUno;
    }

    public void setnUno(int nUno) {
        this.nUno = nUno;
    }

    public int getnDos() {
        return nDos;
    }

    public void setnDos(int nDos) {
        this.nDos = nDos;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeInt(this.nUno);
        dest.writeInt(this.nDos);
    }

    public Alumno() {
    }

    public Alumno(Parcel in) {
        this.nombre = in.readString();
        this.nUno = in.readInt();
        this.nDos = in.readInt();
    }

    public static final Parcelable.Creator<Alumno> CREATOR = new Parcelable.Creator<Alumno>() {
        @Override
        public Alumno createFromParcel(Parcel source) {
            return new Alumno(source);
        }

        @Override
        public Alumno[] newArray(int size) {
            return new Alumno[size];
        }
    };
}
