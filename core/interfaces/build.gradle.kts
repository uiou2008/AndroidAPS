plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlinx-serialization")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {

    namespace = "app.aaps.core.interfaces"
    defaultConfig {
        minSdk = Versions.wearMinSdk  // for wear
    }
}

dependencies {
    implementation(project(":core:data"))


    api(Libs.AndroidX.appCompat)
    api(Libs.AndroidX.preference)

    api(platform(libs.kotlinx.serialization.bom))
    api(libs.kotlinx.serialization.json)
    api(libs.kotlinx.serialization.protobuf)

    api(Libs.Apache.commonsLang3)
    api(Libs.jodaTimeAndroid)

    //RxBus
    api(libs.io.reactivex.rxjava3.rxkotlin)
    testImplementation(libs.io.reactivex.rxjava3.rxandroid)
}