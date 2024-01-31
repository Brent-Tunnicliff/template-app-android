pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "REPLACE_ME"
include(":app")

// Example of referencing git repo as dependency.
// sourceControl {
//     gitRepository(uri("https://github.com/gradle/native-samples-cpp-library.git")) {
//         producesModule("org.gradle.cpp-samples:utilities")
//     }
// }