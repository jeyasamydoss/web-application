package com.example.StudentMarkSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMarkSheet.entity.MarkSheet;
import com.example.StudentMarkSheet.services.StudentMarkSheetServices;

@RestController
@RequestMapping(value="/mark")
public class StudentMarkSheetController {
	@Autowired
	StudentMarkSheetServices stumark;
@PostMapping(value="/add")
public MarkSheet insertStudent(@RequestBody MarkSheet e) {
	return stumark.insertStudent (e);
}
@GetMapping(value="/getByRollNum/{roll_number}")
public List<MarkSheet>getByRollNum(@PathVariable int roll_number) {
	return stumark.getByRollNum(roll_number);
}
}
