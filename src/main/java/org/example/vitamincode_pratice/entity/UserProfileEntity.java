package org.example.vitamincode_pratice.entity;



import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserProfileEntity {
    private Integer id;
    private String username;
    private String email;
    private RoleEntity role;
}

