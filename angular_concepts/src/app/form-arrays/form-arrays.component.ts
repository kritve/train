import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  standalone:true,
  selector: 'app-form-arrays',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './form-arrays.component.html',
  styleUrl: './form-arrays.component.css',
})
export class FormArraysComponent {
  form: FormGroup;

  constructor (private fb: FormBuilder){
    this.form = this.fb.group({
      name:[''],
      address: this.fb.array([])
    })
  }

  get address(): FormArray {
    return this.form.get('address') as FormArray;
  }

  addNewAddressGroup() {
    const addressArray = this.form.get('address') as FormArray
    addressArray.push( this.fb.group( {
      street:[''],
      city:[''],
    }))
  }

  deleteAddressGroup(index: number){
    const addressArray = this.form.get('address') as FormArray
    addressArray.removeAt(index)
  }

}
