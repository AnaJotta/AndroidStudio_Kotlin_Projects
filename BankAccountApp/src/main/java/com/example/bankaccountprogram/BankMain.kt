package com.example.bankaccountprogram

fun main(){

    val jessicaMarinBankAccount = BankAccount ("Jessica Marin", 2500.50)

    jessicaMarinBankAccount.depositar(200.0)
    jessicaMarinBankAccount.depositar(630.0)
    jessicaMarinBankAccount.retirar(1655.0)
    jessicaMarinBankAccount.depositar(2350.0)
    jessicaMarinBankAccount.retirar(365.0)

    jessicaMarinBankAccount.historialDeTransacciones()
    println("La cuenta de ${jessicaMarinBankAccount.propietarioCuenta} tiene un balance de ${jessicaMarinBankAccount.balance}")

}