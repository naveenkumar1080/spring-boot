package com.web.ems.controller;

import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @ApiOperation(value = "Get Status Of EMS Application")
    @GetMapping(value = "/status", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getStatus() {
        final String response = "OK";

        // return ResponseEntity.status(HttpStatus.OK).body(response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ApiOperation(value = "Stopping EMS Application Forcefully")
    @GetMapping(value = "/stop", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<Void> stopApplicationForcefully() {
        System.exit(0);

        return new ResponseEntity<>(HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }
}
