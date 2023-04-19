#CCuenta - Una aplicación para gestionar cuentas bancarias

Práctica ED05.

CCuenta es una aplicación sencilla para gestionar cuentas bancarias. La aplicación está escrita en Java y utiliza la clase CCuenta para representar una cuenta bancaria con el nombre del titular, número de cuenta, saldo y tipo de interés.

Requisitos
Antes de utilizar la aplicación, asegúrate de tener instalado lo siguiente:

Java 8 o superior
Un IDE de Java, como Eclipse o IntelliJ IDEA
Uso
Clona este repositorio en tu equipo.
Abre el proyecto en tu IDE de Java.
Revisa la clase CCuenta y su javadoc para entender los atributos y métodos disponibles.
Crea una instancia de CCuenta y utiliza los métodos para gestionar la cuenta bancaria.
java
Copy code
CCuenta cuenta = new CCuenta("Juan Perez", "01234567890123456789", 1000, 0.5);
double saldoActual = cuenta.estado();
cuenta.ingresar(500);
cuenta.retirar(200);
Contribución
Si encuentras un error o quieres mejorar la aplicación, siéntete libre de hacer una contribución. Simplemente haz un fork de este repositorio, realiza tus cambios y crea un pull request.

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Por favor revisa el archivo LICENSE para más detalles.
