import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { errorRoute } from './layouts/error/error.route';
import { navbarRoute } from './layouts/navbar/navbar.route';
import { DEBUG_INFO_ENABLED } from 'app/app.constants';

import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { CreateRecipeComponent } from 'app/create-recipe/create-recipe.component';
import { UserPageComponent } from 'app/user-page/user-page.component';
import { RegisterComponent } from 'app/register/register.component';
import { SearchComponent } from 'app/search/search.component';

const LAYOUT_ROUTES = [navbarRoute, ...errorRoute];

@NgModule({
  imports: [
    RouterModule.forRoot(
      [
        {
          path: 'admin',
          data: {
            authorities: ['ROLE_ADMIN']
          },
          canActivate: [UserRouteAccessService],
          loadChildren: () => import('./admin/admin-routing.module').then(m => m.AdminRoutingModule)
        },
        {
          path: 'account',
          loadChildren: () => import('./account/account.module').then(m => m.TopChefAccountModule)
        },
        {
          path: 'create',
          component: CreateRecipeComponent
        },
        {
          path: 'user',
          component: UserPageComponent
        },
        {
          path: 'register',
          component: RegisterComponent
        },
        {
          path: 'search/:id',
          component: SearchComponent
        },

        ...LAYOUT_ROUTES
      ],
      { enableTracing: DEBUG_INFO_ENABLED }
    )
  ],
  exports: [RouterModule]
})
export class TopChefAppRoutingModule {}
