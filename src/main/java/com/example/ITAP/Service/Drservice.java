package com.example.ITAP.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ITAP.Entity.DR;
import com.example.ITAP.Repository.DrRepository;

@Service
public class Drservice {
	@Autowired
	private final DrRepository drrepo;
	public Drservice(DrRepository drrepo) 
	{
		this.drrepo = drrepo;
	}
	public List<String> getallappnames()
	{
		return drrepo.getappnames();
	}

	public String getappdeveloper2(String appname) {
        return drrepo.findByAppName(appname);
    }


}
