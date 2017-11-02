# Decodificador del cifrado por transposición de columnas / Columnar Transposition Cipher Decoder
#### En este README está documentada toda la información necesaria para usar el programa de descifrado de textos por transposición.
#### This README documents all the necessary information to use the deciphering texts by transposition program.
***
#### Esto es una aplicación que descifra textos cifrados por transposición de columnas con clave, realizada para la asignatura CSCA (Ciberseguridad: Contexto y Amenazas) del Máster Universitario en Ciberseguridad de la [Universidad politécnica de Madrid.](http://www.upm.es) 

#### This is an application that deciphers encrypted texts by transposing columns with key, made for the subject CSCA (Cybersecurity: Context and Threats) of the Master's Degree in Cybersecurity of the [Polytechnic University of Madrid.](http://www.upm.es) 

![](http://www.iecre.org/img/retl_logos/idr-upm.png)
***
### Para usar la aplicación descarga el fichero de git y inicializa el proyecto en tu entorno de desarrollo. / To use the application download the git file and initialize the project in your development environment.

![](https://imgur.com/rqzjxdb.jpg)

### Compila el proyecto y ejecutalo, verás en la consola el texto siguiente: / Compile the project and execute it, you will see in the console the following text:

![](https://imgur.com/iD7Wl68.jpg)

### Introduce el texto cifrado como en el ejemplo y la palabra probable: /Enter the encrypted text and the probable word as in the example:

![](https://imgur.com/s5FLcgX.jpg)

Se mostrará el resultado además de los overflows de las columnas y la relación de la transposición que se uso, es decir, la relación entre las letras de la clave. / The result will be shown in addition to the overflows of the columns and the relation of the transposition that was used, that is the relationship between the letters of the key.

![](https://imgur.com/vM9M9Aw.jpg)

En este ejemplo la clave utilizada ha sido GITHUB y la relación que nos muestra el programa es la siguiente: 1 3 4 2 5 0, lo que significa que la B es la letra con menor valor a la que le sigue la G, luego la H etc / In this example, the key used was GITHUB and the relationship shown by the program is as follows: 1 3 4 2 5 0, which means that B is the letter with the lowest value followed by G then H etc.
