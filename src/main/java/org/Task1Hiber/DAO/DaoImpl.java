package org.Task1Hiber.DAO;

import org.Task1Hiber.Entity.DTO.InfoDto;
import org.Task1Hiber.Entity.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import static org.Task1Hiber.Configuration.ConfigurationTask.getSessionFactory;

public class DaoImpl implements Dao {
    Transaction transaction;
    public void savePerson(Person person) {
        try( Session session = getSessionFactory().openSession()) {
        transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
             ex.printStackTrace();
        }
    }


    public  List<InfoDto> getPersonDto() {
        try (Session session = getSessionFactory().openSession()) {

            return (List<InfoDto>) session.createQuery(
                            "SELECT new org.Task1Hiber.Entity.DTO.InfoDto" +
                                    "(p.fullName, d.documentType,d.documentNumber )" +
                                    " FROM Person p "
                                    + "JOIN p.documents d "
                                    + "WHERE d.documentNumber LIKE '%777%' and d.duration > CURRENT_DATE")

                    .getResultList();
        }
    }
}
