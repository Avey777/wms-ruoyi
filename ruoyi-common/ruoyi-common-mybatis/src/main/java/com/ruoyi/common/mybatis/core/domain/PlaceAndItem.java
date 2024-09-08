package com.ruoyi.common.mybatis.core.domain;

public interface PlaceAndItem {

    Long getWarehouseId();

    Long getSkuId();

    default String getKey() {
        return getWarehouseId() + "_" + getSkuId();
    }
}
