package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Agency extends StoreAgencySuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agencyCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StoreAgencyStatus storeAgencyStatus;
}