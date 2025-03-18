import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { config } from './app/app.config.server';
import { MyFirstComponentComponent } from './app/my-first-component/my-first-component.component';
import { MySecondComponentComponent } from './app/my-second-component/my-second-component.component';
import { OneWayDataBindingComponent } from './app/one-way-data-binding/one-way-data-binding.component';
import { TwoWayDataBindingComponent } from './app/two-way-data-binding/two-way-data-binding.component';
import { DirectivesComponent } from './app/directives/directives.component';
import { FormsComponent } from './app/forms/forms.component';
import { FormControlsComponent } from './app/form-controls/form-controls.component';
import { FormArraysComponent } from './app/form-arrays/form-arrays.component';
import { RunRoutingComponent } from './app/routing/run-routing/run-routing.component';
import { SimpleFormsComponent } from './app/simple-forms/simple-forms.component';
import { BootstrapComponent } from './app/bootstrap/bootstrap.component';
import { HttpClientComponent } from './app/http-client/http-client.component';

const bootstrap = () => bootstrapApplication(HttpClientComponent, config); 

export default bootstrap;
