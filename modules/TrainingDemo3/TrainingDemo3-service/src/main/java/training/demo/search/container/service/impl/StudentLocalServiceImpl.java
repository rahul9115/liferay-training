/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package training.demo.search.container.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;

import training.demo.search.container.model.Student;
import training.demo.search.container.service.StudentLocalServiceUtil;
import training.demo.search.container.service.base.StudentLocalServiceBaseImpl;


/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=training.demo.search.container.model.Student",
	service = AopService.class
)
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
	public Student addStudentDetails(String name,String mobileno, String email) {
		Student studentDetails=StudentLocalServiceUtil.createStudent(CounterLocalServiceUtil.increment(Student.class.getName()));
		studentDetails.setName(name);
		studentDetails.setEmail(email);
		studentDetails.setMobileNo(mobileno);
		StudentLocalServiceUtil.updateStudent(studentDetails);
		return studentDetails;
	}
	public Student editStudentDetails(long studentId,String name, String mobileno, String email) throws PortalException  {
		Student studentDetails=StudentLocalServiceUtil.getStudent(studentId);
		studentDetails.setName(name);
		studentDetails.setEmail(email);
		studentDetails.setMobileNo(mobileno);
		StudentLocalServiceUtil.updateStudent(studentDetails);
		return studentDetails;
		
	}
}