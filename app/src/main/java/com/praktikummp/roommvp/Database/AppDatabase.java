package com.praktikummp.roommvp.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.praktikummp.roommvp.Database.Entity.Person;
import com.praktikummp.roommvp.Database.Dao.PersonDao;

@Database(entities = {Person.class}, version = 1, exportSchema = false)
public abstract class  AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "database")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
    public abstract PersonDao personDao();

}