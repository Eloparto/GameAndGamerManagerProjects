package EntityObjects;

import java.util.Date;

import AbstractObjects.Entity;

public class Gamer implements Entity {

	private int _id;
	private String _firstName;
	private String _lastName;
	private String _eMail;
	private String _phoneNumber;
	private String _nationalId;
	private Date _dateOfBirth;
	
	public Gamer() {}
	
	public Gamer(int id,String firstName,String lastName,String eMail,String phoneNumber,String nationalId,Date dateOfBirth) {
		
		_id = id;
		_firstName = firstName;
		_lastName = lastName;
		_eMail = eMail;
		_phoneNumber = phoneNumber;
		_nationalId =nationalId;
		_dateOfBirth = dateOfBirth;
		
	}
	
	public void setId(int id) {
		_id = id;
	}
	public int getId() {
		return _id;
	}
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}
	public String getFirstName() {
		return _firstName;
	}
	public void setLastName(String lastName) {
		_lastName = lastName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setEmail(String eMail) {
		_eMail = eMail;
	}
	public String getEmail() {
		return _eMail;
	}
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return _phoneNumber;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public String get_nationalId() {
		return _nationalId;
	}

	public void set_nationalId(String nationalId) {
		this._nationalId = nationalId;
	}
	
	
}
