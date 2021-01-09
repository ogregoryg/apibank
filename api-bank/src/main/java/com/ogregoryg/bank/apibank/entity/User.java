package com.ogregoryg.bank.apibank.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message="Digite um nome válido")
    private String name;

    @NotEmpty
    @Email(message="Digite um e-mail válido")
    private String email;

    @NotNull
    @Past(message="Digite uma Data Válida")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthday;


    @CPF(message="Digite um CPF Válido")
    private String cpf;


}

