package com.tinkeraft.memberservice.domain;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

import static java.lang.Character.SPACE_SEPARATOR;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Person implements Serializable {

    private String IDCardNumber;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String birthPlace;
    private String title;
    private String bloodType;
    private String status;

    private String fullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstName).append(SPACE_SEPARATOR).append(this.lastName);
        return sb.toString();
    }

    protected abstract void doActivity();

}
