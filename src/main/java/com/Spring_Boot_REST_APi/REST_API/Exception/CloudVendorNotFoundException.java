package com.Spring_Boot_REST_APi.REST_API.Exception;

public class CloudVendorNotFoundException extends RuntimeException{
    public CloudVendorNotFoundException() {
    }

    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
