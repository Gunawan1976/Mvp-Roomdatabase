package com.praktikummp.roommvp.Database.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.praktikummp.roommvp.Database.Entity.Person;

import java.util.List;

@Dao
public interface PersonDao {

    @Insert
    void insertPerson(Person person);

    @Update
    void insertUpdate(Person person);

    @Delete
    void insertDelete(Person person);

    @Query("SELECT * FROM person")
    List<Person> getAll();

    @Query("SELECT * FROM person WHERE id=:id")
    Person findPerson(long id);

}
