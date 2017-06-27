package org.edge.woostore.persist.dao;

import org.edge.woostore.domain.entity.Group;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by Administrator on 2017/5/20.
 */
public interface IGroupDao extends CoreDao<Group,String>{
    @Transactional
    Collection<Group> getRootNode();
    @Transactional
    Collection<Group> getChildNode(String pkid);
    @Transactional
    Boolean isRootNode(String pkid);
}