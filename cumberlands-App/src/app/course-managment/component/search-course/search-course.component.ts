import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-search-course',
  templateUrl: './search-course.component.html',
  styleUrls: ['./search-course.component.css']
})
export class SearchCourseComponent implements OnInit {

  searchCourse:FormGroup;

  constructor(private fb:FormBuilder) { }

  ngOnInit() {
    this.searchCourse = this.fb.group({
      name:[],
      duration:[],
      cost:[],
      trainer:[]
    })
  }

}
