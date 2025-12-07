package com.SpringAOP.AOP.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private int personId;
    private String lastName;
    private String firstName;
}
