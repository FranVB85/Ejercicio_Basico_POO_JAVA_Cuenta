import java.util.Scanner;

public class Principal {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Número de cuenta: ");
        numero = sc.nextLine();
        System.out.println("Tipo de Interés: ");
        tipo = sc.nextDouble();
        System.out.println("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        //Se crea el objeto cuenta2 con los valores leidos por teclado
        //Se ejecuta el constructor con parámetros
        Cuenta cuenta2 = new Cuenta("Francisco Vázquez","1212121212",2.75,3000);

        //Se crea cuenta3 como copia de cuenta1
        //Se ejecuta el constructor copia
        Cuenta cuenta3 = new Cuenta(cuenta1);

        //Mostrar los datos de cuenta1
        System.out.println("Datos de la Cuenta 1");
        System.out.println("Nombre del Cliente: " + cuenta1.getNombre());
        System.out.println("Número de Cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        //Se realiza un ingreso en Cuenta1
        cuenta1.ingreso(4000);


        //Se muestra el saldo en Cuenta1 después de ingreso
        System.out.println(cuenta1.getSaldo());

        //Mostrar los datos de Cuenta2
        System.out.println("Datos de la Cuenta 2");
        System.out.println("Nombre del Cliente: " + cuenta2.getNombre());
        System.out.println("Número de Cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de Interés: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //Mostrar los datos de Cuenta3
        System.out.println("Datos de la Cuenta 3");
        System.out.println("Nombre del Cliente: " + cuenta3.getNombre());
        System.out.println("Número de Cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de Interés: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        //Realizar una transferencia de 10€ desde Cuenta3 a Cuenta2
        if (cuenta3.transferencia(cuenta2,10)){
            System.out.println("Transferencia realizada");
        }else {
            System.out.println("No se ha podido realizar la transferencia");
        }

        //Mostrar el saldo de Cuenta2
        System.out.println("Saldo de Cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //Mostrar el saldo de Cuenta3
        System.out.println("Saldo de Cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();


    }
}
