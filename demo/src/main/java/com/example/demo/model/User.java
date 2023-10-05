package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Integer UserId;

  String  Name;
   String Email;
   @UuidGenerator(style = UuidGenerator.Style.RANDOM)
   String AccountNumber;
   @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Transaction> transactionList= new ArrayList<>();
}
