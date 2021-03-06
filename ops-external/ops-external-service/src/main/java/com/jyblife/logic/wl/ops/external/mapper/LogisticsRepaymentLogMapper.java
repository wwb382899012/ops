package com.jyblife.logic.wl.ops.external.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jyblife.logic.wl.ops.entity.LogisticsRepaymentLog;

public interface LogisticsRepaymentLogMapper {
    /**
     * deleteByPrimaryKey
     *
     * 
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert
     *
     * 
     * @param record
     * @return int
     */
    int insert(LogisticsRepaymentLog record);

    /**
     * insertSelective
     *
     * 
     * @param record
     * @return int
     */
    int insertSelective(LogisticsRepaymentLog record);

    /**
     * selectByPrimaryKey
     *
     * 
     * @param id
     * @return LogisticsRepaymentLog
     */
    LogisticsRepaymentLog selectByPrimaryKey(Long id);

    /**
     * updateByPrimaryKeySelective
     *
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(LogisticsRepaymentLog record);

    /**
     * updateByPrimaryKey
     *
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(LogisticsRepaymentLog record);
    
    List<LogisticsRepaymentLog> selectByTxno(@Param("txNo") String txNo);
    
    int updateByTxno(LogisticsRepaymentLog record);
}