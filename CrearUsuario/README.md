# Proyecto E2E Front - Crear Usuario Siigo

Este proyecto implementa pruebas automatizadas end-to-end (E2E) para la creación de usuarios en la plataforma Siigo, utilizando Serenity BDD, Java, Gradle y Screenplay Pattern.

## Tecnologías usadas

- **Java 11+**
- **Gradle**
- **Serenity BDD**
- **Cucumber**
- **Screenplay Pattern**
- **Selenium WebDriver**
- **JUnit**
- **IntelliJ IDEA** (recomendado)
- **JavaScript** (para algunos recursos de UI)

## Estructura del proyecto

- `src/main/java`: Código principal de tareas, modelos y UI.
- `src/test/java`: Definiciones de pasos y runners de Cucumber.
- `src/test/resources/features`: Archivos `.feature` de Cucumber.
- `serenity.conf` o `serenity.properties`: Configuración de Serenity.

## Configuración previa

### Variables necesarias antes de ejecutar

Antes de ejecutar las pruebas, debes crear las siguientes variables -DuserTest=retoautomationsiigo2@yopmail.com
-DpasswordTest=J1h4{zMTV3 en las VM options del runner (por ejemplo, en IntelliJ IDEA)