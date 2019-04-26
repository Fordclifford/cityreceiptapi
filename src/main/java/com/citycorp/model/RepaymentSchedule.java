package com.citycorp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_loan_repayment_schedule")
public class RepaymentSchedule
{
  @Column(name="id")
  @Id
  private Long id;
  @Column(name="loan_id")
  private Long loanId;
  @Column(name="principal_amount")
  private Double principalAmount;
  @Column(name="interest_amount")
  private Double interestAmount;
  
  public Double getInterestAmount()
  {
    return this.interestAmount;
  }
  
  public void setInterestAMount(Double interestAmount)
  {
    this.interestAmount = interestAmount;
  }
  
  public RepaymentSchedule(Long loanId, Double principalAmount, Double interestAmount)
  {
    this.loanId = loanId;
    this.principalAmount = principalAmount;
    this.interestAmount = interestAmount;
  }
  
  public RepaymentSchedule() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public Long getLoanId()
  {
    return this.loanId;
  }
  
  public Double getPrincipalAmount()
  {
    return this.principalAmount;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public void setLoanId(Long loanId)
  {
    this.loanId = loanId;
  }
  
  public void setPrincipalAmount(Double principalAmount)
  {
    this.principalAmount = principalAmount;
  }
}
