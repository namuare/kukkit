plugins {
    kotlin("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "6.1.0"
    `maven-publish`
}

group = "me.mocha.nukkitplugin"
version = "0.0.1-alpha"

repositories {
    mavenCentral()
    maven("https://repo.nukkitx.com/maven-snapshots")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation("cn.nukkit:nukkit:1.0-SNAPSHOT")
}

tasks {
    shadowJar {
        dependencies {
            exclude(dependency("cn.nukkit:nukkit:1.0-SNAPSHOT"))
        }
        archiveClassifier.set("")
    }
}

publishing {
    publications {
        create<MavenPublication>("kukkit") {
            artifact(tasks.jar)
        }
    }
}