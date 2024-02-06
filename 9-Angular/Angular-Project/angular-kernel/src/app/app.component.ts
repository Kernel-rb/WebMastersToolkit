import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  //  value of selector is an html element 
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-kernel';
}