package CMC.model;

import java.time.LocalDate;

public class Base {
    private LocalDate createDate;
    private String createPerson;
    private LocalDate updateDate;
    private String updatePerson;

    public Base(LocalDate createDate, String createPerson, LocalDate updateDate, String updatePerson) {
        this.createDate = createDate;
        this.createPerson = createPerson;
        this.updateDate = updateDate;
        this.updatePerson = updatePerson;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }
}
