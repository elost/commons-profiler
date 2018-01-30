import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    kotlin("jvm")
    java
}


dependencies {

    /**
     * Runtime
     */
    compile(Libs.slf4j_api)



    /**
     * Tests
     */
    testCompile(Libs.kotlin_stdlib)
    testCompile(Libs.kotlin_jre8)

    testCompile(Libs.junit)
    testCompile(Libs.mockito)
    testCompile(Libs.slf4j_simple)
    testCompile(Libs.guava)
    testCompile(Libs.kotlin_logging)
}

repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}