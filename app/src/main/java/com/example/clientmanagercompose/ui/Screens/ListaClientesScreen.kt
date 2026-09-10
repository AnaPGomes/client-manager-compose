package com.example.clientmanagercompose.ui.Screens



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.clientmanagercompose.data.ClienteRepository

@Composable
fun ListaClientesScreen() {
    val clientes = ClienteRepository.getClientesFalsos()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(clientes) { cliente ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = cliente.nome, style = MaterialTheme.typography.titleMedium)
                    Text(text = cliente.email, style = MaterialTheme.typography.bodyMedium)
                    Text(text = cliente.telefone, style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}