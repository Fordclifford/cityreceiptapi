package com.citycorp.payload;

public class RepaymentScheduleRequest
{
  private Long loanId;
  
  public Long getLoanId()
  {
    return this.loanId;
  }
  
  public void setLoanId(Long loanId)
  {
    this.loanId = loanId;
  }
}
