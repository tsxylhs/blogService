package com.edu.common.code.page;

import java.io.Serializable;

/**
 * @ClassName PageData
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-19
 **/
public class PageData  implements Serializable {
    private long count;
    private int page;
    private int pageSize;

    public PageData(long total, PageParam pageParam) {
        this.count = total;
        this.page = pageParam.getPage();
        this.pageSize = pageParam.getPageSize();
    }

    public PageData(long total, int page, int pageSize) {
        this.count = total;
        this.page = page;
        this.pageSize = pageSize;
    }

    public long getCount() {
        return this.count;
    }

    public int getPage() {
        return this.page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageData)) {
            return false;
        } else {
            PageData other = (PageData)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCount() != other.getCount()) {
                return false;
            } else if (this.getPage() != other.getPage()) {
                return false;
            } else {
                return this.getPageSize() == other.getPageSize();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PageData;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        long $count = this.getCount();
         result = result * 59 + (int)($count >>> 32 ^ $count);
        result = result * 59 + this.getPage();
        result = result * 59 + this.getPageSize();
        return result;
    }

    public String toString() {
        return "PageData(count=" + this.getCount() + ", page=" + this.getPage() + ", pageSize=" + this.getPageSize() + ")";
    }

    public PageData() {
    }
}

