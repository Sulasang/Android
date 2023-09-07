
plugins {
    id("lsakee.plugin.feature")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    namespace = "com.lsakee.feature_home"
    dataBinding.enable = true
}

dependencies {
    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.junit4)
    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
}