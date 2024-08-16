package com.Spring_Boot_REST_APi.REST_API.service;

import com.Spring_Boot_REST_APi.REST_API.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendorById(String cloudVendorId);

    public List<CloudVendor> getAllCloudVendor();
}
