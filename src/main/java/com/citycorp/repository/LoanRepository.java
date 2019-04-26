package com.citycorp.repository;

import com.citycorp.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface LoanRepository
  extends JpaRepository<Loan, Long>
{
  @Query(value="SELECT m.client_id FROM m_loan m WHERE m.id = :id", nativeQuery=true)
  public abstract Long findClientIdById(@Param("id") Long paramLong);
}
