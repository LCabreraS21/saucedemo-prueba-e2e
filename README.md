# Guía de Ejecución: Automatización de Flujo de Compra en Sauce Demo con Serenity BDD

Este proyecto contiene un conjunto de pruebas de automatización para validar el flujo de compra en el sitio web de Sauce Demo (https://www.saucedemo.com).

## Prerrequisitos
- Java Development Kit (JDK) 11 o superior.
- Apache Maven (versión 3.6.0 o superior).
- Un editor de código (por ejemplo, Visual Studio Code o Eclipse).
- Acceso a Internet para descargar las dependencias de Maven.

## Estructura del Proyecto
- `src/test/java/`: Contiene el código fuente de los PageObjects y los Step Definitions.
- `src/test/resources/`: Contiene el archivo Gherkin (`.feature`) con la descripción de las pruebas.

## Ejecución del Proyecto
Para ejecutar las pruebas, abre una terminal en la raíz del proyecto y utiliza el siguiente comando de Maven:

`mvn clean verify`

Este comando realizará las siguientes acciones:
1.  `clean`: Eliminará los artefactos de compilación anteriores.
2.  `verify`: Ejecutará las pruebas, generará los archivos `jar` y compilará los reportes de Serenity.

## Visualización de Reportes
Una vez finalizada la ejecución, el reporte de Serenity BDD se generará automáticamente. Puedes acceder a él abriendo el siguiente archivo en tu navegador web:

`target/site/serenity/index.html`

## Solución de Problemas
Si encuentras errores de compilación como "cannot be resolved to a type", asegúrate de que tu IDE (Eclipse o similar) esté sincronizado con las dependencias de Maven. Puedes forzar la actualización con un clic derecho en el proyecto -> Maven -> Update Project...