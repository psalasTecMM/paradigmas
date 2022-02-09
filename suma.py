
def suma(a,b):
    return a+b

if __name__ == "__main__":
    resultado = 1
    for i in range(100):
        resultado = suma(i,resultado)
    print("El resultado de la suma es: " + str(resultado))
    