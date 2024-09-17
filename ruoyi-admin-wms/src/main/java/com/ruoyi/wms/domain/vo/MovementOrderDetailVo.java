package com.ruoyi.wms.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.ruoyi.wms.domain.entity.MovementOrderDetail;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 库存移动详情视图对象 wms_movement_order_detail
 *
 * @author zcc
 * @date 2024-08-09
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = MovementOrderDetail.class)
public class MovementOrderDetailVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @ExcelProperty(value = "")
    private Long id;

    /**
     * 移库单Id
     */
    @ExcelProperty(value = "移库单Id")
    private Long movementOrderId;

    /**
     * 规格id
     */
    @ExcelProperty(value = "规格id")
    private Long skuId;

    /**
     * 数量
     */
    @ExcelProperty(value = "数量")
    private BigDecimal quantity;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String remark;

    /**
     * 源仓库
     */
    @ExcelProperty(value = "源仓库")
    private Long sourceWarehouseId;

    /**
     * 目标仓库
     */
    @ExcelProperty(value = "目标仓库")
    private Long targetWarehouseId;

    private ItemSkuVo itemSku;

    private BigDecimal remainQuantity;
}
