# NiceStartsPractica

Este proyecto incluye varias actividades principales:

- **Splash**: Pantalla de introducción con animación de transición.
- **MainLogin**: Permite el inicio de sesión y la opción de registro.
- **SignUp**: Contiene un formulario de registro y devuelve al usuario a MainLogin o MainVista.
- **MainVista**: Pantalla principal con un **Toolbar** que incluye íconos accionables, opciones de navegación y funcionalidades dinámicas.
- **MainButtonBar**: Barra de navegación con pestañas para acceder a diferentes secciones.
- **Profile**: Perfil personal con imagen circular cargada mediante **Glide**.
- **FragmentInicio**: Sección principal con contenido dinámico.
- **FragmentFavoritos**: Sección donde se muestran los elementos favoritos del usuario.
- **FragmentSettings**: Pantalla de configuración para personalizar la experiencia del usuario.
- **MainActivityToolBar**: Alternativa a MainVista con un **Toolbar** que usa animaciones de **Lottie**.
- **MainBab**: Variante de la pantalla principal con una implementación diferente de la barra de herramientas.

---

## **Splash**

El **Splash** muestra una animación de transición al iniciar la aplicación.  
Esta animación, creada en XML, despliega un movimiento suave que presenta el logotipo de la aplicación.

### **Características**
- **Tipo de animación:** Translación desde el centro de la pantalla a la derecha.
- **Duración:** 2 segundos.
- **Diseño:** Minimalista, para captar la atención del usuario.
![splash.gif](gif%2Fsplash.gif)
---

## **MainLogin**

El **MainLogin** permite al usuario iniciar sesión con un diseño moderno y funcional.

### **Diseño**
- **Fondo:** Gradiente con una imagen superpuesta que combina estética y funcionalidad.
- **Campos de texto:**
    - Incluyen íconos representativos dentro de cada campo.
    - El campo de contraseña tiene la opción **passwordToggleEnabled** para mostrar u ocultar la contraseña.
- **Botones:**
    - "Login" redirige al usuario al **MainVista**.
    - "Sign Up" redirige a **SignUp**.
![login.png](img%2Flogin.png)
---

## **SignUp**

El **SignUp** utiliza un diseño similar al de **MainLogin**, con ajustes para optimizar el registro del usuario.

### **Características**
- **Fondo:** Imagen con un atributo **alpha**, que reduce la opacidad y permite destacar los campos del formulario.
- **Campos adicionales:** Se incluye un campo para el correo electrónico, además de los tradicionales.
- **Botones:**
    - "Registrar" para completar el registro.
    - "Cancelar" para volver a **MainLogin**.
![singUp.png](img%2FsingUp.png)
---

## **MainVista**

El **MainVista** es la pantalla principal de la aplicación, diseñada para ofrecer una experiencia dinámica e interactiva.

### **Características del Toolbar**
1. **Nombre de la aplicación:** En la parte izquierda del toolbar.
2. **Íconos de acción:**
    - **Icono de mensaje:** Muestra un **SnackBar** con el texto "Mensaje enviado". Al pulsar "Undo", cancela la acción.
    - **Menú desplegable:** Incluye opciones como:
        - **Perfil.**
        - **Registro (SignUp).**
        - **Login (MainLogin).**
        - **Logout:** Muestra un **AlertDialog** para confirmar la acción.

### **Contenido principal**
- **WebView:** Carga imágenes desde Internet.
- **SwipeRefreshLayout:** Permite al usuario actualizar el contenido del WebView deslizando hacia abajo.
- [navegacion.mp4](gif%2Fnavegacion.mp4)
---

## **MainButtonBar**

El **MainButtonBar** es la barra de navegación de la aplicación para acceder a diferentes secciones mediante pestañas.

### **Opciones de navegación:**
- Inicio (**FragmentInicio**)
- Favoritos (**FragmentFavoritos**)
- Configuración (**FragmentSettings**)
![bottonBar.png](img%2FbottonBar.png)
---

## **FragmentInicio**

El **FragmentInicio** es la pantalla principal dentro de la navegación con pestañas.

### **Características**
- Muestra información destacada para el usuario.
- Acceso rápido a funcionalidades clave de la app.

---

## **FragmentFavoritos**

El **FragmentFavoritos** permite a los usuarios guardar y ver elementos marcados como favoritos.

### **Características**
- Lista de elementos guardados.
- Diseño optimizado para facilitar la visualización.

---

## **FragmentSettings**

El **FragmentSettings** permite modificar ajustes de la aplicación.

### **Características**
- Opciones para personalizar la experiencia del usuario.
- Configuración de notificaciones y preferencias.
[opcionesNAv.mp4](gif%2FopcionesNAv.mp4)
---

## **MainActivityToolBar**

El **MainActivityToolBar** es una variante de la pantalla principal con un diseño diferente.

### **Características**
- **Animaciones de Lottie** en la barra de herramientas.
- **Menú contextual** con accesos rápidos.
- **SnackBar** y **AlertDialog** para interacción con el usuario.
[toolBar.mp4](gif%2FtoolBar.mp4)
---

### **Mensaje de Alerta**
- **Al querer hacer un logout, nos pide mensaje de confirmacion a traves de una alerta**
![LogOut1.png](img%2FLogOut1.png)
- ![LogOut2.png](img%2FLogOut2.png)
-  **Tambien manda un mensaje cuando se ha enviado un correo**
- ![mensaje.png](img%2Fmensaje.png)
## **MainBab**

El **MainBab** es otra alternativa de la pantalla principal con un diseño y estructura distintos.

### **Características**
- Implementación única del diseño de navegación.
- Experiencia de usuario mejorada con transiciones suaves.
[mainBab.mp4](gif%2FmainBab.mp4)
---

## **Profile**

El **Profile** cuenta con una imagen de forma circular y cargada desde un **Glide**. Además, tiene el texto justificado.
![profile.png](img%2Fprofile.png)
---

## **Navegación entre actividades**
- **Splash** → MainLogin.
- **MainLogin:**
    - Si el inicio de sesión es exitoso → MainVista.
    - Opción de registro → SignUp.
- **SignUp:**
    - Si el registro es exitoso → MainVista.
    - Opción de cancelar → MainLogin.
- **MainVista:**
    - Opción de cerrar sesión → MainLogin.
- **MainButtonBar**: Permite cambiar entre **FragmentInicio, FragmentFavoritos y FragmentSettings**.
[navegacion.mp4](gif%2Fnavegacion.mp4)
---

## **Vista general de funcionalidades**
| Actividad             | Características principales                                        |
|----------------------|------------------------------------------------------------------|
| **Splash**          | Animación de transición con diseño atractivo.                    |
| **MainLogin**       | Fondo dinámico, campos personalizados y funcionalidad de login.  |
| **SignUp**          | Diseño similar al login con campos adicionales y opciones de acción. |
| **MainVista**       | Toolbar dinámico, SnackBar, menú desplegable y WebView interactivo. |
| **MainButtonBar**   | Barra de navegación con pestañas para acceder a distintas secciones. |
| **FragmentInicio**  | Sección principal con contenido dinámico.                         |
| **FragmentFavoritos** | Pantalla donde se guardan los elementos favoritos del usuario.  |
| **FragmentSettings** | Configuración de la aplicación y preferencias de usuario.       |
| **MainActivityToolBar** | Alternativa con **Toolbar** personalizado y animaciones.      |
| **MainBab**         | Otra variante de la pantalla principal con distinto diseño.      |
| **Profile**         | Perfil con imagen circular cargada con Glide.                     |

---

Este `README.md` está actualizado con todas las actividades y nuevas funcionalidades de la aplicación. Si necesitas algún ajuste adicional, dime y lo modifico. 🚀 &#8203;:contentReference[oaicite:0]{index=0}&#8203;
