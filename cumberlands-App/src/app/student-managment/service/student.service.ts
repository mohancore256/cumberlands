import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Student } from '../model/student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  appUrl: "http://localhost:8082/student/";
  constructor(private httpClient: HttpClient) { }

  saveStudent() { }

  getStudentById( studentId:string):Observable<any> {
    return this.httpClient.get(this.appUrl+"/get/"+studentId);
   }

  getAllStudent() { 
    return this.httpClient.get(this.appUrl+"/getAll/");
  }

  deleteStudent() { }

  updateStudent() { }

  studentSearch(student:Student):Observable<any>{
    return this.httpClient.post(this.appUrl+"/search", student);

  }

}
