package com.praktikummp.roommvp.Presenter;

import com.praktikummp.roommvp.Database.Entity.Person;

public interface EditPresenter {

    void save(Person person);

    boolean validate(Person person);

    void getPerson(long id);

    void update(Person person);
}
