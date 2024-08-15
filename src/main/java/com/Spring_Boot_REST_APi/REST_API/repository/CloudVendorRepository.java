package com.Spring_Boot_REST_APi.REST_API.repository;

import com.Spring_Boot_REST_APi.REST_API.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
