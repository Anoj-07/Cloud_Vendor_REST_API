package com.Spring_Boot_REST_APi.REST_API.Controller;

import com.Spring_Boot_REST_APi.REST_API.model.CloudVendor;
import com.Spring_Boot_REST_APi.REST_API.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

    public CloudVendorService cloudVendorService;

    /*Constructor*/
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    /*Get specific data by ID*/
    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendorById(vendorId);
    }

    /*Get all data*/
    @GetMapping
    public List<CloudVendor> getCloudVendorAllDetails() {
        return cloudVendorService.getAllCloudVendor();
    }


    /*To create new data*/
    @PostMapping
    public String createCloudVendorDetail(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetail(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Update Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetail(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.deleteCloudVendor(vendorId);
    }


}
