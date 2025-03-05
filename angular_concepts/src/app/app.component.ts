import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MySecondComponentComponent } from './my-second-component/my-second-component.component';
import { MyFirstComponentComponent } from './my-first-component/my-first-component.component';

@Component({
  selector: 'app-root',
  imports: [],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular_concepts';
}
