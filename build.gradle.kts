plugins {
    id("java")
}

group = "jay.frc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.google.code.gson:gson:2.8.6")
    implementation("com.google.code.gson:gson:2.8.6")
}

tasks.test {
    useJUnitPlatform()
}