import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
    //@Output decorator along with eventemitter enables communication from child component to parent
    @Output() messageEvent = new EventEmitter<string>();

    sendMessage(){
      this.messageEvent.emit("Message from child component")
    }
}
