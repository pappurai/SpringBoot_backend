package com.springrest.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FileDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private  String fileName;
	private byte[] docFile;
	public FileDocument(long id, String fileName, byte[] docFile) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.docFile = docFile;
	}
	public FileDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getDocFile() {
		return docFile;
	}
	public void setDocFile(byte[] docFile) {
		this.docFile = docFile;
	}
	@Override
	public String toString() {
		return "File [id=" + id + ", fileName=" + fileName + ", docFile=" + Arrays.toString(docFile) + "]";
	}
	
	
}
