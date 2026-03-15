package com.project.web_tamplate_marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.project.web_tamplate_marketplace.entity.ContactRequest;
import com.project.web_tamplate_marketplace.service.ContactRequestService;

@RestController
@RequestMapping("/contact")
public class ContactRequestController {

    @Autowired
    private ContactRequestService contactRequestService;

    @PostMapping
    public ContactRequest createRequest(@RequestBody ContactRequest request){
        return contactRequestService.createRequest(request);
    }

    @GetMapping
    public List<ContactRequest> getAllRequests(){
        return contactRequestService.getAllRequests();
    }

    @GetMapping("/seller/{sellerId}")
    public List<ContactRequest> getRequestsBySeller(@PathVariable Long sellerId){
        return contactRequestService.getRequestsBySeller(sellerId);
    }

    @GetMapping("/buyer/{buyerId}")
    public List<ContactRequest> getRequestsByBuyer(@PathVariable Long buyerId){
        return contactRequestService.getRequestsByBuyer(buyerId);
    }

    @PutMapping("/{id}/status")
    public ContactRequest updateStatus(@PathVariable Long id, @RequestParam String status){
        return contactRequestService.updateStatus(id, status);
    }

}