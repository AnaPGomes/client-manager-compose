package com.example.clientmanagercompose.data
import com.example.clientmanagercompose.model.Cliente

object ClienteRepository {
    fun getClientesFalsos(): List<Cliente> {
        return listOf(
            Cliente(1, "Ana Gomes", "ana@email.com", "(19) 99999-0001"),
            Cliente(2, "Bruno Silva", "bruno@email.com", "(19) 99999-0002"),
            Cliente(3, "Carla Souza", "carla@email.com", "(19) 99999-0003"),
            Cliente(4, "Daniel Costa", "daniel@email.com", "(19) 99999-0004")
        )
    }
}