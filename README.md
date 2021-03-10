# Scalajs Basic Tutorial

## run main
```shell
$ sbt run
[info] Running tutorial.webapp.TutorialApp. Hit any key to interrupt.
[success] Total time: 2 s, completed 2021/03/07 19:21:26
```

## Generate Javascript
```shell
$ sbt fastLinkJS
[success] Total time: 0 s, completed 2021/03/11 0:22:58
```
Build to `target/scala-2.13/scala-js-tutorial-fastopt/main.js`

## Auto rebuild Javascript
```shell
$ sbt
sbt:Scala.js Tutorial> ~fastLinkJS
[success] (...)
[info] 1. Monitoring source files for scalajs_tutorial/fastLinkJS...
[info]    Press <enter> to interrupt or '?' for more options.
```

## Production Build
```shell
$ sbt fullLinkJS
```
Build to `./target/scala-2.13/scala-js-tutorial-opt/main.js`
