package com.doudouj.dao;

import com.doudouj.dto.Trade;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}