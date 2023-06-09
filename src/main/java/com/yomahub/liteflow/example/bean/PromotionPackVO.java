package com.yomahub.liteflow.example.bean;

import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;


@Data
public class PromotionPackVO extends PromotionInfoVO {

    /**
     * 这个优惠活动关联的商品包
     */
    private List<ProductPackVO> relatedProductPackList;


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (getClass() != obj.getClass()) {
                return false;
            } else {
                if (((PromotionPackVO) obj).getId().equals(this.getId())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

}
