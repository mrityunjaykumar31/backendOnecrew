package com.assesemnetApp.assesemnetApp.services;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;

public interface ClentService {

	ClientEntity saveclient(ClientEntity client);
	ClientEntity fetchByClientnameAndClientpassword(String clientname, String clientpassword);
}
