# Getting Started from scratch

1. Create Aviator app: `aviator new np play-scala`
2. Create Github.com repository: np
3. Initialize git:
  1. `git init`
  2. `git add .`
  3. `git commit -m 'initial commit'`
  4. `git remote add origin git@github.com:murithn/np.git`
  5. `git push -u origin master`
4. test app locally:
  1. `activator run`
  2. [localhost:9000](http://localhost:9000/)
5. if needed, install [heroku toolbelt](https://toolbelt.heroku.com)
6. create heroku app: `heroku create` [Result](http://immense-basin-4404.herokuapp.com/)
7. deploy to heroku: `git push heroku master`
8. test heroku app: `heroku ps`
9. Add CNAME [np.n8mur.yxz](np.n8mur.yxz) to point to [http://immense-basin-4404.herokuapp.com/](http://immense-basin-4404.herokuapp.com/)
10. download twitter [bootstrap](http://getbootstrap.com) and add css/js/images to public foder
11. import libraries and scripts in `index.scala.html` and `main.scala.html`
12. Configure routes
1x. Add assets
13. Add DB dependcies to `build.sbt` and `application.conf`
14. Add `Procfile` for Heroku DB deploy
15. Add FullScreen JS: `public/javascript/fullscreen.js`
16. Add tests and run tests
17. Go Crazy!!!
