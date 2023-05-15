package com.sujit.transactional_annotation.repository;

import com.sujit.transactional_annotation.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
