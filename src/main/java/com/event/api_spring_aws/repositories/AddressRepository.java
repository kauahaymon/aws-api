package com.event.api_spring_aws.repositories;

import com.event.api_spring_aws.domain.Address;
import com.event.api_spring_aws.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
