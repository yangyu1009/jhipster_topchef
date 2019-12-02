import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { TopChefSharedModule } from 'app/shared/shared.module';
import { TopChefCoreModule } from 'app/core/core.module';
import { TopChefAppRoutingModule } from './app-routing.module';
import { TopChefHomeModule } from './home/home.module';
import { TopChefEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { JhiMainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    TopChefSharedModule,
    TopChefCoreModule,
    TopChefHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    TopChefEntityModule,
    TopChefAppRoutingModule
  ],
  declarations: [JhiMainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [JhiMainComponent]
})
export class TopChefAppModule {}
