package com.assesemnetApp.assesemnetApp.services;

import com.assesemnetApp.assesemnetApp.entity.AdminEntity;
import com.assesemnetApp.assesemnetApp.entity.ClientEntity;

public interface AdminService {

	
	AdminEntity fetchByAdminUserAndAdminPass(String clientname, String clientpassword);
	
	AdminEntity createAdmin(AdminEntity admin);
}
