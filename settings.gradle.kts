pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
//        mavenCentral()
//        gradlePluginPortal()
        maven {
            url = uri("http://192.168.8.73:8081/repository/google/")
            isAllowInsecureProtocol = true
        }
        maven {
            url  = uri("http://192.168.8.73:8081/repository/maven-central/")
            isAllowInsecureProtocol = true
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
//        google()
//        mavenCentral()
        maven {
            url = uri("http://192.168.8.73:8081/repository/google/")
            isAllowInsecureProtocol = true
        }
        maven {
            url  = uri("http://192.168.8.73:8081/repository/maven-central/")
            isAllowInsecureProtocol = true
        }
    }
}

rootProject.name = "GPSWaypoints"
include(":app")
 