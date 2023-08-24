package com.nkh1987.banking.dto;

import java.util.Objects;

public class UserRequest {

    private String firstName;

    private String lastName;

    private String gender;

    private String address;

    private String email;

    private String cellPhoneNumber;

    private String landlineNumber;

    public UserRequest(String firstName, String lastName, String gender, String address, String email, String cellPhoneNumber, String landlineNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.cellPhoneNumber = cellPhoneNumber;
        this.landlineNumber = landlineNumber;
    }

    public UserRequest() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCellPhoneNumber() {
        return this.cellPhoneNumber;
    }

    public String getLandlineNumber() {
        return this.landlineNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserRequest)) return false;
        final UserRequest other = (UserRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (!Objects.equals(this$firstName, other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (!Objects.equals(this$lastName, other$lastName)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (!Objects.equals(this$gender, other$gender)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (!Objects.equals(this$address, other$address)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (!Objects.equals(this$email, other$email)) return false;
        final Object this$cellPhoneNumber = this.getCellPhoneNumber();
        final Object other$cellPhoneNumber = other.getCellPhoneNumber();
        if (!Objects.equals(this$cellPhoneNumber, other$cellPhoneNumber))
            return false;
        final Object this$landlineNumber = this.getLandlineNumber();
        final Object other$landlineNumber = other.getLandlineNumber();
        if (!Objects.equals(this$landlineNumber, other$landlineNumber))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $cellPhoneNumber = this.getCellPhoneNumber();
        result = result * PRIME + ($cellPhoneNumber == null ? 43 : $cellPhoneNumber.hashCode());
        final Object $landlineNumber = this.getLandlineNumber();
        result = result * PRIME + ($landlineNumber == null ? 43 : $landlineNumber.hashCode());
        return result;
    }

    public String toString() {
        return "UserRequest(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", gender=" + this.getGender() + ", address=" + this.getAddress() + ", email=" + this.getEmail() + ", cellPhoneNumber=" + this.getCellPhoneNumber() + ", landlineNumber=" + this.getLandlineNumber() + ")";
    }

}
