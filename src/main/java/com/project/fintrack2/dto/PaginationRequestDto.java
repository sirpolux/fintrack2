package com.project.fintrack2.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaginationRequestDto {
    private int page;
    private int pageSize;
    private String sortDirection;
}
