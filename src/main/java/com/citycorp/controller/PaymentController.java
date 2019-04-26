package com.citycorp.controller;

import com.citycorp.exception.ResourceNotFoundException;
import com.citycorp.model.Client;
import com.citycorp.model.Payment;
import com.citycorp.model.RepaymentSchedule;
import com.citycorp.payload.ApiResponse;
import com.citycorp.payload.ClientRequest;
import com.citycorp.payload.LoanRequest;
import com.citycorp.payload.PaymentRequest;
import com.citycorp.payload.RepaymentScheduleRequest;
import com.citycorp.repository.ClientRepository;
import com.citycorp.repository.LoanRepository;
import com.citycorp.repository.PaymentRepository;
import com.citycorp.repository.RepaymentScheduleRepository;
import java.io.PrintStream;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api"})
public class PaymentController
{
  @Autowired
  private PaymentRepository pRepository;
  @Autowired
  private LoanRepository lRepository;
  @Autowired
  private ClientRepository cRepository;
  @Autowired
  private RepaymentScheduleRepository rRepository;
  
  @PostMapping({"/receipt/check"})
  public ApiResponse chekReceiptNumber(@Valid @RequestBody PaymentRequest paymentRequest)
  {
    System.out.println(paymentRequest.getReceiptNumber().replaceAll("\\s+",""));
    
    
        Payment pay = pRepository.existsByReceiptNumber(paymentRequest.getReceiptNumber().replaceAll("\\s+",""))
                .orElseThrow(() ->new ApiResponse(false, "false","Payment","receipt_number",paymentRequest.getReceiptNumber().replaceAll("\\s+","")));
//    if (pRepository.existsByReceiptNumber(paymentRequest.getReceiptNumber().replaceAll("\\s+","")))
//    {
//      System.out.println(paymentRequest);
//      return new ApiResponse(false, "Receipt Number Exists");
//    }
//    if (!pRepository.existsByReceiptNumber(paymentRequest.getReceiptNumber().replaceAll("\\s+","")))
//    {
//      System.out.println(paymentRequest);
//      return new ApiResponse(true, "Receipt Number Available");
//    }
    System.out.println(paymentRequest.getReceiptNumber().replaceAll("\\s+",""));
    return new ApiResponse(true, "true","Payment","receipt_number",paymentRequest.getReceiptNumber().replaceAll("\\s+",""));
  }
  
  @PostMapping({"/client/get"})
  public Optional<Client> getClient(@Valid @RequestBody LoanRequest lRequest)
  {
    Optional<Client> c = this.cRepository.findById(this.lRepository.findClientIdById(lRequest.getId()));
    return c;
  }
  
  @PostMapping({"/details/get"})
  public Optional<Client> getDetails(@Valid @RequestBody ClientRequest cRequest)
  {
    Optional<Client> c = this.cRepository.findById(cRequest.getClientId());
    return c;
  }
  
  @PostMapping({"/payment/get"})
  public Optional<RepaymentSchedule> getPaymentSchedule(@Valid @RequestBody RepaymentScheduleRequest rRequest)
  {
    Optional<RepaymentSchedule> p = this.rRepository.findByLoanId(rRequest.getLoanId());
    return p;
  }
}
