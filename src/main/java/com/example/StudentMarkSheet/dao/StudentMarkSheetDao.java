package com.example.StudentMarkSheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentMarkSheet.entity.MarkSheet;
import com.example.StudentMarkSheet.repository.StudentMarkSheetRepository;
@Repository
public class StudentMarkSheetDao {
	@Autowired
	StudentMarkSheetRepository marrepo;

	public MarkSheet insertStudent(MarkSheet e) {
		int sem1Total=e.getSem1Theory()+e.getSem1Practicals();
		int sem2Total=e.getSem2Theory()+e.getSem2Practicals();
		e.setSem1Total(sem1Total);
		e.setSem2Total(sem2Total);
		return marrepo.save(e);
	}

	public List<MarkSheet> getByRollNum(int roll_number) {
		// TODO Auto-generated method stub
		return marrepo.getByRollNum(roll_number);
	}
	
}
