package com.assesemnetApp.assesemnetApp.conroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;
import com.assesemnetApp.assesemnetApp.model.ClientResponseModel;
import com.assesemnetApp.assesemnetApp.services.ClentService;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class Clientcontroller {
	
	@Autowired
	private ClentService clientSerive;
	
	@PostMapping("/clients")
	public ClientEntity saveClient(@RequestBody ClientEntity client) {
		
		return clientSerive.saveclient(client);
		
	}
	
	
	@GetMapping("/client-loging")
	public ResponseEntity<ClientResponseModel> login(@RequestParam("username") String username, @RequestParam("password") String password){
		
		 ClientEntity clientEntity = new ClientEntity();
		 ClientResponseModel clientResponseModel  = new ClientResponseModel();
		try {
			
			clientEntity = clientSerive.fetchByClientnameAndClientpassword(username, password);
			
			if(clientEntity != null) {
				
				clientResponseModel.setClientDetails(clientEntity);
				clientResponseModel.setMessage(null);
				clientResponseModel.setSuccess(true);
				
				
			} else {
				clientResponseModel.setClientDetails(null);
				clientResponseModel.setMessage("Not found");
				clientResponseModel.setSuccess(false);
			}
			
			
		} catch (Exception e){
			 ResponseEntity.internalServerError().body(e);
		}
		// return ResponseEntity.ok("Student updated successfully");	
		return ResponseEntity.ok(clientResponseModel);
		
	}


}
