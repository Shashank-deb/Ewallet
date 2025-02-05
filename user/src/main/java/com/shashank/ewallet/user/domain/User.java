package com.shashank.ewallet.user.domain;


import com.shashank.ewallet.user.service.resource.UserResponse;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String password;

    private String email;

    public UserResponse toUserResponse(){
        return UserResponse.builder()
                .id(String.valueOf(id))
                .name(name)
                .email(email)
                .build();
    }
}