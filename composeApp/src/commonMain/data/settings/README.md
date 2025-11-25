# Carpeta Settings

**Objetivo:** Contiene las implementaciones de los repositorios de configuración. Estas clases se encargan de guardar y recuperar datos de configuración del dispositivo, como las preferencias del usuario.

**Ejemplo:**
```kotlin
class SettingsRepository(private val dataStore: DataStore<Preferences>) {
    suspend fun saveTheme(theme: Theme) {
        dataStore.edit {
            it[THEME_KEY] = theme.name
        }
    }
}
```
