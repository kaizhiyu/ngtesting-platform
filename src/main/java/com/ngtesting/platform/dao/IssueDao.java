package com.ngtesting.platform.dao;

import com.ngtesting.platform.model.IsuIssue;
import com.ngtesting.platform.model.IsuPageElement;
import com.ngtesting.platform.model.IsuType;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IssueDao {
    IsuIssue get(@Param("id") Integer id,
                 @Param("orgId") Integer orgId);
    IsuIssue getByUuid(@Param("uuid") String uuid,
                       @Param("orgId") Integer orgId);

    Integer save(@Param("elems") List<IsuPageElement> elems,
                 @Param("params") List<Object> params);
    Integer saveExt(@Param("elems") List<IsuPageElement> elems,
                    @Param("params") List<Object> params,
                    @Param("id") Integer id);

    Integer update(@Param("elems") List<IsuPageElement> elems,
                   @Param("params") List<Object> params,
                   @Param("id") Integer id,
                   @Param("orgId") Integer orgId);
    Integer updateExt(@Param("elems") List<IsuPageElement> elems,
                   @Param("params") List<Object> params,
                   @Param("id") Integer id);

    Integer updateProp(@Param("id") Integer id,
                       @Param("code") String code,
                       @Param("value") String value,
                       @Param("projectId") Integer projectId);
    Integer updatePropExt(@Param("id") Integer id,
                       @Param("code") String code,
                       @Param("value") String value);

    Integer delete(@Param("id") Integer id,
                   @Param("orgId") Integer orgId);

    IsuType getProjectDefaultType(@Param("orgId") Integer orgId,
                                  @Param("prjId") Integer prjId);

    List<Map<String, Object>> getProjectDefaultPages(@Param("orgId") Integer orgId,
                                      @Param("prjId") Integer prjId,
                                      @Param("typeId") Integer typeId);

}
