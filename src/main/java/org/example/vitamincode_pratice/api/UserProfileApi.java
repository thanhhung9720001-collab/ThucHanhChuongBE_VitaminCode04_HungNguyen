package org.example.vitamincode_pratice.api;

import lombok.AllArgsConstructor;
import org.example.vitamincode_pratice.entity.UserProfileEntity;
import org.example.vitamincode_pratice.service.UserProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserProfileApi {

    private final UserProfileService userProfileService;

    @GetMapping("/users")
    public ResponseEntity<List<UserProfileEntity>> getAllUserProfiles() {
        return ResponseEntity.ok(userProfileService.getAllUserProfiles());
    }

    @PostMapping("/users")
    public ResponseEntity<UserProfileEntity> insertUserProfile(@RequestBody UserProfileEntity userProfileEntity) {
        UserProfileEntity savedUserProfile = userProfileService.insertUserProfile(userProfileEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUserProfile);
    }

    @PutMapping("/users")
    public Map<Object, UserProfileEntity> updateUserProfile(@RequestBody UserProfileEntity userProfileEntity) {
        HashMap result = new HashMap();
        try {
            result.put("status", 200);
            result.put("message", "success");
            result.put("data", userProfileService.updateUserProfile(userProfileEntity));
        } catch (Exception e) {
            result.put("status", 200);
            result.put("message", e.getMessage());
            result.put("data", null);
        }
        return result;
    }

    @DeleteMapping("/users/{userProfileId}")
    public Map<Object, UserProfileEntity> deleteUserProfile(@PathVariable("userProfileId") int userProfileId) {
        HashMap result = new HashMap();
        try {
            result.put("status", 200);
            result.put("message", "success");
            result.put("Data", userProfileService.deleteUserProfile(userProfileId));
        }catch (Exception e){
            result.put("status", 200);
            result.put("message", e.getMessage());
            result.put("Data", null);
        }
        return result;
    }
}
