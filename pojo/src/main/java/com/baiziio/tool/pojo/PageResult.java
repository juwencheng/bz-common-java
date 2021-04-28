package com.baiziio.tool.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author juwencheng
 */
@Data
public class PageResult<T> {
    private long current;
    private long pageSize;
    private long total;
    private List<T> list;

    public PageResult() {
    }

    public PageResult(long current, long pageSize, long total, List<T> list) {
        this.current = current;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }
}
