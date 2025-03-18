import { Component } from '@angular/core';

@Component({
  selector: 'app-one-way-data-binding',
  imports: [],
  templateUrl: './one-way-data-binding.component.html',
  styleUrl: './one-way-data-binding.component.css'
})
export class OneWayDataBindingComponent {
  //interpolation
  message : string = "Interpolation - changes to model updates the view automatically"
  //property binding
  imageURL = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/512px-Angular_full_color_logo.svg.png"

  //attribute binding
  colspan = 2

  buttonClicked(event: any, item:any){
    console.log("Button clicked")
    if(event){
      alert(`${event.target.innerHTML}, ${event.target.value}, ${item}`)
    }
  }

  isClassapplied=true
  backgroundColor='lightblue'

}
