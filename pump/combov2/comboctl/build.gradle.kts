plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "info.nightscout.comboctl"
    sourceSets.getByName("main") {
        kotlin.srcDir("src/commonMain/kotlin")
        kotlin.srcDir("src/androidMain/kotlin")
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
    }
    sourceSets.getByName("test") {
        kotlin.srcDir("src/jvmTest/kotlin")
    }
}

dependencies {

    api(platform(libs.kotlinx.coroutines.bom))
    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.datetime)
    api(Libs.AndroidX.core)

    testImplementation(kotlin("test"))
    testImplementation(Libs.kotlinTestRunner)
    testRuntimeOnly(Libs.JUnit.jupiterEngine)
}