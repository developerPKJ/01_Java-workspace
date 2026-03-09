package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class ObjectsRun {

	public static void main(String[] args) {
		
		ObjectsDao ods = new ObjectsDao();
		
		// ods.fileSave();
		ods.fileRead();
		
	}
	
}
