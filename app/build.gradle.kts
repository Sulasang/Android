
plugins {
    id("lsakee.plugin.application")
    id("lsakee.plugin.hilt")
}

android {

    namespace = "com.lsakee.sulasang"

    defaultConfig {
        applicationId = "com.lsakee.sulasang"
        minSdk = 26
        targetSdk = 33
        versionCode =1
        versionName = "1.0"
        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }


    viewBinding.enable = true
    dataBinding.enable = true
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.splashscreen)
    implementation(libs.bundles.androidx.navigation)

    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)
    implementation(libs.bundles.coroutine)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.timber)

    testImplementation(libs.junit4)
    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
}