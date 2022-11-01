def descuento(porcentaje):
  Precio= cantidad *800000
  descuento = (Precio*porcentaje)
  PrecioFinal = Precio - descuento
  return PrecioFinal

cantidad= int(input("Ingresa cuantos escritorios vas a comprar: "))

if cantidad < 5:
  print("!Gano un descuento de 10%¡ El total de compra es de : ", descuento(0.1))
elif cantidad >= 5 and cantidad < 10:
    print("!Gano un descuento de 20%¡ El total de compra es de : ", descuento(0.2))
elif cantidad > 10:
  print("!Gano un descuento de 0%¡ El total de compra es de : ", descuento(0.4))