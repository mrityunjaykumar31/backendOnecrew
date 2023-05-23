package com.assesemnetApp.assesemnetApp.services;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.stereotype.Service;

@Service
public class EncryptionService {

	
    private final StandardPBEStringEncryptor encryptor;

    public EncryptionService() {
        encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("mk"); // Set your secret key here
    }

    public String encrypt(String data) {
        return encryptor.encrypt(data);
    }

    public String decrypt(String encryptedData) {
        return encryptor.decrypt(encryptedData);
    }
}
