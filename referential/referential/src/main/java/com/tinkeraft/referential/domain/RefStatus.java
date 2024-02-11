package com.tinkeraft.referential.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "ref_status")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefStatus implements Serializable {

    @Id
    @Column(name = "code")
    private String code;
    private String label;
    private String description;
}
