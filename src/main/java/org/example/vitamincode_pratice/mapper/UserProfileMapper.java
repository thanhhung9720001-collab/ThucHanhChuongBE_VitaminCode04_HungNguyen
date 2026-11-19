package org.example.vitamincode_pratice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.vitamincode_pratice.entity.UserProfileEntity;

import java.util.List;

@Mapper
public interface UserProfileMapper {
    List<UserProfileEntity> getAllUserProfiles();
    int insertUserProfile(UserProfileEntity userProfileEntity);
    int updateUserProfile(UserProfileEntity userProfileEntity);
    int deleteUserProfile(@Param("id") int userProfileId);
}
