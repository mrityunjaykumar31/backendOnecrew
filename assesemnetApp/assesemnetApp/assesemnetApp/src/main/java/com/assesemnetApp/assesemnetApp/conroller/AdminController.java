package com.assesemnetApp.assesemnetApp.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.AdminEntity;
import com.assesemnetApp.assesemnetApp.model.AdminRequestModel;
import com.assesemnetApp.assesemnetApp.model.AdminResponseModel;
import com.assesemnetApp.assesemnetApp.model.AnswerResponseModel;
import com.assesemnetApp.assesemnetApp.services.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("/admin-login")
	public ResponseEntity<AdminResponseModel>checkAdmin(@RequestBody AdminRequestModel adminRequestModel){
		
		AdminEntity admin = this.adminService.fetchByAdminUserAndAdminPass(adminRequestModel.getUser(), adminRequestModel.getPwd());
		AdminResponseModel adminResponseModel = new AdminResponseModel();
		try {
			if(admin !=null) {
				adminResponseModel.setSuccess(true);
				adminResponseModel.setMessage("login successful");
				
			}else {
				adminResponseModel.setSuccess(false);
				adminResponseModel.setMessage(null);
			}
			
		} catch (Exception e){
			 ResponseEntity.internalServerError().body(e);
		}
		return ResponseEntity.ok(adminResponseModel);
		 
		 
	 }

	
	@GetMapping("/createDefaultAdmin")
	public void createDefaultAdmin() {
		AdminEntity admin =new AdminEntity();
		
		admin.setAdminUser("Onecrew");
		admin.setAdminPass("Optra@123");
	//	System.out.println("working");
	//	return "updated";
		
	// String url = "http://52.207.59.58/login"+this.encryptionService.encrypt("mk");
	//this.emailService.sendHtmlEmail("mrityunjaykumar31@gmail.com", "test", url);
		this.adminService.createAdmin(admin);
	}
}
