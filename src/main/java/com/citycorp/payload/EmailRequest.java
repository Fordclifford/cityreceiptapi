package com.citycorp.payload;

public class EmailRequest
{
  private String message;
  private String attachment;
  private String fromEmail;
  private String toEmail;
  private String subject;
  
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
