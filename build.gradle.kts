plugins {
    id("java")
    kotlin("jvm") version "1.9.22"
    kotlin("kapt") version "1.9.22"
}

group = "com.uber"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    kapt("com.uber.motif:motif-compiler:0.3.8")
    implementation("com.uber.motif:motif:0.3.8")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}