package com.anajotta.productivityhub
// 1. EL PAQUETE ES EL CORRECTO

// 2. Imports para la UI
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// 3. La pantalla
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(
    onAddTaskClicked: () -> Unit // Recibimos la "acción" de navegación
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Mis Tareas") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onAddTaskClicked) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Añadir tarea"
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("¡Aquí irá nuestra lista de tareas!")
        }
    }
}