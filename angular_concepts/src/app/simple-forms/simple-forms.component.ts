import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-simple-forms',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './simple-forms.component.html',
  styleUrl: './simple-forms.component.css'
})
export class SimpleFormsComponent {
  userForm: FormGroup;

  constructor (private formBuilder: FormBuilder){
    this.userForm = this.formBuilder.group({
      name:['', Validators.required],
      email:['', Validators.required],
      age:['', Validators.required],
      extraInfo: this.formBuilder.group({
        isEmployed:[false],
        company:[''],
        position:['']
      }),
    });
  }
  logFormData(): void {
    console.log(this.userForm.value);
  }


}