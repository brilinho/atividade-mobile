package com.senai.xarantpreferencs.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTableLockedException;

import com.senai.xarantpreferencs.DataBase.DataBaseHelpen;

import java.sql.SQLData;

public class StudentController {

    private SQLiteDatabase DB;

    private DataBaseHelpen dataBaseHelpen;


    public StudentController(Context context){
        this.dataBaseHelpen = new DataBaseHelpen(context);
    }

    public String save(Student student){
        contentValues values;

        db=database.getWritableDataBase();
        values = new ContentValues();
        values.put("name",student.getName());
        values.put("email",student.getEmail());
        values.put("passWord",studnet.getPassWord());

        long result = db.insetr("student", null,values);

        if(result == -1){
            return"Error to save student";
        }else{
            return"Student saved sucessfully";
        }
    }
}
