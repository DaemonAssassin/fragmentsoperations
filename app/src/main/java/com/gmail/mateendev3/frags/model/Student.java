package com.gmail.mateendev3.frags.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name;
    private byte age;
    private byte height;

    public Student(String name, byte age, byte height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public byte getHeight() {
        return height;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeByte(this.age);
        dest.writeByte(this.height);
    }

    public void readFromParcel(Parcel source) {
        this.name = source.readString();
        this.age = source.readByte();
        this.height = source.readByte();
    }

    protected Student(Parcel in) {
        this.name = in.readString();
        this.age = in.readByte();
        this.height = in.readByte();
    }

    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
