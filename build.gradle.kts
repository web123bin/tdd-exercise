plugins {
    id("java")
    id("org.springframework.boot") version "2.7.14"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.bin"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.baomidou:mybatis-plus-boot-starter:3.5.3.1")
    implementation("com.baomidou:mybatis-plus-generator:3.5.3.1")
    implementation("org.freemarker:freemarker:2.3.31")
    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
    implementation("com.h2database:h2:2.1.214")
    runtimeOnly("mysql:mysql-connector-java:8.0.33")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.baomidou:mybatis-plus-boot-starter-test:3.5.3.1")
    testImplementation("p6spy:p6spy:3.9.1")
    testImplementation("org.testng:testng:7.4.0")
    testImplementation("com.google.inject:guice:5.1.0")
    testImplementation("org.uncommons:reportng:1.1.4")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

