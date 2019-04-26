package com.citycorp.repository;

import com.citycorp.model.RepaymentSchedule;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface RepaymentScheduleRepository
  extends JpaRepository<RepaymentSchedule, Long>
{
  @Query(value="SELECT  * FROM `m_loan_repayment_schedule` where `loan_id`=4 GROUP BY `loan_id", nativeQuery=true)
  public abstract Optional<RepaymentSchedule> findByLoanId(@Param("loanId") Long paramLong);
}
