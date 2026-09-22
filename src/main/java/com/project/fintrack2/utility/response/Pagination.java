package com.project.fintrack2.utility.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pagination {
    private int currentPage;
    private int nextPage;
    private int totalPages;
    private int totalItems;
    private boolean hasNext;
    private boolean hasPrevious;
    private boolean first;
    private boolean last;

}
