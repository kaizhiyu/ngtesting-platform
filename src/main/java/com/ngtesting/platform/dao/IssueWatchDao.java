package com.ngtesting.platform.dao;

import com.ngtesting.platform.model.TstUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IssueWatchDao {
    List<TstUser> list(@Param("issueId") Integer issueId);

    List<TstUser> search(@Param("issueId") Integer issueId,
                        @Param("prjId") Integer prjId,
                        @Param("keywords") String keywords,
                        @Param("exceptIds") List<Integer> exceptIds);

    void batchSave(@Param("issueId") Integer issueId,
                   @Param("userIds") List<Integer> userIds);

    void remove(@Param("id") Integer id);

    void watch(@Param("issueId") Integer issueId,
               @Param("userId") Integer userId);
    void unwatch(@Param("issueId") Integer issueId,
                 @Param("userId") Integer userId);
}