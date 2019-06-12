import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms';
import { Student } from '../../model/student';
import { StudentService } from '../../service/student.service';

@Component({
  selector: 'app-search-student',
  templateUrl: './search-student.component.html',
  styleUrls: ['./search-student.component.css']
})
export class SearchStudentComponent implements OnInit {

  firstName:string='';
  lastName:string='';
  email:string='';

  public searchStudent:FormGroup;
  
  constructor(private fb:FormBuilder, private studentService:StudentService) {
   
   }

  ngOnInit() {
    this.searchStudent = new FormGroup({
      firstName : new FormControl(),
      lastName : new FormControl(),
       email  : new FormControl()
    });

    // this.searchStudent = this.fb.group({
    //   firstName:[this.firstName],
    //   lastName:[this.lastName],
    //   email:[this.email]
    // })
  }

  onSearch(student:Student){
   this.studentService.studentSearch(student).subscribe();
  }

}
