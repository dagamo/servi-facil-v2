# Capa de Datos (Data)

**Responsabilidad:** Implementa las interfaces de repositorio definidas en la capa de dominio. Se encarga de obtener los datos de una o más fuentes (remota, local, etc.).

**Contenido típico:**
- **Implementaciones de Repositorio:** Clases concretas que implementan las interfaces del dominio. Ejemplo: `AuthRepositoryImpl`.
- **Fuentes de Datos (Data Sources):** Clases responsables de interactuar con las APIs de red (usando el módulo `:core:network`), bases de datos locales o cualquier otra fuente de datos.
- **Modelos de Datos (DTOs):** Modelos que representan la estructura de los datos tal como se reciben de las fuentes (ej. JSON de una API). Estos se mapean a modelos de dominio antes de pasar a la capa superior.

Aquí se usan las implementaciones `expect/actual` para acceder a APIs específicas de la plataforma si es necesario.
