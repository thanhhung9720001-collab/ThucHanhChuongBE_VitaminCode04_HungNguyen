package org.example.vitamincode_pratice.entity;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class ListRequestEntity {
    private Integer id;
    private String question;
    private String status;
    private UserProfileEntity user_profile;
}
