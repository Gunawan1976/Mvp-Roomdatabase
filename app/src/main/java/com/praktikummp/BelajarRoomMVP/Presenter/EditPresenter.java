package com.praktikummp.BelajarRoomMVP.Presenter;

import com.praktikummp.BelajarRoomMVP.Database.Entity.Person;

public interface EditPresenter {

    void save(Person person);

    boolean validate(Person person);

    void getPerson(long id);

    void update(Person person);
}
