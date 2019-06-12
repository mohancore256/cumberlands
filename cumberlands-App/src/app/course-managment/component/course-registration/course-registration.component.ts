import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Course } from '../../model/course';

@Component({
  selector: 'app-course-registration',
  templateUrl: './course-registration.component.html',
  styleUrls: ['./course-registration.component.css']
})
export class CourseRegistrationComponent implements OnInit {

  courseRegistration: FormGroup;

  course:Course;
  constructor(private fb: FormBuilder) { }

  onCourseRegistration(){
    this.course.name = this.courseRegistration.get("name").value;
    this.course.duration = this.courseRegistration.get("duration").value;
    this.course.cost = this.courseRegistration.get("cost").value;
    this.course.startDate = this.courseRegistration.get("startDate").value;
    this.course.endDate = this.courseRegistration.get("endDate").value;
    
  }

  ngOnInit() {
    this.courseRegistration = this.fb.group({
      name: [],
      duration: [],
      cost: [],
      startDate: [],
      endDate: []
    })
  }

}
