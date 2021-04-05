# Motivación
La Empresa A desarrolló un programa en Java para mostrar todos los detalles de los productos en la consola. Este programa Java es muy simple y toma una colección de iteradores y la recorre para mostrar los productos uno por uno.
Sin embargo, la Empresa A subcontrata el sistema de back-end del Proveedor B. El Proveedor B presentó un sistema que devolverá todos los productos como colección de Enumeración.
¿Devolver el producto como enumeración? Pero el sistema actual de la Empresa A está diseñado para aceptar el producto como un iterador. El diseño de la empresa A se basa en la colección de iteradores para funcionar, ahora el proveedor B proporciona una función antigua y obsoleta (enumeración), ¿Qué debemos hacer?
Para ser sincero, puedo garantizar que el Proveedor B 100% no lo cambiará por usted. Sin embargo, la empresa A tampoco puede darse el lujo de rediseñar, porque ya ha invertido mucho tiempo y esfuerzo en mano de obra.
Aquí el adaptador hace su aparición. Lo que tenemos que hacer es crear una clase adaptadora que pueda convertir Enumeration en Iterator.

