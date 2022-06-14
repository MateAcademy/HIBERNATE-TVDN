package com.itvdn4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Sergey Klunniy
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ClientsDetails {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String phone;
}
