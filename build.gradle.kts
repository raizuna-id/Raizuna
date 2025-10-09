plugins {
    kotlin("jvm") version "2.1.21"
    kotlin("plugin.serialization") version "2.1.21"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // --- Main dependencies ---
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    implementation("org.json:json:20240303")
    implementation("org.jline:jline:3.21.0")

    // --- Testing dependencies ---
    testImplementation(kotlin("test"))              // ✅ kotlin.test API (assertEquals, assertTrue, etc)
    testImplementation(kotlin("test-junit5"))       // ✅ integrasi JUnit 5
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2") // engine runtime
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform() // ✅ aktifkan JUnit 5 platform
}

application {
    mainClass.set("raizuna.MainKt")
}

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    archiveBaseName.set("Raizuna")
    archiveClassifier.set("all")
    archiveVersion.set("") // biar nama file-nya bersih tanpa versi
}

