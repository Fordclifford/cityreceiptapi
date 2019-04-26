package com.citycorp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SMS
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String phone;
  private String message;
  
  public SMS() {}
  
  public SMS(String phone, String message)
  {
    this.phone = phone;
    this.message = message;
  }
  
  public Long getId()
  {
    return this.id;
  }
  
  public String getPhone()
  {
    return this.phone;
  }
  
  public String getMessage()
  {
    return this.message;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public void setPhone(String phone)
  {
    this.phone = phone;
  }
  
  public void setMessage(String message)
  {
    this.message = message;
  }
}
