import { Component } from '@angular/core';
import { ParentComponent } from './parent/parent.component';

@Component({
  selector: 'app-my-first-component',
  imports: [ParentComponent],
  templateUrl: './my-first-component.component.html',
  styleUrl: './my-first-component.component.css'
})
export class MyFirstComponentComponent {

}
