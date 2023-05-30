package org.Task1Hiber;


import org.Task1Hiber.Entity.Document;
import org.Task1Hiber.Entity.Person;
import org.Task1Hiber.Service.ServiceImpl;

import java.time.LocalDate;


public class App {

    public static void main( String[] args ) {
        ServiceImpl serviceImpl = new ServiceImpl();


        Person Maks = new Person("Maks Pasevich3", 27);
        Document passport = new Document("23457777444", "passport2",
                LocalDate.of(2021,12,31));
        Document medCard = new Document("4577774", "medCard2",
                LocalDate.of(2027,12,31));
        Maks.addDocumentToPeople(passport);
        Maks.addDocumentToPeople(medCard);
        serviceImpl.savePerson(Maks);

        Person Anzhelika = new Person("Anzhelika Zueva", 18);
        Document passportZagran = new Document("23457777444", "passportZagran",
                LocalDate.of(2026,12,31));
        Document idCard = new Document("45774", "medCard2",
                LocalDate.of(2027,12,31));

        Anzhelika.addDocumentToPeople(passportZagran);
        Anzhelika.addDocumentToPeople(idCard);
        serviceImpl.savePerson(Anzhelika);

        serviceImpl.getPersonDto()
                .forEach(System.out::println);

    }
}
