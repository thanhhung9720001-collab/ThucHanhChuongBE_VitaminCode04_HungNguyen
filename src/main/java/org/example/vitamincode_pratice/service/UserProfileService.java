package org.example.vitamincode_pratice.service;

import org.example.vitamincode_pratice.entity.UserProfileEntity;

import java.util.List;

public interface UserProfileService {
    List<UserProfileEntity> getAllUserProfiles();
    UserProfileEntity insertUserProfile(UserProfileEntity userProfileEntity);
    UserProfileEntity updateUserProfile(UserProfileEntity userProfileEntity);
    int deleteUserProfile(int userProfileId);
}
