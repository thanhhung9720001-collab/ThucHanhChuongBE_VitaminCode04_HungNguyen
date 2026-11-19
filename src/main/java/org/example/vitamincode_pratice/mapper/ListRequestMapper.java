package org.example.vitamincode_pratice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.vitamincode_pratice.entity.ListRequestEntity;
import org.example.vitamincode_pratice.entity.UserProfileEntity;

import java.util.List;

@Mapper
public interface ListRequestMapper {
    List<ListRequestEntity>  getListRequests();
    int insertRequest(ListRequestEntity requestEntity);
    int updateRequest(ListRequestEntity requestEntity);
    int deleteRequest(@Param("id") int requestId);
}
