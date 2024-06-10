@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.emertozd.compose.catalog"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.emertozd.compose.catalog"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
//    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.datastore.core)
    implementation(libs.androidx.material3.android)
    implementation("androidx.compose.material3.adaptive:adaptive:1.0.0-beta02")
    implementation ("androidx.compose.material3.adaptive:adaptive-layout:1.0.0-beta02")
    implementation( "androidx.compose.material3.adaptive:adaptive-navigation:1.0.0-beta02")
//    implementation(libs.androidx.material3.adaptive.android)
    implementation("androidx.compose.material3:material3-adaptive-navigation-suite:1.3.0-beta02")
    implementation(libs.androidx.material3.window.size)
//    implementation(libs.androidx.adaptive.android)
//    implementation(libs.androidx.adaptive.navigation.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
    implementation ("androidx.compose.material3:material3:1.3.0-beta02")
    implementation ("androidx.compose.material:material-icons-extended-android:1.7.0-beta02")
    implementation ("androidx.compose.material:material:1.7.0-beta02")

    implementation("androidx.compose.animation:animation:1.7.0-beta02")
    implementation("androidx.compose.animation:animation-core:1.7.0-beta02")
    implementation("androidx.compose.animation:animation-graphics:1.7.0-beta02")
    implementation("androidx.compose.foundation:foundation:1.7.0-beta02")
    implementation("androidx.compose.foundation:foundation-layout:1.7.0-beta02")
    implementation("androidx.compose.material:material:1.7.0-beta02")
    implementation("androidx.compose.material:material-icons-core:1.7.0-beta02")
    implementation("androidx.compose.material:material-icons-extended:1.7.0-beta02")
    implementation("androidx.compose.material:material-ripple:1.7.0-beta02")
    implementation("androidx.compose.material3:material3:1.3.0-beta02")
    implementation("androidx.compose.material3:material3-window-size-class:1.3.0-beta02")
    implementation("androidx.compose.runtime:runtime:1.7.0-beta02")
    implementation("androidx.compose.runtime:runtime-livedata:1.7.0-beta02")
    implementation("androidx.compose.runtime:runtime-rxjava2:1.7.0-beta02")
    implementation("androidx.compose.runtime:runtime-rxjava3:1.7.0-beta02")
    implementation("androidx.compose.runtime:runtime-saveable:1.7.0-beta02")
    implementation("androidx.compose.ui:ui:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-geometry:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-graphics:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-test:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-test-junit4:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-test-manifest:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-text:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-text-google-fonts:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-tooling:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-tooling-data:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-tooling-preview:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-unit:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-util:1.7.0-beta02")
    implementation("androidx.compose.ui:ui-viewbinding:1.7.0-beta02")
}