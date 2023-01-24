package com.example.demo.domain;

import lombok.Getter;
import lombok.ToString;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@ToString
public class StoreAgencySuperEntity extends BaseTimeEntity{

    private LocalDateTime openDate;
    private LocalDateTime closeDate;
    private String name;
    private String telephone;
    private String fax;
    private String managerName;
    private String managerPhone;
    private String postalCode;
    private String address;
    private String addressDetail;



}