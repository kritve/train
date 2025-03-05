import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { config } from './app/app.config.server';
import { MyFirstComponentComponent } from './app/my-first-component/my-first-component.component';
import { MySecondComponentComponent } from './app/my-second-component/my-second-component.component';
import { OneWayDataBindingComponent } from './app/one-way-data-binding/one-way-data-binding.component';
import { TwoWayDataBindingComponent } from './app/two-way-data-binding/two-way-data-binding.component';

const bootstrap = () => bootstrapApplication(TwoWayDataBindingComponent, config); 

export default bootstrap;
