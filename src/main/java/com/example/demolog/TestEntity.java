package com.example.demolog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "test_log")
@Data
@NoArgsConstructor
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String columnFirst;

    private String columnSecond;
}
