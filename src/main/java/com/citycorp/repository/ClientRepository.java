package com.citycorp.repository;

import com.citycorp.model.Client;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface ClientRepository
  extends JpaRepository<Client, Long>
{
  public abstract Optional<Client> findById(Long paramLong);
}
