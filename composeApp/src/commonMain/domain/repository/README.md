# Carpeta Repository

**Objetivo:** Contiene las interfaces de los repositorios. Estas interfaces definen los contratos para acceder a los datos, ya sea de forma remota o local.

**Ejemplo:**
```kotlin
interface UserRepository {
    suspend fun getUser(id: String): User
}
```
