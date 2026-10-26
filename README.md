# Practica-03.1

### Preguntas apartado 10

###### 1. ¿Por qué los atributos del editor deben ser privados?

R: Para hacer más robusto el código al encapsular las variables, y que otros metodos no cambien por error la memoria de la variable
   
###### 2. ¿Qué diferencia hay entre un método public y uno private?

R: Lo accesible que son, Public puede ser alterado en cualquier parte del proyecto, mientras que private solo en la clase en la que esta

###### 3. Si quitas public de un método, ¿qué acceso tiene y puede llamarlo PruebaEditor desde el mismo
paquete?

R: Si cambio public por private no tendra acceso para PruebaEditor y no podras llamarlo

###### 4. ¿En qué se diferencia el acceso de paquete de protected?

R: El protected es igual que el private, pero añade un permite acceso a clases del mismo paquete y subclases (las cuales pueden estar en diferentes paquetes) por medio de la herencia
