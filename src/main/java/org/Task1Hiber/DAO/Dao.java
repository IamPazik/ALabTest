package org.Task1Hiber.DAO;

import org.Task1Hiber.Entity.DTO.InfoDto;
import org.Task1Hiber.Entity.Person;

import java.util.List;

public interface Dao {
    void savePerson(Person person);
    List<InfoDto> getPersonDto();
}
