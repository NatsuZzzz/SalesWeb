package com.project.web_tamplate_marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.web_tamplate_marketplace.entity.ContactRequest;
import com.project.web_tamplate_marketplace.repository.ContactRequestRepository;

@Service
public class ContactRequestService {

    @Autowired
    private ContactRequestRepository contactRequestRepository;

    public ContactRequest createRequest(ContactRequest request) {
        request.setStatus("pending");
        return contactRequestRepository.save(request);
    }

    public List<ContactRequest> getAllRequests() {
        return contactRequestRepository.findAll();
    }

    public List<ContactRequest> getRequestsBySeller(Long sellerId) {
        return contactRequestRepository.findBySellerId(sellerId);
    }

    public List<ContactRequest> getRequestsByBuyer(Long buyerId) {
        return contactRequestRepository.findByBuyerId(buyerId);
    }

    public ContactRequest updateStatus(Long id, String status) {

        ContactRequest request = contactRequestRepository.findById(id).orElse(null);

        if (request != null) {
            request.setStatus(status);
            return contactRequestRepository.save(request);
        }

        return null;
    }

    public void deleteRequest(Long id) {
        contactRequestRepository.deleteById(id);
    }
}