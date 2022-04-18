package com.example.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter @Setter
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastname;

}
