## Cuestiones de análisis
1. ¿Qué tipo de relación se define en el diagrama UML entre Pedido y Producto?

En el diagrama UML se define una asociación entre las clases Pedido y Producto. 
Esta asociación indica que la clase Pedido conoce y utiliza objetos de tipo Producto, lo cual se refleja en
List<Producto>: productos
No se trata de una agregación ni de una composición, ya que los productos pueden existir independientmente del pedido. 

2. ¿Qué significa la cardinalidad indicada en esa relación?
 
Implica que un Pedido puede estar asociado a cero o múltiples Productos. Y cada Producto pertenece a un único Pedido dentro de este modelo.

3. ¿Qué otros tipos de cardinalidad se pueden definir en UML?.
   
 1 (Indica que debe existir exactamente una instancia asociada).
   Ejemplo: Un usuario tiene una única cuenta principal.

 0..1 (Indica una relación opcional, donde puede existir cero o una instancia asociada).
   Ejemplo: Un empleado puede tener un despacho asignado o ninguno.
   
 1..* (Indica una relación donde debe existir al menos una instancia asociada).
   Ejemplo: Un pedido debe contener uno o más productos.
   
 0..* (Indica que puede no existir ninguna o existir muchas instancias).
   Ejemplo: Un cliente puede realizar cero o varios pedidos.
   
 n..m (Define un rango concreto de instancias permitidas).
   Ejemplo: Un equipo puede estar formado por entre 6 y 8 desarrolladores (6..8).       

4. ¿Qué diferencias existen entre una asociación, una agregación y una composición?.
   
La asociación es una relación estructural básica entre clases que indica que existe algún tipo de vínculo o interacción entre ellas. No implica propiedad ni dependencia fuerte.(Un cliente se relaciona con un pedido)

Mientras que una agregación es una forma especializada de asociación que representa una relación todo-parte débil (una empresa agrupa empleados, pero los empleados pueden existir fuera de esa empresa). Las partes pueden existir independientemente del todo. No obstante, una composición es una relación todo-parte fuerte, donde las partes dependen completamente del todo, es decir, que si el objeto contenedor se destruye, los objetos contenidos también. (Un pedido compuesto por líneas de pedido que no tienen sentido fuera de él) 
