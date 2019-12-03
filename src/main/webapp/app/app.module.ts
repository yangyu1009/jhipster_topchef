import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule } from '@angular/common/http'; // Step 2

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
import { AllRecipeComponent } from './all-recipe/all-recipe.component';
import { CreateRecipeComponent } from './create-recipe/create-recipe.component';
import { ItemComponent } from './item/item.component';
import { RegisterComponent } from './register/register.component';
import { SearchComponent } from './search/search.component';
import { UserPageComponent } from './user-page/user-page.component';

@NgModule({
  imports: [
    BrowserModule,
    TopChefSharedModule,
    TopChefCoreModule,
    TopChefHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    TopChefEntityModule,
    TopChefAppRoutingModule,
    NgbModule,
    NgbCarouselModule,
    HttpClientModule
  ],
  declarations: [
    JhiMainComponent,
    NavbarComponent,
    ErrorComponent,
    PageRibbonComponent,
    FooterComponent,
    AllRecipeComponent,
    CreateRecipeComponent,
    ItemComponent,
    RegisterComponent,
    SearchComponent,
    UserPageComponent
  ],
  bootstrap: [JhiMainComponent]
})
export class TopChefAppModule {}
