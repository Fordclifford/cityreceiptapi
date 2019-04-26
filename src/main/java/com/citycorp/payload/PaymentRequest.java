package com.citycorp.payload;

public class PaymentRequest
{
  private String receiptNumber;
  private Long id;
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public String getReceiptNumber()
  {
    return this.receiptNumber;
  }
  
  public void setReceiptNumber(String receiptNumber)
  {
    this.receiptNumber = receiptNumber;
  }
}
