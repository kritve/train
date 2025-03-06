import { CommonModule, NgClass } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgModel } from '@angular/forms';
import { BasicHighlightDirective } from './basic-highlight/basic-highlight.directive';

@Component({
  selector: 'app-directives',
  imports: [CommonModule, NgClass,FormsModule, BasicHighlightDirective],
  templateUrl: './directives.component.html',
  styleUrl: './directives.component.css'
})
export class DirectivesComponent {
  oddNumbers = [1,3,5,7]
  evenNumbers = [2,4,6,8]
  onlyOdd: boolean = false
  items=[1,2,3,4,5,6,67,4]

  num : number = 0

  selectedval = "0"

  arrayOfObjects = [
    {name: 'A', value:10},
    {name: 'B', value:10},
    {name: 'C', value:10},
    {name: 'D', value:10},
    {name: 'E', value:10},
  ]
}
