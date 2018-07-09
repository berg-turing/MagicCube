package com.berg.magicube.core.base.mapper;

import com.berg.magicube.core.base.entity.BaseEntity;
import com.berg.magicube.core.base.web.dto.BaseCondition;

import java.io.Serializable;
import java.util.List;

/**
 * <p>基本的mapper接口</p>
 *
 * @author  993450432@qq.com
 * @version v1.0
 * @apiNote Created on 18-07-09
 */
public interface BaseMapper<
        ID extends Serializable,
        ENTITY extends BaseEntity,
        CONDITION extends BaseCondition> {

    /**
     * 根据id查找一个指定的实体对象
     *
     * @param id    该实体对象的id
     * @return      查找到的实体对象，如果没有找到就返回null
     */
    ENTITY findOne(ID id);

    /**
     * 条件查询满足条件的所有的实体对象
     *
     * @param condition     条件对象
     * @return              查询到的实体对象
     */
    List<ENTITY> select(CONDITION condition);

    /**
     * 插入一条新的数据
     *
     * @param entity    插入的数据实体对象
     * @return          插入之后的数据实体对象
     */
    int insert(ENTITY entity);

    /**
     * 更新或者插入一条数据：
     *      如果entity有id则更新数据
     *      如果entity没有id则插入一条新的数据
     *
     * @param entity    更新或者插入的数据实体对象
     * @return          更新或者插入之后的数据实体对象
     */
    int update(ENTITY entity);

    /**
     * 根据id，删除一条指定的数据
     *
     * @param id    删除的数据的id值
     * @return      删除的数据对象
     */
    int deleteOne(ID id);

    /**
     * 根据条件删除数据(慎用)
     * @param condition     查询的条件对象
     * @return              删除的数据对象
     */
    int delete(CONDITION condition);
}
