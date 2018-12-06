package com.edu.common.code.page;

import java.io.Serializable;

/**
 * @ClassName PageParam
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-19
 **/
public class PageParam implements Serializable {
    private Integer page;
    private Integer pageSize;

    public int getPage() {
        return this.page == null ? 1 : this.page;
    }

    public int getPageSize() {
        return this.pageSize == null ? 20 : this.pageSize;
    }

    public PageParam(Integer page, Integer pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }
}