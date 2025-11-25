# Carpeta Usecase

**Objetivo:** Contiene los casos de uso de la aplicación. Estos casos de uso orquestan el flujo de datos entre la capa de presentación y la capa de datos.

**Ejemplo:**
```kotlin
class GetUserUseCase(private val userRepository: UserRepository) {
    suspend operator fun invoke(id: String): User {
        return userRepository.getUser(id)
    }
}
```
