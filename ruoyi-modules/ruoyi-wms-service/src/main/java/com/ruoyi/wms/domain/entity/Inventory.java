package com.ruoyi.wms.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.ruoyi.common.mybatis.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

import java.io.Serial;

/**
 * 库存对象 wms_inventory
 *
 * @author zcc
 * @date 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wms_inventory")
public class Inventory extends BaseEntity {

    @Serial
    private static final long serialVersionUID=1L;

    /**
     *
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 规格ID
     */
    private Long skuId;
    /**
     * 所属仓库
     */
    private Long warehouseId;
    /**
     * 所属库区
     */
    private Long areaId;
    /**
     * 库存
     */
    private BigDecimal quantity;
    /**
     * 备注
     */
    private String remark;

}
