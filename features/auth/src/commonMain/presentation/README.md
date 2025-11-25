# Capa de Presentación (Presentation)

**Responsabilidad:** Contiene la UI y la lógica de presentación (ViewModels) para la feature `auth`.

**Contenido típico:**
- **Componentes de UI (Composables):** Pantallas, botones, y otros elementos de UI construidos con Compose Multiplatform. Ejemplo: `LoginScreen()`.
- **ViewModels:** Clases que gestionan el estado de la UI y exponen los datos de la capa de dominio a los Composables, generalmente a través de `StateFlow`.
- **Modelos de UI:** Clases que representan el estado de la pantalla para que la UI los pueda consumir de forma sencilla.

Esta capa depende de la capa de dominio para obtener los datos y ejecutar la lógica de negocio.
