package org.Task1Hiber.Entity.DTO;

public class InfoDto {
    private String full_nameDto;
    private String docTypeDto;
    private String docNumberDto;

    public InfoDto(String full_nameDto, String docTypeDto, String docNumberDto) {
        this.full_nameDto = full_nameDto;
        this.docTypeDto = docTypeDto;
        this.docNumberDto = docNumberDto;
    }

    public InfoDto() {
    }

    public String getFull_nameDto() {
        return full_nameDto;
    }

    public void setFull_nameDto(String full_nameDto) {
        this.full_nameDto = full_nameDto;
    }

    public String getDocTypeDto() {
        return docTypeDto;
    }

    public void setDocTypeDto(String docTypeDto) {
        this.docTypeDto = docTypeDto;
    }

    public String getDocNumberDto() {
        return docNumberDto;
    }

    public void setDocNumberDto(String docNumberDto) {
        this.docNumberDto = docNumberDto;
    }

    @Override
    public String toString() {
        return "InfoDto{" +
                "full_nameDto='" + full_nameDto + '\'' +
                ", docTypeDto='" + docTypeDto + '\'' +
                ", docNumberDto='" + docNumberDto + '\'' +
                '}';
    }
}
