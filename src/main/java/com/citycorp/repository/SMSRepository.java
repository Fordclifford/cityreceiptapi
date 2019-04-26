package com.citycorp.repository;

import com.citycorp.model.SMS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface SMSRepository
  extends JpaRepository<SMS, Long>
{}
