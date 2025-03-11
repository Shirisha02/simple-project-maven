package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.Service;

public class ServiceTest {
    private final Service service = new Service();

    @Test
    public void testValidEmails() {
        assertTrue(service.validateEmail("user@example.com"));
        assertTrue(service.validateEmail("test.email@domain.com"));
        assertTrue(service.validateEmail("name123@company.com"));
    }

//    @Test
//    void testInvalidEmails() {
//        assertFalse(service.validateEmail("plainaddress"));
//        assertFalse(service.validateEmail("user@example"));  // Missing .com
//        assertFalse(service.validateEmail("user@.com"));    // Invalid domain
//        assertFalse(service.validateEmail("user@com"));     // Invalid format
//        assertFalse(service.validateEmail("user@@example.com")); // Double @
//    }
//
//    @Test
//    void testEmptyAndNullEmails() {
//        assertFalse(service.validateEmail(""));
//        assertFalse(service.validateEmail(null));
//    }
}