import {Injectable} from "@angular/core";
import {Actions} from "@ngrx/effects";
import {Router} from "@angular/router";

@Injectable()
export class OrderEffects {
  //
  // @Effect()
  // create$ = this.actions$
  //   .ofType(Auth.LOGIN)
  //   .map((action: Auth.Login) => action.payload)
  //   .exhaustMap(auth =>
  //     this.authService
  //       .login(auth)
  //       .map(user => new Auth.LoginSuccess({user}))
  //       .catch(error => of(new Auth.LoginFailure(error)))
  //   );
  //
  // @Effect({dispatch: false})
  // loginSuccess$ = this.actions$
  //   .ofType(Auth.LOGIN_SUCCESS)
  //   .do(() => this.router.navigate(['/']));
  //
  // @Effect({dispatch: false})
  // loginRedirect$ = this.actions$
  //   .ofType(Auth.LOGIN_REDIRECT, Auth.LOGOUT)
  //   .do(authed => {
  //     this.router.navigate(['/login']);
  //   });

  constructor(private actions$: Actions,
              private router: Router) {
  }
}
