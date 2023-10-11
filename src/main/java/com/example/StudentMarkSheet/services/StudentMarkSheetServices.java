package com.example.StudentMarkSheet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentMarkSheet.dao.StudentMarkSheetDao;
import com.example.StudentMarkSheet.entity.MarkSheet;
@Service
public class StudentMarkSheetServices {
	@Autowired
	StudentMarkSheetDao studao;
	public List<MarkSheet> getByRollNum(int roll_number) {
		// TODO Auto-generated method stub
		return studao.getByRollNum(roll_number);
	}

	public MarkSheet insertStudent(MarkSheet e) {
		// TODO Auto-generated method stub
		return studao.insertStudent(e);
	}

}
