package com.example.bankaccountprogram

class BankAccount(var propietarioCuenta: String, var balance: Double) {
    private val historialTransacciones =  mutableListOf<String>()

    fun depositar(cantidad: Double){
        balance+= cantidad
        historialTransacciones.add("$propietarioCuenta depositó: $cantidad €")

    }

    fun retirar(cantidad: Double){
        if (cantidad <= balance) {
            balance -= cantidad
            historialTransacciones.add("$propietarioCuenta retiró: $cantidad €")
        }else{
            println("No tienes suficiente fondo para retirar, actualmente tienes: $cantidad €")
        }

    }

    fun historialDeTransacciones(){
        println("Historial de transacciones de: $propietarioCuenta")
        for(transaccion in historialTransacciones){
            println(transaccion)
        }

    }

}