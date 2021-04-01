package com.praktikummp.roommvp.Presenter;

import com.praktikummp.roommvp.Database.Dao.PersonDao;
import com.praktikummp.roommvp.Database.Entity.Person;
import com.praktikummp.roommvp.Utils.Constants;
import com.praktikummp.roommvp.Utils.Util;
import com.praktikummp.roommvp.View.EditView;

public class EditPresenterImp implements EditPresenter{
    private final EditView view;
    private final PersonDao personDao;

    public EditPresenterImp(EditView view, PersonDao personDao) {
        this.view = view;
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        this.personDao.insertPerson(person);
    }

    @Override
    public boolean validate(Person person) {
        if (person.getName().isEmpty() || !Util.isValidName(person.getName())){
            view.showErrorMessage(Constants.ID_NAME);
            return false;
        }
        if (person.getAddress().isEmpty()){
            view.showErrorMessage(Constants.ID_ADDRESS);
            return false;
        }
        if (person.getPhone().isEmpty() || !Util.isValidPhone(person.getPhone())){
            view.showErrorMessage(Constants.ID_PHONE);
            return false;
        }
        if (person.getEmail().isEmpty() || !Util.isValidEmail(person.getEmail())){
            view.showErrorMessage(Constants.ID_EMAIL);
            return false;
        }
        return true;
    }

    @Override
    public void getPerson(long id) {

    }

    @Override
    public void update(Person person) {

    }
}