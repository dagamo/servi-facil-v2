# Carpeta Presentation

**Objetivo:** Contiene la lógica de la interfaz de usuario (UI). En una aplicación Compose, esto incluiría los Composables.

**Ejemplo:**
```kotlin
@Composable
fun UserProfile(user: User) {
    Column {
        Text(text = user.name)
        Text(text = user.email)
    }
}
```
