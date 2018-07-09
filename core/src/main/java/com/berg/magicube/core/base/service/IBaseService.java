package com.berg.magicube.core.base.service;

import com.berg.magicube.core.base.entity.ServiceMultiResult;
import com.berg.magicube.core.base.entity.ServiceResult;
import com.berg.magicube.core.base.web.dto.BaseCondition;
import com.berg.magicube.core.base.web.dto.BaseDto;

import java.io.Serializable;
import java.util.List;

/**
 * <p>基本的服务接口</p>
 *
 * @author  993450432@qq.com
 * @version v1.0
 * @apiNote Created on 18-07-09
 */
public interface IBaseService<
        ID extends Serializable,
        DTO extends BaseDto,
        CONDITION extends BaseCondition> {

    /**
     * 根据id查找满足条件的单个数据
     *
     * @param id    数据对象的id
     * @return      服务层返回的单个数据对象
     */
    ServiceResult<DTO> findOne(ID id);

    /**
     *
     * @param condition
     * @return
     */
    ServiceMultiResult<DTO> select(CONDITION condition);

    /**
     *
     * @param dto
     * @return
     */
    ServiceResult<DTO> insert(DTO dto);

    /**
     *
     * @param dto
     * @return
     */
    ServiceResult<DTO> update(DTO dto);

    /**
     *
     * @param id
     * @param dto
     * @return
     */
    ServiceResult<DTO> update(ID id, DTO dto);

    /**
     *
     * @param id
     * @return
     */
    ServiceResult<DTO> deleteOne(ID id);

    /**
     *
     * @param condition
     * @return
     */
    ServiceMultiResult<DTO> delete(CONDITION condition);

    /**
     *
     * @param dtos
     * @return
     */
    ServiceMultiResult<DTO> batchUpdate(List<DTO> dtos);

    /**
     *
     * @param ids
     * @return
     */
    ServiceMultiResult<DTO> batchDelete(List<ID> ids);
}
