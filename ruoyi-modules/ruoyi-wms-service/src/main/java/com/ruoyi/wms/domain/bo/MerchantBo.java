package com.ruoyi.wms.domain.bo;

import com.ruoyi.common.core.validate.AddGroup;
import com.ruoyi.common.core.validate.EditGroup;
import com.ruoyi.common.mybatis.core.domain.BaseEntity;
import com.ruoyi.wms.domain.entity.Merchant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import io.github.linpeilie.annotations.AutoMapper;


/**
 * 往来单位业务对象 wms_merchant
 *
 * @author zcc
 * @date 2024-07-05
 */

@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = Merchant.class, reverseConvertGenerate = false)
public class MerchantBo extends BaseEntity {

    /**
     *
     */
    private Long id;

    /**
     * 编号
     */
    @NotBlank(message = "编号不能为空", groups = { AddGroup.class, EditGroup.class })
    private String merchantNo;

    /**
     * 名称
     */
    @NotBlank(message = "名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String merchantName;

    /**
     * 开户行
     */
    private String bankName;

    /**
     * 银行账户
     */
    private String bankAccount;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 座机号
     */
    private String tel;

    /**
     * 联系人
     */
    private String contactPerson;

    /**
     * 级别
     */
    private String merchantLevel;

    /**
     * Email
     */
    private String email;

    /**
     * 备注
     */
    private String remark;


}
