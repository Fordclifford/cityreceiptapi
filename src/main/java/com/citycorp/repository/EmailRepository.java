package com.citycorp.repository;

import com.citycorp.model.EmailService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface EmailRepository
  extends JpaRepository<EmailService, Long>
{}
