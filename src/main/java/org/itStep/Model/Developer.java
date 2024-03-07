package org.itStep.Model;

public class Developer {

    private Integer id;
    private String pib;
    private String phone;
    private String email;
    private String url;
    private String notes;

    public Developer() {
    }

    public Developer(String pib, String phone, String email, String url, String notes) {
        this.pib = pib;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.notes = notes;
    }

    public Developer(Integer id, String pib, String phone, String email, String url, String notes) {
        this.id = id;
        this.pib = pib;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
