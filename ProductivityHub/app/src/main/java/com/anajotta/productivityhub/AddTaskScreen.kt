// 1. EL PAQUETE ES EL CORRECTO
package com.anajotta.productivityhub

// 2. Imports para la UI y el ESTADO
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// 3. La pantalla
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddTaskScreen(
    onBackClicked: () -> Unit // Recibimos la acción de "volver atrás"
) {
    // El estado para el campo de texto
    var taskName by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Nueva Tarea") },
                navigationIcon = {
                    IconButton(onClick = onBackClicked) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Volver"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            TextField(
                value = taskName,
                onValueChange = { taskName = it },
                label = { Text("Nombre de la tarea") },
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = {
                    // Por ahora, solo volvemos atrás
                    onBackClicked()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("GUARDAR")
            }
        }
    }
}