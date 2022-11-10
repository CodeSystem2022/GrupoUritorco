#Ejercicio09: Mostrar una frase sin espacios y contar la longitud 
#Hacer un programa donde el usuario ingrese una frase, se le devolvera la misma pero sin espacios en blanco, y ademas un contador de cuantos caracteres tiene la frase(sin contar los espacios en blanco)
#Ejemplo= frase: vivir por siempre en paz 
#Frase Final= vivirporsiempreenpaz
#Numero de caracteres:21
frase1=input("Digite una frase: ")
frase2= " "
for i in frase1:
    if i != " ":
        frase2+= i
frase1 = frase2
print(f'\nFrase Final: {frase1}')
print(f'N° de caracteres: {len(frase1)}')