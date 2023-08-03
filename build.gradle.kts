plugins {
    id("java")
    id("application")
}

group = "com.github.teren4m"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    this.mainClass = "com.github.teren4m.Main"
}

dependencies {
    implementation(files("tvm/jvm/assembly/linux-x86_64/target/tvm4j-full-linux-x86_64-0.0.1-SNAPSHOT.jar"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}