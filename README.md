kotlin-webapp-archetype
=======================

[![Kotlin](https://img.shields.io/badge/kotlin-1.0.0-blue.svg)](http://kotlinlang.org)

A minimalistic webapp archetype with kotlin.

Usage
=====

To kickstart your [kotlin](http://kotlinlang.org/) project with [maven](http://maven.apache.org/), simply copy paste this into the command line:

```
mvn archetype:generate \
    -DarchetypeArtifactId=kotlin-webapp-archetype \
    -DarchetypeGroupId=com.github.K0zka \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=com.foo.bar \
    -DartifactId=kickass-app \
    -DinteractiveMode=false
```

After the your project was created, you can run it using
```
mvn jetty:run
```

The generated project will also have unit and integration tests built in, which you can use with
```
mvn verify
```

More
====

* [kotlin-simple-archetype](https://github.com/K0zka/kotlin-simple-archetype/) for standalone applications and libraries

Enjoy kotlin!
