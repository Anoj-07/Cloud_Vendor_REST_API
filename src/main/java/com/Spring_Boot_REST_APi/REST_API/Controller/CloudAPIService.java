package com.Spring_Boot_REST_APi.REST_API.Controller;

import com.Spring_Boot_REST_APi.REST_API.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudAPIService {

    public CloudVendor cloudVendor;
    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetail(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetail(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Update Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetail(String vendorId){
        this.cloudVendor = null;
        return  "Cloud Vendor delete Successfully";
    }


}
