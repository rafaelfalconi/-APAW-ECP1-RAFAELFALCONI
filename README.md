# Ejercicio Patrones de diseño
### Rafael Falconí
#### Asignatura: *Ingeniería Web: Visión General*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

[![Build Status](https://travis-ci.org/rafaelfalconi/APAW-ECP1-RAFAELFALCONI.svg?branch=develop)](https://travis-ci.org/rafaelfalconi/APAW-ECP1-RAFAELFALCONI)

[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=es.upm.miw:APAW-ECP1-RAFAELFALCONI)](https://sonarcloud.io/dashboard?id=es.upm.miw:APAW-ECP1-RAFAELFALCONI)

## Patrón Strategy

![strategy](https://lh5.googleusercontent.com/v-NVcoj0AatjiqadYCm92fQ1SXkwLHpxWPdI3qgf5d4sm1Gi-F3kyxVnkfpPoJz4ZZOGMkWic_3GUMaSN7GZ4DYWVn56Hbcldah4fLf8fJx69oY_jw)

El patrón strategy permite la implementación de distintos comportamientos específicos en clases hijas con una clase padre común. Así, en tiempo de ejecución y en función de algún parámetro como el tipo de instancia, se ejecutará la estrategia concreta para esa situación.
Este patrón se utilizará cuando un programa ofrezcas diferentes comportamientos para un misma función.
Los elementos que utiliza :
* Strategy: Una interfaz padre que tiene los  algoritmos soportados.
* StrategyConcreto: implementa un algoritmo heredada de la interfaz Strategy.
* Context: Hace  referencia a Strategy y según las características del cliente opta por una estrategia en concreto
