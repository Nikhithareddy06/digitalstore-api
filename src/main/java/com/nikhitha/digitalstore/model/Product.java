package com.nikhitha.digitalstore.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Product {
	@NotNull(message = "Id is required")
    private Long id;
	
	@NotBlank(message = "Name is required")
    private String name;
	
	@NotNull(message = "Price is required")
	@Positive(message = "Price must be greater than 0")
	private double price;
	
	@NotBlank(message = "Description is required")
	private String description;
	
//getters and setters
    public Long getId() {
	    return id;
    }

    public void setId(Long id) {
	    this.id = id;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public double getPrice() {
	    return price;
    }

    public void setPrice(double price) {
	    this.price = price;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }
}