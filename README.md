# 🚀 **Práctica 10B - Validación de Contraseña en Android**

## 📝 **Descripción**

Esta práctica consiste en la creación de una aplicación Android que maneja dos pantallas. La primera pantalla solicita al usuario que ingrese una contraseña. Si la contraseña es correcta, el usuario es redirigido a una segunda pantalla con un mensaje de bienvenida. Si la contraseña es incorrecta, se muestra un mensaje de error.

## ⚙️ **Tecnologías usadas**

- **Android SDK 34**
- **Java (MainActivity y Validacion)**
- **EditText** para la entrada de texto (contraseña)
- **Toast** para mostrar mensajes de error
- **Intent** para navegación entre actividades
- **ConstraintLayout** para diseño flexible
- **Edge-to-Edge API** para diseño inmersivo

## 📐 **Diseño UI**

El layout de ambas actividades utiliza **ConstraintLayout** para organizar los elementos visuales.

### `activity_main.xml`

Contiene un campo de texto para ingresar la contraseña y un botón para validar la contraseña:

- **EditText**: Un campo de texto donde el usuario ingresa la contraseña.
- **Button**: Un botón que valida la contraseña cuando se presiona.
  
  La validación es realizada con una contraseña fija (`abc123`). Si la contraseña es correcta, se abre la segunda pantalla. Si es incorrecta, se muestra un mensaje de error con un `Toast`.

### `activity_validacion.xml`

Contiene una imagen que se muestra como mensaje de bienvenida cuando la contraseña es válida:

- **ImageView**: Muestra una imagen de bienvenida cuando la contraseña es correcta.

## 🚀 **Ejecución**

1. Abrir el proyecto en **Android Studio** con el SDK 34 configurado.
2. Ejecutar en un **dispositivo/emulador con Android 11 (API 30)** o superior.
3. En la pantalla de inicio, ingresa la contraseña `abc123` en el campo de texto y presiona el botón "Validar".
   - Si la contraseña es correcta, serás redirigido a la segunda pantalla, donde verás el mensaje de bienvenida.
   - Si la contraseña es incorrecta, aparecerá un mensaje de error utilizando un `Toast`.

## 📌 **Versionado**

Este proyecto utiliza **Git** y **GitHub** para el control de versiones, lo que permite mantener un registro detallado de los cambios realizados durante el desarrollo.

## 📄 **Licencia**

Este proyecto está bajo la [MIT License](./LICENSE).

## 🎁 **Expresiones de Gratitud**

Podéis invitarme a una cerveza 🍺 o un café ☕.  
Gracias por la lectura 🤓.
