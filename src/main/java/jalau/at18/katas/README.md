# Katas folder
Welcome to katas folder for AT18!

Under this folder, you can add your own folders for practicing katas presented in class or versioned under this same folder, homework and any other that you wish.

## Folder structure
- Under the folder with the kata name, a subfolder with your name and add your solution code files under that folder
```
katas/<kata name>/<your name>/Main.java
katas/<kata name>/<your name>/foo/Example.java
```

## Run katas
To run the katas, use gradle wrapper included in the project. For using the gradle wrapper, add a gradle task in [build.gradle](../../../../../../build.gradle) file with the name to run your kata (replace "runMyKataExample" with an unique name for your kata)
```
task runMyKataExample (dependsOn: 'classes', type: JavaExec) {
    main = '<Main class to run for kata>' // Example: 'jalau.at18.katas.highestlowest.Main'
    classpath = sourceSets.main.runtimeClasspath
}
```

After adding the gradle task, move to project root folder (AT18) and run it using gradle wrapper
Windows
```
gradlew.bat -q runMyKataExample
```

Unix/Linux/Git Bash
```
./gradlew -q runMyKataExample
```