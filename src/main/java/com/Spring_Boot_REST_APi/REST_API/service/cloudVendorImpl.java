package com.Spring_Boot_REST_APi.REST_API.service;

import com.Spring_Boot_REST_APi.REST_API.Exception.CloudVendorNotFoundException;
import com.Spring_Boot_REST_APi.REST_API.model.CloudVendor;
import com.Spring_Boot_REST_APi.REST_API.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class cloudVendorImpl implements CloudVendorService{

    CloudVendorRepository cloudVendorRepository;


    /*constructor*/
    public cloudVendorImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
//        CloudVendor cloudVendor1 = new CloudVendor();
        cloudVendorRepository.save(cloudVendor);
        return "Success full";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "success Update";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        CloudVendor cloudVendor = cloudVendorRepository.findById(cloudVendorId).get();
        cloudVendorRepository.delete(cloudVendor);
        return "Success delete";
    }

    @Override
    public CloudVendor getCloudVendorById(String cloudVendorId) {
        /*Exception*/
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Requested Cloud vendor doesn't exit");
        }
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
