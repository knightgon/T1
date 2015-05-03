# T1
Proyecto: Servicios Sociales 


Arreglado:

- **Fecha - Cita** ahora es *Temporal.DATE*
- **Estado_Cita - Cita** ahora es *Enum*
- **Fecha - Expediente** ahora es *Temporal.DATE*
- **Telef - Expediente** ahora es *String*
- **Telefono - Profesional** ahora es *String*
- **Fecha - Formulario** ahora es *Temporal.DATE*
- **Fecha_Inicio - Intervencion** ahora es *Temporal.DATE*
- **Ultima_act - Intervencion** ahora es *Temporal.DATE*
- Sustituido el atributo **Recurso - Intervencion** por atributos *Recurso_Adecuado* y *Recurso_Aplicado*
- **Fecha_Nacimiento - Usuario** ahora es *Temporal.DATE*
- **Sexo - Usuario** ahora es *Enum*
- Cardinalidad de las relaciones entre entidades
- Navegacion de relaciones

Agregado:

- Anotaciones *@Entity*
- Todas las relaciones *OneToOne* y *ManyToOne* junto sus *JoinColumn*
- Todos lo *equals* y *hashcodes* de las entidades
- Generacion del esquema de la base de datos (**Base de datos:** *SSBD* , **user:** *sa* , **pass:** *sa*)
