

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.jriesgo.nicestart"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jriesgo.nicestart"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}

dependencies {
    implementation(libs.swiperefreshlayout)
    implementation ("com.github.bumptech.glide:glide:4.15.1") // Última versión de Glide
    annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1") // Procesador de anotaciones para Java
}
dependencies {
    implementation ("com.airbnb.android:lottie:5.0.3")  // Verifica la última versión disponible
}