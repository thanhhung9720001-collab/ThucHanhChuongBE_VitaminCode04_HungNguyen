package org.example.vitamincode_pratice.entity;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RoleEntity {
    private Integer id;
    private String role_name;
    private String description;
}
