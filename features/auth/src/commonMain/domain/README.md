# Capa de Dominio (Domain)

**Responsabilidad:** Contiene la lógica de negocio pura y las reglas del dominio de la feature `auth`.

**Contenido típico:**
- **Casos de Uso (Use Cases/Interactors):** Orquestan el flujo de datos entre la capa de presentación y la de datos. Ejemplo: `LoginUseCase`.
- **Interfaces de Repositorio:** Definen los contratos que la capa de datos debe implementar. Ejemplo: `AuthRepository`.
- **Modelos de Dominio:** Representan los objetos de negocio. Ejemplo: `User`.

Esta capa no debe tener ninguna dependencia con Android, iOS, o la capa de presentación.
