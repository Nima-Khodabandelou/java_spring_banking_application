package com.nkh1987.banking.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastName;

    private String gender;

    private String address;

    private String email;

    private String cellPhoneNumber;

    private String landlineNumber;

    private String accountNumber;

    private BigDecimal accountBalance;
    // status: active, restricted, pending
    private String status;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    public User(Long id, String firstname, String lastName, String gender, String address, String email, String cellPhoneNumber, String landlineNumber, String accountNumber, BigDecimal accountBalance, String status, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.cellPhoneNumber = cellPhoneNumber;
        this.landlineNumber = landlineNumber;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.status = status;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public User() {
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
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

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return this.accountBalance;
    }

    public String getStatus() {
        return this.status;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return this.modifiedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public static class UserBuilder {
        private Long id;
        private String firstname;
        private String lastName;
        private String gender;
        private String address;
        private String email;
        private String cellPhoneNumber;
        private String landlineNumber;
        private String accountNumber;
        private BigDecimal accountBalance;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime modifiedAt;

        UserBuilder() {
        }

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder cellPhoneNumber(String cellPhoneNumber) {
            this.cellPhoneNumber = cellPhoneNumber;
            return this;
        }

        public UserBuilder landlineNumber(String landlineNumber) {
            this.landlineNumber = landlineNumber;
            return this;
        }

        public UserBuilder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public UserBuilder accountBalance(BigDecimal accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        public UserBuilder status(String status) {
            this.status = status;
            return this;
        }

        public UserBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public UserBuilder modifiedAt(LocalDateTime modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public User build() {
            return new User(id, firstname, lastName, gender, address, email, cellPhoneNumber, landlineNumber, accountNumber, accountBalance, status, createdAt, modifiedAt);
        }

        public String toString() {
            return "User.UserBuilder(id=" + this.id + ", firstname=" + this.firstname + ", lastName=" + this.lastName + ", gender=" + this.gender + ", address=" + this.address + ", email=" + this.email + ", cellPhoneNumber=" + this.cellPhoneNumber + ", landlineNumber=" + this.landlineNumber + ", accountNumber=" + this.accountNumber + ", accountBalance=" + this.accountBalance + ", status=" + this.status + ", createdAt=" + this.createdAt + ", modifiedAt=" + this.modifiedAt + ")";
        }
    }
}
