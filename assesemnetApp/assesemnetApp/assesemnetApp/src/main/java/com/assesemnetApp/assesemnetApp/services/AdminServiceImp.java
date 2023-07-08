package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesemnetApp.assesemnetApp.entity.AdminEntity;
import com.assesemnetApp.assesemnetApp.repository.AdminRepository;

@Service
public class AdminServiceImp implements AdminService{

	@Autowired
	AdminRepository adminRepository;
	@Override
	public AdminEntity fetchByAdminUserAndAdminPass(String clientname, String clientpassword) {
		// TODO Auto-generated method stub
		
		
		return this.adminRepository.findByAdminUserAndAdminPass(clientname, clientpassword);
	}
	
	public AdminEntity createAdmin(AdminEntity admin) {
		// TODO Auto-generated method stub
		
		
		return this.adminRepository.save(admin);
	}
}
