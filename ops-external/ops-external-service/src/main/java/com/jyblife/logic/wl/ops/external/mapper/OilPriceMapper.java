package com.jyblife.logic.wl.ops.external.mapper;

import java.util.List;
import java.util.Map;

import com.jyblife.logic.wl.ops.core.mybatis.mapper.BaseMapper;
import com.jyblife.logic.wl.ops.entity.OilPrice;
import com.jyblife.logic.wl.ops.external.dto.req.ReqOilPriceListDto;
import com.jyblife.logic.wl.ops.external.dto.resp.RespOilPriceListDto;
import com.jyblife.logic.wl.ops.external.dto.resp.RespOilStationInfoDto;
import org.apache.ibatis.annotations.Param;

public interface OilPriceMapper extends BaseMapper<OilPrice,Integer> {
    /**
     * deleteByPrimaryKey
     *
     * 
     * @param priceId
     * @return int
     */
    int deleteByPrimaryKey(Integer priceId);

    /**
     * insert
     *
     * 
     * @param record
     * @return int
     */
    int insert(OilPrice record);

    /**
     * insertSelective
     *
     * 
     * @param record
     * @return int
     */
    int insertSelective(OilPrice record);

    /**
     * selectByPrimaryKey
     *
     * 
     * @param priceId
     * @return OilPrice
     */
    OilPrice selectByPrimaryKey(Integer priceId);

    /**
     * updateByPrimaryKeySelective
     *
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(OilPrice record);

    /**
     * updateByPrimaryKey
     *
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(OilPrice record);

    OilPrice selectByGoodsId(Integer goodsId);
    
    /**
     * 获取该油站油品得最新有效价格
     * @param param
     * @return
     */
    OilPrice getEffectByStationIdAndGoodsId(Map<String, Object> param);
    
    List<RespOilStationInfoDto.Goods> getOilPriceInfoByStationId(Integer stationId);

    List<OilPrice> getEffectListByStationIdAndGoodsId(@Param("stationId")Integer stationId,@Param("goodsId")Integer goodsId);
    
    List<RespOilPriceListDto.OilPriceItem> getOilPriceList(ReqOilPriceListDto.Search search);
    
}