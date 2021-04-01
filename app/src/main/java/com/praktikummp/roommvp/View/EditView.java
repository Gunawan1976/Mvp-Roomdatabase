package com.praktikummp.roommvp.View;

import com.praktikummp.roommvp.Database.Entity.Person;

public interface EditView {

    void showErrorMessage(int id);

    void clearPreErrors();

    void populate(Person person);
}

