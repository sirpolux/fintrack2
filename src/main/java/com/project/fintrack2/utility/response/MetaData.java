package com.project.fintrack2.utility.response;


import lombok.Getter;

@Getter
public class MetaData {
    private Pagination pagination;
    public MetaData(Pagination pagination){
        this.pagination=pagination;
    }
}
