package com.example.paygenius;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data // Lombok annotation to create getters, setters, toString, etc.
@NoArgsConstructor // Lombok annotation for no-args constructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Description is mandatory")
    private String description;

    @NotNull(message = "Amount is mandatory")
    @Positive(message = "Amount must be positive")
    private Double amount;

    @NotBlank(message = "Category is mandatory")
    private String category;

    @NotNull(message = "Date is mandatory")
    private LocalDate date;

    // We will add user association later
    // private Long userId;
}
