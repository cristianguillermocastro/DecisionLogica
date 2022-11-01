#include<iostream>
using namespace std;

float descuento(float numescritorios, float porcentaje);

int main() {
	int numescritorios;
	cout << "Ingrese Cuantos escritorios va a comprar" << endl;
	cin >> numescritorios;
	if (numescritorios<5) {
		cout << "!Gano un descuento de 10%¡ El total de compra es de : " << descuento(numescritorios,10) << endl;
	} else {
		if (numescritorios>=5 && numescritorios<10) {
			cout << "!Gano un descuento de 20%¡ El total de compra es de : " << descuento(numescritorios,20) << endl;
		} else {
			if (numescritorios>=10) {
				cout << "!Gano un descuento de 40%¡ El total de compra es de : " << descuento(numescritorios,30) << endl;
			}
		}
	}
	return 0;
}

float descuento(float numescritorios, float porcentaje) {
	float descuento1;
	float precio;
	float preciofinal;
	precio = numescritorios*800000;
	descuento1 = (precio*porcentaje)/100;
	preciofinal = precio-descuento1;
	return preciofinal;