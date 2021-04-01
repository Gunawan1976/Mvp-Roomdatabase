package com.praktikummp.BelajarRoomMVP.View;

import com.praktikummp.BelajarRoomMVP.Database.Entity.Person;

public interface EditView {

    void showErrorMessage(int id);

    void clearPreErrors();

    void populate(Person person);
}

