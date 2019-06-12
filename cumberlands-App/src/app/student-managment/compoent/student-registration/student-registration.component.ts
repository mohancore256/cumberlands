import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Student } from '../../model/student';

@Component({
  selector: 'app-student-registration',
  templateUrl: './student-registration.component.html',
  styleUrls: ['./student-registration.component.css']
})
export class StudentRegistrationComponent implements OnInit {

  

  student: Student;
  studentRegistration: FormGroup;

  constructor(private fb: FormBuilder) { }

  onRegistration() {
    this.student = new Student();
    this.student.studentId = this.studentRegistration.get('studentId').value;
    this.student.firstName = this.studentRegistration.get('firstName').value;
    this.student.lastName = this.studentRegistration.get('lastName').value;
    this.student.email = this.studentRegistration.get('email').value;
    this.student.DOB = this.studentRegistration.get('DOB').value;
    this.student.phoneNumber = this.studentRegistration.get('phoneNumber').value;

    this.student.permanentAddress.addressId = this.studentRegistration.get('permanentaddress_addressId').value;
    this.student.permanentAddress.addressLine1 = this.studentRegistration.get('permanentaddress_addressLine1').value;
    this.student.permanentAddress.addressLine2 = this.studentRegistration.get('permanentaddress_addressLine2').value;
    this.student.permanentAddress.city = this.studentRegistration.get('permanentaddress_city').value;
    this.student.permanentAddress.state = this.studentRegistration.get('permanentaddress_state').value;
    this.student.permanentAddress.zip = this.studentRegistration.get('permanentaddress_zip').value;

    this.student.presentAddress.addressId = this.studentRegistration.get('presentaddress_addressId').value;
    this.student.presentAddress.addressLine1 = this.studentRegistration.get('presentaddress_addressLine1').value;
    this.student.presentAddress.addressLine2 = this.studentRegistration.get('presentaddress_addressLine2').value;
    this.student.presentAddress.city = this.studentRegistration.get('presentaddress_city').value;
    this.student.presentAddress.state = this.studentRegistration.get(' presentaddress_state').value;
    this.student.presentAddress.zip = this.studentRegistration.get('presentaddress_zip').value;
    
  }

  ngOnInit() {
    this.studentRegistration = this.fb.group({
      studentId: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      DOB: ['', Validators.required],
      phoneNumber: ['', Validators.required],
      email: ['', Validators.required],

      permanentaddress_addressId: ['', Validators.required],
      permanentaddress_addressLine1: ['', Validators.required],
      permanentaddress_addressLine2: ['', Validators.required],
      permanentaddress_city: ['', Validators.required],
      permanentaddress_state: ['', Validators.required],
      permanentaddress_zip: ['', Validators.required],

      presentaddress_addressId: ['', Validators.required],
      presentaddress_addressLine1: ['', Validators.required],
      presentaddress_addressLine2: ['', Validators.required],
      presentaddress_city: ['', Validators.required],
      presentaddress_state: ['', Validators.required],
      presentaddress_zip: ['', Validators.required],

    })
  }

}
