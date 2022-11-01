Nombre = input("Ingresa tu nombre: ")
SalarioH= int(input("Ingresa el valor por hora de tu salario: "))
Hora= int(input("Cuantas horas trabajaste: "))

SalarioT= SalarioH*Hora

if SalarioT>450000:
  print(Nombre, " tu salario total es de $", SalarioT)
else:
  print(Nombre)
  