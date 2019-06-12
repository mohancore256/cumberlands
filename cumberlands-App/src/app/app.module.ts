import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './common/component/header/header.component';
import { FooterComponent } from './common/component/footer/footer.component';
import { MenuComponent } from './common/menu/menu.component';
import { WelcomeComponent } from './common/component/welcome/welcome.component';
import { SearchStudentComponent } from './student-managment/compoent/search-student/search-student.component';
import { StudentRegistrationComponent } from './student-managment/compoent/student-registration/student-registration.component';
import { SearchCourseComponent } from './course-managment/component/search-course/search-course.component';
import { CourseRegistrationComponent } from './course-managment/component/course-registration/course-registration.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MenuComponent,
    WelcomeComponent,
    SearchStudentComponent,
    StudentRegistrationComponent,
    SearchCourseComponent,
    CourseRegistrationComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
