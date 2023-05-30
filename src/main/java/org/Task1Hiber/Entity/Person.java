package org.Task1Hiber.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Person")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "AGE")
    private int age;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Document_ID")
    private List<Document> documents ;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void addDocumentToPeople (Document document) {
        if(documents == null) {
            documents = new ArrayList<>();
        }
        documents.add(document);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +'}';
    }
}
