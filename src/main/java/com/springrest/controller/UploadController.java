package com.springrest.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletContext;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.springrest.dao.DocFileDao;
import com.springrest.dao.RegistrationDao;
import com.springrest.services.AccountService;
import com.springrest.services.RegistrationService;

@RestController
@RequestMapping("/api/demo")
public class UploadController implements ServletContextAware {
	
	@Autowired
	private RegistrationDao registeritem;
	
	
	
	private ServletContext servletContext;
	
	@RequestMapping(value="upload",method=RequestMethod.POST)
	
	public ResponseEntity<ArrayList<String>> upload(@RequestParam("files")MultipartFile[] files){
		//try {
			System.out.println("File list");
			ArrayList<String> filePaths=new ArrayList<String>();
			for(MultipartFile file: files) {
				System.out.println("File name:"+file.getOriginalFilename());
				System.out.println("File size:"+file.getSize());
				System.out.println("File type:"+file.getContentType());
				
				System.out.println("-----------");
				filePaths.add("/uploads/images/"+save(file));
			}
			
			
			
			
			return ResponseEntity.ok(filePaths);
			
		
	}
		
		private String save(MultipartFile file) {
			try {
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat("ddMMyyyyHHmmss");
				String newFileName=simpleDateFormat.format(new Date()) +file.getOriginalFilename();
				byte[] bytes=file.getBytes();
				Path path=Paths.get(this.servletContext.getRealPath("/uploads/images/" +newFileName));
				Files.write(path,bytes);
				
				return newFileName;
				
			}catch(Exception e) {
				return null;
			}
		}

		@Override
		public void setServletContext(ServletContext servletContext) {
			this.servletContext=servletContext;
			
		}
	}


