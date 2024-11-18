package org.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {
    @NotBlank(message = "productCode must not be empty")
    private String productCode;
    @Positive(message = "quantity must be positive")
    private Integer quantity;
    @Positive(message = "unitPrice must be positive")
    private BigDecimal unitPrice;
}
