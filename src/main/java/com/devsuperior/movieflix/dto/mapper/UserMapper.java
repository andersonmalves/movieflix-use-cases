package com.devsuperior.movieflix.dto.mapper;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;

public class UserMapper {

  public static UserDTO toDTO(final User user) {
    return UserDTO.builder()
        .id(user.getId())
        .name(user.getName())
        .email(user.getEmail())
        .build();
  }
}