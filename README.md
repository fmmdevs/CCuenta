# CCuenta - Una aplicación para gestionar cuentas bancarias- Práctica ED05 git&gitHub.



CCuenta es una aplicación sencilla para gestionar cuentas bancarias. La aplicación está escrita en Java y utiliza la clase CCuenta para representar una cuenta bancaria con el nombre del titular, número de cuenta, saldo y tipo de interés.

## Requisitos
Antes de utilizar la aplicación, asegúrate de tener instalado lo siguiente:

Java 11 o superior
Un IDE de Java, como Eclipse o IntelliJ IDEA
## Uso
Clona este repositorio en tu equipo.
Abre el proyecto en tu IDE de Java.
Revisa la clase CCuenta y su javadoc para entender los atributos y métodos disponibles.
Crea una instancia de CCuenta y utiliza los métodos para gestionar la cuenta bancaria.
``` java
CCuenta cuenta = new CCuenta("Juan Perez", "01234567890123456789", 1000, 0.5);
double saldoActual = cuenta.estado();
cuenta.ingresar(500);
cuenta.retirar(200);
````
## Contribución
Si encuentras un error o quieres mejorar la aplicación, siéntete libre de hacer una contribución. Simplemente haz un fork de este repositorio, realiza tus cambios y crea un pull request.

## Licencia
GNU GENERAL PUBLIC LICENSE
Version 3, 29 June 2007

CCuenta es un programa libre: puedes redistribuirlo y/o modificarlo
bajo los términos de la Licencia Pública General de GNU publicada por
la Free Software Foundation, ya sea la versión 3 de la Licencia, o
(cualquier versión posterior que la Fundación para el Software Libre
( Free Software Foundation) publique.

Este programa se distribuye con la esperanza de que sea útil, pero
SIN GARANTÍA ALGUNA; ni siquiera la garantía implícita de
COMERCIALIZACIÓN o IDONEIDAD PARA UN PROPÓSITO PARTICULAR. Consulta
la Licencia Pública General de GNU para obtener más detalles.

Deberías haber recibido una copia de la Licencia Pública General de GNU
junto con este programa. En caso contrario, consulta
<http://www.gnu.org/licenses/>.

