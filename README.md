# Taller 3: Lambdas y patrón Strategy

*Asignatura:* Programación 3 (Orientada a Objetos Avanzada)\
*Paralelo:* B\
*Grupo:* 9\
*Docente:* Ing. Hamilton Francisco Villamar Barros, MSc.\
*Período:* 2026-2027 CII

## Descripción del Proyecto

Este proyecto consiste en una calculadora de costos de producción agropecuaria desarrollada en Java 21. Aplica el patrón de diseño Strategy junto con interfaces funcionales, expresiones lambda, jerarquías selladas (sealed interfaces) y pattern matching para permitir que las fórmulas de cálculo (insumos, mano de obra, hectáreas, subsidios e IVA) sean intercambiables en tiempo de ejecución sin modificar la clase principal.

## Integrantes y roles

| Nombre Completo | Usuario de GitHub | Rol asignado en el Taller |
|:-----------------------|:-----------------------|:-----------------------|
| Sánchez Bryan | brsan3 | Coordinador |
| Vera John | joncarl196-cpu | Desarrollador Principal |
| Muñoz María | maprisms-svg | Revisor de Calidad |
| Ramos Karla | karlaisabelramospimentel-bot | Coordinador (Apoyo en repositorio) |
| Párraga Aaron | aaronparraga25-tech | Desarrollador Principal (Apoyo en código) |
| Solórzano Gerardo | mirandasol28-creator | Revisor de Calidad (Apoyo en pruebas) |

## Instrucciones para ejecutar el proyecto

### Requisitos previos

- Java JDK 21 (Temurin o OpenJDK).
- Maven instalado (o usar el Maven Wrapper integrado en IntelliJ IDEA).

### Comandos de ejecución

Para compilar el proyecto y ejecutar las pruebas unitarias (JUnit 5), abre la terminal en la raíz del proyecto y ejecuta:

\\\`bash mvn clean test