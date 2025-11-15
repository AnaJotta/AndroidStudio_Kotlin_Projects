// 1. EL PAQUETE ES EL CORRECTO
package com.anajotta.productivityhub

// 2. Imports del sistema
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier

// 3. Imports de Navegación
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// 4. Import de TU TEMA
import com.anajotta.productivityhub.ui.theme.ProductivityHubTheme

// 5. ¡NO NECESITAMOS IMPORTAR TaskScreen o AddTaskScreen
//    porque viven en el MISMO paquete!

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProductivityHubTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // 1. Creamos el "GPS"
                    val navController = rememberNavController()

                    // 2. Definimos el "Mapa"
                    NavHost(
                        navController = navController,
                        startDestination = "task_list"
                    ) {

                        // Ruta 1: Lista de tareas
                        composable(route = "task_list") {
                            TaskScreen( // <- ¡Se encuentra sin importar!
                                onAddTaskClicked = {
                                    navController.navigate("add_task")
                                }
                            )
                        }

                        // Ruta 2: Añadir tarea
                        composable(route = "add_task") {
                            AddTaskScreen( // <- ¡Se encuentra sin importar!
                                onBackClicked = {
                                    navController.popBackStack()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}