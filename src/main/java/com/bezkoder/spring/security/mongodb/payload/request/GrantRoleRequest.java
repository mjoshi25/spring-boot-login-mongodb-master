package com.bezkoder.spring.security.mongodb.payload.request;

import javax.validation.constraints.*;

public class GrantRoleRequest {
  //@NotBlank
  @Size(min = 3, max = 20)
  private String username;

  //@NotBlank
  @Size(max = 50)
  private String role;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
