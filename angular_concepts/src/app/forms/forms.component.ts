import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-forms',
  imports: [FormsModule, ReactiveFormsModule],
  templateUrl: './forms.component.html',
  styleUrl: './forms.component.css',
  standalone:true
})
export class FormsComponent {
  title: string = "forms"
  contactForm!: FormGroup
  constructor(private formBuilder: FormBuilder){
    this.createContactForm()
  }

  createContactForm(){
    this.contactForm = this.formBuilder.group({
      fullName: [''],
      email: [''],
      message: ['']
    })
  }

  submitReactiveForm(){
    console.log("Reactive - you form data: ", this.contactForm.value)
  }

  submitTemplateForm(form: NgForm){
    console.log("Template - you form data: ", form.value)
  }
}
