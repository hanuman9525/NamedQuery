package com.scp.NamedNative.queries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PassportOneToOne_tbl")
@NamedNativeQueries({
		@NamedNativeQuery(name = "GetAllPassport", query = "Select * from PassportOneToOne_tbl", resultClass = Passport.class),
		@NamedNativeQuery(name = "GetPassport", query = "Select * from PassportOneToOne_tbl where passportId=:id", resultClass = Passport.class) })
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int passportId;
	private String passportNumber;

	public Passport(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + "]";
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
}
