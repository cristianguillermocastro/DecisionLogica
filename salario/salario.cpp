#include <iostream>
using  namespace std;
int edad;
int main(){
  
  string nombre;
  float salariobasico;
  int horas;
  double multiplicacion;
  
   cout<<"ingrese su nombre"<<endl;
   cin>>nombre;
   cout<<"ingrese su salario  por hora"<<endl;
   cin>>salariobasico;
   cout<<"ingrese su horas trabajadas en el mes"<<endl;
   cin>>horas;
   multiplicacion = salariobasico*horas;


  if (multiplicacion >= 450.000){
    cout <<multiplicacion<<endl<<nombre<<endl;}
  else{
     cout<<nombre<<endl;
     }
}