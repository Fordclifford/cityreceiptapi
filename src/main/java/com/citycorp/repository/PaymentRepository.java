package com.citycorp.repository;

import com.citycorp.model.Payment;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PaymentRepository
  extends JpaRepository<Payment, Long>
{

    /**
     *
     * @param paramString
     * @return
     */
    @Query(
			  value = "select * from m_payment_detail p left join m_loan_transaction lt on lt.payment_detail_id = p.id left join m_savings_account_transaction st on st.payment_detail_id=p.id WHERE (st.is_reversed=0 or lt.is_reversed=0) and  (REPLACE(p.receipt_number, ' ', '')= :receipt_number or REPLACE(p.check_number, ' ', '')= :receipt_number)",
			  nativeQuery = true)
  Optional<Payment> existsByReceiptNumber(@Param("receipt_number") String paramString);
}
