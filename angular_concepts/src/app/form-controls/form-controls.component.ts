import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Form, FormControl, ReactiveFormsModule, Validators } from '@angular/forms';
import { delay, of } from 'rxjs';

@Component({
  selector: 'app-form-controls',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './form-controls.component.html',
  styleUrl: './form-controls.component.css'
})
export class FormControlsComponent {
  myControlDefault = new FormControl( 'default value')
  myControlRegular = new FormControl('default value', {initialValueIsDefault:true})

  emailControl = new FormControl ('', [Validators.required, Validators.email])
  myControl = new FormControl('a.b@gmail.com')
  emailTakenVailidator(control: FormControl){
    return of( control.value === 'taken@example.com' ? {emailTaken:true}: null).pipe(delay(1000));
  }
}
