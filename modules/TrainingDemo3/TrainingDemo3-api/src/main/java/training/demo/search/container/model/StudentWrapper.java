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

package training.demo.search.container.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentWrapper
	extends BaseModelWrapper<Student>
	implements ModelWrapper<Student>, Student {

	public StudentWrapper(Student student) {
		super(student);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("StudentId", getStudentId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("mobileNo", getMobileNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long StudentId = (Long)attributes.get("StudentId");

		if (StudentId != null) {
			setStudentId(StudentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String mobileNo = (String)attributes.get("mobileNo");

		if (mobileNo != null) {
			setMobileNo(mobileNo);
		}
	}

	@Override
	public Student cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the email of this student.
	 *
	 * @return the email of this student
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the mobile no of this student.
	 *
	 * @return the mobile no of this student
	 */
	@Override
	public String getMobileNo() {
		return model.getMobileNo();
	}

	/**
	 * Returns the name of this student.
	 *
	 * @return the name of this student
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student ID of this student.
	 *
	 * @return the student ID of this student
	 */
	@Override
	public long getStudentId() {
		return model.getStudentId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the email of this student.
	 *
	 * @param email the email of this student
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the mobile no of this student.
	 *
	 * @param mobileNo the mobile no of this student
	 */
	@Override
	public void setMobileNo(String mobileNo) {
		model.setMobileNo(mobileNo);
	}

	/**
	 * Sets the name of this student.
	 *
	 * @param name the name of this student
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student ID of this student.
	 *
	 * @param StudentId the student ID of this student
	 */
	@Override
	public void setStudentId(long StudentId) {
		model.setStudentId(StudentId);
	}

	@Override
	protected StudentWrapper wrap(Student student) {
		return new StudentWrapper(student);
	}

}