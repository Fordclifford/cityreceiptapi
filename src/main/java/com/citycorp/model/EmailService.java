package com.citycorp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmailService
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String email;
  private String message;
  private String attachment;
  private String fromEmail;
  private String toEmail;
  private String subject;
  
  public EmailService() {}
  
  public EmailService(String message, String attachment, String fromEmail, String toEmail, String subject)
  {
    this.message = message;
    this.attachment = attachment;
    this.fromEmail = fromEmail;
    this.toEmail = toEmail;
    this.subject = subject;
  }
  
  public Long getId()
  {
    return this.id;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public String getMessage()
  {
    return this.message;
  }
  
  public String getAttachment()
  {
    return this.attachment;
  }
  
  public String getFromEmail()
  {
    return this.fromEmail;
  }
  
  public String getToEmail()
  {
    return this.toEmail;
  }
  
  public String getSubject()
  {
    return this.subject;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public void setMessage(String message)
  {
    this.message = message;
  }
  
  public void setAttachment(String attachment)
  {
    this.attachment = attachment;
  }
  
  public void setFromEmail(String fromEmail)
  {
    this.fromEmail = fromEmail;
  }
  
  public void setToEmail(String toEmail)
  {
    this.toEmail = toEmail;
  }
  
  public void setSubject(String subject)
  {
    this.subject = subject;
  }
}
