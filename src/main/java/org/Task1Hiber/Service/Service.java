package org.Task1Hiber.Service;

import org.Task1Hiber.Entity.DTO.InfoDto;
import org.Task1Hiber.Entity.Person;

import java.util.List;

public interface Service {
    void savePerson(Person person);
    List<InfoDto> getPersonDto();
}
