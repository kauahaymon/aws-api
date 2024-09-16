package com.event.api_spring_aws.repositories;

import com.event.api_spring_aws.domain.Coupon;
import com.event.api_spring_aws.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
