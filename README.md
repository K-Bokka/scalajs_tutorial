# Scalajs Basic Tutorial

## run main
```shell
$ sbt run
[info] Running tutorial.webapp.TutorialApp. Hit any key to interrupt.
Hello world!
[success] Total time: 2 s, completed 2021/03/07 19:21:26
```

## Generate Javascript
```shell
$ sbt fastLinkJS
$ node target/scala-2.13/scala-js-tutorial-fastopt/main.js
Hello world!
```

## Auto rebuild Javascript
```shell
$ sbt
sbt:Scala.js Tutorial> ~fastLinkJS
[success] (...)
[info] 1. Monitoring source files for scalajs_tutorial/fastLinkJS...
[info]    Press <enter> to interrupt or '?' for more options.
```
