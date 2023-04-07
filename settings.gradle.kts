@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "kontour"

sequenceOf(
    "domain",
).forEach {
    val project = ":kontour-$it"
    include(project)
    project(project).projectDir = file(it.replace('-', '/'))
}
