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

package training.demo.search.container.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import training.demo.search.container.model.Student;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StudentCacheModel)) {
			return false;
		}

		StudentCacheModel studentCacheModel = (StudentCacheModel)object;

		if (StudentId == studentCacheModel.StudentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, StudentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{StudentId=");
		sb.append(StudentId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", mobileNo=");
		sb.append(mobileNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setStudentId(StudentId);

		if (name == null) {
			studentImpl.setName("");
		}
		else {
			studentImpl.setName(name);
		}

		if (email == null) {
			studentImpl.setEmail("");
		}
		else {
			studentImpl.setEmail(email);
		}

		if (mobileNo == null) {
			studentImpl.setMobileNo("");
		}
		else {
			studentImpl.setMobileNo(mobileNo);
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		StudentId = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		mobileNo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(StudentId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (mobileNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobileNo);
		}
	}

	public long StudentId;
	public String name;
	public String email;
	public String mobileNo;

}