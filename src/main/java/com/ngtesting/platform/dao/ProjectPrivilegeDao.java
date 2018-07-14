package com.ngtesting.platform.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProjectPrivilegeDao {
    List<Map<String, String>> listByProjectForUser(@Param("userId") Integer userId,
                                   @Param("prjId") Integer prjId, @Param("orgId") Integer orgId);
}
