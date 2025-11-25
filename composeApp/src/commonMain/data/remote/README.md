# Carpeta Remote

**Objetivo:** Contiene las implementaciones de los repositorios remotos. Estas clases se encargan de obtener datos de fuentes externas, como una API REST.

**Ejemplo:**
```kotlin
class RemoteUserRepository(private val api: MyApi) : UserRepository {
    override suspend fun getUser(id: String): User {
        return api.fetchUser(id).toDomainModel()
    }
}
```
