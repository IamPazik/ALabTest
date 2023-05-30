package org.Task1Hiber.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Document_Number")
    private String documentNumber;

    @Column(name = "Document_Type")
    private String documentType;

    @Column(name = "Duration")
    private LocalDate duration;

    public Document() {
    }

    public Document(String documentNumber, String documentType, LocalDate duration) {
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.duration = duration;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", documentNumber='" + documentNumber + '\'' +
                ", documentType='" + documentType + '\'' +
                ", duration=" + duration +
                '}';
    }
}

