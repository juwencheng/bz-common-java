package com.baiziio.tool.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author juwencheng
 * @date 2020 2020/4/10 12:03 下午
 */
@Data
public class PageReq {
    @ApiModelProperty(value = "当前页码")
    private Integer current = 1;

    @ApiModelProperty(value = "每页数量")
    private Integer pageSize = 10;
}
