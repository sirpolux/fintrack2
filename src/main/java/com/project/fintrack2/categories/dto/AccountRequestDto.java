package com.project.fintrack2.categories.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountRequestDto {
    private String accountName;
    private Long accountTypeId;
    private Long currencyTypeId;
}
