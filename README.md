# Objetivo
Este proyecto tiene como objetivo aplicar los fundamentos de las actividades e intents en Android para crear una aplicación interactiva que permita al usuario enviar mensajes entre dos actividades. Se busca demostrar el manejo de actividades, la transmisión de datos mediante intents y la integración de componentes de la interfaz de usuario.

# Presentación
El desarrollo se basa en el laboratorio "Lab Send Messages", el cual explica la creación de una aplicación básica en Android Studio llamada "My Messenger". Esta aplicación permite a los usuarios escribir un mensaje en una actividad y enviarlo a una segunda actividad utilizando un intent.

# Desarrollo
## Aspectos Clave Trabajados

### Diseño de la Interfaz de Usuario:
- Creación de `activity_create_message.xml` para permitir la entrada de texto del usuario.
- Creación de `activity_receive_message.xml` para mostrar el mensaje recibido.
- Implementación de un `EditText` para la entrada del mensaje y un `Button` para enviarlo.
- Uso de `TextView` en la segunda actividad para mostrar el mensaje enviado.

### Manejo de Recursos:
- Creación de `strings.xml` para almacenar los textos utilizados en la interfaz de usuario.
- Uso de recursos de cadena para definir etiquetas de botones y títulos de actividades.
- Referenciación de recursos en el layout mediante `@string`.

### Lógica de Negocio:
- Creación de la clase `CreateMessageActivity` para capturar el mensaje ingresado y enviarlo mediante un intent.
- Creación de la clase `ReceiveMessageActivity` para recibir el intent y mostrar el mensaje en la pantalla.
- Uso de `putExtra()` en el intent para enviar el mensaje desde `CreateMessageActivity`.
- Uso de `getIntent().getStringExtra()` en `ReceiveMessageActivity` para recuperar y mostrar el mensaje recibido.

### Conexión entre la Interfaz y la Lógica:
- En `CreateMessageActivity`, se implementó el método `onClickSendMessage(View view)` para manejar el evento de clic del botón.
- Se utilizó `Intent` para iniciar la segunda actividad y enviar el mensaje ingresado por el usuario.
- Se actualizó dinámicamente el `TextView` en `ReceiveMessageActivity` con el mensaje recibido.

## Ejemplo de Funcionamiento
1. El usuario ingresa un mensaje en `CreateMessageActivity`.
2. Al presionar el botón "Send Message", la aplicación inicia `ReceiveMessageActivity` y muestra el mensaje en pantalla.

## Imágenes de Funcionamiento
![image](https://github.com/user-attachments/assets/bf6dab93-5d15-4ef6-990d-31ee2531be5f)
![image](https://github.com/user-attachments/assets/00b18b1d-93b8-4348-b829-029ac3abae03)



# Conclusión
Este proyecto demostró la aplicación de conceptos fundamentales de Android, incluyendo la creación de actividades, el manejo de intents para la comunicación entre actividades y el diseño de interfaces de usuario. La implementación de `putExtra()` y `getStringExtra()` permitió comprender cómo se pueden transferir datos entre componentes de una aplicación Android.

# Referencias
- Head First Android Development de Dawn Griffiths y David Griffiths, O’Reilly Media, Inc.
- Presentación de apoyo: "Building Interactive Apps".

