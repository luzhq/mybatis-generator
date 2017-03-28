package com.morning.star.dms.order.dao;

import com.morning.star.dms.order.entity.DmsOrderInfo;
import com.morning.star.dms.order.entity.DmsOrderInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsOrderInfoMapper {
    int countByExample(DmsOrderInfoCriteria example);

    int deleteByExample(DmsOrderInfoCriteria example);

    int deleteByPrimaryKey(Long orderId);

    int insert(DmsOrderInfo record);

    int insertSelective(DmsOrderInfo record);

    List<DmsOrderInfo> selectByExample(DmsOrderInfoCriteria example);

    DmsOrderInfo selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") DmsOrderInfo record, @Param("example") DmsOrderInfoCriteria example);

    int updateByExample(@Param("record") DmsOrderInfo record, @Param("example") DmsOrderInfoCriteria example);

    int updateByPrimaryKeySelective(DmsOrderInfo record);

    int updateByPrimaryKey(DmsOrderInfo record);
}