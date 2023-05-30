package org.Task1Hiber.Service;

import org.Task1Hiber.DAO.DaoImpl;
import org.Task1Hiber.Entity.DTO.InfoDto;
import org.Task1Hiber.Entity.Person;

import java.util.List;

public class ServiceImpl implements Service{

    DaoImpl dao = new DaoImpl();
    @Override
    public void savePerson(Person person) {
        dao.savePerson(person);
    }

    @Override
    public List<InfoDto> getPersonDto() {
        return dao.getPersonDto();
    }
}
