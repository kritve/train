import { Routes } from '@angular/router';
import { HomeComponent } from './routing/pages/general/home/home.component';
import { SignupComponent } from './routing/pages/general/signup/signup.component';
import { LoginComponent } from './routing/pages/general/login/login.component';
import { AboutComponent } from './routing/pages/general/about/about.component';
import { ExperienceComponent } from './routing/pages/general/about/experience/experience.component';
import { SkillComponent } from './routing/pages/general/about/skill/skill.component';
import { ContactComponent } from './routing/pages/general/contact/contact.component';
import { MailingComponent } from './routing/pages/general/contact/mailing/mailing.component';
import { MappingComponent } from './routing/pages/general/contact/mapping/mapping.component';
import { WebsiteComponent } from './routing/pages/general/contact/website/website.component';
import { NotFoundComponent } from './routing/pages/general/not-found/not-found.component';

export const routes: Routes = [

    {path: '', redirectTo: 'login', pathMatch: 'full'},
    {path: 'home', component: HomeComponent},
    {path: 'login', component: LoginComponent},
    {path: 'signup', component: SignupComponent},

    {
        path: 'about', component: AboutComponent,
        children: [
            {path: '', component: ExperienceComponent},
            {path: 'experience', component: ExperienceComponent},
            {path: 'skill', component: SkillComponent},
        ]
    },
    {
        path: 'contact', component: ContactComponent,
        children: [
            {path: '', component: MailingComponent},
            {path: 'mailing', component: MailingComponent},
            {path: 'mapping', component: MappingComponent},
            {path: 'website', component: WebsiteComponent},



        ]
    },
    {path: '**', component: NotFoundComponent}
];
