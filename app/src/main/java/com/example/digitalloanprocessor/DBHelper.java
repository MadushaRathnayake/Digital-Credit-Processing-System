package com.example.digitalloanprocessor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "Login.db";

    public DBHelper(Context context) {
        super(context, "Login.db" ,null ,1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("CREATE TABLE users(fullName TEXT, NIC TEXT UNIQUE, userName TEXT PRIMARY KEY, password TEXT, mobileNumber LONG UNIQUE, email TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("DROP TABLE IF EXISTS users");
    }
    public Boolean insertData(String fullName, String NIC, String userName, String password, Integer mobileNumber, String email){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fullName", fullName);
        contentValues.put("NIC", NIC);
        contentValues.put("userName", userName);
        contentValues.put("password", password);
        contentValues.put("mobileNumber", mobileNumber);
        contentValues.put("email", email);

        long result = MyDB.insert("users", null, contentValues);
        if(result==-1) return false;
        else
            return true;
    }
    public Boolean checkUserName(String NIC, String userName, Integer mobileNumber){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("SELECT * FROM users WHERE username = ? AND password = ?", new String[]{});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
