package com.bezkoder.spring.security.mongodb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rolesuser")
public class RoleUser {
  @Id
  
  private String id;
  
  public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

private String username;

  private String role;

  public RoleUser() {

  }
  
  public RoleUser(String username, String role) {
	    this.username = username;
	    this.role = role;
	    }


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
