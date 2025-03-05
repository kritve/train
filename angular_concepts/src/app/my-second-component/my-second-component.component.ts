import { Component } from '@angular/core';
import { ChildComponent } from './child/child.component';

@Component({
  selector: 'app-my-second-component',
  imports: [ChildComponent],
  templateUrl: './my-second-component.component.html',
  styleUrl: './my-second-component.component.css'
})
export class MySecondComponentComponent {
  receivedMessage : string = ""

  recieveMessage(message: string){
    this.receivedMessage = message
  }
}
