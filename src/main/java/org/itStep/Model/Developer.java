package org.itStep.Model;


import org.springframework.stereotype.Component;
import javax.persistence.*;

@Component
@Entity
@Table(name ="developers")
public class Developer {

    @Id
    @Column(name = "id_developers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDeveloper;
    @Column(name = "pib")
    private String pib;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "url")
    private String url;
    @Column(name = "notes")
    private String notes;

    public Developer() {
    }

    public Developer(Integer id, String pib, String phone, String email, String url, String notes) {
        this.idDeveloper = id;
        this.pib = pib;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.notes = notes;
    }

    public Developer(String pib, String phone, String email, String url, String notes) {
        this.pib = pib;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.notes = notes;
    }

    public Integer getIdDeveloper() {
        return idDeveloper;
    }

    public void setIdDeveloper(Integer idDeveloper) {
        this.idDeveloper = idDeveloper;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
