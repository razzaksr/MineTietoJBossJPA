package elements.spring.explore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class KnowYourCustomer {
    public KnowYourCustomer() {
    }

    @Override
    public String toString() {
        return "KnowYourCustomer{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", email='" + email + '\'' +
                ", pan='" + pan + '\'' +
                ", contact=" + contact +
                ", aadhaar=" + aadhaar +
                ", address='" + address + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountPasscode='" + accountPasscode + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }

    public KnowYourCustomer(long accountNumber, String accountHolder, String email, String pan, long contact, long aadhaar, String address, double accountBalance, String accountPasscode, Date dateOfCreation) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.email = email;
        this.pan = pan;
        this.contact = contact;
        this.aadhaar = aadhaar;
        this.address = address;
        this.accountBalance = accountBalance;
        this.accountPasscode = accountPasscode;
        this.dateOfCreation = dateOfCreation;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public long getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountPasscode() {
        return accountPasscode;
    }

    public void setAccountPasscode(String accountPasscode) {
        this.accountPasscode = accountPasscode;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long accountNumber;
    private String accountHolder;
    private String email;
    private String pan;
    private long contact;
    private long aadhaar;
    private String address;
    private double accountBalance;
    private String accountPasscode;
    @Temporal(TemporalType.DATE)
    private Date dateOfCreation;
}