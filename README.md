# TrigCalculator de la implementación del parcial I - AREP

Este repositorio está implementado en **JAVA** para la materia de **AREP**,

Tiene por función construir un servicio web que permita calcular las funciones trigonométricas. esta es la fachada 


Para conocer mayor información de la implementación del sistema puede ver el documento [INFORME](AREP_TALLER02.pdf) o el [DIAGRAMA.](Diagram.asta)

## Getting Started


Principalmente para dar un vistazo del funcionamiento en despliegue puede ir a la siguiente ruta en 
[Heroku Deploy](https://damp-mesa-00919.herokuapp.com/datos?rad=0.8&func=cos) , aquí encontrará la aplicación corriendo.

se recomienda clonar el repositorio a su computadora, como opción puede realizarlo por medio del siguiente comando:

``` git clone https://github.com/IJuanchoG/AREP_PARCIAL_TRIGCAL.git```

La construcción del proyecto se ha realizado por medio de **MAVEN**, es por este motivo que puede ser necesario tener la herramienta en su dispositivo. 

Para compilar el proyecto, ejecute el siguiente comando:

```mvn compile```

posteriormente puede hacer el empaquetado:

``` mvn package```

para verificar el correcto funcionamiento de las librerias es recomendable ejecutar las pruebas presentes en estos,
se pueden ejecutar desde el IDE de preferencia o desde comandos MVN tales como 

```mvn surefire:test```

Con el fin de correr el programa ejecute la siguiente instrucción puede hacerlo de varias maneras:

###1. Por JAVA

####Windows:
```
java -cp target/classes;target/dependency/* edu.eci.arep.sparkwebapp.SparkWebApp
```

####Linux:
```
java -cp target/classes:target/dependency/* edu.eci.arep.sparkwebapp.SparkWebApp
```

de este modo la aplicación web se ejecutará en local con la siguiente [ruta.](http://localhost:4567/datos?rad=0.8&func=cos)
###2. por Heroku local
```heroku local web``` dirigiendo a la siguiente [ruta.](http://localhost:5000/datos?rad=0.8&func=cos)



### En Despliegue:

Para observar la aplicación en despliegue puede ejecutar el comando:

````heroku open```

desplegando una pestaña que redirige a la siguiente [ruta.](https://damp-mesa-00919.herokuapp.com/datos?rad=0.8&func=cos) 


 ### Prerequisitos.

Es necesario/recomendable que posea las siguientes herramientas:

- git instalado en su computador.
- Maven configurado en sus **Variables de Entorno**.
- Interprete de lenguaje de programacion **JAVA** (Eclipse, netbeans, Intellij, etc.)

si necesita instalar algunos de los servicios mencionados puede encontrarlos aquí:

- **Git** puede descargarlo [aqui.](https://git-scm.com/downloads)

- **Maven** puede descargarlo [aqui.](https://maven.apache.org/download.cgi)

- **IntelliJ** puede descargarlo [aqui.](https://www.jetbrains.com/es-es/idea/download/)

- **Heroku** puede descargarlo [aqui.](https://devcenter.heroku.com/articles/heroku-cli#download-and-install)


## Built With

* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - The develop enviroment
* [Maven](https://maven.apache.org/) - Dependency Management
* [JUnit](https://junit.org/junit5/) - Used to generate Unitary Test
* [Heroku](https://devcenter.heroku.com/) - used to deploy

## Authors

* **Juan Carlos García** - *Initial work* - [IJuanchoG](https://github.com/IJuanchoG)
