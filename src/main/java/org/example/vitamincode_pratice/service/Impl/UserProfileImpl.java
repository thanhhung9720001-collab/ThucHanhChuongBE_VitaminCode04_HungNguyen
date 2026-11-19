package org.example.vitamincode_pratice.service.Impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.vitamincode_pratice.entity.UserProfileEntity;
import org.example.vitamincode_pratice.mapper.UserProfileMapper;
import org.example.vitamincode_pratice.service.UserProfileService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileImpl implements UserProfileService {
    private final UserProfileMapper userProfileMapper;


    public List<UserProfileEntity> getAllUserProfiles() {
        return userProfileMapper.getAllUserProfiles();
    }

    public  UserProfileEntity insertUserProfile(UserProfileEntity userProfileEntity) {
        int result = userProfileMapper.insertUserProfile(userProfileEntity);
        if (result > 0) {
            return userProfileEntity;
        }
        throw new RuntimeException("Tạo user thất bại");
    }

    public  UserProfileEntity updateUserProfile(UserProfileEntity userProfileEntity) {
        if (userProfileEntity.getId() == null) {
            throw new RuntimeException("Không thể cập nhập - vì User ID null");
        }
        int result = userProfileMapper.updateUserProfile(userProfileEntity);
        if (result > 0) {
            return userProfileEntity;
        }
        throw new RuntimeException("Không thể cập nhập User");
    }

    public int deleteUserProfile(int userProfileId){
        if (userProfileId==0){
            throw new RuntimeException("Khong the xoa - vi User ID null");
        }
        return userProfileMapper.deleteUserProfile(userProfileId);
    }
}
