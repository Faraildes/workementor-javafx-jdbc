package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.Teacher;

public class TeacherService {

	public List<Teacher> findAll(){
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher(1, "Marta", new Date(), "12345678921", "986547562", 20000.00));
		list.add(new Teacher(2, "Mariana", new  Date(), "12987589562", "965747562", 17000.00));
		list.add(new Teacher(3, "Joana", new  Date(), "12345765895", "983425621", 15000.00));
		return list;
	}
}


