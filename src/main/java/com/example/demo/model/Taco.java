package com.example.demo.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

    @NotBlank(message="Name is required")
    private String name;

    @NotNull(message = "Select at least 1 ingredient")
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;
}
