package com.tinkeraft.memberservice.domain;

import com.tinkeraft.memberservice.dto.RefStatusDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends Person{
    @Id
    private Long licenceNumber;

    private LocalDate membershipDate;

    private String membershipStatus;

    private String category;

    @Override
    protected void doActivity() {
        System.out.println("Doing an activity");
    }
}
