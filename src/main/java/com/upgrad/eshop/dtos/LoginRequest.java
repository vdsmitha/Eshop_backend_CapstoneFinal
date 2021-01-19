package com.upgrad.eshop.dtos;


public class LoginRequest {
    private String userName;
    private String password;
    private String Firstname;
    private String Lastname;
    private String Email;
    private String ContactNumber;

    public LoginRequest(String userName, String password, String firstname, String lastname, String email, String contactNumber) {
        this.userName = userName;
        this.password = password;
        Firstname = firstname;
        Lastname = lastname;
        Email = email;
        ContactNumber = contactNumber;
    }



    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public LoginRequest() {
    }

    public LoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static LoginRequest getLoginRequest(String userName, String password) {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUserName(userName);
        loginRequest.setPassword(password);
        return loginRequest;
    }
}
