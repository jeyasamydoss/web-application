package com.example.StudentMarkSheet.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StudentMarkSheet.entity.MarkSheet;

public interface StudentMarkSheetRepository extends JpaRepository<MarkSheet, Integer>{
@Query(value="select * from mark_sheet where roll_number=?",nativeQuery = true)
public	List<MarkSheet> getByRollNum(int roll_number);

}
