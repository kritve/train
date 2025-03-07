import { Component } from '@angular/core';
import { RouterOutlet, RouterLink } from '@angular/router';

@Component({
  selector: 'app-run-routing',
  imports: [RouterOutlet,RouterLink],
  templateUrl: './run-routing.component.html',
  styleUrl: './run-routing.component.css'
})
export class RunRoutingComponent {
  title: string = "Angular routing implementation"
  footerUrl = "https://www.google.com"
  footerLink = "https://angular.com"
}
