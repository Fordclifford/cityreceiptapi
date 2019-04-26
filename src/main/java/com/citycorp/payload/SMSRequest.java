package com.citycorp.payload;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SMSRequest
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String[] phone;
  private String message;
  
  public Long getId()
  {
    return this.id;
  }
  
  public String[] getPhone()
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
  
  public void setPhone(String[] phone)
  {
    this.phone = phone;
  }
  
  public void setMessage(String message)
  {
    this.message = message;
  }
}
