package org.edge.woostore.persist.dao.impl;

import org.edge.woostore.domain.entity.Master;
import org.edge.woostore.persist.dao.AbstractCoreDao;
import org.edge.woostore.persist.dao.IMasterDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/7.
 */
@Repository(value = "masterDao")
public class MasterDao extends AbstractCoreDao<Master,String> implements IMasterDao{

    @Override
    public int deleteByPrimaryKey(List<String> pkIds) {
        return 0;
    }

    @Override
    public int batchinsert(List<Master> records) {
        return 0;
    }

    @Override
    public int insertSelective(Master record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Master record) {
        return 0;
    }
}
