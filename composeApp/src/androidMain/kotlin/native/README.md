# Carpeta Native

**Objetivo:** Contiene código nativo específico de la plataforma Android. Esto puede incluir código C/C++ o código Kotlin que interactúa con las API de Android a través de JNI.

**Ejemplo:**
```kotlin
// Archivo: Platform.kt
actual class Platform {
    actual val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}
```
