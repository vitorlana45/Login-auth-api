package com.lanVitor.Authapi.domain.dtos;

import com.lanVitor.Authapi.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role){

}
