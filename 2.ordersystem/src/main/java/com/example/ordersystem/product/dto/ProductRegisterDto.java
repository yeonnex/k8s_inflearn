package com.example.ordersystem.product.dto;

import com.example.ordersystem.member.domain.Member;
import com.example.ordersystem.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductRegisterDto {
    private String name;
    private String category;
    private int price;
    private int stockQuantity;
    public Product toEntity(Member member){
        return Product.builder()
                .name(this.name).price(this.price).stockQuantity(this.stockQuantity)
                .member(member)
                .build();
    }

}
