
plugins {
    id("lsakee.plugin.android-library")
    id("lsakee.plugin.hilt")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.lsakee.local"
}

dependencies {
    implementation(project(":domain"))

    implementation(libs.bundles.coroutine)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.androidx.dataStore.core)
    implementation(libs.androidx.dataStore.preferences)

    ksp(libs.encrypted.datastore.preference.ksp)
    implementation(libs.encrypted.datastore.preference.ksp.annotations)
    implementation(libs.encrypted.datastore.preference.security)

    ksp(libs.room.compiler)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)

    implementation(libs.timber)
}